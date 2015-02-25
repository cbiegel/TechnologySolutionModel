/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Solutions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions#getTechnologySolutions <em>Technology Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutions()
 * @model
 * @generated
 */
public interface TechnologySolutions extends TechnologySolutionBase {
	/**
	 * Returns the value of the '<em><b>Technology Solutions</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Solutions</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutions_TechnologySolutions()
	 * @model
	 * @generated
	 */
	EList<TechnologySolution> getTechnologySolutions();

} // TechnologySolutions
