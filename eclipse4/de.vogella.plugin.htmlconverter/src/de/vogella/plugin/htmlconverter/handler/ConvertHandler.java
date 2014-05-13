package de.vogella.plugin.htmlconverter.handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public final class ConvertHandler extends AbstractHandler {
	private static final QualifiedName HTML_PATH_PERSISTENT_PROPERTY_NAME = new QualifiedName("html",
			"path");

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShell(event);
		final ISelection sel = HandlerUtil.getActiveMenuSelection(event);

		if (!(sel instanceof IStructuredSelection))
			throw new ExecutionException("invalid selection");

		final IStructuredSelection selection = (IStructuredSelection) sel;

		final Object firstElement = selection.getFirstElement();
		if (firstElement instanceof ICompilationUnit) {
			final ICompilationUnit cu = (ICompilationUnit) firstElement;
			String directory = getPersistentProperty(cu.getResource(),
					HTML_PATH_PERSISTENT_PROPERTY_NAME);

			if (directory != null && directory.length() > 0) {
				if (MessageDialog.openQuestion(shell, "Question",
						"Use the previous output directory?")) {
				} else {
					directory = new DirectoryDialog(shell).open();
				}
			}
			if (directory != null && directory.length() > 0) {
				setPersistentProperty(cu.getResource(), HTML_PATH_PERSISTENT_PROPERTY_NAME, directory);
				write(directory, cu);
			}

		} else {
			MessageDialog.openInformation(shell, "Info",
					"Please select a Java source file");
		}
		return null;
	}

	protected String getPersistentProperty(IResource res, QualifiedName qn) {
		try {
			return res.getPersistentProperty(qn);
		} catch (CoreException e) {
			return "";
		}
	}

	protected void setPersistentProperty(IResource res, QualifiedName qn,
			String value) {
		try {
			res.setPersistentProperty(qn, value);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void write(String dir, ICompilationUnit cu) {
		BufferedWriter writer = null;
		try {
			String test = cu.getCorrespondingResource().getName();
			// Need
			String[] name = test.split("\\.");
			String htmlFile = dir + "\\" + name[0] + ".html";
			FileWriter output = new FileWriter(htmlFile);
			writer = new BufferedWriter(output);
			writer.write("<html>");
			writer.write("<head>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<pre>");
			writer.write(cu.getSource());
			writer.write("</pre>");
			writer.write("</body>");
			writer.write("</html>");
		} catch (JavaModelException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}
	}
}