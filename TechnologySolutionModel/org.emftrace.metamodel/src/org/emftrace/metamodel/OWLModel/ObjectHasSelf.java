/**
 */
package org.emftrace.metamodel.OWLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Has Self</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasSelf#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.ObjectHasSelf#getObjectInverseOf <em>Object Inverse Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasSelf()
 * @model
 * @generated
 */
public interface ObjectHasSelf extends ClassExpression {
	/**
	 * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Property</em>' containment reference.
	 * @see #setObjectProperty(ObjectProperty)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasSelf_ObjectProperty()
	 * @model containment="true"
	 * @generated
	 */
	ObjectProperty getObjectProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasSelf#getObjectProperty <em>Object Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Property</em>' containment reference.
	 * @see #getObjectProperty()
	 * @generated
	 */
	void setObjectProperty(ObjectProperty value);

	/**
	 * Returns the value of the '<em><b>Object Inverse Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Inverse Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #setObjectInverseOf(ObjectInverseOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getObjectHasSelf_ObjectInverseOf()
	 * @model containment="true"
	 * @generated
	 */
	ObjectInverseOf getObjectInverseOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.ObjectHasSelf#getObjectInverseOf <em>Object Inverse Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Inverse Of</em>' containment reference.
	 * @see #getObjectInverseOf()
	 * @generated
	 */
	void setObjectInverseOf(ObjectInverseOf value);

} // ObjectHasSelf
