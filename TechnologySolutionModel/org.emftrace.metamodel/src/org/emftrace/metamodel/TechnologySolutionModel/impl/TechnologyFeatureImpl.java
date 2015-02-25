/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.TechnologySolutionModel.ASTA;
import org.emftrace.metamodel.TechnologySolutionModel.CapabilityType;
import org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation;
import org.emftrace.metamodel.TechnologySolutionModel.Relation;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl#getASTA <em>ASTA</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl#getFeatureEvaluation <em>Feature Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyFeatureImpl extends RelationSourceTypeImpl implements TechnologyFeature {
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
	 * The default value of the '{@link #getCapabilityType() <em>Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityType()
	 * @generated
	 * @ordered
	 */
	protected static final CapabilityType CAPABILITY_TYPE_EDEFAULT = CapabilityType.DEVELOPMENT_CAPABILITY;

	/**
	 * The cached value of the '{@link #getCapabilityType() <em>Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityType()
	 * @generated
	 * @ordered
	 */
	protected CapabilityType capabilityType = CAPABILITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getASTA() <em>ASTA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASTA()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTA> asta;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getFeatureEvaluation() <em>Feature Evaluation</em>}' reference list.
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
	protected TechnologyFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType getCapabilityType() {
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityType(CapabilityType newCapabilityType) {
		CapabilityType oldCapabilityType = capabilityType;
		capabilityType = newCapabilityType == null ? CAPABILITY_TYPE_EDEFAULT : newCapabilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__CAPABILITY_TYPE, oldCapabilityType, capabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ASTA> getASTA() {
		if (asta == null) {
			asta = new EObjectResolvingEList<ASTA>(ASTA.class, this, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__ASTA);
		}
		return asta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectResolvingEList<Relation>(Relation.class, this, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEvaluation> getFeatureEvaluation() {
		if (featureEvaluation == null) {
			featureEvaluation = new EObjectResolvingEList<FeatureEvaluation>(FeatureEvaluation.class, this, TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__FEATURE_EVALUATION);
		}
		return featureEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__DESCRIPTION:
				return getDescription();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__CAPABILITY_TYPE:
				return getCapabilityType();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__ASTA:
				return getASTA();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__RELATIONS:
				return getRelations();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__FEATURE_EVALUATION:
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__CAPABILITY_TYPE:
				setCapabilityType((CapabilityType)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__ASTA:
				getASTA().clear();
				getASTA().addAll((Collection<? extends ASTA>)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__FEATURE_EVALUATION:
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__CAPABILITY_TYPE:
				setCapabilityType(CAPABILITY_TYPE_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__ASTA:
				getASTA().clear();
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__RELATIONS:
				getRelations().clear();
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__FEATURE_EVALUATION:
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
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__CAPABILITY_TYPE:
				return capabilityType != CAPABILITY_TYPE_EDEFAULT;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__ASTA:
				return asta != null && !asta.isEmpty();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE__FEATURE_EVALUATION:
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
		result.append(", CapabilityType: ");
		result.append(capabilityType);
		result.append(')');
		return result.toString();
	}

} //TechnologyFeatureImpl
