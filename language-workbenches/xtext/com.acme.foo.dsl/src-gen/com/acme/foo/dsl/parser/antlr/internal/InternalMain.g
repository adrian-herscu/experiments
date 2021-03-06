/*
* generated by Xtext
*/
grammar InternalMain;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.acme.foo.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.acme.foo.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.acme.foo.dsl.services.MainGrammarAccess;

}

@parser::members {

 	private MainGrammarAccess grammarAccess;
 	
    public InternalMainParser(TokenStream input, MainGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "DocumentRoot";	
   	}
   	
   	@Override
   	protected MainGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDocumentRoot
entryRuleDocumentRoot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDocumentRootRule()); }
	 iv_ruleDocumentRoot=ruleDocumentRoot 
	 { $current=$iv_ruleDocumentRoot.current; } 
	 EOF 
;

// Rule DocumentRoot
ruleDocumentRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDocumentRootAccess().getDocumentRootAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDocumentRootAccess().getContactsContactsParserRuleCall_1_0()); 
	    }
		lv_contacts_1_0=ruleContacts		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDocumentRootRule());
	        }
       		set(
       			$current, 
       			"contacts",
        		lv_contacts_1_0, 
        		"Contacts");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleContacts
entryRuleContacts returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContactsRule()); }
	 iv_ruleContacts=ruleContacts 
	 { $current=$iv_ruleContacts.current; } 
	 EOF 
;

// Rule Contacts
ruleContacts returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getContactsAccess().getContactsAction_0(),
            $current);
    }
)	otherlv_1='contacts' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getContactsAccess().getContactsKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getContactsAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContactsAccess().getContactContactParserRuleCall_3_0()); 
	    }
		lv_contact_3_0=ruleContact		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContactsRule());
	        }
       		add(
       			$current, 
       			"contact",
        		lv_contact_3_0, 
        		"Contact");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getContactsAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleContact
entryRuleContact returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContactRule()); }
	 iv_ruleContact=ruleContact 
	 { $current=$iv_ruleContact.current; } 
	 EOF 
;

// Rule Contact
ruleContact returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getContactAccess().getContactAction_0(),
            $current);
    }
)	otherlv_1='contact' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getContactAccess().getContactKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getContactAccess().getNameNameParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContactRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"Name");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getContactAccess().getPhonePhoneParserRuleCall_3_0()); 
	    }
		lv_phone_3_0=rulePhone		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContactRule());
	        }
       		set(
       			$current, 
       			"phone",
        		lv_phone_3_0, 
        		"Phone");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleName
entryRuleName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNameRule()); } 
	 iv_ruleName=ruleName 
	 { $current=$iv_ruleName.current.getText(); }  
	 EOF 
;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='name' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNameAccess().getNameKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getNameAccess().getEQUALSParserRuleCall_1()); 
    }
    this_EQUALS_1=ruleEQUALS    {
		$current.merge(this_EQUALS_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getNameAccess().getSTRINGTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRulePhone
entryRulePhone returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhoneRule()); } 
	 iv_rulePhone=rulePhone 
	 { $current=$iv_rulePhone.current.getText(); }  
	 EOF 
;

// Rule Phone
rulePhone returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='phone' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPhoneAccess().getPhoneKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getPhoneAccess().getEQUALSParserRuleCall_1()); 
    }
    this_EQUALS_1=ruleEQUALS    {
		$current.merge(this_EQUALS_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getPhoneAccess().getSTRINGTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleEQUALS
entryRuleEQUALS returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEQUALSRule()); } 
	 iv_ruleEQUALS=ruleEQUALS 
	 { $current=$iv_ruleEQUALS.current.getText(); }  
	 EOF 
;

// Rule EQUALS
ruleEQUALS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEQUALSAccess().getEqualsSignKeyword()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


