/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Environments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getDevelopmentEnvironments()
 * @model
 * @generated
 */
public interface DevelopmentEnvironments extends TechnologySolutionBase {
	/**
	 * Returns the value of the '<em><b>Development Environments</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Environments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Environments</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getDevelopmentEnvironments_DevelopmentEnvironments()
	 * @model
	 * @generated
	 */
	EList<DevelopmentEnvironment> getDevelopmentEnvironments();

} // DevelopmentEnvironments
