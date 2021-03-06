/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataIntersectionOf <em>Data Intersection Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataUnionOf <em>Data Union Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataComplementOf <em>Data Complement Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataOneOf <em>Data One Of</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDatatypeRestriction <em>Datatype Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition()
 * @model
 * @generated
 */
public interface DatatypeDefinition extends Axiom {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_Datatype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Datatype> getDatatype();

	/**
	 * Returns the value of the '<em><b>Data Intersection Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Intersection Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Intersection Of</em>' containment reference.
	 * @see #setDataIntersectionOf(DataIntersectionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_DataIntersectionOf()
	 * @model containment="true"
	 * @generated
	 */
	DataIntersectionOf getDataIntersectionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataIntersectionOf <em>Data Intersection Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Intersection Of</em>' containment reference.
	 * @see #getDataIntersectionOf()
	 * @generated
	 */
	void setDataIntersectionOf(DataIntersectionOf value);

	/**
	 * Returns the value of the '<em><b>Data Union Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Union Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Union Of</em>' containment reference.
	 * @see #setDataUnionOf(DataUnionOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_DataUnionOf()
	 * @model containment="true"
	 * @generated
	 */
	DataUnionOf getDataUnionOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataUnionOf <em>Data Union Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Union Of</em>' containment reference.
	 * @see #getDataUnionOf()
	 * @generated
	 */
	void setDataUnionOf(DataUnionOf value);

	/**
	 * Returns the value of the '<em><b>Data Complement Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Complement Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Complement Of</em>' containment reference.
	 * @see #setDataComplementOf(DataComplementOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_DataComplementOf()
	 * @model containment="true"
	 * @generated
	 */
	DataComplementOf getDataComplementOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataComplementOf <em>Data Complement Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Complement Of</em>' containment reference.
	 * @see #getDataComplementOf()
	 * @generated
	 */
	void setDataComplementOf(DataComplementOf value);

	/**
	 * Returns the value of the '<em><b>Data One Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data One Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data One Of</em>' containment reference.
	 * @see #setDataOneOf(DataOneOf)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_DataOneOf()
	 * @model containment="true"
	 * @generated
	 */
	DataOneOf getDataOneOf();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDataOneOf <em>Data One Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data One Of</em>' containment reference.
	 * @see #getDataOneOf()
	 * @generated
	 */
	void setDataOneOf(DataOneOf value);

	/**
	 * Returns the value of the '<em><b>Datatype Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Restriction</em>' containment reference.
	 * @see #setDatatypeRestriction(DatatypeRestriction)
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDatatypeDefinition_DatatypeRestriction()
	 * @model containment="true"
	 * @generated
	 */
	DatatypeRestriction getDatatypeRestriction();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.OWLModel.DatatypeDefinition#getDatatypeRestriction <em>Datatype Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype Restriction</em>' containment reference.
	 * @see #getDatatypeRestriction()
	 * @generated
	 */
	void setDatatypeRestriction(DatatypeRestriction value);

} // DatatypeDefinition
