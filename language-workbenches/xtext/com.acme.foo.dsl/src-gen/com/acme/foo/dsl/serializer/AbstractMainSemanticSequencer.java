package com.acme.foo.dsl.serializer;

import com.acme.foo.Contact;
import com.acme.foo.Contacts;
import com.acme.foo.DocumentRoot;
import com.acme.foo.FooPackage;
import com.acme.foo.dsl.services.MainGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractMainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MainGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FooPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FooPackage.CONTACT:
				if(context == grammarAccess.getContactRule()) {
					sequence_Contact(context, (Contact) semanticObject); 
					return; 
				}
				else break;
			case FooPackage.CONTACTS:
				if(context == grammarAccess.getContactsRule()) {
					sequence_Contacts(context, (Contacts) semanticObject); 
					return; 
				}
				else break;
			case FooPackage.DOCUMENT_ROOT:
				if(context == grammarAccess.getDocumentRootRule()) {
					sequence_DocumentRoot(context, (DocumentRoot) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=Name phone=Phone)
	 */
	protected void sequence_Contact(EObject context, Contact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FooPackage.Literals.CONTACT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.CONTACT__NAME));
			if(transientValues.isValueTransient(semanticObject, FooPackage.Literals.CONTACT__PHONE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FooPackage.Literals.CONTACT__PHONE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContactAccess().getNameNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getContactAccess().getPhonePhoneParserRuleCall_3_0(), semanticObject.getPhone());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (contact+=Contact*)
	 */
	protected void sequence_Contacts(EObject context, Contacts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     contacts=Contacts
	 */
	protected void sequence_DocumentRoot(EObject context, DocumentRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
