package com.acme.foo.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.acme.foo.dsl.services.MainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'contacts'", "'{'", "'}'", "'contact'", "'name'", "'phone'"
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
    public String getGrammarFileName() { return "../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g"; }


     
     	private MainGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MainGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDocumentRoot"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:60:1: entryRuleDocumentRoot : ruleDocumentRoot EOF ;
    public final void entryRuleDocumentRoot() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:61:1: ( ruleDocumentRoot EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:62:1: ruleDocumentRoot EOF
            {
             before(grammarAccess.getDocumentRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDocumentRoot_in_entryRuleDocumentRoot61);
            ruleDocumentRoot();

            state._fsp--;

             after(grammarAccess.getDocumentRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDocumentRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentRoot"


    // $ANTLR start "ruleDocumentRoot"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:69:1: ruleDocumentRoot : ( ( rule__DocumentRoot__Group__0 ) ) ;
    public final void ruleDocumentRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:73:2: ( ( ( rule__DocumentRoot__Group__0 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:74:1: ( ( rule__DocumentRoot__Group__0 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:74:1: ( ( rule__DocumentRoot__Group__0 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:75:1: ( rule__DocumentRoot__Group__0 )
            {
             before(grammarAccess.getDocumentRootAccess().getGroup()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:76:1: ( rule__DocumentRoot__Group__0 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:76:2: rule__DocumentRoot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DocumentRoot__Group__0_in_ruleDocumentRoot94);
            rule__DocumentRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentRoot"


    // $ANTLR start "entryRuleContacts"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:88:1: entryRuleContacts : ruleContacts EOF ;
    public final void entryRuleContacts() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:89:1: ( ruleContacts EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:90:1: ruleContacts EOF
            {
             before(grammarAccess.getContactsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContacts_in_entryRuleContacts121);
            ruleContacts();

            state._fsp--;

             after(grammarAccess.getContactsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContacts128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContacts"


    // $ANTLR start "ruleContacts"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:97:1: ruleContacts : ( ( rule__Contacts__Group__0 ) ) ;
    public final void ruleContacts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:101:2: ( ( ( rule__Contacts__Group__0 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:102:1: ( ( rule__Contacts__Group__0 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:102:1: ( ( rule__Contacts__Group__0 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:103:1: ( rule__Contacts__Group__0 )
            {
             before(grammarAccess.getContactsAccess().getGroup()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:104:1: ( rule__Contacts__Group__0 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:104:2: rule__Contacts__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__0_in_ruleContacts154);
            rule__Contacts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContacts"


    // $ANTLR start "entryRuleContact"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:116:1: entryRuleContact : ruleContact EOF ;
    public final void entryRuleContact() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:117:1: ( ruleContact EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:118:1: ruleContact EOF
            {
             before(grammarAccess.getContactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_entryRuleContact181);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getContactRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContact188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:125:1: ruleContact : ( ( rule__Contact__Group__0 ) ) ;
    public final void ruleContact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:129:2: ( ( ( rule__Contact__Group__0 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:130:1: ( ( rule__Contact__Group__0 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:130:1: ( ( rule__Contact__Group__0 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:131:1: ( rule__Contact__Group__0 )
            {
             before(grammarAccess.getContactAccess().getGroup()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:132:1: ( rule__Contact__Group__0 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:132:2: rule__Contact__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__0_in_ruleContact214);
            rule__Contact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleName"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:144:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:145:1: ( ruleName EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:146:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName241);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:153:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:157:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:158:1: ( ( rule__Name__Group__0 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:158:1: ( ( rule__Name__Group__0 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:159:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:160:1: ( rule__Name__Group__0 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:160:2: rule__Name__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__0_in_ruleName274);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRulePhone"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:172:1: entryRulePhone : rulePhone EOF ;
    public final void entryRulePhone() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:173:1: ( rulePhone EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:174:1: rulePhone EOF
            {
             before(grammarAccess.getPhoneRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhone_in_entryRulePhone301);
            rulePhone();

            state._fsp--;

             after(grammarAccess.getPhoneRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhone308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhone"


    // $ANTLR start "rulePhone"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:181:1: rulePhone : ( ( rule__Phone__Group__0 ) ) ;
    public final void rulePhone() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:185:2: ( ( ( rule__Phone__Group__0 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:186:1: ( ( rule__Phone__Group__0 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:186:1: ( ( rule__Phone__Group__0 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:187:1: ( rule__Phone__Group__0 )
            {
             before(grammarAccess.getPhoneAccess().getGroup()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:188:1: ( rule__Phone__Group__0 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:188:2: rule__Phone__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__0_in_rulePhone334);
            rule__Phone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhone"


    // $ANTLR start "entryRuleEQUALS"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:200:1: entryRuleEQUALS : ruleEQUALS EOF ;
    public final void entryRuleEQUALS() throws RecognitionException {
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:201:1: ( ruleEQUALS EOF )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:202:1: ruleEQUALS EOF
            {
             before(grammarAccess.getEQUALSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_entryRuleEQUALS361);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getEQUALSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEQUALS368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:209:1: ruleEQUALS : ( '=' ) ;
    public final void ruleEQUALS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:213:2: ( ( '=' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:214:1: ( '=' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:214:1: ( '=' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:215:1: '='
            {
             before(grammarAccess.getEQUALSAccess().getEqualsSignKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleEQUALS395); 
             after(grammarAccess.getEQUALSAccess().getEqualsSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "rule__DocumentRoot__Group__0"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:232:1: rule__DocumentRoot__Group__0 : rule__DocumentRoot__Group__0__Impl rule__DocumentRoot__Group__1 ;
    public final void rule__DocumentRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:236:1: ( rule__DocumentRoot__Group__0__Impl rule__DocumentRoot__Group__1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:237:2: rule__DocumentRoot__Group__0__Impl rule__DocumentRoot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DocumentRoot__Group__0__Impl_in_rule__DocumentRoot__Group__0430);
            rule__DocumentRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DocumentRoot__Group__1_in_rule__DocumentRoot__Group__0433);
            rule__DocumentRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRoot__Group__0"


    // $ANTLR start "rule__DocumentRoot__Group__0__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:244:1: rule__DocumentRoot__Group__0__Impl : ( () ) ;
    public final void rule__DocumentRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:248:1: ( ( () ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:249:1: ( () )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:249:1: ( () )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:250:1: ()
            {
             before(grammarAccess.getDocumentRootAccess().getDocumentRootAction_0()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:251:1: ()
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:253:1: 
            {
            }

             after(grammarAccess.getDocumentRootAccess().getDocumentRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRoot__Group__0__Impl"


    // $ANTLR start "rule__DocumentRoot__Group__1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:263:1: rule__DocumentRoot__Group__1 : rule__DocumentRoot__Group__1__Impl ;
    public final void rule__DocumentRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:267:1: ( rule__DocumentRoot__Group__1__Impl )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:268:2: rule__DocumentRoot__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DocumentRoot__Group__1__Impl_in_rule__DocumentRoot__Group__1491);
            rule__DocumentRoot__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRoot__Group__1"


    // $ANTLR start "rule__DocumentRoot__Group__1__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:274:1: rule__DocumentRoot__Group__1__Impl : ( ( rule__DocumentRoot__ContactsAssignment_1 ) ) ;
    public final void rule__DocumentRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:278:1: ( ( ( rule__DocumentRoot__ContactsAssignment_1 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:279:1: ( ( rule__DocumentRoot__ContactsAssignment_1 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:279:1: ( ( rule__DocumentRoot__ContactsAssignment_1 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:280:1: ( rule__DocumentRoot__ContactsAssignment_1 )
            {
             before(grammarAccess.getDocumentRootAccess().getContactsAssignment_1()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:281:1: ( rule__DocumentRoot__ContactsAssignment_1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:281:2: rule__DocumentRoot__ContactsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DocumentRoot__ContactsAssignment_1_in_rule__DocumentRoot__Group__1__Impl518);
            rule__DocumentRoot__ContactsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentRootAccess().getContactsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRoot__Group__1__Impl"


    // $ANTLR start "rule__Contacts__Group__0"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:295:1: rule__Contacts__Group__0 : rule__Contacts__Group__0__Impl rule__Contacts__Group__1 ;
    public final void rule__Contacts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:299:1: ( rule__Contacts__Group__0__Impl rule__Contacts__Group__1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:300:2: rule__Contacts__Group__0__Impl rule__Contacts__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__0__Impl_in_rule__Contacts__Group__0552);
            rule__Contacts__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__1_in_rule__Contacts__Group__0555);
            rule__Contacts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__0"


    // $ANTLR start "rule__Contacts__Group__0__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:307:1: rule__Contacts__Group__0__Impl : ( () ) ;
    public final void rule__Contacts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:311:1: ( ( () ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:312:1: ( () )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:312:1: ( () )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:313:1: ()
            {
             before(grammarAccess.getContactsAccess().getContactsAction_0()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:314:1: ()
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:316:1: 
            {
            }

             after(grammarAccess.getContactsAccess().getContactsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__0__Impl"


    // $ANTLR start "rule__Contacts__Group__1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:326:1: rule__Contacts__Group__1 : rule__Contacts__Group__1__Impl rule__Contacts__Group__2 ;
    public final void rule__Contacts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:330:1: ( rule__Contacts__Group__1__Impl rule__Contacts__Group__2 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:331:2: rule__Contacts__Group__1__Impl rule__Contacts__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__1__Impl_in_rule__Contacts__Group__1613);
            rule__Contacts__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__2_in_rule__Contacts__Group__1616);
            rule__Contacts__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__1"


    // $ANTLR start "rule__Contacts__Group__1__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:338:1: rule__Contacts__Group__1__Impl : ( 'contacts' ) ;
    public final void rule__Contacts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:342:1: ( ( 'contacts' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:343:1: ( 'contacts' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:343:1: ( 'contacts' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:344:1: 'contacts'
            {
             before(grammarAccess.getContactsAccess().getContactsKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Contacts__Group__1__Impl644); 
             after(grammarAccess.getContactsAccess().getContactsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__1__Impl"


    // $ANTLR start "rule__Contacts__Group__2"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:357:1: rule__Contacts__Group__2 : rule__Contacts__Group__2__Impl rule__Contacts__Group__3 ;
    public final void rule__Contacts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:361:1: ( rule__Contacts__Group__2__Impl rule__Contacts__Group__3 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:362:2: rule__Contacts__Group__2__Impl rule__Contacts__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__2__Impl_in_rule__Contacts__Group__2675);
            rule__Contacts__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__3_in_rule__Contacts__Group__2678);
            rule__Contacts__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__2"


    // $ANTLR start "rule__Contacts__Group__2__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:369:1: rule__Contacts__Group__2__Impl : ( '{' ) ;
    public final void rule__Contacts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:373:1: ( ( '{' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:374:1: ( '{' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:374:1: ( '{' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:375:1: '{'
            {
             before(grammarAccess.getContactsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Contacts__Group__2__Impl706); 
             after(grammarAccess.getContactsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__2__Impl"


    // $ANTLR start "rule__Contacts__Group__3"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:388:1: rule__Contacts__Group__3 : rule__Contacts__Group__3__Impl rule__Contacts__Group__4 ;
    public final void rule__Contacts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:392:1: ( rule__Contacts__Group__3__Impl rule__Contacts__Group__4 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:393:2: rule__Contacts__Group__3__Impl rule__Contacts__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__3__Impl_in_rule__Contacts__Group__3737);
            rule__Contacts__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__4_in_rule__Contacts__Group__3740);
            rule__Contacts__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__3"


    // $ANTLR start "rule__Contacts__Group__3__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:400:1: rule__Contacts__Group__3__Impl : ( ( rule__Contacts__ContactAssignment_3 )* ) ;
    public final void rule__Contacts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:404:1: ( ( ( rule__Contacts__ContactAssignment_3 )* ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:405:1: ( ( rule__Contacts__ContactAssignment_3 )* )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:405:1: ( ( rule__Contacts__ContactAssignment_3 )* )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:406:1: ( rule__Contacts__ContactAssignment_3 )*
            {
             before(grammarAccess.getContactsAccess().getContactAssignment_3()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:407:1: ( rule__Contacts__ContactAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:407:2: rule__Contacts__ContactAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Contacts__ContactAssignment_3_in_rule__Contacts__Group__3__Impl767);
            	    rule__Contacts__ContactAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getContactsAccess().getContactAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__3__Impl"


    // $ANTLR start "rule__Contacts__Group__4"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:417:1: rule__Contacts__Group__4 : rule__Contacts__Group__4__Impl ;
    public final void rule__Contacts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:421:1: ( rule__Contacts__Group__4__Impl )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:422:2: rule__Contacts__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contacts__Group__4__Impl_in_rule__Contacts__Group__4798);
            rule__Contacts__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__4"


    // $ANTLR start "rule__Contacts__Group__4__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:428:1: rule__Contacts__Group__4__Impl : ( '}' ) ;
    public final void rule__Contacts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:432:1: ( ( '}' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:433:1: ( '}' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:433:1: ( '}' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:434:1: '}'
            {
             before(grammarAccess.getContactsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Contacts__Group__4__Impl826); 
             after(grammarAccess.getContactsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__Group__4__Impl"


    // $ANTLR start "rule__Contact__Group__0"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:457:1: rule__Contact__Group__0 : rule__Contact__Group__0__Impl rule__Contact__Group__1 ;
    public final void rule__Contact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:461:1: ( rule__Contact__Group__0__Impl rule__Contact__Group__1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:462:2: rule__Contact__Group__0__Impl rule__Contact__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__0__Impl_in_rule__Contact__Group__0867);
            rule__Contact__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__1_in_rule__Contact__Group__0870);
            rule__Contact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0"


    // $ANTLR start "rule__Contact__Group__0__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:469:1: rule__Contact__Group__0__Impl : ( () ) ;
    public final void rule__Contact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:473:1: ( ( () ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:474:1: ( () )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:474:1: ( () )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:475:1: ()
            {
             before(grammarAccess.getContactAccess().getContactAction_0()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:476:1: ()
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:478:1: 
            {
            }

             after(grammarAccess.getContactAccess().getContactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__0__Impl"


    // $ANTLR start "rule__Contact__Group__1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:488:1: rule__Contact__Group__1 : rule__Contact__Group__1__Impl rule__Contact__Group__2 ;
    public final void rule__Contact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:492:1: ( rule__Contact__Group__1__Impl rule__Contact__Group__2 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:493:2: rule__Contact__Group__1__Impl rule__Contact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__1__Impl_in_rule__Contact__Group__1928);
            rule__Contact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__2_in_rule__Contact__Group__1931);
            rule__Contact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1"


    // $ANTLR start "rule__Contact__Group__1__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:500:1: rule__Contact__Group__1__Impl : ( 'contact' ) ;
    public final void rule__Contact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:504:1: ( ( 'contact' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:505:1: ( 'contact' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:505:1: ( 'contact' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:506:1: 'contact'
            {
             before(grammarAccess.getContactAccess().getContactKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Contact__Group__1__Impl959); 
             after(grammarAccess.getContactAccess().getContactKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__1__Impl"


    // $ANTLR start "rule__Contact__Group__2"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:519:1: rule__Contact__Group__2 : rule__Contact__Group__2__Impl rule__Contact__Group__3 ;
    public final void rule__Contact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:523:1: ( rule__Contact__Group__2__Impl rule__Contact__Group__3 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:524:2: rule__Contact__Group__2__Impl rule__Contact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__2__Impl_in_rule__Contact__Group__2990);
            rule__Contact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__3_in_rule__Contact__Group__2993);
            rule__Contact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2"


    // $ANTLR start "rule__Contact__Group__2__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:531:1: rule__Contact__Group__2__Impl : ( ( rule__Contact__NameAssignment_2 ) ) ;
    public final void rule__Contact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:535:1: ( ( ( rule__Contact__NameAssignment_2 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:536:1: ( ( rule__Contact__NameAssignment_2 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:536:1: ( ( rule__Contact__NameAssignment_2 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:537:1: ( rule__Contact__NameAssignment_2 )
            {
             before(grammarAccess.getContactAccess().getNameAssignment_2()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:538:1: ( rule__Contact__NameAssignment_2 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:538:2: rule__Contact__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__NameAssignment_2_in_rule__Contact__Group__2__Impl1020);
            rule__Contact__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__2__Impl"


    // $ANTLR start "rule__Contact__Group__3"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:548:1: rule__Contact__Group__3 : rule__Contact__Group__3__Impl ;
    public final void rule__Contact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:552:1: ( rule__Contact__Group__3__Impl )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:553:2: rule__Contact__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__Group__3__Impl_in_rule__Contact__Group__31050);
            rule__Contact__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3"


    // $ANTLR start "rule__Contact__Group__3__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:559:1: rule__Contact__Group__3__Impl : ( ( rule__Contact__PhoneAssignment_3 ) ) ;
    public final void rule__Contact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:563:1: ( ( ( rule__Contact__PhoneAssignment_3 ) ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:564:1: ( ( rule__Contact__PhoneAssignment_3 ) )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:564:1: ( ( rule__Contact__PhoneAssignment_3 ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:565:1: ( rule__Contact__PhoneAssignment_3 )
            {
             before(grammarAccess.getContactAccess().getPhoneAssignment_3()); 
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:566:1: ( rule__Contact__PhoneAssignment_3 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:566:2: rule__Contact__PhoneAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contact__PhoneAssignment_3_in_rule__Contact__Group__3__Impl1077);
            rule__Contact__PhoneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContactAccess().getPhoneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__Group__3__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:584:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:588:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:589:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__01115);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__1_in_rule__Name__Group__01118);
            rule__Name__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:596:1: rule__Name__Group__0__Impl : ( 'name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:600:1: ( ( 'name' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:601:1: ( 'name' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:601:1: ( 'name' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:602:1: 'name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Name__Group__0__Impl1146); 
             after(grammarAccess.getNameAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:615:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:619:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:620:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__11177);
            rule__Name__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__2_in_rule__Name__Group__11180);
            rule__Name__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:627:1: rule__Name__Group__1__Impl : ( ruleEQUALS ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:631:1: ( ( ruleEQUALS ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:632:1: ( ruleEQUALS )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:632:1: ( ruleEQUALS )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:633:1: ruleEQUALS
            {
             before(grammarAccess.getNameAccess().getEQUALSParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_rule__Name__Group__1__Impl1207);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getNameAccess().getEQUALSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__2"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:644:1: rule__Name__Group__2 : rule__Name__Group__2__Impl ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:648:1: ( rule__Name__Group__2__Impl )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:649:2: rule__Name__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Name__Group__2__Impl_in_rule__Name__Group__21236);
            rule__Name__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2"


    // $ANTLR start "rule__Name__Group__2__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:655:1: rule__Name__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:659:1: ( ( RULE_STRING ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:660:1: ( RULE_STRING )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:660:1: ( RULE_STRING )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:661:1: RULE_STRING
            {
             before(grammarAccess.getNameAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Name__Group__2__Impl1263); 
             after(grammarAccess.getNameAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__2__Impl"


    // $ANTLR start "rule__Phone__Group__0"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:678:1: rule__Phone__Group__0 : rule__Phone__Group__0__Impl rule__Phone__Group__1 ;
    public final void rule__Phone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:682:1: ( rule__Phone__Group__0__Impl rule__Phone__Group__1 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:683:2: rule__Phone__Group__0__Impl rule__Phone__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__0__Impl_in_rule__Phone__Group__01298);
            rule__Phone__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__1_in_rule__Phone__Group__01301);
            rule__Phone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__0"


    // $ANTLR start "rule__Phone__Group__0__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:690:1: rule__Phone__Group__0__Impl : ( 'phone' ) ;
    public final void rule__Phone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:694:1: ( ( 'phone' ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:695:1: ( 'phone' )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:695:1: ( 'phone' )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:696:1: 'phone'
            {
             before(grammarAccess.getPhoneAccess().getPhoneKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Phone__Group__0__Impl1329); 
             after(grammarAccess.getPhoneAccess().getPhoneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__0__Impl"


    // $ANTLR start "rule__Phone__Group__1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:709:1: rule__Phone__Group__1 : rule__Phone__Group__1__Impl rule__Phone__Group__2 ;
    public final void rule__Phone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:713:1: ( rule__Phone__Group__1__Impl rule__Phone__Group__2 )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:714:2: rule__Phone__Group__1__Impl rule__Phone__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__1__Impl_in_rule__Phone__Group__11360);
            rule__Phone__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__2_in_rule__Phone__Group__11363);
            rule__Phone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__1"


    // $ANTLR start "rule__Phone__Group__1__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:721:1: rule__Phone__Group__1__Impl : ( ruleEQUALS ) ;
    public final void rule__Phone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:725:1: ( ( ruleEQUALS ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:726:1: ( ruleEQUALS )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:726:1: ( ruleEQUALS )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:727:1: ruleEQUALS
            {
             before(grammarAccess.getPhoneAccess().getEQUALSParserRuleCall_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEQUALS_in_rule__Phone__Group__1__Impl1390);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getPhoneAccess().getEQUALSParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__1__Impl"


    // $ANTLR start "rule__Phone__Group__2"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:738:1: rule__Phone__Group__2 : rule__Phone__Group__2__Impl ;
    public final void rule__Phone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:742:1: ( rule__Phone__Group__2__Impl )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:743:2: rule__Phone__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Phone__Group__2__Impl_in_rule__Phone__Group__21419);
            rule__Phone__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__2"


    // $ANTLR start "rule__Phone__Group__2__Impl"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:749:1: rule__Phone__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__Phone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:753:1: ( ( RULE_STRING ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:754:1: ( RULE_STRING )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:754:1: ( RULE_STRING )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:755:1: RULE_STRING
            {
             before(grammarAccess.getPhoneAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Phone__Group__2__Impl1446); 
             after(grammarAccess.getPhoneAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phone__Group__2__Impl"


    // $ANTLR start "rule__DocumentRoot__ContactsAssignment_1"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:773:1: rule__DocumentRoot__ContactsAssignment_1 : ( ruleContacts ) ;
    public final void rule__DocumentRoot__ContactsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:777:1: ( ( ruleContacts ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:778:1: ( ruleContacts )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:778:1: ( ruleContacts )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:779:1: ruleContacts
            {
             before(grammarAccess.getDocumentRootAccess().getContactsContactsParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContacts_in_rule__DocumentRoot__ContactsAssignment_11486);
            ruleContacts();

            state._fsp--;

             after(grammarAccess.getDocumentRootAccess().getContactsContactsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentRoot__ContactsAssignment_1"


    // $ANTLR start "rule__Contacts__ContactAssignment_3"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:788:1: rule__Contacts__ContactAssignment_3 : ( ruleContact ) ;
    public final void rule__Contacts__ContactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:792:1: ( ( ruleContact ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:793:1: ( ruleContact )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:793:1: ( ruleContact )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:794:1: ruleContact
            {
             before(grammarAccess.getContactsAccess().getContactContactParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContact_in_rule__Contacts__ContactAssignment_31517);
            ruleContact();

            state._fsp--;

             after(grammarAccess.getContactsAccess().getContactContactParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contacts__ContactAssignment_3"


    // $ANTLR start "rule__Contact__NameAssignment_2"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:803:1: rule__Contact__NameAssignment_2 : ( ruleName ) ;
    public final void rule__Contact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:807:1: ( ( ruleName ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:808:1: ( ruleName )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:808:1: ( ruleName )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:809:1: ruleName
            {
             before(grammarAccess.getContactAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_rule__Contact__NameAssignment_21548);
            ruleName();

            state._fsp--;

             after(grammarAccess.getContactAccess().getNameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__NameAssignment_2"


    // $ANTLR start "rule__Contact__PhoneAssignment_3"
    // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:818:1: rule__Contact__PhoneAssignment_3 : ( rulePhone ) ;
    public final void rule__Contact__PhoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:822:1: ( ( rulePhone ) )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:823:1: ( rulePhone )
            {
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:823:1: ( rulePhone )
            // ../com.acme.foo.dsl.ui/src-gen/com/acme/foo/dsl/ui/contentassist/antlr/internal/InternalMain.g:824:1: rulePhone
            {
             before(grammarAccess.getContactAccess().getPhonePhoneParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePhone_in_rule__Contact__PhoneAssignment_31579);
            rulePhone();

            state._fsp--;

             after(grammarAccess.getContactAccess().getPhonePhoneParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contact__PhoneAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDocumentRoot_in_entryRuleDocumentRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDocumentRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DocumentRoot__Group__0_in_ruleDocumentRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacts_in_entryRuleContacts121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContacts128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__0_in_ruleContacts154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_entryRuleContact181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContact188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__0_in_ruleContact214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_entryRuleName241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhone_in_entryRulePhone301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhone308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Phone__Group__0_in_rulePhone334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEQUALS_in_entryRuleEQUALS361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEQUALS368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEQUALS395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DocumentRoot__Group__0__Impl_in_rule__DocumentRoot__Group__0430 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DocumentRoot__Group__1_in_rule__DocumentRoot__Group__0433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DocumentRoot__Group__1__Impl_in_rule__DocumentRoot__Group__1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DocumentRoot__ContactsAssignment_1_in_rule__DocumentRoot__Group__1__Impl518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__0__Impl_in_rule__Contacts__Group__0552 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Contacts__Group__1_in_rule__Contacts__Group__0555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__1__Impl_in_rule__Contacts__Group__1613 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Contacts__Group__2_in_rule__Contacts__Group__1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Contacts__Group__1__Impl644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__2__Impl_in_rule__Contacts__Group__2675 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Contacts__Group__3_in_rule__Contacts__Group__2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Contacts__Group__2__Impl706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__3__Impl_in_rule__Contacts__Group__3737 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Contacts__Group__4_in_rule__Contacts__Group__3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contacts__ContactAssignment_3_in_rule__Contacts__Group__3__Impl767 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Contacts__Group__4__Impl_in_rule__Contacts__Group__4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Contacts__Group__4__Impl826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__0__Impl_in_rule__Contact__Group__0867 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Contact__Group__1_in_rule__Contact__Group__0870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__1__Impl_in_rule__Contact__Group__1928 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Contact__Group__2_in_rule__Contact__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Contact__Group__1__Impl959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__2__Impl_in_rule__Contact__Group__2990 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Contact__Group__3_in_rule__Contact__Group__2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__NameAssignment_2_in_rule__Contact__Group__2__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__Group__3__Impl_in_rule__Contact__Group__31050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contact__PhoneAssignment_3_in_rule__Contact__Group__3__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__01115 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__01118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Name__Group__0__Impl1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__11177 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Name__Group__2_in_rule__Name__Group__11180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEQUALS_in_rule__Name__Group__1__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Name__Group__2__Impl_in_rule__Name__Group__21236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Name__Group__2__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Phone__Group__0__Impl_in_rule__Phone__Group__01298 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Phone__Group__1_in_rule__Phone__Group__01301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Phone__Group__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Phone__Group__1__Impl_in_rule__Phone__Group__11360 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Phone__Group__2_in_rule__Phone__Group__11363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEQUALS_in_rule__Phone__Group__1__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Phone__Group__2__Impl_in_rule__Phone__Group__21419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Phone__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContacts_in_rule__DocumentRoot__ContactsAssignment_11486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContact_in_rule__Contacts__ContactAssignment_31517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_rule__Contact__NameAssignment_21548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhone_in_rule__Contact__PhoneAssignment_31579 = new BitSet(new long[]{0x0000000000000002L});
    }


}