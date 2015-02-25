/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.UMLModel.InputPin;
import org.emftrace.metamodel.UMLModel.OutputPin;
import org.emftrace.metamodel.UMLModel.ReadIsClassifiedObjectAction;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReadIsClassifiedObjectActionImpl#isIsDirect <em>Is Direct</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReadIsClassifiedObjectActionImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReadIsClassifiedObjectActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ReadIsClassifiedObjectActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadIsClassifiedObjectActionImpl extends ActionImpl implements ReadIsClassifiedObjectAction {
	/**
	 * The default value of the '{@link #isIsDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDirect() <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirect()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirect = IS_DIRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected String classifier = CLASSIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadIsClassifiedObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getReadIsClassifiedObjectAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDirect() {
		return isDirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirect(boolean newIsDirect) {
		boolean oldIsDirect = isDirect;
		isDirect = newIsDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT, oldIsDirect, isDirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(String newClassifier) {
		String oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(OutputPin newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return basicSetResult(null, msgs);
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return basicSetObject(null, msgs);
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
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				return isIsDirect();
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return getClassifier();
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return getResult();
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return getObject();
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
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				setIsDirect((Boolean)newValue);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				setClassifier((String)newValue);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				setResult((OutputPin)newValue);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				setObject((InputPin)newValue);
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
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				setIsDirect(IS_DIRECT_EDEFAULT);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				setClassifier(CLASSIFIER_EDEFAULT);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				setResult((OutputPin)null);
				return;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				setObject((InputPin)null);
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
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT:
				return isDirect != IS_DIRECT_EDEFAULT;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT:
				return result != null;
			case UMLModelPackage.READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT:
				return object != null;
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
		result.append(" (isDirect: ");
		result.append(isDirect);
		result.append(", classifier: ");
		result.append(classifier);
		result.append(')');
		return result.toString();
	}

} //ReadIsClassifiedObjectActionImpl
