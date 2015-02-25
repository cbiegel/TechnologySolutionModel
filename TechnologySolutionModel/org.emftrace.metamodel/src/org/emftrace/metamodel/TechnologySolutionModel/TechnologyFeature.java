/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getASTA <em>ASTA</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getFeatureEvaluation <em>Feature Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature()
 * @model
 * @generated
 */
public interface TechnologyFeature extends RelationSourceType, RelationTargetType {
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
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Capability Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftrace.metamodel.TechnologySolutionModel.CapabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Type</em>' attribute.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.CapabilityType
	 * @see #setCapabilityType(CapabilityType)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature_CapabilityType()
	 * @model required="true"
	 * @generated
	 */
	CapabilityType getCapabilityType();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Type</em>' attribute.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.CapabilityType
	 * @see #getCapabilityType()
	 * @generated
	 */
	void setCapabilityType(CapabilityType value);

	/**
	 * Returns the value of the '<em><b>ASTA</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.ASTA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASTA</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASTA</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature_ASTA()
	 * @model
	 * @generated
	 */
	EList<ASTA> getASTA();

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
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature_Relations()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Feature Evaluation</b></em>' reference list.
	 * The list contents are of type {@link org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Evaluation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Evaluation</em>' reference list.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologyFeature_FeatureEvaluation()
	 * @model
	 * @generated
	 */
	EList<FeatureEvaluation> getFeatureEvaluation();

} // TechnologyFeature
