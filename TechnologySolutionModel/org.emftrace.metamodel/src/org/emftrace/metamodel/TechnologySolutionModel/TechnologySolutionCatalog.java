/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Solution Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getTechnologySolution <em>Technology Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionCatalog()
 * @model
 * @generated
 */
public interface TechnologySolutionCatalog extends TechnologySolutionBase {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionCatalog_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Technology Solution</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Solution</em>' containment reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionCatalog_TechnologySolution()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechnologySolution> getTechnologySolution();

} // TechnologySolutionCatalog
