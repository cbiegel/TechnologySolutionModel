/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.TechnologySolutionModel.ASTA;
import org.emftrace.metamodel.TechnologySolutionModel.CapabilityType;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl#getCapabilityType <em>Capability Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ASTAImpl extends TechnologySolutionBaseImpl implements ASTA {
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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.ASTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.ASTA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.ASTA__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.ASTA__CAPABILITY_TYPE, oldCapabilityType, capabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.ASTA__DESCRIPTION:
				return getDescription();
			case TechnologySolutionModelPackage.ASTA__CONDITION:
				return getCondition();
			case TechnologySolutionModelPackage.ASTA__CAPABILITY_TYPE:
				return getCapabilityType();
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
			case TechnologySolutionModelPackage.ASTA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechnologySolutionModelPackage.ASTA__CONDITION:
				setCondition((String)newValue);
				return;
			case TechnologySolutionModelPackage.ASTA__CAPABILITY_TYPE:
				setCapabilityType((CapabilityType)newValue);
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
			case TechnologySolutionModelPackage.ASTA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.ASTA__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.ASTA__CAPABILITY_TYPE:
				setCapabilityType(CAPABILITY_TYPE_EDEFAULT);
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
			case TechnologySolutionModelPackage.ASTA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechnologySolutionModelPackage.ASTA__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TechnologySolutionModelPackage.ASTA__CAPABILITY_TYPE:
				return capabilityType != CAPABILITY_TYPE_EDEFAULT;
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
		result.append(", Condition: ");
		result.append(condition);
		result.append(", CapabilityType: ");
		result.append(capabilityType);
		result.append(')');
		return result.toString();
	}

} //ASTAImpl
