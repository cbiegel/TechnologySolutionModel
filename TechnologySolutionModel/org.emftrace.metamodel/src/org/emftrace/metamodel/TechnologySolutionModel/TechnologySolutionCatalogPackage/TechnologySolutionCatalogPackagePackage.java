/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackageFactory
 * @model kind="package"
 * @generated
 */
public interface TechnologySolutionCatalogPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TechnologySolutionCatalogPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TechnologySolutionCatalogPackage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TechnologySolutionCatalogPackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechnologySolutionCatalogPackagePackage eINSTANCE = org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl <em>Technology Solution Catalog Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl#getTechnologySolutionCatalogPackage()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Technology Solution Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Technology Feature Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Technology Feature Evaluation Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG = 2;

	/**
	 * The feature id for the '<em><b>ASTA Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG = 3;

	/**
	 * The number of structural features of the '<em>Technology Solution Catalog Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_PACKAGE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage <em>Technology Solution Catalog Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution Catalog Package</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage
	 * @generated
	 */
	EClass getTechnologySolutionCatalogPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologySolutionCatalog <em>Technology Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Solution Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologySolutionCatalog()
	 * @see #getTechnologySolutionCatalogPackage()
	 * @generated
	 */
	EReference getTechnologySolutionCatalogPackage_TechnologySolutionCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologyFeatureCatalog <em>Technology Feature Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Feature Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologyFeatureCatalog()
	 * @see #getTechnologySolutionCatalogPackage()
	 * @generated
	 */
	EReference getTechnologySolutionCatalogPackage_TechnologyFeatureCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologyFeatureEvaluationCatalog <em>Technology Feature Evaluation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Feature Evaluation Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getTechnologyFeatureEvaluationCatalog()
	 * @see #getTechnologySolutionCatalogPackage()
	 * @generated
	 */
	EReference getTechnologySolutionCatalogPackage_TechnologyFeatureEvaluationCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getASTACatalog <em>ASTA Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ASTA Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage#getASTACatalog()
	 * @see #getTechnologySolutionCatalogPackage()
	 * @generated
	 */
	EReference getTechnologySolutionCatalogPackage_ASTACatalog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechnologySolutionCatalogPackageFactory getTechnologySolutionCatalogPackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl <em>Technology Solution Catalog Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl#getTechnologySolutionCatalogPackage()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION_CATALOG_PACKAGE = eINSTANCE.getTechnologySolutionCatalogPackage();

		/**
		 * The meta object literal for the '<em><b>Technology Solution Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG = eINSTANCE.getTechnologySolutionCatalogPackage_TechnologySolutionCatalog();

		/**
		 * The meta object literal for the '<em><b>Technology Feature Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG = eINSTANCE.getTechnologySolutionCatalogPackage_TechnologyFeatureCatalog();

		/**
		 * The meta object literal for the '<em><b>Technology Feature Evaluation Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG = eINSTANCE.getTechnologySolutionCatalogPackage_TechnologyFeatureEvaluationCatalog();

		/**
		 * The meta object literal for the '<em><b>ASTA Catalog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG = eINSTANCE.getTechnologySolutionCatalogPackage_ASTACatalog();

	}

} //TechnologySolutionCatalogPackagePackage
