package com.acme.foo.dsl.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class FooDocumentProvider
        extends XtextDocumentProvider {

    @Override
    protected void doSaveDocument(
            IProgressMonitor monitor, Object element, IDocument document,
            boolean overwrite)
            throws CoreException {
        // TODO Auto-generated method stub
        super.doSaveDocument(monitor, element, document, overwrite);
    }

}
