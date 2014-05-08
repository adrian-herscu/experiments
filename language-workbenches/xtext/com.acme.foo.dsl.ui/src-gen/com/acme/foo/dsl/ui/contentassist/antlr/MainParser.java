/*
* generated by Xtext
*/
package com.acme.foo.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.acme.foo.dsl.services.MainGrammarAccess;

public class MainParser extends AbstractContentAssistParser {
	
	@Inject
	private MainGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.acme.foo.dsl.ui.contentassist.antlr.internal.InternalMainParser createParser() {
		com.acme.foo.dsl.ui.contentassist.antlr.internal.InternalMainParser result = new com.acme.foo.dsl.ui.contentassist.antlr.internal.InternalMainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDocumentRootAccess().getGroup(), "rule__DocumentRoot__Group__0");
					put(grammarAccess.getContactsAccess().getGroup(), "rule__Contacts__Group__0");
					put(grammarAccess.getContactAccess().getGroup(), "rule__Contact__Group__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getPhoneAccess().getGroup(), "rule__Phone__Group__0");
					put(grammarAccess.getDocumentRootAccess().getContactsAssignment_1(), "rule__DocumentRoot__ContactsAssignment_1");
					put(grammarAccess.getContactsAccess().getContactAssignment_3(), "rule__Contacts__ContactAssignment_3");
					put(grammarAccess.getContactAccess().getNameAssignment_2(), "rule__Contact__NameAssignment_2");
					put(grammarAccess.getContactAccess().getPhoneAssignment_3(), "rule__Contact__PhoneAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.acme.foo.dsl.ui.contentassist.antlr.internal.InternalMainParser typedParser = (com.acme.foo.dsl.ui.contentassist.antlr.internal.InternalMainParser) parser;
			typedParser.entryRuleDocumentRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}