/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.SubDataPropertyOf#getDataProperty <em>Data Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubDataPropertyOf()
 * @model
 * @generated
 */
public interface SubDataPropertyOf extends DataPropertyAxiom {
	/**
	 * Returns the value of the '<em><b>Data Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Property</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getSubDataPropertyOf_DataProperty()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<DataProperty> getDataProperty();

} // SubDataPropertyOf
