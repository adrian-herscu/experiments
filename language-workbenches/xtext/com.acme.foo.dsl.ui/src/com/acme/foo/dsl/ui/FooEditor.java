package com.acme.foo.dsl.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class FooEditor
        extends XtextEditor {

    @Override
    public void doSave(IProgressMonitor progressMonitor) {
        // TODO Auto-generated method stub
        super.doSave(progressMonitor);
    }

}
