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
import org.emftrace.metamodel.BPMN2Model.CatchEvent;
import org.emftrace.metamodel.BPMN2Model.DataOutput;
import org.emftrace.metamodel.BPMN2Model.DataOutputAssociation;
import org.emftrace.metamodel.BPMN2Model.EventDefinition;
import org.emftrace.metamodel.BPMN2Model.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.CatchEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
	/**
	 * The cached value of the '{@link #getDataOutputs() <em>Data Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutput> dataOutputs;

	/**
	 * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutputAssociation> dataOutputAssociation;

	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected OutputSet outputSet;

	/**
	 * The cached value of the '{@link #getEventDefinitions() <em>Event Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> eventDefinitions;

	/**
	 * The cached value of the '{@link #getEventDefinitionRefs() <em>Event Definition Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitionRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> eventDefinitionRefs;

	/**
	 * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getCatchEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getDataOutputs() {
		if (dataOutputs == null) {
			dataOutputs = new EObjectContainmentEList<DataOutput>(DataOutput.class, this, BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS);
		}
		return dataOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutputAssociation> getDataOutputAssociation() {
		if (dataOutputAssociation == null) {
			dataOutputAssociation = new EObjectContainmentEList<DataOutputAssociation>(DataOutputAssociation.class, this, BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION);
		}
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputSet() {
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(OutputSet newOutputSet, NotificationChain msgs) {
		OutputSet oldOutputSet = outputSet;
		outputSet = newOutputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET, oldOutputSet, newOutputSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSet(OutputSet newOutputSet) {
		if (newOutputSet != outputSet) {
			NotificationChain msgs = null;
			if (outputSet != null)
				msgs = ((InternalEObject)outputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET, null, msgs);
			if (newOutputSet != null)
				msgs = ((InternalEObject)newOutputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET, null, msgs);
			msgs = basicSetOutputSet(newOutputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET, newOutputSet, newOutputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefinition> getEventDefinitions() {
		if (eventDefinitions == null) {
			eventDefinitions = new EObjectContainmentEList<EventDefinition>(EventDefinition.class, this, BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS);
		}
		return eventDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefinition> getEventDefinitionRefs() {
		if (eventDefinitionRefs == null) {
			eventDefinitionRefs = new EObjectResolvingEList<EventDefinition>(EventDefinition.class, this, BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITION_REFS);
		}
		return eventDefinitionRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallelMultiple() {
		return parallelMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelMultiple(boolean newParallelMultiple) {
		boolean oldParallelMultiple = parallelMultiple;
		parallelMultiple = newParallelMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.CATCH_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, parallelMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS:
				return ((InternalEList<?>)getDataOutputs()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				return ((InternalEList<?>)getDataOutputAssociation()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS:
				return ((InternalEList<?>)getEventDefinitions()).basicRemove(otherEnd, msgs);
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
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS:
				return getDataOutputs();
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET:
				return getOutputSet();
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS:
				return getEventDefinitions();
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
				return getEventDefinitionRefs();
			case BPMN2ModelPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return isParallelMultiple();
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
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS:
				getDataOutputs().clear();
				getDataOutputs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				getDataOutputAssociation().addAll((Collection<? extends DataOutputAssociation>)newValue);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET:
				setOutputSet((OutputSet)newValue);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
				getEventDefinitions().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
				getEventDefinitionRefs().clear();
				getEventDefinitionRefs().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple((Boolean)newValue);
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
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS:
				getDataOutputs().clear();
				return;
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				return;
			case BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET:
				setOutputSet((OutputSet)null);
				return;
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
				return;
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
				getEventDefinitionRefs().clear();
				return;
			case BPMN2ModelPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple(PARALLEL_MULTIPLE_EDEFAULT);
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
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUTS:
				return dataOutputs != null && !dataOutputs.isEmpty();
			case BPMN2ModelPackage.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION:
				return dataOutputAssociation != null && !dataOutputAssociation.isEmpty();
			case BPMN2ModelPackage.CATCH_EVENT__OUTPUT_SET:
				return outputSet != null;
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITIONS:
				return eventDefinitions != null && !eventDefinitions.isEmpty();
			case BPMN2ModelPackage.CATCH_EVENT__EVENT_DEFINITION_REFS:
				return eventDefinitionRefs != null && !eventDefinitionRefs.isEmpty();
			case BPMN2ModelPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return parallelMultiple != PARALLEL_MULTIPLE_EDEFAULT;
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
		result.append(" (parallelMultiple: ");
		result.append(parallelMultiple);
		result.append(')');
		return result.toString();
	}

} //CatchEventImpl
