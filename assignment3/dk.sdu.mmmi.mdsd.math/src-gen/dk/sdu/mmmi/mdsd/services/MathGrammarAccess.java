/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cExternalsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExternalsExternalParserRuleCall_2_0 = (RuleCall)cExternalsAssignment_2.eContents().get(0);
		private final Assignment cMathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMathMathExpParserRuleCall_3_0 = (RuleCall)cMathAssignment_3.eContents().get(0);
		
		//Program:
		//    'program' name=ID (externals+=External)* math=MathExp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'program' name=ID (externals+=External)* math=MathExp
		public Group getGroup() { return cGroup; }
		
		//'program'
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(externals+=External)*
		public Assignment getExternalsAssignment_2() { return cExternalsAssignment_2; }
		
		//External
		public RuleCall getExternalsExternalParserRuleCall_2_0() { return cExternalsExternalParserRuleCall_2_0; }
		
		//math=MathExp
		public Assignment getMathAssignment_3() { return cMathAssignment_3; }
		
		//MathExp
		public RuleCall getMathMathExpParserRuleCall_3_0() { return cMathMathExpParserRuleCall_3_0; }
	}
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Assignment cVariablesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVariablesVarBindingParserRuleCall_0 = (RuleCall)cVariablesAssignment.eContents().get(0);
		
		//MathExp:
		//    variables += VarBinding*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//variables += VarBinding*
		public Assignment getVariablesAssignment() { return cVariablesAssignment; }
		
		//VarBinding
		public RuleCall getVariablesVarBindingParserRuleCall_0() { return cVariablesVarBindingParserRuleCall_0; }
	}
	public class ExternalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.External");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypesIDTerminalRuleCall_3_0 = (RuleCall)cTypesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTypesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTypesIDTerminalRuleCall_4_1_0 = (RuleCall)cTypesAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//External:
		//    "external" name=ID "(" types+=ID? ("," types+=ID)* ")"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"external" name=ID "(" types+=ID? ("," types+=ID)* ")"
		public Group getGroup() { return cGroup; }
		
		//"external"
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//types+=ID?
		public Assignment getTypesAssignment_3() { return cTypesAssignment_3; }
		
		//ID
		public RuleCall getTypesIDTerminalRuleCall_3_0() { return cTypesIDTerminalRuleCall_3_0; }
		
		//("," types+=ID)*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//types+=ID
		public Assignment getTypesAssignment_4_1() { return cTypesAssignment_4_1; }
		
		//ID
		public RuleCall getTypesIDTerminalRuleCall_4_1_0() { return cTypesIDTerminalRuleCall_4_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class ExternalCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.ExternalCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExternalCallAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cExternalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cExternalExternalCrossReference_1_0 = (CrossReference)cExternalAssignment_1.eContents().get(0);
		private final RuleCall cExternalExternalIDTerminalRuleCall_1_0_1 = (RuleCall)cExternalExternalCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cArgumentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cArgumentsExpParserRuleCall_3_0 = (RuleCall)cArgumentsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cArgumentsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cArgumentsExpParserRuleCall_4_1_0 = (RuleCall)cArgumentsAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ExternalCall returns Expression:
		//    {ExternalCall} external=[External] "(" arguments+=Exp? ("," arguments+=Exp)* ")"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ExternalCall} external=[External] "(" arguments+=Exp? ("," arguments+=Exp)* ")"
		public Group getGroup() { return cGroup; }
		
		//{ExternalCall}
		public Action getExternalCallAction_0() { return cExternalCallAction_0; }
		
		//external=[External]
		public Assignment getExternalAssignment_1() { return cExternalAssignment_1; }
		
		//[External]
		public CrossReference getExternalExternalCrossReference_1_0() { return cExternalExternalCrossReference_1_0; }
		
		//ID
		public RuleCall getExternalExternalIDTerminalRuleCall_1_0_1() { return cExternalExternalIDTerminalRuleCall_1_0_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//arguments+=Exp?
		public Assignment getArgumentsAssignment_3() { return cArgumentsAssignment_3; }
		
		//Exp
		public RuleCall getArgumentsExpParserRuleCall_3_0() { return cArgumentsExpParserRuleCall_3_0; }
		
		//("," arguments+=Exp)*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//arguments+=Exp
		public Assignment getArgumentsAssignment_4_1() { return cArgumentsAssignment_4_1; }
		
		//Exp
		public RuleCall getArgumentsExpParserRuleCall_4_1_0() { return cArgumentsExpParserRuleCall_4_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class VarBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VarBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//VarBinding:
		//    'var' name=ID '=' expression=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' expression=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//expression=Exp
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Exp
		public RuleCall getExpressionExpParserRuleCall_3_0() { return cExpressionExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightFactorParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression:
		//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//(( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup_1() { return cGroup_1; }
		
		//( {Plus.left=current} '+' | {Minus.left=current}  '-' )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current}  '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_0() { return cRightFactorParserRuleCall_1_1_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Factor returns Expression:
		//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current}  '/'  )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current}  '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMathNumberAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cExternalCallParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Primary returns Expression:
		//    {MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | ExternalCall
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | ExternalCall
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MathNumber} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{MathNumber}
		public Action getMathNumberAction_0_0() { return cMathNumberAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//'(' Exp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_1_1() { return cExpParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_3() { return cLetBindingParserRuleCall_3; }
		
		//ExternalCall
		public RuleCall getExternalCallParserRuleCall_4() { return cExternalCallParserRuleCall_4; }
	}
	public class LetBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBindingAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingExpParserRuleCall_3_0 = (RuleCall)cBindingAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetBinding:
		//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//binding=Exp
		public Assignment getBindingAssignment_3() { return cBindingAssignment_3; }
		
		//Exp
		public RuleCall getBindingExpParserRuleCall_3_0() { return cBindingExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//body=Exp
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//Exp
		public RuleCall getBodyExpParserRuleCall_5_0() { return cBodyExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Binding");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Binding:
		//    VarBinding | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//VarBinding | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarBinding
		public RuleCall getVarBindingParserRuleCall_0() { return cVarBindingParserRuleCall_0; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_1() { return cLetBindingParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefBindingCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_0_1 = (RuleCall)cRefBindingCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [Binding]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [Binding]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_0() { return cRefBindingCrossReference_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_0_1() { return cRefBindingIDTerminalRuleCall_0_1; }
	}
	
	
	private final ProgramElements pProgram;
	private final MathExpElements pMathExp;
	private final ExternalElements pExternal;
	private final ExternalCallElements pExternalCall;
	private final VarBindingElements pVarBinding;
	private final ExpElements pExp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final LetBindingElements pLetBinding;
	private final BindingElements pBinding;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pMathExp = new MathExpElements();
		this.pExternal = new ExternalElements();
		this.pExternalCall = new ExternalCallElements();
		this.pVarBinding = new VarBindingElements();
		this.pExp = new ExpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pLetBinding = new LetBindingElements();
		this.pBinding = new BindingElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//    'program' name=ID (externals+=External)* math=MathExp
	//;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//MathExp:
	//    variables += VarBinding*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//External:
	//    "external" name=ID "(" types+=ID? ("," types+=ID)* ")"
	//;
	public ExternalElements getExternalAccess() {
		return pExternal;
	}
	
	public ParserRule getExternalRule() {
		return getExternalAccess().getRule();
	}
	
	//ExternalCall returns Expression:
	//    {ExternalCall} external=[External] "(" arguments+=Exp? ("," arguments+=Exp)* ")"
	//;
	public ExternalCallElements getExternalCallAccess() {
		return pExternalCall;
	}
	
	public ParserRule getExternalCallRule() {
		return getExternalCallAccess().getRule();
	}
	
	//VarBinding:
	//    'var' name=ID '=' expression=Exp
	//;
	public VarBindingElements getVarBindingAccess() {
		return pVarBinding;
	}
	
	public ParserRule getVarBindingRule() {
		return getVarBindingAccess().getRule();
	}
	
	//Exp returns Expression:
	//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Factor returns Expression:
	//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
	//;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary returns Expression:
	//    {MathNumber} value=INT  | '(' Exp ')'  |  VariableUse | LetBinding | ExternalCall
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//LetBinding:
	//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
	//;
	public LetBindingElements getLetBindingAccess() {
		return pLetBinding;
	}
	
	public ParserRule getLetBindingRule() {
		return getLetBindingAccess().getRule();
	}
	
	//Binding:
	//    VarBinding | LetBinding
	//;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [Binding]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
