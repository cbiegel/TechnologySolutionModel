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

import org.emftrace.metamodel.TechnologySolutionModel.Relation;
import org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationCatalogImpl extends TechnologySolutionBaseImpl implements RelationCatalog {
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
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.RELATION_CATALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.RELATION_CATALOG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Relation>(Relation.class, this, TechnologySolutionModelPackage.RELATION_CATALOG__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TechnologySolutionModelPackage.RELATION_CATALOG__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
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
			case TechnologySolutionModelPackage.RELATION_CATALOG__DESCRIPTION:
				return getDescription();
			case TechnologySolutionModelPackage.RELATION_CATALOG__RELATION:
				return getRelation();
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
			case TechnologySolutionModelPackage.RELATION_CATALOG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechnologySolutionModelPackage.RELATION_CATALOG__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Relation>)newValue);
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
			case TechnologySolutionModelPackage.RELATION_CATALOG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.RELATION_CATALOG__RELATION:
				getRelation().clear();
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
			case TechnologySolutionModelPackage.RELATION_CATALOG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechnologySolutionModelPackage.RELATION_CATALOG__RELATION:
				return relation != null && !relation.isEmpty();
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

} //RelationCatalogImpl
