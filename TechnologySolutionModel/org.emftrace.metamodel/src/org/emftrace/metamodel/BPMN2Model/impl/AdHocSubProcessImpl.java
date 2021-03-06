/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.AdHocOrdering;
import org.emftrace.metamodel.BPMN2Model.AdHocSubProcess;
import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.AdHocSubProcessImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.AdHocSubProcessImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.AdHocSubProcessImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocSubProcessImpl extends SubProcessImpl implements AdHocSubProcess {
	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression completionCondition;

	/**
	 * The default value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelRemainingInstances()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCEL_REMAINING_INSTANCES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelRemainingInstances()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final AdHocOrdering ORDERING_EDEFAULT = AdHocOrdering.PARALLEL;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected AdHocOrdering ordering = ORDERING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocSubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getAdHocSubProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(Expression newCompletionCondition, NotificationChain msgs) {
		Expression oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(Expression newCompletionCondition) {
		if (newCompletionCondition != completionCondition) {
			NotificationChain msgs = null;
			if (completionCondition != null)
				msgs = ((InternalEObject)completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, null, msgs);
			if (newCompletionCondition != null)
				msgs = ((InternalEObject)newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, null, msgs);
			msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelRemainingInstances() {
		return cancelRemainingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelRemainingInstances(boolean newCancelRemainingInstances) {
		boolean oldCancelRemainingInstances = cancelRemainingInstances;
		cancelRemainingInstances = newCancelRemainingInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, oldCancelRemainingInstances, cancelRemainingInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(AdHocOrdering newOrdering) {
		AdHocOrdering oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.AD_HOC_SUB_PROCESS__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
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
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
				return getCompletionCondition();
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
				return isCancelRemainingInstances();
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__ORDERING:
				return getOrdering();
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
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
				setCompletionCondition((Expression)newValue);
				return;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
				setCancelRemainingInstances((Boolean)newValue);
				return;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__ORDERING:
				setOrdering((AdHocOrdering)newValue);
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
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
				setCompletionCondition((Expression)null);
				return;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
				setCancelRemainingInstances(CANCEL_REMAINING_INSTANCES_EDEFAULT);
				return;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
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
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION:
				return completionCondition != null;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES:
				return cancelRemainingInstances != CANCEL_REMAINING_INSTANCES_EDEFAULT;
			case BPMN2ModelPackage.AD_HOC_SUB_PROCESS__ORDERING:
				return ordering != ORDERING_EDEFAULT;
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
		result.append(" (cancelRemainingInstances: ");
		result.append(cancelRemainingInstances);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //AdHocSubProcessImpl
