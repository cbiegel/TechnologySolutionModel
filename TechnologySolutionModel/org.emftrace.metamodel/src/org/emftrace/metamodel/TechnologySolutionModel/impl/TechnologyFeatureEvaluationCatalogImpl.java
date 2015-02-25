/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Feature Evaluation Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl#getFeatureEvaluation <em>Feature Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyFeatureEvaluationCatalogImpl extends TechnologySolutionBaseImpl implements TechnologyFeatureEvaluationCatalog {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureEvaluation() <em>Feature Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEvaluation> featureEvaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyFeatureEvaluationCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEvaluation> getFeatureEvaluation() {
		if (featureEvaluation == null) {
			featureEvaluation = new EObjectContainmentEList<FeatureEvaluation>(FeatureEvaluation.class, this, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION);
		}
		return featureEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
				return ((InternalEList<?>)getFeatureEvaluation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION:
				return getDescription();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
				return getFeatureEvaluation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
				getFeatureEvaluation().clear();
				getFeatureEvaluation().addAll((Collection<? extends FeatureEvaluation>)newValue);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
				getFeatureEvaluation().clear();
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
				return featureEvaluation != null && !featureEvaluation.isEmpty();
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
		result.append(" (Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TechnologyFeatureEvaluationCatalogImpl
