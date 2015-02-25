/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolution()
 * @model
 * @generated
 */
public interface TechnologySolution extends RelationSourceType, RelationTargetType {
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
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolution_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolution_Features()
	 * @model
	 * @generated
	 */
	EList<TechnologyFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolution_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

} // TechnologySolution
