/**
 */
package org.xtext.httprouting.route.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.httprouting.route.RoutePackage;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.httprouting.route.impl.URLImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.httprouting.route.impl.URLImpl#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLImpl extends MinimalEObjectImpl.Container implements URL
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The default value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected static final boolean WILDCARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected boolean wildcard = WILDCARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected URLImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RoutePackage.Literals.URL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, RoutePackage.URL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWildcard(boolean newWildcard)
  {
    boolean oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoutePackage.URL__WILDCARD, oldWildcard, wildcard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RoutePackage.URL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RoutePackage.URL__VARIABLES:
        return getVariables();
      case RoutePackage.URL__WILDCARD:
        return isWildcard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RoutePackage.URL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case RoutePackage.URL__WILDCARD:
        setWildcard((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RoutePackage.URL__VARIABLES:
        getVariables().clear();
        return;
      case RoutePackage.URL__WILDCARD:
        setWildcard(WILDCARD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RoutePackage.URL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case RoutePackage.URL__WILDCARD:
        return wildcard != WILDCARD_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (wildcard: ");
    result.append(wildcard);
    result.append(')');
    return result.toString();
  }

} //URLImpl
