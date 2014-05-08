/*
* generated by Xtext
*/
package com.acme.foo.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.acme.foo.dsl.services.MainGrammarAccess;

public class MainParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MainGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.acme.foo.dsl.parser.antlr.internal.InternalMainParser createParser(XtextTokenStream stream) {
		return new com.acme.foo.dsl.parser.antlr.internal.InternalMainParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DocumentRoot";
	}
	
	public MainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
