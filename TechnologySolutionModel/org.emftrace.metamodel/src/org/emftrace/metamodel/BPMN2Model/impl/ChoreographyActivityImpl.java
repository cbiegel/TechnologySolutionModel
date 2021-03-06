/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.ChoreographyActivity;
import org.emftrace.metamodel.BPMN2Model.ChoreographyLoopType;
import org.emftrace.metamodel.BPMN2Model.CorrelationKey;
import org.emftrace.metamodel.BPMN2Model.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ChoreographyActivityImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChoreographyActivityImpl extends FlowNodeImpl implements ChoreographyActivity {
	/**
	 * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participantRefs;

	/**
	 * The cached value of the '{@link #getCorrelationKeys() <em>Correlation Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationKey> correlationKeys;

	/**
	 * The cached value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected Participant initiatingParticipantRef;

	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected static final ChoreographyLoopType LOOP_TYPE_EDEFAULT = ChoreographyLoopType.NONE;

	/**
	 * The cached value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopType()
	 * @generated
	 * @ordered
	 */
	protected ChoreographyLoopType loopType = LOOP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getChoreographyActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipantRefs() {
		if (participantRefs == null) {
			participantRefs = new EObjectResolvingEList<Participant>(Participant.class, this, BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS);
		}
		return participantRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationKey> getCorrelationKeys() {
		if (correlationKeys == null) {
			correlationKeys = new EObjectContainmentEList<CorrelationKey>(CorrelationKey.class, this, BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS);
		}
		return correlationKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getInitiatingParticipantRef() {
		if (initiatingParticipantRef != null && initiatingParticipantRef.eIsProxy()) {
			InternalEObject oldInitiatingParticipantRef = (InternalEObject)initiatingParticipantRef;
			initiatingParticipantRef = (Participant)eResolveProxy(oldInitiatingParticipantRef);
			if (initiatingParticipantRef != oldInitiatingParticipantRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef));
			}
		}
		return initiatingParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetInitiatingParticipantRef() {
		return initiatingParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingParticipantRef(Participant newInitiatingParticipantRef) {
		Participant oldInitiatingParticipantRef = initiatingParticipantRef;
		initiatingParticipantRef = newInitiatingParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType getLoopType() {
		return loopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopType(ChoreographyLoopType newLoopType) {
		ChoreographyLoopType oldLoopType = loopType;
		loopType = newLoopType == null ? LOOP_TYPE_EDEFAULT : newLoopType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE, oldLoopType, loopType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
				return ((InternalEList<?>)getCorrelationKeys()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
				return getParticipantRefs();
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
				return getCorrelationKeys();
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
				if (resolve) return getInitiatingParticipantRef();
				return basicGetInitiatingParticipantRef();
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
				return getLoopType();
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
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				getParticipantRefs().addAll((Collection<? extends Participant>)newValue);
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
				getCorrelationKeys().clear();
				getCorrelationKeys().addAll((Collection<? extends CorrelationKey>)newValue);
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
				setInitiatingParticipantRef((Participant)newValue);
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
				setLoopType((ChoreographyLoopType)newValue);
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
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
				getParticipantRefs().clear();
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
				getCorrelationKeys().clear();
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
				setInitiatingParticipantRef((Participant)null);
				return;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
				setLoopType(LOOP_TYPE_EDEFAULT);
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
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS:
				return participantRefs != null && !participantRefs.isEmpty();
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS:
				return correlationKeys != null && !correlationKeys.isEmpty();
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF:
				return initiatingParticipantRef != null;
			case BPMN2ModelPackage.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE:
				return loopType != LOOP_TYPE_EDEFAULT;
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
		result.append(" (loopType: ");
		result.append(loopType);
		result.append(')');
		return result.toString();
	}

} //ChoreographyActivityImpl
