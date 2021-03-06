/**
 */
package org.emftrace.metamodel.OWLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DifferentIndividuals#getNamedIndividual <em>Named Individual</em>}</li>
 *   <li>{@link org.emftrace.metamodel.OWLModel.DifferentIndividuals#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDifferentIndividuals()
 * @model
 * @generated
 */
public interface DifferentIndividuals extends Assertion {
	/**
	 * Returns the value of the '<em><b>Named Individual</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.NamedIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Individual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Individual</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDifferentIndividuals_NamedIndividual()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedIndividual> getNamedIndividual();

	/**
	 * Returns the value of the '<em><b>Anonymous Individual</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.OWLModel.AnonymousIndividual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Individual</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Individual</em>' containment reference list.
	 * @see org.emftrace.metamodel.OWLModel.OWLModelPackage#getDifferentIndividuals_AnonymousIndividual()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnonymousIndividual> getAnonymousIndividual();

} // DifferentIndividuals
