/**
 */
package org.emftrace.metamodel.BPMN2Model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;
import org.emftrace.metamodel.BPMN2Model.Import;
import org.emftrace.metamodel.BPMN2Model.ItemDefinition;
import org.emftrace.metamodel.BPMN2Model.ItemKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.impl.ItemDefinitionImpl#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDefinitionImpl extends RootElementImpl implements ItemDefinition {
	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected Import import_;

	/**
	 * The default value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemKind()
	 * @generated
	 * @ordered
	 */
	protected static final ItemKind ITEM_KIND_EDEFAULT = ItemKind.PHYSICAL;

	/**
	 * The cached value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemKind()
	 * @generated
	 * @ordered
	 */
	protected ItemKind itemKind = ITEM_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected EObject structureRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN2ModelPackage.eINSTANCE.getItemDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_DEFINITION__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject)import_;
			import_ = (Import)eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.ITEM_DEFINITION__IMPORT, oldImport, import_));
			}
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import basicGetImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		Import oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_DEFINITION__IMPORT, oldImport, import_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind getItemKind() {
		return itemKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemKind(ItemKind newItemKind) {
		ItemKind oldItemKind = itemKind;
		itemKind = newItemKind == null ? ITEM_KIND_EDEFAULT : newItemKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_DEFINITION__ITEM_KIND, oldItemKind, itemKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStructureRef() {
		if (structureRef != null && structureRef.eIsProxy()) {
			InternalEObject oldStructureRef = (InternalEObject)structureRef;
			structureRef = eResolveProxy(oldStructureRef);
			if (structureRef != oldStructureRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef));
			}
		}
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetStructureRef() {
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(EObject newStructureRef) {
		EObject oldStructureRef = structureRef;
		structureRef = newStructureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN2ModelPackage.ITEM_DEFINITION__IS_COLLECTION:
				return isIsCollection();
			case BPMN2ModelPackage.ITEM_DEFINITION__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case BPMN2ModelPackage.ITEM_DEFINITION__ITEM_KIND:
				return getItemKind();
			case BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF:
				if (resolve) return getStructureRef();
				return basicGetStructureRef();
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
			case BPMN2ModelPackage.ITEM_DEFINITION__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__IMPORT:
				setImport((Import)newValue);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__ITEM_KIND:
				setItemKind((ItemKind)newValue);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF:
				setStructureRef((EObject)newValue);
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
			case BPMN2ModelPackage.ITEM_DEFINITION__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__IMPORT:
				setImport((Import)null);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__ITEM_KIND:
				setItemKind(ITEM_KIND_EDEFAULT);
				return;
			case BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF:
				setStructureRef((EObject)null);
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
			case BPMN2ModelPackage.ITEM_DEFINITION__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case BPMN2ModelPackage.ITEM_DEFINITION__IMPORT:
				return import_ != null;
			case BPMN2ModelPackage.ITEM_DEFINITION__ITEM_KIND:
				return itemKind != ITEM_KIND_EDEFAULT;
			case BPMN2ModelPackage.ITEM_DEFINITION__STRUCTURE_REF:
				return structureRef != null;
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
		result.append(" (isCollection: ");
		result.append(isCollection);
		result.append(", itemKind: ");
		result.append(itemKind);
		result.append(')');
		return result.toString();
	}

} //ItemDefinitionImpl
