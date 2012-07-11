/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.httprouting.route;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.httprouting.route.RouteFactory
 * @model kind="package"
 * @generated
 */
public interface RoutePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "route";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/httprouting/Route";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "route";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoutePackage eINSTANCE = org.xtext.httprouting.route.impl.RoutePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.ModelImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.ImportImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_TYPE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.AbstractDeclarationImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 2;

  /**
   * The number of structural features of the '<em>Abstract Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.DependencyImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__ANNOTATIONS = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__TYPE = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__NAME = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.RouteImpl <em>Route</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.RouteImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRoute()
   * @generated
   */
  int ROUTE = 4;

  /**
   * The feature id for the '<em><b>Request Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__REQUEST_TYPE = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__URL = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__CONDITION = ABSTRACT_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE__CALL = ABSTRACT_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Route</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUTE_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.URLImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getURL()
   * @generated
   */
  int URL = 5;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.impl.VariableImpl
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.httprouting.route.RequestType
   * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRequestType()
   * @generated
   */
  int REQUEST_TYPE = 7;


  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.httprouting.route.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.httprouting.route.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.httprouting.route.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.httprouting.route.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link org.xtext.httprouting.route.Import#getImportedType <em>Imported Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Type</em>'.
   * @see org.xtext.httprouting.route.Import#getImportedType()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportedType();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see org.xtext.httprouting.route.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.xtext.httprouting.route.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.Dependency#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.xtext.httprouting.route.Dependency#getAnnotations()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Dependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.httprouting.route.Dependency#getType()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Dependency#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.httprouting.route.Dependency#getName()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Route <em>Route</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Route</em>'.
   * @see org.xtext.httprouting.route.Route
   * @generated
   */
  EClass getRoute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Route#getRequestType <em>Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Request Type</em>'.
   * @see org.xtext.httprouting.route.Route#getRequestType()
   * @see #getRoute()
   * @generated
   */
  EAttribute getRoute_RequestType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.xtext.httprouting.route.Route#getUrl()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Url();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.httprouting.route.Route#getCondition()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.httprouting.route.Route#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.xtext.httprouting.route.Route#getCall()
   * @see #getRoute()
   * @generated
   */
  EReference getRoute_Call();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see org.xtext.httprouting.route.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.httprouting.route.URL#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.xtext.httprouting.route.URL#getVariables()
   * @see #getURL()
   * @generated
   */
  EReference getURL_Variables();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.URL#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.xtext.httprouting.route.URL#isWildcard()
   * @see #getURL()
   * @generated
   */
  EAttribute getURL_Wildcard();

  /**
   * Returns the meta object for class '{@link org.xtext.httprouting.route.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.httprouting.route.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.httprouting.route.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.httprouting.route.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for enum '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Request Type</em>'.
   * @see org.xtext.httprouting.route.RequestType
   * @generated
   */
  EEnum getRequestType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RouteFactory getRouteFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.ModelImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.ImportImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORTED_TYPE = eINSTANCE.getImport_ImportedType();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.AbstractDeclarationImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getAbstractDeclaration()
     * @generated
     */
    EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.DependencyImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__ANNOTATIONS = eINSTANCE.getDependency_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.RouteImpl <em>Route</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.RouteImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRoute()
     * @generated
     */
    EClass ROUTE = eINSTANCE.getRoute();

    /**
     * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUTE__REQUEST_TYPE = eINSTANCE.getRoute_RequestType();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__URL = eINSTANCE.getRoute_Url();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__CONDITION = eINSTANCE.getRoute_Condition();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUTE__CALL = eINSTANCE.getRoute_Call();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.URLImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL__VARIABLES = eINSTANCE.getURL_Variables();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL__WILDCARD = eINSTANCE.getURL_Wildcard();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.impl.VariableImpl
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.httprouting.route.RequestType <em>Request Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.httprouting.route.RequestType
     * @see org.xtext.httprouting.route.impl.RoutePackageImpl#getRequestType()
     * @generated
     */
    EEnum REQUEST_TYPE = eINSTANCE.getRequestType();

  }

} //RoutePackage
