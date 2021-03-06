/**
 */
package org.emftrace.metamodel.OWLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.OWLModel.DataComplementOf;
import org.emftrace.metamodel.OWLModel.DataIntersectionOf;
import org.emftrace.metamodel.OWLModel.DataOneOf;
import org.emftrace.metamodel.OWLModel.DataUnionOf;
import org.emftrace.metamodel.OWLModel.Datatype;
import org.emftrace.metamodel.OWLModel.DatatypeRestriction;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Complement Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDataIntersectionOf <em>Data Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDataUnionOf <em>Data Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDataComplementOf <em>Data Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDataOneOf <em>Data One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.impl.DataComplementOfImpl#getDatatypeRestriction <em>Datatype Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataComplementOfImpl extends DataRangeImpl implements DataComplementOf {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Datatype datatype;

	/**
	 * The cached value of the '{@link #getDataIntersectionOf() <em>Data Intersection Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataIntersectionOf()
	 * @generated
	 * @ordered
	 */
	protected DataIntersectionOf dataIntersectionOf;

	/**
	 * The cached value of the '{@link #getDataUnionOf() <em>Data Union Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnionOf()
	 * @generated
	 * @ordered
	 */
	protected DataUnionOf dataUnionOf;

	/**
	 * The cached value of the '{@link #getDataComplementOf() <em>Data Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataComplementOf()
	 * @generated
	 * @ordered
	 */
	protected DataComplementOf dataComplementOf;

	/**
	 * The cached value of the '{@link #getDataOneOf() <em>Data One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOneOf()
	 * @generated
	 * @ordered
	 */
	protected DataOneOf dataOneOf;

	/**
	 * The cached value of the '{@link #getDatatypeRestriction() <em>Datatype Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeRestriction()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRestriction datatypeRestriction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataComplementOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWLModelPackage.eINSTANCE.getDataComplementOf();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(Datatype newDatatype, NotificationChain msgs) {
		Datatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE, oldDatatype, newDatatype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataIntersectionOf getDataIntersectionOf() {
		return dataIntersectionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataIntersectionOf(DataIntersectionOf newDataIntersectionOf, NotificationChain msgs) {
		DataIntersectionOf oldDataIntersectionOf = dataIntersectionOf;
		dataIntersectionOf = newDataIntersectionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF, oldDataIntersectionOf, newDataIntersectionOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataIntersectionOf(DataIntersectionOf newDataIntersectionOf) {
		if (newDataIntersectionOf != dataIntersectionOf) {
			NotificationChain msgs = null;
			if (dataIntersectionOf != null)
				msgs = ((InternalEObject)dataIntersectionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF, null, msgs);
			if (newDataIntersectionOf != null)
				msgs = ((InternalEObject)newDataIntersectionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF, null, msgs);
			msgs = basicSetDataIntersectionOf(newDataIntersectionOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF, newDataIntersectionOf, newDataIntersectionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnionOf getDataUnionOf() {
		return dataUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataUnionOf(DataUnionOf newDataUnionOf, NotificationChain msgs) {
		DataUnionOf oldDataUnionOf = dataUnionOf;
		dataUnionOf = newDataUnionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF, oldDataUnionOf, newDataUnionOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataUnionOf(DataUnionOf newDataUnionOf) {
		if (newDataUnionOf != dataUnionOf) {
			NotificationChain msgs = null;
			if (dataUnionOf != null)
				msgs = ((InternalEObject)dataUnionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF, null, msgs);
			if (newDataUnionOf != null)
				msgs = ((InternalEObject)newDataUnionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF, null, msgs);
			msgs = basicSetDataUnionOf(newDataUnionOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF, newDataUnionOf, newDataUnionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataComplementOf getDataComplementOf() {
		return dataComplementOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataComplementOf(DataComplementOf newDataComplementOf, NotificationChain msgs) {
		DataComplementOf oldDataComplementOf = dataComplementOf;
		dataComplementOf = newDataComplementOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF, oldDataComplementOf, newDataComplementOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataComplementOf(DataComplementOf newDataComplementOf) {
		if (newDataComplementOf != dataComplementOf) {
			NotificationChain msgs = null;
			if (dataComplementOf != null)
				msgs = ((InternalEObject)dataComplementOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF, null, msgs);
			if (newDataComplementOf != null)
				msgs = ((InternalEObject)newDataComplementOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF, null, msgs);
			msgs = basicSetDataComplementOf(newDataComplementOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF, newDataComplementOf, newDataComplementOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOneOf getDataOneOf() {
		return dataOneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOneOf(DataOneOf newDataOneOf, NotificationChain msgs) {
		DataOneOf oldDataOneOf = dataOneOf;
		dataOneOf = newDataOneOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF, oldDataOneOf, newDataOneOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOneOf(DataOneOf newDataOneOf) {
		if (newDataOneOf != dataOneOf) {
			NotificationChain msgs = null;
			if (dataOneOf != null)
				msgs = ((InternalEObject)dataOneOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF, null, msgs);
			if (newDataOneOf != null)
				msgs = ((InternalEObject)newDataOneOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF, null, msgs);
			msgs = basicSetDataOneOf(newDataOneOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF, newDataOneOf, newDataOneOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRestriction getDatatypeRestriction() {
		return datatypeRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatypeRestriction(DatatypeRestriction newDatatypeRestriction, NotificationChain msgs) {
		DatatypeRestriction oldDatatypeRestriction = datatypeRestriction;
		datatypeRestriction = newDatatypeRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION, oldDatatypeRestriction, newDatatypeRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeRestriction(DatatypeRestriction newDatatypeRestriction) {
		if (newDatatypeRestriction != datatypeRestriction) {
			NotificationChain msgs = null;
			if (datatypeRestriction != null)
				msgs = ((InternalEObject)datatypeRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION, null, msgs);
			if (newDatatypeRestriction != null)
				msgs = ((InternalEObject)newDatatypeRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION, null, msgs);
			msgs = basicSetDatatypeRestriction(newDatatypeRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION, newDatatypeRestriction, newDatatypeRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE:
				return basicSetDatatype(null, msgs);
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF:
				return basicSetDataIntersectionOf(null, msgs);
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF:
				return basicSetDataUnionOf(null, msgs);
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF:
				return basicSetDataComplementOf(null, msgs);
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF:
				return basicSetDataOneOf(null, msgs);
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION:
				return basicSetDatatypeRestriction(null, msgs);
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
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE:
				return getDatatype();
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF:
				return getDataIntersectionOf();
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF:
				return getDataUnionOf();
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF:
				return getDataComplementOf();
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF:
				return getDataOneOf();
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION:
				return getDatatypeRestriction();
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
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE:
				setDatatype((Datatype)newValue);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF:
				setDataIntersectionOf((DataIntersectionOf)newValue);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF:
				setDataUnionOf((DataUnionOf)newValue);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF:
				setDataComplementOf((DataComplementOf)newValue);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF:
				setDataOneOf((DataOneOf)newValue);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION:
				setDatatypeRestriction((DatatypeRestriction)newValue);
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
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE:
				setDatatype((Datatype)null);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF:
				setDataIntersectionOf((DataIntersectionOf)null);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF:
				setDataUnionOf((DataUnionOf)null);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF:
				setDataComplementOf((DataComplementOf)null);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF:
				setDataOneOf((DataOneOf)null);
				return;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION:
				setDatatypeRestriction((DatatypeRestriction)null);
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
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE:
				return datatype != null;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_INTERSECTION_OF:
				return dataIntersectionOf != null;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_UNION_OF:
				return dataUnionOf != null;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_COMPLEMENT_OF:
				return dataComplementOf != null;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATA_ONE_OF:
				return dataOneOf != null;
			case OWLModelPackage.DATA_COMPLEMENT_OF__DATATYPE_RESTRICTION:
				return datatypeRestriction != null;
		}
		return super.eIsSet(featureID);
	}

} //DataComplementOfImpl
