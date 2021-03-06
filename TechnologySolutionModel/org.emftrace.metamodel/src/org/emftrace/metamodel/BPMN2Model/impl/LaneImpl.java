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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.BaseElement;
import org.emftrace.metamodel.BPMN2Model.FlowNode;
import org.emftrace.metamodel.BPMN2Model.Lane;
import org.emftrace.metamodel.BPMN2Model.LaneSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneImpl extends BaseElementImpl implements Lane {
	/**
	 * The cached value of the '{@link #getPartitionElement() <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement partitionElement;

	/**
	 * The cached value of the '{@link #getFlowNodeRefs() <em>Flow Node Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowNodeRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNode> flowNodeRefs;

	/**
	 * The cached value of the '{@link #getChildLaneSet() <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildLaneSet()
	 * @generated
	 * @ordered
	 */
	protected LaneSet childLaneSet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElementRef()
	 * @generated
	 * @ordered
	 */
	protected BaseElement partitionElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getLane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElement() {
		return partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionElement(BaseElement newPartitionElement, NotificationChain msgs) {
		BaseElement oldPartitionElement = partitionElement;
		partitionElement = newPartitionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__PARTITION_ELEMENT, oldPartitionElement, newPartitionElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElement(BaseElement newPartitionElement) {
		if (newPartitionElement != partitionElement) {
			NotificationChain msgs = null;
			if (partitionElement != null)
				msgs = ((InternalEObject)partitionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.LANE__PARTITION_ELEMENT, null, msgs);
			if (newPartitionElement != null)
				msgs = ((InternalEObject)newPartitionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.LANE__PARTITION_ELEMENT, null, msgs);
			msgs = basicSetPartitionElement(newPartitionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__PARTITION_ELEMENT, newPartitionElement, newPartitionElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNode> getFlowNodeRefs() {
		if (flowNodeRefs == null) {
			flowNodeRefs = new EObjectWithInverseResolvingEList.ManyInverse<FlowNode>(FlowNode.class, this, BPMN2ModelPackage.LANE__FLOW_NODE_REFS, BPMN2ModelPackage.FLOW_NODE__LANES);
		}
		return flowNodeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getChildLaneSet() {
		return childLaneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildLaneSet(LaneSet newChildLaneSet, NotificationChain msgs) {
		LaneSet oldChildLaneSet = childLaneSet;
		childLaneSet = newChildLaneSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__CHILD_LANE_SET, oldChildLaneSet, newChildLaneSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildLaneSet(LaneSet newChildLaneSet) {
		if (newChildLaneSet != childLaneSet) {
			NotificationChain msgs = null;
			if (childLaneSet != null)
				msgs = ((InternalEObject)childLaneSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.LANE__CHILD_LANE_SET, null, msgs);
			if (newChildLaneSet != null)
				msgs = ((InternalEObject)newChildLaneSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN2ModelPackage.LANE__CHILD_LANE_SET, null, msgs);
			msgs = basicSetChildLaneSet(newChildLaneSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__CHILD_LANE_SET, newChildLaneSet, newChildLaneSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElementRef() {
		if (partitionElementRef != null && partitionElementRef.eIsProxy()) {
			InternalEObject oldPartitionElementRef = (InternalEObject)partitionElementRef;
			partitionElementRef = (BaseElement)eResolveProxy(oldPartitionElementRef);
			if (partitionElementRef != oldPartitionElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
			}
		}
		return partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetPartitionElementRef() {
		return partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElementRef(BaseElement newPartitionElementRef) {
		BaseElement oldPartitionElementRef = partitionElementRef;
		partitionElementRef = newPartitionElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowNodeRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
				return basicSetPartitionElement(null, msgs);
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				return ((InternalEList<?>)getFlowNodeRefs()).basicRemove(otherEnd, msgs);
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
				return basicSetChildLaneSet(null, msgs);
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
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
				return getPartitionElement();
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				return getFlowNodeRefs();
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
				return getChildLaneSet();
			case BPMN2ModelPackage.LANE__NAME:
				return getName();
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF:
				if (resolve) return getPartitionElementRef();
				return basicGetPartitionElementRef();
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
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
				setPartitionElement((BaseElement)newValue);
				return;
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				getFlowNodeRefs().addAll((Collection<? extends FlowNode>)newValue);
				return;
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)newValue);
				return;
			case BPMN2ModelPackage.LANE__NAME:
				setName((String)newValue);
				return;
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)newValue);
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
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
				setPartitionElement((BaseElement)null);
				return;
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				return;
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)null);
				return;
			case BPMN2ModelPackage.LANE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)null);
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
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT:
				return partitionElement != null;
			case BPMN2ModelPackage.LANE__FLOW_NODE_REFS:
				return flowNodeRefs != null && !flowNodeRefs.isEmpty();
			case BPMN2ModelPackage.LANE__CHILD_LANE_SET:
				return childLaneSet != null;
			case BPMN2ModelPackage.LANE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN2ModelPackage.LANE__PARTITION_ELEMENT_REF:
				return partitionElementRef != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
