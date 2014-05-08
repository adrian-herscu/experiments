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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contacts'", "'{'", "'}'", "'contact'", "'name'", "'phone'", "'='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMainParser.tokenNames; }
    public String getGrammarFileName() { return "../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g"; }



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



    // $ANTLR start "entryRuleDocumentRoot"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:67:1: entryRuleDocumentRoot returns [EObject current=null] : iv_ruleDocumentRoot= ruleDocumentRoot EOF ;
    public final EObject entryRuleDocumentRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentRoot = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:68:2: (iv_ruleDocumentRoot= ruleDocumentRoot EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:69:2: iv_ruleDocumentRoot= ruleDocumentRoot EOF
            {
             newCompositeNode(grammarAccess.getDocumentRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDocumentRoot_in_entryRuleDocumentRoot75);
            iv_ruleDocumentRoot=ruleDocumentRoot();

            state._fsp--;

             current =iv_ruleDocumentRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDocumentRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentRoot"


    // $ANTLR start "ruleDocumentRoot"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:76:1: ruleDocumentRoot returns [EObject current=null] : ( () ( (lv_contacts_1_0= ruleContacts ) ) ) ;
    public final EObject ruleDocumentRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_contacts_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:79:28: ( ( () ( (lv_contacts_1_0= ruleContacts ) ) ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:80:1: ( () ( (lv_contacts_1_0= ruleContacts ) ) )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:80:1: ( () ( (lv_contacts_1_0= ruleContacts ) ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:80:2: () ( (lv_contacts_1_0= ruleContacts ) )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:80:2: ()
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDocumentRootAccess().getDocumentRootAction_0(),
                        current);
                

            }

            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:86:2: ( (lv_contacts_1_0= ruleContacts ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:87:1: (lv_contacts_1_0= ruleContacts )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:87:1: (lv_contacts_1_0= ruleContacts )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:88:3: lv_contacts_1_0= ruleContacts
            {
             
            	        newCompositeNode(grammarAccess.getDocumentRootAccess().getContactsContactsParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContacts_in_ruleDocumentRoot140);
            lv_contacts_1_0=ruleContacts();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRootRule());
            	        }
                   		set(
                   			current, 
                   			"contacts",
                    		lv_contacts_1_0, 
                    		"Contacts");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentRoot"


    // $ANTLR start "entryRuleContacts"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:112:1: entryRuleContacts returns [EObject current=null] : iv_ruleContacts= ruleContacts EOF ;
    public final EObject entryRuleContacts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContacts = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:113:2: (iv_ruleContacts= ruleContacts EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:114:2: iv_ruleContacts= ruleContacts EOF
            {
             newCompositeNode(grammarAccess.getContactsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContacts_in_entryRuleContacts176);
            iv_ruleContacts=ruleContacts();

            state._fsp--;

             current =iv_ruleContacts; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContacts186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContacts"


    // $ANTLR start "ruleContacts"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:121:1: ruleContacts returns [EObject current=null] : ( () otherlv_1= 'contacts' otherlv_2= '{' ( (lv_contact_3_0= ruleContact ) )* otherlv_4= '}' ) ;
    public final EObject ruleContacts() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contact_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:124:28: ( ( () otherlv_1= 'contacts' otherlv_2= '{' ( (lv_contact_3_0= ruleContact ) )* otherlv_4= '}' ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:125:1: ( () otherlv_1= 'contacts' otherlv_2= '{' ( (lv_contact_3_0= ruleContact ) )* otherlv_4= '}' )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:125:1: ( () otherlv_1= 'contacts' otherlv_2= '{' ( (lv_contact_3_0= ruleContact ) )* otherlv_4= '}' )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:125:2: () otherlv_1= 'contacts' otherlv_2= '{' ( (lv_contact_3_0= ruleContact ) )* otherlv_4= '}'
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:125:2: ()
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:126:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContactsAccess().getContactsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContacts232); 

                	newLeafNode(otherlv_1, grammarAccess.getContactsAccess().getContactsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContacts244); 

                	newLeafNode(otherlv_2, grammarAccess.getContactsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:139:1: ( (lv_contact_3_0= ruleContact ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:140:1: (lv_contact_3_0= ruleContact )
            	    {
            	    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:140:1: (lv_contact_3_0= ruleContact )
            	    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:141:3: lv_contact_3_0= ruleContact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContactsAccess().getContactContactParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContact_in_ruleContacts265);
            	    lv_contact_3_0=ruleContact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContactsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contact",
            	            		lv_contact_3_0, 
            	            		"Contact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleContacts278); 

                	newLeafNode(otherlv_4, grammarAccess.getContactsAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContacts"


    // $ANTLR start "entryRuleContact"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:169:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:170:2: (iv_ruleContact= ruleContact EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:171:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_entryRuleContact314);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContact324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:178:1: ruleContact returns [EObject current=null] : ( () otherlv_1= 'contact' ( (lv_name_2_0= ruleName ) ) ( (lv_phone_3_0= rulePhone ) ) ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_phone_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:181:28: ( ( () otherlv_1= 'contact' ( (lv_name_2_0= ruleName ) ) ( (lv_phone_3_0= rulePhone ) ) ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:182:1: ( () otherlv_1= 'contact' ( (lv_name_2_0= ruleName ) ) ( (lv_phone_3_0= rulePhone ) ) )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:182:1: ( () otherlv_1= 'contact' ( (lv_name_2_0= ruleName ) ) ( (lv_phone_3_0= rulePhone ) ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:182:2: () otherlv_1= 'contact' ( (lv_name_2_0= ruleName ) ) ( (lv_phone_3_0= rulePhone ) )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:182:2: ()
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:183:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContactAccess().getContactAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleContact370); 

                	newLeafNode(otherlv_1, grammarAccess.getContactAccess().getContactKeyword_1());
                
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:192:1: ( (lv_name_2_0= ruleName ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:193:1: (lv_name_2_0= ruleName )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:193:1: (lv_name_2_0= ruleName )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:194:3: lv_name_2_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getContactAccess().getNameNameParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleName_in_ruleContact391);
            lv_name_2_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContactRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:210:2: ( (lv_phone_3_0= rulePhone ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:211:1: (lv_phone_3_0= rulePhone )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:211:1: (lv_phone_3_0= rulePhone )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:212:3: lv_phone_3_0= rulePhone
            {
             
            	        newCompositeNode(grammarAccess.getContactAccess().getPhonePhoneParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePhone_in_ruleContact412);
            lv_phone_3_0=rulePhone();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContactRule());
            	        }
                   		set(
                   			current, 
                   			"phone",
                    		lv_phone_3_0, 
                    		"Phone");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleName"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:236:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:237:2: (iv_ruleName= ruleName EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:238:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName449);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:245:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'name' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_EQUALS_1 = null;


         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:248:28: ( (kw= 'name' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:249:1: (kw= 'name' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:249:1: (kw= 'name' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:250:2: kw= 'name' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING
            {
            kw=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleName498); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNameAccess().getNameKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getNameAccess().getEQUALSParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_ruleName520);
            this_EQUALS_1=ruleEQUALS();

            state._fsp--;


            		current.merge(this_EQUALS_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_STRING_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleName540); 

            		current.merge(this_STRING_2);
                
             
                newLeafNode(this_STRING_2, grammarAccess.getNameAccess().getSTRINGTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRulePhone"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:281:1: entryRulePhone returns [String current=null] : iv_rulePhone= rulePhone EOF ;
    public final String entryRulePhone() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhone = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:282:2: (iv_rulePhone= rulePhone EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:283:2: iv_rulePhone= rulePhone EOF
            {
             newCompositeNode(grammarAccess.getPhoneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhone_in_entryRulePhone586);
            iv_rulePhone=rulePhone();

            state._fsp--;

             current =iv_rulePhone.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhone597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhone"


    // $ANTLR start "rulePhone"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:290:1: rulePhone returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'phone' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken rulePhone() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_EQUALS_1 = null;


         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:293:28: ( (kw= 'phone' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING ) )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:294:1: (kw= 'phone' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING )
            {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:294:1: (kw= 'phone' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:295:2: kw= 'phone' this_EQUALS_1= ruleEQUALS this_STRING_2= RULE_STRING
            {
            kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePhone635); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPhoneAccess().getPhoneKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getPhoneAccess().getEQUALSParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_rulePhone657);
            this_EQUALS_1=ruleEQUALS();

            state._fsp--;


            		current.merge(this_EQUALS_1);
                
             
                    afterParserOrEnumRuleCall();
                
            this_STRING_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePhone677); 

            		current.merge(this_STRING_2);
                
             
                newLeafNode(this_STRING_2, grammarAccess.getPhoneAccess().getSTRINGTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhone"


    // $ANTLR start "entryRuleEQUALS"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:326:1: entryRuleEQUALS returns [String current=null] : iv_ruleEQUALS= ruleEQUALS EOF ;
    public final String entryRuleEQUALS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEQUALS = null;


        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:327:2: (iv_ruleEQUALS= ruleEQUALS EOF )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:328:2: iv_ruleEQUALS= ruleEQUALS EOF
            {
             newCompositeNode(grammarAccess.getEQUALSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_entryRuleEQUALS723);
            iv_ruleEQUALS=ruleEQUALS();

            state._fsp--;

             current =iv_ruleEQUALS.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEQUALS734); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:335:1: ruleEQUALS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleEQUALS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:338:28: (kw= '=' )
            // ../com.acme.foo.dsl/src-gen/com/acme/foo/dsl/parser/antlr/internal/InternalMain.g:340:2: kw= '='
            {
            kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEQUALS771); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEQUALSAccess().getEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEQUALS"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDocumentRoot_in_entryRuleDocumentRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDocumentRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacts_in_ruleDocumentRoot140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacts_in_entryRuleContacts176 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContacts186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleContacts232 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContacts244 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_ruleContact_in_ruleContacts265 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleContacts278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_entryRuleContact314 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContact324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleContact370 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleName_in_ruleContact391 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rulePhone_in_ruleContact412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_entryRuleName449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleName498 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleEQUALS_in_ruleName520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleName540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhone_in_entryRulePhone586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhone597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePhone635 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleEQUALS_in_rulePhone657 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePhone677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEQUALS_in_entryRuleEQUALS723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEQUALS734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEQUALS771 = new BitSet(new long[]{0x0000000000000002L});
    }


}