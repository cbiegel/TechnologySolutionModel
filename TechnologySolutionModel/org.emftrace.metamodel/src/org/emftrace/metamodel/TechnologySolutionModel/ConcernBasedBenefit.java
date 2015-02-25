/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Based Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit#getConcern <em>Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getConcernBasedBenefit()
 * @model
 * @generated
 */
public interface ConcernBasedBenefit extends Benefit {
	/**
	 * Returns the value of the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' attribute.
	 * @see #setConcern(String)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getConcernBasedBenefit_Concern()
	 * @model required="true"
	 * @generated
	 */
	String getConcern();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit#getConcern <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' attribute.
	 * @see #getConcern()
	 * @generated
	 */
	void setConcern(String value);

} // ConcernBasedBenefit
