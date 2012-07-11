/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.annotations.services.XbaseWithAnnotationsGrammarAccess;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class RouteGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cDeclarationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDeclarationsAbstractDeclarationParserRuleCall_1_0 = (RuleCall)cDeclarationsAssignment_1.eContents().get(0);
		
		//Model:
		//	imports+=Import* declarations+=AbstractDeclaration*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* declarations+=AbstractDeclaration*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//declarations+=AbstractDeclaration*
		public Assignment getDeclarationsAssignment_1() { return cDeclarationsAssignment_1; }

		//AbstractDeclaration
		public RuleCall getDeclarationsAbstractDeclarationParserRuleCall_1_0() { return cDeclarationsAbstractDeclarationParserRuleCall_1_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cImportedTypeJvmTypeCrossReference_1_0 = (CrossReference)cImportedTypeAssignment_1.eContents().get(0);
		private final RuleCall cImportedTypeJvmTypeQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cImportedTypeJvmTypeCrossReference_1_0.eContents().get(1);
		
		//Import:
		//	"import" importedType=[types::JvmType|QualifiedName];
		public ParserRule getRule() { return rule; }

		//"import" importedType=[types::JvmType|QualifiedName]
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedType=[types::JvmType|QualifiedName]
		public Assignment getImportedTypeAssignment_1() { return cImportedTypeAssignment_1; }

		//[types::JvmType|QualifiedName]
		public CrossReference getImportedTypeJvmTypeCrossReference_1_0() { return cImportedTypeJvmTypeCrossReference_1_0; }

		//QualifiedName
		public RuleCall getImportedTypeJvmTypeQualifiedNameParserRuleCall_1_0_1() { return cImportedTypeJvmTypeQualifiedNameParserRuleCall_1_0_1; }
	}

	public class AbstractDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractDeclaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDependencyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRouteParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDeclaration:
		//	Dependency | Route;
		public ParserRule getRule() { return rule; }

		//Dependency | Route
		public Alternatives getAlternatives() { return cAlternatives; }

		//Dependency
		public RuleCall getDependencyParserRuleCall_0() { return cDependencyParserRuleCall_0; }

		//Route
		public RuleCall getRouteParserRuleCall_1() { return cRouteParserRuleCall_1; }
	}

	public class DependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Dependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationsXAnnotationParserRuleCall_1_0 = (RuleCall)cAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeJvmTypeReferenceParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Dependency:
		//	"inject" annotations+=XAnnotation? type=JvmTypeReference name=ID;
		public ParserRule getRule() { return rule; }

		//"inject" annotations+=XAnnotation? type=JvmTypeReference name=ID
		public Group getGroup() { return cGroup; }

		//"inject"
		public Keyword getInjectKeyword_0() { return cInjectKeyword_0; }

		//annotations+=XAnnotation?
		public Assignment getAnnotationsAssignment_1() { return cAnnotationsAssignment_1; }

		//XAnnotation
		public RuleCall getAnnotationsXAnnotationParserRuleCall_1_0() { return cAnnotationsXAnnotationParserRuleCall_1_0; }

		//type=JvmTypeReference
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//JvmTypeReference
		public RuleCall getTypeJvmTypeReferenceParserRuleCall_2_0() { return cTypeJvmTypeReferenceParserRuleCall_2_0; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}

	public class RouteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Route");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRequestTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRequestTypeRequestTypeEnumRuleCall_0_0 = (RuleCall)cRequestTypeAssignment_0.eContents().get(0);
		private final Assignment cUrlAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUrlURLParserRuleCall_1_0 = (RuleCall)cUrlAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWhenKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cConditionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cConditionXExpressionParserRuleCall_2_1_0 = (RuleCall)cConditionAssignment_2_1.eContents().get(0);
		private final Keyword cDoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCallAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCallXExpressionParserRuleCall_4_0 = (RuleCall)cCallAssignment_4.eContents().get(0);
		
		//Route:
		//	requestType=RequestType url=URL ("when" condition=XExpression)? "do" call=XExpression;
		public ParserRule getRule() { return rule; }

		//requestType=RequestType url=URL ("when" condition=XExpression)? "do" call=XExpression
		public Group getGroup() { return cGroup; }

		//requestType=RequestType
		public Assignment getRequestTypeAssignment_0() { return cRequestTypeAssignment_0; }

		//RequestType
		public RuleCall getRequestTypeRequestTypeEnumRuleCall_0_0() { return cRequestTypeRequestTypeEnumRuleCall_0_0; }

		//url=URL
		public Assignment getUrlAssignment_1() { return cUrlAssignment_1; }

		//URL
		public RuleCall getUrlURLParserRuleCall_1_0() { return cUrlURLParserRuleCall_1_0; }

		//("when" condition=XExpression)?
		public Group getGroup_2() { return cGroup_2; }

		//"when"
		public Keyword getWhenKeyword_2_0() { return cWhenKeyword_2_0; }

		//condition=XExpression
		public Assignment getConditionAssignment_2_1() { return cConditionAssignment_2_1; }

		//XExpression
		public RuleCall getConditionXExpressionParserRuleCall_2_1_0() { return cConditionXExpressionParserRuleCall_2_1_0; }

		//"do"
		public Keyword getDoKeyword_3() { return cDoKeyword_3; }

		//call=XExpression
		public Assignment getCallAssignment_4() { return cCallAssignment_4; }

		//XExpression
		public RuleCall getCallXExpressionParserRuleCall_4_0() { return cCallXExpressionParserRuleCall_4_0; }
	}

	public class URLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cURLAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Group cGroup_1_1_0 = (Group)cGroup_1_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_0_0 = (Keyword)cGroup_1_1_0.eContents().get(0);
		private final Alternatives cAlternatives_1_1_0_1 = (Alternatives)cGroup_1_1_0.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_1_1_0_1_0 = (RuleCall)cAlternatives_1_1_0_1.eContents().get(0);
		private final Assignment cVariablesAssignment_1_1_0_1_1 = (Assignment)cAlternatives_1_1_0_1.eContents().get(1);
		private final RuleCall cVariablesVariableParserRuleCall_1_1_0_1_1_0 = (RuleCall)cVariablesAssignment_1_1_0_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cSolidusKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cVariablesAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cVariablesVariableParserRuleCall_1_1_1_1_0 = (RuleCall)cVariablesAssignment_1_1_1_1.eContents().get(0);
		private final Assignment cWildcardAssignment_1_1_1_2 = (Assignment)cGroup_1_1_1.eContents().get(2);
		private final Keyword cWildcardAsteriskKeyword_1_1_1_2_0 = (Keyword)cWildcardAssignment_1_1_1_2.eContents().get(0);
		
		/// **
		// * matches URLs like 
		// * 	'/foo/bar.html' or 
		// * 	'/customer/:customerID/save'
		// * / URL:
		//	{URL} ("/" | ("/" (QualifiedName | variables+=Variable))* ("/" variables+=Variable wildcard?="*")?);
		public ParserRule getRule() { return rule; }

		//{URL} ("/" | ("/" (QualifiedName | variables+=Variable))* ("/" variables+=Variable wildcard?="*")?)
		public Group getGroup() { return cGroup; }

		//{URL}
		public Action getURLAction_0() { return cURLAction_0; }

		//"/" | ("/" (QualifiedName | variables+=Variable))* ("/" variables+=Variable wildcard?="*")?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"/"
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }

		//("/" (QualifiedName | variables+=Variable))* ("/" variables+=Variable wildcard?="*")?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//("/" (QualifiedName | variables+=Variable))*
		public Group getGroup_1_1_0() { return cGroup_1_1_0; }

		//"/"
		public Keyword getSolidusKeyword_1_1_0_0() { return cSolidusKeyword_1_1_0_0; }

		//QualifiedName | variables+=Variable
		public Alternatives getAlternatives_1_1_0_1() { return cAlternatives_1_1_0_1; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_1_0_1_0() { return cQualifiedNameParserRuleCall_1_1_0_1_0; }

		//variables+=Variable
		public Assignment getVariablesAssignment_1_1_0_1_1() { return cVariablesAssignment_1_1_0_1_1; }

		//Variable
		public RuleCall getVariablesVariableParserRuleCall_1_1_0_1_1_0() { return cVariablesVariableParserRuleCall_1_1_0_1_1_0; }

		//("/" variables+=Variable wildcard?="*")?
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }

		//"/"
		public Keyword getSolidusKeyword_1_1_1_0() { return cSolidusKeyword_1_1_1_0; }

		//variables+=Variable
		public Assignment getVariablesAssignment_1_1_1_1() { return cVariablesAssignment_1_1_1_1; }

		//Variable
		public RuleCall getVariablesVariableParserRuleCall_1_1_1_1_0() { return cVariablesVariableParserRuleCall_1_1_1_1_0; }

		//wildcard?="*"
		public Assignment getWildcardAssignment_1_1_1_2() { return cWildcardAssignment_1_1_1_2; }

		//"*"
		public Keyword getWildcardAsteriskKeyword_1_1_1_2_0() { return cWildcardAsteriskKeyword_1_1_1_2_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable:
		//	":" name=ID;
		public ParserRule getRule() { return rule; }

		//":" name=ID
		public Group getGroup() { return cGroup; }

		//":"
		public Keyword getColonKeyword_0() { return cColonKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	public class RequestTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "RequestType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cGETEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cGETGETKeyword_0_0 = (Keyword)cGETEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPOSTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPOSTPOSTKeyword_1_0 = (Keyword)cPOSTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPUTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPUTPUTKeyword_2_0 = (Keyword)cPUTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDELETEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDELETEDELETEKeyword_3_0 = (Keyword)cDELETEEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cHEADEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cHEADHEADKeyword_4_0 = (Keyword)cHEADEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum RequestType:
		//	GET | POST | PUT | DELETE | HEAD;
		public EnumRule getRule() { return rule; }

		//GET | POST | PUT | DELETE | HEAD
		public Alternatives getAlternatives() { return cAlternatives; }

		//GET
		public EnumLiteralDeclaration getGETEnumLiteralDeclaration_0() { return cGETEnumLiteralDeclaration_0; }

		//"GET"
		public Keyword getGETGETKeyword_0_0() { return cGETGETKeyword_0_0; }

		//POST
		public EnumLiteralDeclaration getPOSTEnumLiteralDeclaration_1() { return cPOSTEnumLiteralDeclaration_1; }

		//"POST"
		public Keyword getPOSTPOSTKeyword_1_0() { return cPOSTPOSTKeyword_1_0; }

		//PUT
		public EnumLiteralDeclaration getPUTEnumLiteralDeclaration_2() { return cPUTEnumLiteralDeclaration_2; }

		//"PUT"
		public Keyword getPUTPUTKeyword_2_0() { return cPUTPUTKeyword_2_0; }

		//DELETE
		public EnumLiteralDeclaration getDELETEEnumLiteralDeclaration_3() { return cDELETEEnumLiteralDeclaration_3; }

		//"DELETE"
		public Keyword getDELETEDELETEKeyword_3_0() { return cDELETEDELETEKeyword_3_0; }

		//HEAD
		public EnumLiteralDeclaration getHEADEnumLiteralDeclaration_4() { return cHEADEnumLiteralDeclaration_4; }

		//"HEAD"
		public Keyword getHEADHEADKeyword_4_0() { return cHEADHEADKeyword_4_0; }
	}
	
	private ModelElements pModel;
	private ImportElements pImport;
	private AbstractDeclarationElements pAbstractDeclaration;
	private DependencyElements pDependency;
	private RouteElements pRoute;
	private RequestTypeElements unknownRuleRequestType;
	private URLElements pURL;
	private VariableElements pVariable;
	
	private final Grammar grammar;

	private XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations;

	@Inject
	public RouteGrammarAccess(GrammarProvider grammarProvider,
		XbaseWithAnnotationsGrammarAccess gaXbaseWithAnnotations) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbaseWithAnnotations = gaXbaseWithAnnotations;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.httprouting.Route".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public XbaseWithAnnotationsGrammarAccess getXbaseWithAnnotationsGrammarAccess() {
		return gaXbaseWithAnnotations;
	}

	
	//Model:
	//	imports+=Import* declarations+=AbstractDeclaration*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Import:
	//	"import" importedType=[types::JvmType|QualifiedName];
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//AbstractDeclaration:
	//	Dependency | Route;
	public AbstractDeclarationElements getAbstractDeclarationAccess() {
		return (pAbstractDeclaration != null) ? pAbstractDeclaration : (pAbstractDeclaration = new AbstractDeclarationElements());
	}
	
	public ParserRule getAbstractDeclarationRule() {
		return getAbstractDeclarationAccess().getRule();
	}

	//Dependency:
	//	"inject" annotations+=XAnnotation? type=JvmTypeReference name=ID;
	public DependencyElements getDependencyAccess() {
		return (pDependency != null) ? pDependency : (pDependency = new DependencyElements());
	}
	
	public ParserRule getDependencyRule() {
		return getDependencyAccess().getRule();
	}

	//Route:
	//	requestType=RequestType url=URL ("when" condition=XExpression)? "do" call=XExpression;
	public RouteElements getRouteAccess() {
		return (pRoute != null) ? pRoute : (pRoute = new RouteElements());
	}
	
	public ParserRule getRouteRule() {
		return getRouteAccess().getRule();
	}

	//enum RequestType:
	//	GET | POST | PUT | DELETE | HEAD;
	public RequestTypeElements getRequestTypeAccess() {
		return (unknownRuleRequestType != null) ? unknownRuleRequestType : (unknownRuleRequestType = new RequestTypeElements());
	}
	
	public EnumRule getRequestTypeRule() {
		return getRequestTypeAccess().getRule();
	}

	/// **
	// * matches URLs like 
	// * 	'/foo/bar.html' or 
	// * 	'/customer/:customerID/save'
	// * / URL:
	//	{URL} ("/" | ("/" (QualifiedName | variables+=Variable))* ("/" variables+=Variable wildcard?="*")?);
	public URLElements getURLAccess() {
		return (pURL != null) ? pURL : (pURL = new URLElements());
	}
	
	public ParserRule getURLRule() {
		return getURLAccess().getRule();
	}

	//Variable:
	//	":" name=ID;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//XAnnotation:
	//	{XAnnotation} "@" annotationType=[types::JvmAnnotationType|QualifiedName] ("("
	//	(elementValuePairs+=XAnnotationElementValuePair ("," elementValuePairs+=XAnnotationElementValuePair)* |
	//	value=XAnnotationElementValue)? ")")?;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElements getXAnnotationAccess() {
		return gaXbaseWithAnnotations.getXAnnotationAccess();
	}
	
	public ParserRule getXAnnotationRule() {
		return getXAnnotationAccess().getRule();
	}

	//XAnnotationElementValuePair:
	//	element=[types::JvmOperation|ValidID] "=" value=XAnnotationElementValue;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValuePairElements getXAnnotationElementValuePairAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValuePairAccess();
	}
	
	public ParserRule getXAnnotationElementValuePairRule() {
		return getXAnnotationElementValuePairAccess().getRule();
	}

	//XAnnotationElementValueStringConcatenation returns xbase::XExpression:
	//	XAnnotationElementValue ({XAnnotationElementValueBinaryOperation.leftOperand=current} operator="+"
	//	rightOperand=XAnnotationElementValue)*;
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValueStringConcatenationElements getXAnnotationElementValueStringConcatenationAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValueStringConcatenationAccess();
	}
	
	public ParserRule getXAnnotationElementValueStringConcatenationRule() {
		return getXAnnotationElementValueStringConcatenationAccess().getRule();
	}

	//XAnnotationElementValue returns xbase::XExpression:
	//	XAnnotation | XAnnotationValueArray | XStringLiteral | XBooleanLiteral | XNumberLiteral | XTypeLiteral |
	//	XAnnotationValueFieldReference | "(" XAnnotationElementValueStringConcatenation ")";
	public XbaseWithAnnotationsGrammarAccess.XAnnotationElementValueElements getXAnnotationElementValueAccess() {
		return gaXbaseWithAnnotations.getXAnnotationElementValueAccess();
	}
	
	public ParserRule getXAnnotationElementValueRule() {
		return getXAnnotationElementValueAccess().getRule();
	}

	//XAnnotationValueFieldReference returns xbase::XExpression:
	//	{xbase::XFeatureCall} declaringType=[types::JvmDeclaredType|StaticQualifier]?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper];
	public XbaseWithAnnotationsGrammarAccess.XAnnotationValueFieldReferenceElements getXAnnotationValueFieldReferenceAccess() {
		return gaXbaseWithAnnotations.getXAnnotationValueFieldReferenceAccess();
	}
	
	public ParserRule getXAnnotationValueFieldReferenceRule() {
		return getXAnnotationValueFieldReferenceAccess().getRule();
	}

	//XAnnotationValueArray returns xbase::XExpression:
	//	{XAnnotationValueArray} "{" values+=XAnnotationElementValue ("," values+=XAnnotationElementValue)* "}";
	public XbaseWithAnnotationsGrammarAccess.XAnnotationValueArrayElements getXAnnotationValueArrayAccess() {
		return gaXbaseWithAnnotations.getXAnnotationValueArrayAccess();
	}
	
	public ParserRule getXAnnotationValueArrayRule() {
		return getXAnnotationValueArrayAccess().getRule();
	}

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbaseWithAnnotations.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} / * (declaringType=[types::JvmDeclaredType] '::')? * / feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign value=XAssignment | XOrExpression (=> ({XBinaryOperation.leftOperand=current}
	//	feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbaseWithAnnotations.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbaseWithAnnotations.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbaseWithAnnotations.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbaseWithAnnotations.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbaseWithAnnotations.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbaseWithAnnotations.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbaseWithAnnotations.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbaseWithAnnotations.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbaseWithAnnotations.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof") type=JvmTypeReference | =>
	//	({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare])
	//	rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbaseWithAnnotations.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbaseWithAnnotations.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbaseWithAnnotations.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | ".." | "=>" | ">" (=> (">" ">") | ">") | "<" (=> ("<" "<") | "<") | "<>" | "?:" | "<=>";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbaseWithAnnotations.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbaseWithAnnotations.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbaseWithAnnotations.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbaseWithAnnotations.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbaseWithAnnotations.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XCastedExpression | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbaseWithAnnotations.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbaseWithAnnotations.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XMemberFeatureCall (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbaseWithAnnotations.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} "." feature=[types::JvmIdentifiableElement|ValidID]
	//	OpSingleAssign) value=XAssignment | => ({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." |
	//	spreading?="*.")) ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|ValidID] (=> explicitOperationCall?="(" (memberCallArguments+=XShortClosure |
	//	memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")? memberCallArguments+=XClosure?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbaseWithAnnotations.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XPrimaryExpression returns XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
	//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
	//	XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbaseWithAnnotations.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//XLiteral returns XExpression:
	//	XClosure | XBooleanLiteral | XNumberLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbaseWithAnnotations.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XClosure returns XExpression:
	//	=> ({XClosure} "[") => ((declaredFormalParameters+=JvmFormalParameter (","
	//	declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?="|")? expression=XExpressionInClosure "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbaseWithAnnotations.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XExpressionInClosure returns XExpression:
	//	{XBlockExpression} (expressions+=XExpressionInsideBlock ";"?)*;
	public XbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaXbaseWithAnnotations.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (declaredFormalParameters+=JvmFormalParameter ("," declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?="|") expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbaseWithAnnotations.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbaseWithAnnotations.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbaseWithAnnotations.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (=> (localVarName=ValidID ":")? switch=XExpression | => ("(" localVarName=ValidID ":")
	//	switch=XExpression ")") "{" cases+=XCasePart+ ("default" ":" default=XExpression)? "}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbaseWithAnnotations.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	typeGuard=JvmTypeReference? ("case" case=XExpression)? ":" then=XExpression;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbaseWithAnnotations.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	{XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":" forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbaseWithAnnotations.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbaseWithAnnotations.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbaseWithAnnotations.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionInsideBlock ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbaseWithAnnotations.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionInsideBlock returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionInsideBlockElements getXExpressionInsideBlockAccess() {
		return gaXbaseWithAnnotations.getXExpressionInsideBlockAccess();
	}
	
	public ParserRule getXExpressionInsideBlockRule() {
		return getXExpressionInsideBlockAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbaseWithAnnotations.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbaseWithAnnotations.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//FullJvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference name=ValidID;
	public XbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaXbaseWithAnnotations.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} declaringType=[types::JvmDeclaredType|StaticQualifier]? ("<" typeArguments+=JvmArgumentTypeReference
	//	("," typeArguments+=JvmArgumentTypeReference)* ">")? feature=[types::JvmIdentifiableElement|IdOrSuper] (=>
	//	explicitOperationCall?="(" (featureCallArguments+=XShortClosure | featureCallArguments+=XExpression (","
	//	featureCallArguments+=XExpression)*)? ")")? featureCallArguments+=XClosure?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbaseWithAnnotations.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//IdOrSuper:
	//	ValidID | "super";
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbaseWithAnnotations.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}

	//// This is a workaround since ANTLR will not be able to resolve
	//// StaticQualifier: ValidID ('::' ValidID)*; and XFeatureCall: (StaticQualifier '::')? ValidID
	//// Make sure to change the value converter if you change the syntax of the StaticQualifier
	//StaticQualifier:
	//	(ValidID "::")+;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbaseWithAnnotations.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? ("("
	//	(arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")")? arguments+=XClosure?;
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbaseWithAnnotations.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbaseWithAnnotations.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbaseWithAnnotations.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XNumberLiteral returns XExpression:
	//	{XNumberLiteral} value=Number;
	public XbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaXbaseWithAnnotations.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbaseWithAnnotations.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbaseWithAnnotations.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbaseWithAnnotations.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" => expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbaseWithAnnotations.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbaseWithAnnotations.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=FullJvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbaseWithAnnotations.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbaseWithAnnotations.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Number hidden():
	//	HEX | (INT | DECIMAL) ("." (INT | DECIMAL))?;
	public XbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaXbaseWithAnnotations.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal HEX:
	//	("0x" | "0X") ("0".."9" | "a".."f" | "A".."F" | "_")+ ("#" (("b" | "B") ("i" | "I") | ("l" | "L")))?;
	public TerminalRule getHEXRule() {
		return gaXbaseWithAnnotations.getHEXRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9" ("0".."9" | "_")*;
	public TerminalRule getINTRule() {
		return gaXbaseWithAnnotations.getINTRule();
	} 

	//terminal DECIMAL:
	//	INT (("e" | "E") ("+" | "-")? INT)? (("b" | "B") ("i" | "I" | "d" | "D") | ("l" | "L" | "d" | "D" | "f" | "F"))?;
	public TerminalRule getDECIMALRule() {
		return gaXbaseWithAnnotations.getDECIMALRule();
	} 

	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} "[" "]")* | XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" (paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)*)? ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbaseWithAnnotations.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)*
	//	">")?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbaseWithAnnotations.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbaseWithAnnotations.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbaseWithAnnotations.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbaseWithAnnotations.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbaseWithAnnotations.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXbaseWithAnnotations.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "$" | "_") ("a".."z" | "A".."Z" | "$" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbaseWithAnnotations.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaXbaseWithAnnotations.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbaseWithAnnotations.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbaseWithAnnotations.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbaseWithAnnotations.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbaseWithAnnotations.getANY_OTHERRule();
	} 
}
