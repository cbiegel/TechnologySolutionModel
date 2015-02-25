/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Features Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl#getTrust <em>Trust</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyFeaturesComparisonImpl extends FeatureEvaluationImpl implements TechnologyFeaturesComparison {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrust() <em>Trust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrust() <em>Trust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrust()
	 * @generated
	 * @ordered
	 */
	protected String trust = TRUST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeaturesComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURES_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrust() {
		return trust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrust(String newTrust) {
		String oldTrust = trust;
		trust = newTrust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__TRUST, oldTrust, trust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SOURCE:
				return getSource();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SCOPE:
				return getScope();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__DATE:
				return getDate();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__TRUST:
				return getTrust();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SOURCE:
				setSource((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SCOPE:
				setScope((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__DATE:
				setDate((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__TRUST:
				setTrust((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__TRUST:
				setTrust(TRUST_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON__TRUST:
				return TRUST_EDEFAULT == null ? trust != null : !TRUST_EDEFAULT.equals(trust);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Source: ");
		result.append(source);
		result.append(", Scope: ");
		result.append(scope);
		result.append(", Date: ");
		result.append(date);
		result.append(", Trust: ");
		result.append(trust);
		result.append(')');
		return result.toString();
	}

} //TechnologyFeaturesComparisonImpl
