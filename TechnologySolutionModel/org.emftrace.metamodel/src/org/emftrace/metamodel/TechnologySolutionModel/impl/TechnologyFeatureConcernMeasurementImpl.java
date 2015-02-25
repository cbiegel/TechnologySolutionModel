/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Feature Concern Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getQuantitativeResult <em>Quantitative Result</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl#getQualitativeResult <em>Qualitative Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyFeatureConcernMeasurementImpl extends FeatureEvaluationImpl implements TechnologyFeatureConcernMeasurement {
	/**
	 * The default value of the '{@link #getAspect() <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspect() <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected String aspect = ASPECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final String METRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected String metrics = METRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssumptions() <em>Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSUMPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected String assumptions = ASSUMPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantitativeResult() <em>Quantitative Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeResult()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITATIVE_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantitativeResult() <em>Quantitative Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeResult()
	 * @generated
	 * @ordered
	 */
	protected String quantitativeResult = QUANTITATIVE_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualitativeResult() <em>Qualitative Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeResult()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITATIVE_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualitativeResult() <em>Qualitative Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeResult()
	 * @generated
	 * @ordered
	 */
	protected String qualitativeResult = QUALITATIVE_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeatureConcernMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspect() {
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(String newAspect) {
		String oldAspect = aspect;
		aspect = newAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT, oldAspect, aspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(String newMetrics) {
		String oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS, oldMetrics, metrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssumptions() {
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumptions(String newAssumptions) {
		String oldAssumptions = assumptions;
		assumptions = newAssumptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS, oldAssumptions, assumptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantitativeResult() {
		return quantitativeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeResult(String newQuantitativeResult) {
		String oldQuantitativeResult = quantitativeResult;
		quantitativeResult = newQuantitativeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT, oldQuantitativeResult, quantitativeResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualitativeResult() {
		return qualitativeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeResult(String newQualitativeResult) {
		String oldQualitativeResult = qualitativeResult;
		qualitativeResult = newQualitativeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT, oldQualitativeResult, qualitativeResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT:
				return getAspect();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT:
				return getContext();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS:
				return getMetrics();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS:
				return getAssumptions();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT:
				return getQuantitativeResult();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT:
				return getQualitativeResult();
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT:
				setAspect((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT:
				setContext((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS:
				setMetrics((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS:
				setAssumptions((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT:
				setQuantitativeResult((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT:
				setQualitativeResult((String)newValue);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT:
				setAspect(ASPECT_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS:
				setMetrics(METRICS_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS:
				setAssumptions(ASSUMPTIONS_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT:
				setQuantitativeResult(QUANTITATIVE_RESULT_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT:
				setQualitativeResult(QUALITATIVE_RESULT_EDEFAULT);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT:
				return ASPECT_EDEFAULT == null ? aspect != null : !ASPECT_EDEFAULT.equals(aspect);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS:
				return METRICS_EDEFAULT == null ? metrics != null : !METRICS_EDEFAULT.equals(metrics);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS:
				return ASSUMPTIONS_EDEFAULT == null ? assumptions != null : !ASSUMPTIONS_EDEFAULT.equals(assumptions);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT:
				return QUANTITATIVE_RESULT_EDEFAULT == null ? quantitativeResult != null : !QUANTITATIVE_RESULT_EDEFAULT.equals(quantitativeResult);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT:
				return QUALITATIVE_RESULT_EDEFAULT == null ? qualitativeResult != null : !QUALITATIVE_RESULT_EDEFAULT.equals(qualitativeResult);
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
		result.append(" (Aspect: ");
		result.append(aspect);
		result.append(", Context: ");
		result.append(context);
		result.append(", Metrics: ");
		result.append(metrics);
		result.append(", Assumptions: ");
		result.append(assumptions);
		result.append(", QuantitativeResult: ");
		result.append(quantitativeResult);
		result.append(", QualitativeResult: ");
		result.append(qualitativeResult);
		result.append(')');
		return result.toString();
	}

} //TechnologyFeatureConcernMeasurementImpl
