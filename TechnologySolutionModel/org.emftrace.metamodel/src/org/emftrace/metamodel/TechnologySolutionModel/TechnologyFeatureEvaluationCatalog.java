/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Feature Evaluation Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getFeatureEvaluation <em>Feature Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeatureEvaluationCatalog()
 * @model
 * @generated
 */
public interface TechnologyFeatureEvaluationCatalog extends TechnologySolutionBase {
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
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeatureEvaluationCatalog_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Feature Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Evaluation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Evaluation</em>' containment reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeatureEvaluationCatalog_FeatureEvaluation()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureEvaluation> getFeatureEvaluation();

} // TechnologyFeatureEvaluationCatalog
