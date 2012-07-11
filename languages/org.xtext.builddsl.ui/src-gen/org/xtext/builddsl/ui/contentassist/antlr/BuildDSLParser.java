/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.builddsl.services.BuildDSLGrammarAccess;

public class BuildDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private BuildDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.builddsl.ui.contentassist.antlr.internal.InternalBuildDSLParser createParser() {
		org.xtext.builddsl.ui.contentassist.antlr.internal.InternalBuildDSLParser result = new org.xtext.builddsl.ui.contentassist.antlr.internal.InternalBuildDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getXAssignmentAccess().getAlternatives(), "rule__XAssignment__Alternatives");
					put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
					put(grammarAccess.getXRelationalExpressionAccess().getAlternatives_1(), "rule__XRelationalExpression__Alternatives_1");
					put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
					put(grammarAccess.getOpOtherAccess().getAlternatives(), "rule__OpOther__Alternatives");
					put(grammarAccess.getOpOtherAccess().getAlternatives_3_1(), "rule__OpOther__Alternatives_3_1");
					put(grammarAccess.getOpOtherAccess().getAlternatives_4_1(), "rule__OpOther__Alternatives_4_1");
					put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
					put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
					put(grammarAccess.getXUnaryOperationAccess().getAlternatives(), "rule__XUnaryOperation__Alternatives");
					put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
					put(grammarAccess.getXMemberFeatureCallAccess().getAlternatives_1(), "rule__XMemberFeatureCall__Alternatives_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getAlternatives_1_1_0_0_1(), "rule__XMemberFeatureCall__Alternatives_1_1_0_0_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getAlternatives_1_1_3_1(), "rule__XMemberFeatureCall__Alternatives_1_1_3_1");
					put(grammarAccess.getXPrimaryExpressionAccess().getAlternatives(), "rule__XPrimaryExpression__Alternatives");
					put(grammarAccess.getXLiteralAccess().getAlternatives(), "rule__XLiteral__Alternatives");
					put(grammarAccess.getXSwitchExpressionAccess().getAlternatives_2(), "rule__XSwitchExpression__Alternatives_2");
					put(grammarAccess.getXExpressionInsideBlockAccess().getAlternatives(), "rule__XExpressionInsideBlock__Alternatives");
					put(grammarAccess.getXVariableDeclarationAccess().getAlternatives_1(), "rule__XVariableDeclaration__Alternatives_1");
					put(grammarAccess.getXVariableDeclarationAccess().getAlternatives_2(), "rule__XVariableDeclaration__Alternatives_2");
					put(grammarAccess.getXFeatureCallAccess().getAlternatives_4_1(), "rule__XFeatureCall__Alternatives_4_1");
					put(grammarAccess.getIdOrSuperAccess().getAlternatives(), "rule__IdOrSuper__Alternatives");
					put(grammarAccess.getXConstructorCallAccess().getAlternatives_4_1(), "rule__XConstructorCall__Alternatives_4_1");
					put(grammarAccess.getXBooleanLiteralAccess().getAlternatives_1(), "rule__XBooleanLiteral__Alternatives_1");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getAlternatives_3(), "rule__XTryCatchFinallyExpression__Alternatives_3");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_1_0(), "rule__Number__Alternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives_1_1_1(), "rule__Number__Alternatives_1_1_1");
					put(grammarAccess.getJvmTypeReferenceAccess().getAlternatives(), "rule__JvmTypeReference__Alternatives");
					put(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives(), "rule__JvmArgumentTypeReference__Alternatives");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2(), "rule__JvmWildcardTypeReference__Alternatives_2");
					put(grammarAccess.getJvmTypeParameterAccess().getAlternatives_1(), "rule__JvmTypeParameter__Alternatives_1");
					put(grammarAccess.getBuildFileAccess().getGroup(), "rule__BuildFile__Group__0");
					put(grammarAccess.getBuildFileAccess().getGroup_0(), "rule__BuildFile__Group_0__0");
					put(grammarAccess.getImportDeclarationAccess().getGroup(), "rule__ImportDeclaration__Group__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getTaskAccess().getGroup_2(), "rule__Task__Group_2__0");
					put(grammarAccess.getTaskAccess().getGroup_2_2(), "rule__Task__Group_2_2__0");
					put(grammarAccess.getXAssignmentAccess().getGroup_0(), "rule__XAssignment__Group_0__0");
					put(grammarAccess.getXAssignmentAccess().getGroup_1(), "rule__XAssignment__Group_1__0");
					put(grammarAccess.getXAssignmentAccess().getGroup_1_1(), "rule__XAssignment__Group_1_1__0");
					put(grammarAccess.getXAssignmentAccess().getGroup_1_1_0(), "rule__XAssignment__Group_1_1_0__0");
					put(grammarAccess.getXAssignmentAccess().getGroup_1_1_0_0(), "rule__XAssignment__Group_1_1_0_0__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup(), "rule__XOrExpression__Group__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1(), "rule__XOrExpression__Group_1__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1_0(), "rule__XOrExpression__Group_1_0__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1_0_0(), "rule__XOrExpression__Group_1_0_0__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup(), "rule__XAndExpression__Group__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1(), "rule__XAndExpression__Group_1__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1_0(), "rule__XAndExpression__Group_1_0__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1_0_0(), "rule__XAndExpression__Group_1_0_0__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup(), "rule__XEqualityExpression__Group__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1(), "rule__XEqualityExpression__Group_1__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1_0(), "rule__XEqualityExpression__Group_1_0__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1_0_0(), "rule__XEqualityExpression__Group_1_0_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup(), "rule__XRelationalExpression__Group__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_0(), "rule__XRelationalExpression__Group_1_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_0_0(), "rule__XRelationalExpression__Group_1_0_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_0_0_0(), "rule__XRelationalExpression__Group_1_0_0_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_1(), "rule__XRelationalExpression__Group_1_1__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_1_0(), "rule__XRelationalExpression__Group_1_1_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_1_0_0(), "rule__XRelationalExpression__Group_1_1_0_0__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup(), "rule__XOtherOperatorExpression__Group__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1(), "rule__XOtherOperatorExpression__Group_1__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1_0(), "rule__XOtherOperatorExpression__Group_1_0__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1_0_0(), "rule__XOtherOperatorExpression__Group_1_0_0__0");
					put(grammarAccess.getOpOtherAccess().getGroup_3(), "rule__OpOther__Group_3__0");
					put(grammarAccess.getOpOtherAccess().getGroup_3_1_0(), "rule__OpOther__Group_3_1_0__0");
					put(grammarAccess.getOpOtherAccess().getGroup_3_1_0_0(), "rule__OpOther__Group_3_1_0_0__0");
					put(grammarAccess.getOpOtherAccess().getGroup_4(), "rule__OpOther__Group_4__0");
					put(grammarAccess.getOpOtherAccess().getGroup_4_1_0(), "rule__OpOther__Group_4_1_0__0");
					put(grammarAccess.getOpOtherAccess().getGroup_4_1_0_0(), "rule__OpOther__Group_4_1_0_0__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup(), "rule__XAdditiveExpression__Group__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1(), "rule__XAdditiveExpression__Group_1__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1_0(), "rule__XAdditiveExpression__Group_1_0__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1_0_0(), "rule__XAdditiveExpression__Group_1_0_0__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup(), "rule__XMultiplicativeExpression__Group__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1(), "rule__XMultiplicativeExpression__Group_1__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1_0(), "rule__XMultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__XMultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getXUnaryOperationAccess().getGroup_0(), "rule__XUnaryOperation__Group_0__0");
					put(grammarAccess.getXCastedExpressionAccess().getGroup(), "rule__XCastedExpression__Group__0");
					put(grammarAccess.getXCastedExpressionAccess().getGroup_1(), "rule__XCastedExpression__Group_1__0");
					put(grammarAccess.getXCastedExpressionAccess().getGroup_1_0(), "rule__XCastedExpression__Group_1_0__0");
					put(grammarAccess.getXCastedExpressionAccess().getGroup_1_0_0(), "rule__XCastedExpression__Group_1_0_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup(), "rule__XMemberFeatureCall__Group__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_0(), "rule__XMemberFeatureCall__Group_1_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_0_0(), "rule__XMemberFeatureCall__Group_1_0_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_0_0_0(), "rule__XMemberFeatureCall__Group_1_0_0_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1(), "rule__XMemberFeatureCall__Group_1_1__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_0(), "rule__XMemberFeatureCall__Group_1_1_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_0_0(), "rule__XMemberFeatureCall__Group_1_1_0_0__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_1(), "rule__XMemberFeatureCall__Group_1_1_1__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_1_2(), "rule__XMemberFeatureCall__Group_1_1_1_2__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_3(), "rule__XMemberFeatureCall__Group_1_1_3__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_3_1_1(), "rule__XMemberFeatureCall__Group_1_1_3_1_1__0");
					put(grammarAccess.getXMemberFeatureCallAccess().getGroup_1_1_3_1_1_1(), "rule__XMemberFeatureCall__Group_1_1_3_1_1_1__0");
					put(grammarAccess.getXClosureAccess().getGroup(), "rule__XClosure__Group__0");
					put(grammarAccess.getXClosureAccess().getGroup_0(), "rule__XClosure__Group_0__0");
					put(grammarAccess.getXClosureAccess().getGroup_0_0(), "rule__XClosure__Group_0_0__0");
					put(grammarAccess.getXClosureAccess().getGroup_1(), "rule__XClosure__Group_1__0");
					put(grammarAccess.getXClosureAccess().getGroup_1_0(), "rule__XClosure__Group_1_0__0");
					put(grammarAccess.getXClosureAccess().getGroup_1_0_0(), "rule__XClosure__Group_1_0_0__0");
					put(grammarAccess.getXClosureAccess().getGroup_1_0_0_1(), "rule__XClosure__Group_1_0_0_1__0");
					put(grammarAccess.getXExpressionInClosureAccess().getGroup(), "rule__XExpressionInClosure__Group__0");
					put(grammarAccess.getXExpressionInClosureAccess().getGroup_1(), "rule__XExpressionInClosure__Group_1__0");
					put(grammarAccess.getXShortClosureAccess().getGroup(), "rule__XShortClosure__Group__0");
					put(grammarAccess.getXShortClosureAccess().getGroup_0(), "rule__XShortClosure__Group_0__0");
					put(grammarAccess.getXShortClosureAccess().getGroup_0_0(), "rule__XShortClosure__Group_0_0__0");
					put(grammarAccess.getXShortClosureAccess().getGroup_0_0_1(), "rule__XShortClosure__Group_0_0_1__0");
					put(grammarAccess.getXShortClosureAccess().getGroup_0_0_1_1(), "rule__XShortClosure__Group_0_0_1_1__0");
					put(grammarAccess.getXParenthesizedExpressionAccess().getGroup(), "rule__XParenthesizedExpression__Group__0");
					put(grammarAccess.getXIfExpressionAccess().getGroup(), "rule__XIfExpression__Group__0");
					put(grammarAccess.getXIfExpressionAccess().getGroup_6(), "rule__XIfExpression__Group_6__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup(), "rule__XSwitchExpression__Group__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_0(), "rule__XSwitchExpression__Group_2_0__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_0_0(), "rule__XSwitchExpression__Group_2_0_0__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_0_0_0(), "rule__XSwitchExpression__Group_2_0_0_0__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_1(), "rule__XSwitchExpression__Group_2_1__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_1_0(), "rule__XSwitchExpression__Group_2_1_0__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_2_1_0_0(), "rule__XSwitchExpression__Group_2_1_0_0__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_5(), "rule__XSwitchExpression__Group_5__0");
					put(grammarAccess.getXCasePartAccess().getGroup(), "rule__XCasePart__Group__0");
					put(grammarAccess.getXCasePartAccess().getGroup_1(), "rule__XCasePart__Group_1__0");
					put(grammarAccess.getXForLoopExpressionAccess().getGroup(), "rule__XForLoopExpression__Group__0");
					put(grammarAccess.getXWhileExpressionAccess().getGroup(), "rule__XWhileExpression__Group__0");
					put(grammarAccess.getXDoWhileExpressionAccess().getGroup(), "rule__XDoWhileExpression__Group__0");
					put(grammarAccess.getXBlockExpressionAccess().getGroup(), "rule__XBlockExpression__Group__0");
					put(grammarAccess.getXBlockExpressionAccess().getGroup_2(), "rule__XBlockExpression__Group_2__0");
					put(grammarAccess.getXVariableDeclarationAccess().getGroup(), "rule__XVariableDeclaration__Group__0");
					put(grammarAccess.getXVariableDeclarationAccess().getGroup_2_0(), "rule__XVariableDeclaration__Group_2_0__0");
					put(grammarAccess.getXVariableDeclarationAccess().getGroup_2_0_0(), "rule__XVariableDeclaration__Group_2_0_0__0");
					put(grammarAccess.getXVariableDeclarationAccess().getGroup_3(), "rule__XVariableDeclaration__Group_3__0");
					put(grammarAccess.getJvmFormalParameterAccess().getGroup(), "rule__JvmFormalParameter__Group__0");
					put(grammarAccess.getFullJvmFormalParameterAccess().getGroup(), "rule__FullJvmFormalParameter__Group__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup(), "rule__XFeatureCall__Group__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup_2(), "rule__XFeatureCall__Group_2__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup_2_2(), "rule__XFeatureCall__Group_2_2__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup_4(), "rule__XFeatureCall__Group_4__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup_4_1_1(), "rule__XFeatureCall__Group_4_1_1__0");
					put(grammarAccess.getXFeatureCallAccess().getGroup_4_1_1_1(), "rule__XFeatureCall__Group_4_1_1_1__0");
					put(grammarAccess.getStaticQualifierAccess().getGroup(), "rule__StaticQualifier__Group__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup(), "rule__XConstructorCall__Group__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup_3(), "rule__XConstructorCall__Group_3__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup_3_2(), "rule__XConstructorCall__Group_3_2__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup_4(), "rule__XConstructorCall__Group_4__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup_4_1_1(), "rule__XConstructorCall__Group_4_1_1__0");
					put(grammarAccess.getXConstructorCallAccess().getGroup_4_1_1_1(), "rule__XConstructorCall__Group_4_1_1_1__0");
					put(grammarAccess.getXBooleanLiteralAccess().getGroup(), "rule__XBooleanLiteral__Group__0");
					put(grammarAccess.getXNullLiteralAccess().getGroup(), "rule__XNullLiteral__Group__0");
					put(grammarAccess.getXNumberLiteralAccess().getGroup(), "rule__XNumberLiteral__Group__0");
					put(grammarAccess.getXStringLiteralAccess().getGroup(), "rule__XStringLiteral__Group__0");
					put(grammarAccess.getXTypeLiteralAccess().getGroup(), "rule__XTypeLiteral__Group__0");
					put(grammarAccess.getXThrowExpressionAccess().getGroup(), "rule__XThrowExpression__Group__0");
					put(grammarAccess.getXReturnExpressionAccess().getGroup(), "rule__XReturnExpression__Group__0");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getGroup(), "rule__XTryCatchFinallyExpression__Group__0");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getGroup_3_0(), "rule__XTryCatchFinallyExpression__Group_3_0__0");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getGroup_3_0_1(), "rule__XTryCatchFinallyExpression__Group_3_0_1__0");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getGroup_3_1(), "rule__XTryCatchFinallyExpression__Group_3_1__0");
					put(grammarAccess.getXCatchClauseAccess().getGroup(), "rule__XCatchClause__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_1_1(), "rule__Number__Group_1_1__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0(), "rule__JvmTypeReference__Group_0__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1(), "rule__JvmTypeReference__Group_0_1__0");
					put(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0(), "rule__JvmTypeReference__Group_0_1_0__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup(), "rule__XFunctionTypeRef__Group__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0(), "rule__XFunctionTypeRef__Group_0__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1(), "rule__XFunctionTypeRef__Group_0_1__0");
					put(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1(), "rule__XFunctionTypeRef__Group_0_1_1__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup(), "rule__JvmParameterizedTypeReference__Group__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1(), "rule__JvmParameterizedTypeReference__Group_1__0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2(), "rule__JvmParameterizedTypeReference__Group_1_2__0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup(), "rule__JvmWildcardTypeReference__Group__0");
					put(grammarAccess.getJvmUpperBoundAccess().getGroup(), "rule__JvmUpperBound__Group__0");
					put(grammarAccess.getJvmUpperBoundAndedAccess().getGroup(), "rule__JvmUpperBoundAnded__Group__0");
					put(grammarAccess.getJvmLowerBoundAccess().getGroup(), "rule__JvmLowerBound__Group__0");
					put(grammarAccess.getJvmTypeParameterAccess().getGroup(), "rule__JvmTypeParameter__Group__0");
					put(grammarAccess.getJvmTypeParameterAccess().getGroup_1_0(), "rule__JvmTypeParameter__Group_1_0__0");
					put(grammarAccess.getBuildFileAccess().getNameAssignment_0_1(), "rule__BuildFile__NameAssignment_0_1");
					put(grammarAccess.getBuildFileAccess().getImportsAssignment_1(), "rule__BuildFile__ImportsAssignment_1");
					put(grammarAccess.getBuildFileAccess().getDeclarationsAssignment_2(), "rule__BuildFile__DeclarationsAssignment_2");
					put(grammarAccess.getImportDeclarationAccess().getImportedNamespaceAssignment_1(), "rule__ImportDeclaration__ImportedNamespaceAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeAssignment_1(), "rule__Parameter__TypeAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getParameterAccess().getInitAssignment_3_1(), "rule__Parameter__InitAssignment_3_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getDependsAssignment_2_1(), "rule__Task__DependsAssignment_2_1");
					put(grammarAccess.getTaskAccess().getDependsAssignment_2_2_1(), "rule__Task__DependsAssignment_2_2_1");
					put(grammarAccess.getTaskAccess().getActionAssignment_3(), "rule__Task__ActionAssignment_3");
					put(grammarAccess.getXAssignmentAccess().getFeatureAssignment_0_1(), "rule__XAssignment__FeatureAssignment_0_1");
					put(grammarAccess.getXAssignmentAccess().getValueAssignment_0_3(), "rule__XAssignment__ValueAssignment_0_3");
					put(grammarAccess.getXAssignmentAccess().getFeatureAssignment_1_1_0_0_1(), "rule__XAssignment__FeatureAssignment_1_1_0_0_1");
					put(grammarAccess.getXAssignmentAccess().getRightOperandAssignment_1_1_1(), "rule__XAssignment__RightOperandAssignment_1_1_1");
					put(grammarAccess.getXOrExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XOrExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXOrExpressionAccess().getRightOperandAssignment_1_1(), "rule__XOrExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXAndExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XAndExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXAndExpressionAccess().getRightOperandAssignment_1_1(), "rule__XAndExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXEqualityExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XEqualityExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXEqualityExpressionAccess().getRightOperandAssignment_1_1(), "rule__XEqualityExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXRelationalExpressionAccess().getTypeAssignment_1_0_1(), "rule__XRelationalExpression__TypeAssignment_1_0_1");
					put(grammarAccess.getXRelationalExpressionAccess().getFeatureAssignment_1_1_0_0_1(), "rule__XRelationalExpression__FeatureAssignment_1_1_0_0_1");
					put(grammarAccess.getXRelationalExpressionAccess().getRightOperandAssignment_1_1_1(), "rule__XRelationalExpression__RightOperandAssignment_1_1_1");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XOtherOperatorExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandAssignment_1_1(), "rule__XOtherOperatorExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXAdditiveExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XAdditiveExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXAdditiveExpressionAccess().getRightOperandAssignment_1_1(), "rule__XAdditiveExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XMultiplicativeExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandAssignment_1_1(), "rule__XMultiplicativeExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXUnaryOperationAccess().getFeatureAssignment_0_1(), "rule__XUnaryOperation__FeatureAssignment_0_1");
					put(grammarAccess.getXUnaryOperationAccess().getOperandAssignment_0_2(), "rule__XUnaryOperation__OperandAssignment_0_2");
					put(grammarAccess.getXCastedExpressionAccess().getTypeAssignment_1_1(), "rule__XCastedExpression__TypeAssignment_1_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getFeatureAssignment_1_0_0_0_2(), "rule__XMemberFeatureCall__FeatureAssignment_1_0_0_0_2");
					put(grammarAccess.getXMemberFeatureCallAccess().getValueAssignment_1_0_1(), "rule__XMemberFeatureCall__ValueAssignment_1_0_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getNullSafeAssignment_1_1_0_0_1_1(), "rule__XMemberFeatureCall__NullSafeAssignment_1_1_0_0_1_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getSpreadingAssignment_1_1_0_0_1_2(), "rule__XMemberFeatureCall__SpreadingAssignment_1_1_0_0_1_2");
					put(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsAssignment_1_1_1_1(), "rule__XMemberFeatureCall__TypeArgumentsAssignment_1_1_1_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsAssignment_1_1_1_2_1(), "rule__XMemberFeatureCall__TypeArgumentsAssignment_1_1_1_2_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getFeatureAssignment_1_1_2(), "rule__XMemberFeatureCall__FeatureAssignment_1_1_2");
					put(grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallAssignment_1_1_3_0(), "rule__XMemberFeatureCall__ExplicitOperationCallAssignment_1_1_3_0");
					put(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsAssignment_1_1_3_1_0(), "rule__XMemberFeatureCall__MemberCallArgumentsAssignment_1_1_3_1_0");
					put(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsAssignment_1_1_3_1_1_0(), "rule__XMemberFeatureCall__MemberCallArgumentsAssignment_1_1_3_1_1_0");
					put(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsAssignment_1_1_3_1_1_1_1(), "rule__XMemberFeatureCall__MemberCallArgumentsAssignment_1_1_3_1_1_1_1");
					put(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsAssignment_1_1_4(), "rule__XMemberFeatureCall__MemberCallArgumentsAssignment_1_1_4");
					put(grammarAccess.getXClosureAccess().getDeclaredFormalParametersAssignment_1_0_0_0(), "rule__XClosure__DeclaredFormalParametersAssignment_1_0_0_0");
					put(grammarAccess.getXClosureAccess().getDeclaredFormalParametersAssignment_1_0_0_1_1(), "rule__XClosure__DeclaredFormalParametersAssignment_1_0_0_1_1");
					put(grammarAccess.getXClosureAccess().getExplicitSyntaxAssignment_1_0_1(), "rule__XClosure__ExplicitSyntaxAssignment_1_0_1");
					put(grammarAccess.getXClosureAccess().getExpressionAssignment_2(), "rule__XClosure__ExpressionAssignment_2");
					put(grammarAccess.getXExpressionInClosureAccess().getExpressionsAssignment_1_0(), "rule__XExpressionInClosure__ExpressionsAssignment_1_0");
					put(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersAssignment_0_0_1_0(), "rule__XShortClosure__DeclaredFormalParametersAssignment_0_0_1_0");
					put(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersAssignment_0_0_1_1_1(), "rule__XShortClosure__DeclaredFormalParametersAssignment_0_0_1_1_1");
					put(grammarAccess.getXShortClosureAccess().getExplicitSyntaxAssignment_0_0_2(), "rule__XShortClosure__ExplicitSyntaxAssignment_0_0_2");
					put(grammarAccess.getXShortClosureAccess().getExpressionAssignment_1(), "rule__XShortClosure__ExpressionAssignment_1");
					put(grammarAccess.getXIfExpressionAccess().getIfAssignment_3(), "rule__XIfExpression__IfAssignment_3");
					put(grammarAccess.getXIfExpressionAccess().getThenAssignment_5(), "rule__XIfExpression__ThenAssignment_5");
					put(grammarAccess.getXIfExpressionAccess().getElseAssignment_6_1(), "rule__XIfExpression__ElseAssignment_6_1");
					put(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameAssignment_2_0_0_0_0(), "rule__XSwitchExpression__LocalVarNameAssignment_2_0_0_0_0");
					put(grammarAccess.getXSwitchExpressionAccess().getSwitchAssignment_2_0_1(), "rule__XSwitchExpression__SwitchAssignment_2_0_1");
					put(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameAssignment_2_1_0_0_1(), "rule__XSwitchExpression__LocalVarNameAssignment_2_1_0_0_1");
					put(grammarAccess.getXSwitchExpressionAccess().getSwitchAssignment_2_1_1(), "rule__XSwitchExpression__SwitchAssignment_2_1_1");
					put(grammarAccess.getXSwitchExpressionAccess().getCasesAssignment_4(), "rule__XSwitchExpression__CasesAssignment_4");
					put(grammarAccess.getXSwitchExpressionAccess().getDefaultAssignment_5_2(), "rule__XSwitchExpression__DefaultAssignment_5_2");
					put(grammarAccess.getXCasePartAccess().getTypeGuardAssignment_0(), "rule__XCasePart__TypeGuardAssignment_0");
					put(grammarAccess.getXCasePartAccess().getCaseAssignment_1_1(), "rule__XCasePart__CaseAssignment_1_1");
					put(grammarAccess.getXCasePartAccess().getThenAssignment_3(), "rule__XCasePart__ThenAssignment_3");
					put(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamAssignment_3(), "rule__XForLoopExpression__DeclaredParamAssignment_3");
					put(grammarAccess.getXForLoopExpressionAccess().getForExpressionAssignment_5(), "rule__XForLoopExpression__ForExpressionAssignment_5");
					put(grammarAccess.getXForLoopExpressionAccess().getEachExpressionAssignment_7(), "rule__XForLoopExpression__EachExpressionAssignment_7");
					put(grammarAccess.getXWhileExpressionAccess().getPredicateAssignment_3(), "rule__XWhileExpression__PredicateAssignment_3");
					put(grammarAccess.getXWhileExpressionAccess().getBodyAssignment_5(), "rule__XWhileExpression__BodyAssignment_5");
					put(grammarAccess.getXDoWhileExpressionAccess().getBodyAssignment_2(), "rule__XDoWhileExpression__BodyAssignment_2");
					put(grammarAccess.getXDoWhileExpressionAccess().getPredicateAssignment_5(), "rule__XDoWhileExpression__PredicateAssignment_5");
					put(grammarAccess.getXBlockExpressionAccess().getExpressionsAssignment_2_0(), "rule__XBlockExpression__ExpressionsAssignment_2_0");
					put(grammarAccess.getXVariableDeclarationAccess().getWriteableAssignment_1_0(), "rule__XVariableDeclaration__WriteableAssignment_1_0");
					put(grammarAccess.getXVariableDeclarationAccess().getTypeAssignment_2_0_0_0(), "rule__XVariableDeclaration__TypeAssignment_2_0_0_0");
					put(grammarAccess.getXVariableDeclarationAccess().getNameAssignment_2_0_0_1(), "rule__XVariableDeclaration__NameAssignment_2_0_0_1");
					put(grammarAccess.getXVariableDeclarationAccess().getNameAssignment_2_1(), "rule__XVariableDeclaration__NameAssignment_2_1");
					put(grammarAccess.getXVariableDeclarationAccess().getRightAssignment_3_1(), "rule__XVariableDeclaration__RightAssignment_3_1");
					put(grammarAccess.getJvmFormalParameterAccess().getParameterTypeAssignment_0(), "rule__JvmFormalParameter__ParameterTypeAssignment_0");
					put(grammarAccess.getJvmFormalParameterAccess().getNameAssignment_1(), "rule__JvmFormalParameter__NameAssignment_1");
					put(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeAssignment_0(), "rule__FullJvmFormalParameter__ParameterTypeAssignment_0");
					put(grammarAccess.getFullJvmFormalParameterAccess().getNameAssignment_1(), "rule__FullJvmFormalParameter__NameAssignment_1");
					put(grammarAccess.getXFeatureCallAccess().getDeclaringTypeAssignment_1(), "rule__XFeatureCall__DeclaringTypeAssignment_1");
					put(grammarAccess.getXFeatureCallAccess().getTypeArgumentsAssignment_2_1(), "rule__XFeatureCall__TypeArgumentsAssignment_2_1");
					put(grammarAccess.getXFeatureCallAccess().getTypeArgumentsAssignment_2_2_1(), "rule__XFeatureCall__TypeArgumentsAssignment_2_2_1");
					put(grammarAccess.getXFeatureCallAccess().getFeatureAssignment_3(), "rule__XFeatureCall__FeatureAssignment_3");
					put(grammarAccess.getXFeatureCallAccess().getExplicitOperationCallAssignment_4_0(), "rule__XFeatureCall__ExplicitOperationCallAssignment_4_0");
					put(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsAssignment_4_1_0(), "rule__XFeatureCall__FeatureCallArgumentsAssignment_4_1_0");
					put(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsAssignment_4_1_1_0(), "rule__XFeatureCall__FeatureCallArgumentsAssignment_4_1_1_0");
					put(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsAssignment_4_1_1_1_1(), "rule__XFeatureCall__FeatureCallArgumentsAssignment_4_1_1_1_1");
					put(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsAssignment_5(), "rule__XFeatureCall__FeatureCallArgumentsAssignment_5");
					put(grammarAccess.getXConstructorCallAccess().getConstructorAssignment_2(), "rule__XConstructorCall__ConstructorAssignment_2");
					put(grammarAccess.getXConstructorCallAccess().getTypeArgumentsAssignment_3_1(), "rule__XConstructorCall__TypeArgumentsAssignment_3_1");
					put(grammarAccess.getXConstructorCallAccess().getTypeArgumentsAssignment_3_2_1(), "rule__XConstructorCall__TypeArgumentsAssignment_3_2_1");
					put(grammarAccess.getXConstructorCallAccess().getArgumentsAssignment_4_1_0(), "rule__XConstructorCall__ArgumentsAssignment_4_1_0");
					put(grammarAccess.getXConstructorCallAccess().getArgumentsAssignment_4_1_1_0(), "rule__XConstructorCall__ArgumentsAssignment_4_1_1_0");
					put(grammarAccess.getXConstructorCallAccess().getArgumentsAssignment_4_1_1_1_1(), "rule__XConstructorCall__ArgumentsAssignment_4_1_1_1_1");
					put(grammarAccess.getXConstructorCallAccess().getArgumentsAssignment_5(), "rule__XConstructorCall__ArgumentsAssignment_5");
					put(grammarAccess.getXBooleanLiteralAccess().getIsTrueAssignment_1_1(), "rule__XBooleanLiteral__IsTrueAssignment_1_1");
					put(grammarAccess.getXNumberLiteralAccess().getValueAssignment_1(), "rule__XNumberLiteral__ValueAssignment_1");
					put(grammarAccess.getXStringLiteralAccess().getValueAssignment_1(), "rule__XStringLiteral__ValueAssignment_1");
					put(grammarAccess.getXTypeLiteralAccess().getTypeAssignment_3(), "rule__XTypeLiteral__TypeAssignment_3");
					put(grammarAccess.getXThrowExpressionAccess().getExpressionAssignment_2(), "rule__XThrowExpression__ExpressionAssignment_2");
					put(grammarAccess.getXReturnExpressionAccess().getExpressionAssignment_2(), "rule__XReturnExpression__ExpressionAssignment_2");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionAssignment_2(), "rule__XTryCatchFinallyExpression__ExpressionAssignment_2");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesAssignment_3_0_0(), "rule__XTryCatchFinallyExpression__CatchClausesAssignment_3_0_0");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionAssignment_3_0_1_1(), "rule__XTryCatchFinallyExpression__FinallyExpressionAssignment_3_0_1_1");
					put(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionAssignment_3_1_1(), "rule__XTryCatchFinallyExpression__FinallyExpressionAssignment_3_1_1");
					put(grammarAccess.getXCatchClauseAccess().getDeclaredParamAssignment_2(), "rule__XCatchClause__DeclaredParamAssignment_2");
					put(grammarAccess.getXCatchClauseAccess().getExpressionAssignment_4(), "rule__XCatchClause__ExpressionAssignment_4");
					put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0");
					put(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1(), "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1");
					put(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2(), "rule__XFunctionTypeRef__ReturnTypeAssignment_2");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0(), "rule__JvmParameterizedTypeReference__TypeAssignment_0");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1");
					put(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1(), "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0");
					put(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1(), "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1");
					put(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBound__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1(), "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1(), "rule__JvmLowerBound__TypeReferenceAssignment_1");
					put(grammarAccess.getJvmTypeParameterAccess().getNameAssignment_0(), "rule__JvmTypeParameter__NameAssignment_0");
					put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_0_0(), "rule__JvmTypeParameter__ConstraintsAssignment_1_0_0");
					put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_0_1(), "rule__JvmTypeParameter__ConstraintsAssignment_1_0_1");
					put(grammarAccess.getJvmTypeParameterAccess().getConstraintsAssignment_1_1(), "rule__JvmTypeParameter__ConstraintsAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.builddsl.ui.contentassist.antlr.internal.InternalBuildDSLParser typedParser = (org.xtext.builddsl.ui.contentassist.antlr.internal.InternalBuildDSLParser) parser;
			typedParser.entryRuleBuildFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BuildDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BuildDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
