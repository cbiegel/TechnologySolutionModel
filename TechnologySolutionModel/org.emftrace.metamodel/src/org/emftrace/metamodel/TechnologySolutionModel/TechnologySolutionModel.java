/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Solution Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getVersion <em>Version</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getTechnologySolutions <em>Technology Solutions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getConceptualSolutions <em>Conceptual Solutions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel()
 * @model
 * @generated
 */
public interface TechnologySolutionModel extends TechnologySolutionBase {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel_Version()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Technology Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Solutions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Solutions</em>' containment reference.
	 * @see #setTechnologySolutions(TechnologySolutions)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel_TechnologySolutions()
	 * @model containment="true"
	 * @generated
	 */
	TechnologySolutions getTechnologySolutions();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getTechnologySolutions <em>Technology Solutions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Solutions</em>' containment reference.
	 * @see #getTechnologySolutions()
	 * @generated
	 */
	void setTechnologySolutions(TechnologySolutions value);

	/**
	 * Returns the value of the '<em><b>Conceptual Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Solutions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Solutions</em>' containment reference.
	 * @see #setConceptualSolutions(ConceptualSolutions)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel_ConceptualSolutions()
	 * @model containment="true"
	 * @generated
	 */
	ConceptualSolutions getConceptualSolutions();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getConceptualSolutions <em>Conceptual Solutions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual Solutions</em>' containment reference.
	 * @see #getConceptualSolutions()
	 * @generated
	 */
	void setConceptualSolutions(ConceptualSolutions value);

	/**
	 * Returns the value of the '<em><b>Development Environments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Environments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Environments</em>' containment reference.
	 * @see #setDevelopmentEnvironments(DevelopmentEnvironments)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel_DevelopmentEnvironments()
	 * @model containment="true"
	 * @generated
	 */
	DevelopmentEnvironments getDevelopmentEnvironments();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getDevelopmentEnvironments <em>Development Environments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Environments</em>' containment reference.
	 * @see #getDevelopmentEnvironments()
	 * @generated
	 */
	void setDevelopmentEnvironments(DevelopmentEnvironments value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference.
	 * @see #setRelations(Relations)
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage#getTechnologySolutionModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	Relations getRelations();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getRelations <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relations</em>' containment reference.
	 * @see #getRelations()
	 * @generated
	 */
	void setRelations(Relations value);

} // TechnologySolutionModel
