/**
 */
package org.emftrace.metamodel.TechnologySolutionModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelFactory
 * @model kind="package"
 * @generated
 */
public interface TechnologySolutionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TechnologySolutionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TechnologySolutionModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TechnologySolutionModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechnologySolutionModelPackage eINSTANCE = org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionBaseImpl <em>Technology Solution Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionBaseImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionBase()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION_BASE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_BASE__ID = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_BASE__NAME = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Solution Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl <em>Technology Solution Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionModel()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION_MODEL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__VERSION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conceptual Solutions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Development Environments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL__RELATIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Technology Solution Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_MODEL_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionCatalogImpl <em>Technology Solution Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionCatalog()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION_CATALOG = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG__TECHNOLOGY_SOLUTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Solution Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureCatalogImpl <em>Technology Feature Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureCatalog()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE_CATALOG = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Feature Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl <em>Relation Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationCatalog()
	 * @generated
	 */
	int RELATION_CATALOG = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG__RELATION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTACatalogImpl <em>ASTA Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ASTACatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getASTACatalog()
	 * @generated
	 */
	int ASTA_CATALOG = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ASTA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG__ASTA = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ASTA Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionCatalogImpl <em>Conceptual Solution Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolutionCatalog()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTION_CATALOG = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conceptual Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Solution Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentCatalogImpl <em>Development Environment Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Development Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG__DEVELOPMENT_ENVIRONMENT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Environment Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl <em>Technology Feature Evaluation Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureEvaluationCatalog()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology Feature Evaluation Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_EVALUATION_CATALOG_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionsImpl <em>Technology Solutions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionsImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutions()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTIONS = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Technology Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Technology Solutions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTIONS_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationSourceTypeImpl <em>Relation Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationSourceTypeImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationSourceType()
	 * @generated
	 */
	int RELATION_SOURCE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Relation Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_SOURCE_TYPE_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionImpl <em>Technology Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolution()
	 * @generated
	 */
	int TECHNOLOGY_SOLUTION = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__FEATURES = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION__RELATIONS = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Technology Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_SOLUTION_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl <em>Technology Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeature()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__CAPABILITY_TYPE = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ASTA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__ASTA = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__RELATIONS = RELATION_SOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Evaluation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE__FEATURE_EVALUATION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Technology Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureEvaluationImpl <em>Feature Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureEvaluationImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureEvaluation()
	 * @generated
	 */
	int FEATURE_EVALUATION = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EVALUATION__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EVALUATION__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Feature Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EVALUATION_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl <em>Technology Feature Concern Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ID = FEATURE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__NAME = FEATURE_EVALUATION__NAME;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT = FEATURE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT = FEATURE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS = FEATURE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS = FEATURE_EVALUATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantitative Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT = FEATURE_EVALUATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualitative Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT = FEATURE_EVALUATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Technology Feature Concern Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT_FEATURE_COUNT = FEATURE_EVALUATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl <em>Technology Features Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeaturesComparison()
	 * @generated
	 */
	int TECHNOLOGY_FEATURES_COMPARISON = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__ID = FEATURE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__NAME = FEATURE_EVALUATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__SOURCE = FEATURE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__SCOPE = FEATURE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__DATE = FEATURE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON__TRUST = FEATURE_EVALUATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Technology Features Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURES_COMPARISON_FEATURE_COUNT = FEATURE_EVALUATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl <em>ASTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getASTA()
	 * @generated
	 */
	int ASTA = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__CONDITION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA__CAPABILITY_TYPE = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ASTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTA_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.BenefitImpl <em>Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.BenefitImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getBenefit()
	 * @generated
	 */
	int BENEFIT = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__ID = ASTA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__NAME = ASTA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__DESCRIPTION = ASTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__CONDITION = ASTA__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT__CAPABILITY_TYPE = ASTA__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEFIT_FEATURE_COUNT = ASTA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedBenefitImpl <em>Feature Based Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedBenefitImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureBasedBenefit()
	 * @generated
	 */
	int FEATURE_BASED_BENEFIT = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__ID = BENEFIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__NAME = BENEFIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__DESCRIPTION = BENEFIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__CONDITION = BENEFIT__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT__CAPABILITY_TYPE = BENEFIT__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Feature Based Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_BENEFIT_FEATURE_COUNT = BENEFIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedBenefitImpl <em>Concern Based Benefit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedBenefitImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConcernBasedBenefit()
	 * @generated
	 */
	int CONCERN_BASED_BENEFIT = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__ID = BENEFIT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__NAME = BENEFIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__DESCRIPTION = BENEFIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CONDITION = BENEFIT__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CAPABILITY_TYPE = BENEFIT__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT__CONCERN = BENEFIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Based Benefit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_BENEFIT_FEATURE_COUNT = BENEFIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DrawbackImpl <em>Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DrawbackImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDrawback()
	 * @generated
	 */
	int DRAWBACK = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__ID = ASTA__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__NAME = ASTA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__DESCRIPTION = ASTA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__CONDITION = ASTA__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK__CAPABILITY_TYPE = ASTA__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK_FEATURE_COUNT = ASTA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedDrawbackImpl <em>Feature Based Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedDrawbackImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureBasedDrawback()
	 * @generated
	 */
	int FEATURE_BASED_DRAWBACK = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__ID = DRAWBACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__NAME = DRAWBACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__DESCRIPTION = DRAWBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__CONDITION = DRAWBACK__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK__CAPABILITY_TYPE = DRAWBACK__CAPABILITY_TYPE;

	/**
	 * The number of structural features of the '<em>Feature Based Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_BASED_DRAWBACK_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedDrawbackImpl <em>Concern Based Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedDrawbackImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConcernBasedDrawback()
	 * @generated
	 */
	int CONCERN_BASED_DRAWBACK = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__ID = DRAWBACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__NAME = DRAWBACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__DESCRIPTION = DRAWBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CONDITION = DRAWBACK__CONDITION;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CAPABILITY_TYPE = DRAWBACK__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK__CONCERN = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concern Based Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_BASED_DRAWBACK_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionsImpl <em>Conceptual Solutions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionsImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolutions()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTIONS = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Conceptual Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conceptual Solutions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTIONS_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionImpl <em>Conceptual Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolution()
	 * @generated
	 */
	int CONCEPTUAL_SOLUTION = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION__VARIATION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conceptual Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTUAL_SOLUTION_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentsImpl <em>Development Environments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentsImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironments()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENTS = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Development Environments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Development Environments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENTS_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironment()
	 * @generated
	 */
	int DEVELOPMENT_ENVIRONMENT = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__ID = RELATION_SOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__NAME = RELATION_SOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__DESCRIPTION = RELATION_SOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Programming Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE = RELATION_SOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Development Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_ENVIRONMENT_FEATURE_COUNT = RELATION_SOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationsImpl <em>Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationsImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelations()
	 * @generated
	 */
	int RELATIONS = 26;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__RELATIONS = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 27;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DESCRIPTION = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE_ELEMENT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET_ELEMENT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationTargetTypeImpl <em>Relation Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationTargetTypeImpl
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationTargetType()
	 * @generated
	 */
	int RELATION_TARGET_TYPE = 29;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE__ID = TECHNOLOGY_SOLUTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE__NAME = TECHNOLOGY_SOLUTION_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Relation Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_TYPE_FEATURE_COUNT = TECHNOLOGY_SOLUTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.CapabilityType <em>Capability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.CapabilityType
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getCapabilityType()
	 * @generated
	 */
	int CAPABILITY_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationType
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 31;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getID()
	 * @generated
	 */
	int ID = 32;


	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase <em>Technology Solution Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution Base</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase
	 * @generated
	 */
	EClass getTechnologySolutionBase();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase#getID()
	 * @see #getTechnologySolutionBase()
	 * @generated
	 */
	EAttribute getTechnologySolutionBase_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase#getName()
	 * @see #getTechnologySolutionBase()
	 * @generated
	 */
	EAttribute getTechnologySolutionBase_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel <em>Technology Solution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution Model</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel
	 * @generated
	 */
	EClass getTechnologySolutionModel();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getVersion()
	 * @see #getTechnologySolutionModel()
	 * @generated
	 */
	EAttribute getTechnologySolutionModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getTechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getTechnologySolutions()
	 * @see #getTechnologySolutionModel()
	 * @generated
	 */
	EReference getTechnologySolutionModel_TechnologySolutions();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getConceptualSolutions()
	 * @see #getTechnologySolutionModel()
	 * @generated
	 */
	EReference getTechnologySolutionModel_ConceptualSolutions();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getDevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getDevelopmentEnvironments()
	 * @see #getTechnologySolutionModel()
	 * @generated
	 */
	EReference getTechnologySolutionModel_DevelopmentEnvironments();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel#getRelations()
	 * @see #getTechnologySolutionModel()
	 * @generated
	 */
	EReference getTechnologySolutionModel_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog <em>Technology Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog
	 * @generated
	 */
	EClass getTechnologySolutionCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getDescription()
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 */
	EAttribute getTechnologySolutionCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getTechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technology Solution</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog#getTechnologySolution()
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 */
	EReference getTechnologySolutionCatalog_TechnologySolution();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog <em>Technology Feature Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog
	 * @generated
	 */
	EClass getTechnologyFeatureCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog#getDescription()
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 */
	EAttribute getTechnologyFeatureCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog#getTechnologyFeature <em>Technology Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technology Feature</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog#getTechnologyFeature()
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 */
	EReference getTechnologyFeatureCatalog_TechnologyFeature();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog <em>Relation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog
	 * @generated
	 */
	EClass getRelationCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog#getDescription()
	 * @see #getRelationCatalog()
	 * @generated
	 */
	EAttribute getRelationCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog#getRelation()
	 * @see #getRelationCatalog()
	 * @generated
	 */
	EReference getRelationCatalog_Relation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog <em>ASTA Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASTA Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog
	 * @generated
	 */
	EClass getASTACatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog#getDescription()
	 * @see #getASTACatalog()
	 * @generated
	 */
	EAttribute getASTACatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog#getASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog#getASTA()
	 * @see #getASTACatalog()
	 * @generated
	 */
	EReference getASTACatalog_ASTA();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog <em>Conceptual Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solution Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog
	 * @generated
	 */
	EClass getConceptualSolutionCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog#getDescription()
	 * @see #getConceptualSolutionCatalog()
	 * @generated
	 */
	EAttribute getConceptualSolutionCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog#getConceptualSolution <em>Conceptual Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptual Solution</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog#getConceptualSolution()
	 * @see #getConceptualSolutionCatalog()
	 * @generated
	 */
	EReference getConceptualSolutionCatalog_ConceptualSolution();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog <em>Development Environment Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environment Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog
	 * @generated
	 */
	EClass getDevelopmentEnvironmentCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog#getDescription()
	 * @see #getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironmentCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog#getDevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Development Environment</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog#getDevelopmentEnvironment()
	 * @see #getDevelopmentEnvironmentCatalog()
	 * @generated
	 */
	EReference getDevelopmentEnvironmentCatalog_DevelopmentEnvironment();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog <em>Technology Feature Evaluation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature Evaluation Catalog</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog
	 * @generated
	 */
	EClass getTechnologyFeatureEvaluationCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getDescription()
	 * @see #getTechnologyFeatureEvaluationCatalog()
	 * @generated
	 */
	EAttribute getTechnologyFeatureEvaluationCatalog_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getFeatureEvaluation <em>Feature Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Evaluation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog#getFeatureEvaluation()
	 * @see #getTechnologyFeatureEvaluationCatalog()
	 * @generated
	 */
	EReference getTechnologyFeatureEvaluationCatalog_FeatureEvaluation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions
	 * @generated
	 */
	EClass getTechnologySolutions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions#getTechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Technology Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions#getTechnologySolutions()
	 * @see #getTechnologySolutions()
	 * @generated
	 */
	EReference getTechnologySolutions_TechnologySolutions();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Solution</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution
	 * @generated
	 */
	EClass getTechnologySolution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getDescription()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EAttribute getTechnologySolution_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getFeatures()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EReference getTechnologySolution_Features();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution#getRelations()
	 * @see #getTechnologySolution()
	 * @generated
	 */
	EReference getTechnologySolution_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature <em>Technology Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature
	 * @generated
	 */
	EClass getTechnologyFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getDescription()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EAttribute getTechnologyFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getCapabilityType()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EAttribute getTechnologyFeature_CapabilityType();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getASTA()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EReference getTechnologyFeature_ASTA();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getRelations()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EReference getTechnologyFeature_Relations();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getFeatureEvaluation <em>Feature Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Evaluation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature#getFeatureEvaluation()
	 * @see #getTechnologyFeature()
	 * @generated
	 */
	EReference getTechnologyFeature_FeatureEvaluation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation <em>Feature Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Evaluation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation
	 * @generated
	 */
	EClass getFeatureEvaluation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement <em>Technology Feature Concern Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Feature Concern Measurement</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement
	 * @generated
	 */
	EClass getTechnologyFeatureConcernMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getAspect()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_Aspect();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getContext()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrics</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getMetrics()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_Metrics();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumptions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getAssumptions()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_Assumptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getQuantitativeResult <em>Quantitative Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantitative Result</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getQuantitativeResult()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_QuantitativeResult();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getQualitativeResult <em>Qualitative Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitative Result</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement#getQualitativeResult()
	 * @see #getTechnologyFeatureConcernMeasurement()
	 * @generated
	 */
	EAttribute getTechnologyFeatureConcernMeasurement_QualitativeResult();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison <em>Technology Features Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Features Comparison</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison
	 * @generated
	 */
	EClass getTechnologyFeaturesComparison();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getSource()
	 * @see #getTechnologyFeaturesComparison()
	 * @generated
	 */
	EAttribute getTechnologyFeaturesComparison_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getScope()
	 * @see #getTechnologyFeaturesComparison()
	 * @generated
	 */
	EAttribute getTechnologyFeaturesComparison_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getDate()
	 * @see #getTechnologyFeaturesComparison()
	 * @generated
	 */
	EAttribute getTechnologyFeaturesComparison_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getTrust <em>Trust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trust</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison#getTrust()
	 * @see #getTechnologyFeaturesComparison()
	 * @generated
	 */
	EAttribute getTechnologyFeaturesComparison_Trust();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASTA</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTA
	 * @generated
	 */
	EClass getASTA();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTA#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTA#getDescription()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTA#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTA#getCondition()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTA#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTA#getCapabilityType()
	 * @see #getASTA()
	 * @generated
	 */
	EAttribute getASTA_CapabilityType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.Benefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benefit</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Benefit
	 * @generated
	 */
	EClass getBenefit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedBenefit <em>Feature Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Based Benefit</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedBenefit
	 * @generated
	 */
	EClass getFeatureBasedBenefit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit <em>Concern Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Based Benefit</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit
	 * @generated
	 */
	EClass getConcernBasedBenefit();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit#getConcern()
	 * @see #getConcernBasedBenefit()
	 * @generated
	 */
	EAttribute getConcernBasedBenefit_Concern();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawback</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Drawback
	 * @generated
	 */
	EClass getDrawback();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedDrawback <em>Feature Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Based Drawback</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedDrawback
	 * @generated
	 */
	EClass getFeatureBasedDrawback();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback <em>Concern Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern Based Drawback</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback
	 * @generated
	 */
	EClass getConcernBasedDrawback();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback#getConcern()
	 * @see #getConcernBasedDrawback()
	 * @generated
	 */
	EAttribute getConcernBasedDrawback_Concern();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions
	 * @generated
	 */
	EClass getConceptualSolutions();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions#getConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conceptual Solutions</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions#getConceptualSolutions()
	 * @see #getConceptualSolutions()
	 * @generated
	 */
	EReference getConceptualSolutions_ConceptualSolutions();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution <em>Conceptual Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptual Solution</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution
	 * @generated
	 */
	EClass getConceptualSolution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution#getDescription()
	 * @see #getConceptualSolution()
	 * @generated
	 */
	EAttribute getConceptualSolution_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution#getVariation <em>Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution#getVariation()
	 * @see #getConceptualSolution()
	 * @generated
	 */
	EAttribute getConceptualSolution_Variation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments
	 * @generated
	 */
	EClass getDevelopmentEnvironments();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments#getDevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Development Environments</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments#getDevelopmentEnvironments()
	 * @see #getDevelopmentEnvironments()
	 * @generated
	 */
	EReference getDevelopmentEnvironments_DevelopmentEnvironments();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Environment</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment
	 * @generated
	 */
	EClass getDevelopmentEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment#getDescription()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment#getProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Programming Language</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment#getProgrammingLanguage()
	 * @see #getDevelopmentEnvironment()
	 * @generated
	 */
	EAttribute getDevelopmentEnvironment_ProgrammingLanguage();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relations
	 * @generated
	 */
	EClass getRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.TechnologySolutionModel.Relations#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relations#getRelations()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation#getDescription()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Description();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation#getSourceElement()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_SourceElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Element</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation#getTargetElement()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationSourceType <em>Relation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Source Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationSourceType
	 * @generated
	 */
	EClass getRelationSourceType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationTargetType <em>Relation Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Target Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationTargetType
	 * @generated
	 */
	EClass getRelationTargetType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.TechnologySolutionModel.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capability Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.CapabilityType
	 * @generated
	 */
	EEnum getCapabilityType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechnologySolutionModelFactory getTechnologySolutionModelFactory();

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
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionBaseImpl <em>Technology Solution Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionBaseImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionBase()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION_BASE = eINSTANCE.getTechnologySolutionBase();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION_BASE__ID = eINSTANCE.getTechnologySolutionBase_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION_BASE__NAME = eINSTANCE.getTechnologySolutionBase_Name();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl <em>Technology Solution Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionModel()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION_MODEL = eINSTANCE.getTechnologySolutionModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION_MODEL__VERSION = eINSTANCE.getTechnologySolutionModel_Version();

		/**
		 * The meta object literal for the '<em><b>Technology Solutions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS = eINSTANCE.getTechnologySolutionModel_TechnologySolutions();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solutions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS = eINSTANCE.getTechnologySolutionModel_ConceptualSolutions();

		/**
		 * The meta object literal for the '<em><b>Development Environments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getTechnologySolutionModel_DevelopmentEnvironments();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_MODEL__RELATIONS = eINSTANCE.getTechnologySolutionModel_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionCatalogImpl <em>Technology Solution Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutionCatalog()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION_CATALOG = eINSTANCE.getTechnologySolutionCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION_CATALOG__DESCRIPTION = eINSTANCE.getTechnologySolutionCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Technology Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION_CATALOG__TECHNOLOGY_SOLUTION = eINSTANCE.getTechnologySolutionCatalog_TechnologySolution();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureCatalogImpl <em>Technology Feature Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureCatalog()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE_CATALOG = eINSTANCE.getTechnologyFeatureCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CATALOG__DESCRIPTION = eINSTANCE.getTechnologyFeatureCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Technology Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE_CATALOG__TECHNOLOGY_FEATURE = eINSTANCE.getTechnologyFeatureCatalog_TechnologyFeature();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl <em>Relation Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationCatalog()
		 * @generated
		 */
		EClass RELATION_CATALOG = eINSTANCE.getRelationCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_CATALOG__DESCRIPTION = eINSTANCE.getRelationCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CATALOG__RELATION = eINSTANCE.getRelationCatalog_Relation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTACatalogImpl <em>ASTA Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ASTACatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getASTACatalog()
		 * @generated
		 */
		EClass ASTA_CATALOG = eINSTANCE.getASTACatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA_CATALOG__DESCRIPTION = eINSTANCE.getASTACatalog_Description();

		/**
		 * The meta object literal for the '<em><b>ASTA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTA_CATALOG__ASTA = eINSTANCE.getASTACatalog_ASTA();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionCatalogImpl <em>Conceptual Solution Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolutionCatalog()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTION_CATALOG = eINSTANCE.getConceptualSolutionCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION_CATALOG__DESCRIPTION = eINSTANCE.getConceptualSolutionCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SOLUTION_CATALOG__CONCEPTUAL_SOLUTION = eINSTANCE.getConceptualSolutionCatalog_ConceptualSolution();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentCatalogImpl <em>Development Environment Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironmentCatalog()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENT_CATALOG = eINSTANCE.getDevelopmentEnvironmentCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT_CATALOG__DESCRIPTION = eINSTANCE.getDevelopmentEnvironmentCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Development Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENT_CATALOG__DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironmentCatalog_DevelopmentEnvironment();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl <em>Technology Feature Evaluation Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureEvaluationCatalogImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureEvaluationCatalog()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE_EVALUATION_CATALOG = eINSTANCE.getTechnologyFeatureEvaluationCatalog();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION = eINSTANCE.getTechnologyFeatureEvaluationCatalog_Description();

		/**
		 * The meta object literal for the '<em><b>Feature Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION = eINSTANCE.getTechnologyFeatureEvaluationCatalog_FeatureEvaluation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionsImpl <em>Technology Solutions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionsImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolutions()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTIONS = eINSTANCE.getTechnologySolutions();

		/**
		 * The meta object literal for the '<em><b>Technology Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS = eINSTANCE.getTechnologySolutions_TechnologySolutions();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionImpl <em>Technology Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologySolution()
		 * @generated
		 */
		EClass TECHNOLOGY_SOLUTION = eINSTANCE.getTechnologySolution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_SOLUTION__DESCRIPTION = eINSTANCE.getTechnologySolution_Description();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION__FEATURES = eINSTANCE.getTechnologySolution_Features();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_SOLUTION__RELATIONS = eINSTANCE.getTechnologySolution_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl <em>Technology Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeature()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE = eINSTANCE.getTechnologyFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE__DESCRIPTION = eINSTANCE.getTechnologyFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE__CAPABILITY_TYPE = eINSTANCE.getTechnologyFeature_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>ASTA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE__ASTA = eINSTANCE.getTechnologyFeature_ASTA();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE__RELATIONS = eINSTANCE.getTechnologyFeature_Relations();

		/**
		 * The meta object literal for the '<em><b>Feature Evaluation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_FEATURE__FEATURE_EVALUATION = eINSTANCE.getTechnologyFeature_FeatureEvaluation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureEvaluationImpl <em>Feature Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureEvaluationImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureEvaluation()
		 * @generated
		 */
		EClass FEATURE_EVALUATION = eINSTANCE.getFeatureEvaluation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl <em>Technology Feature Concern Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeatureConcernMeasurementImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeatureConcernMeasurement()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT = eINSTANCE.getTechnologyFeatureConcernMeasurement();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT = eINSTANCE.getTechnologyFeatureConcernMeasurement_Aspect();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT = eINSTANCE.getTechnologyFeatureConcernMeasurement_Context();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS = eINSTANCE.getTechnologyFeatureConcernMeasurement_Metrics();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS = eINSTANCE.getTechnologyFeatureConcernMeasurement_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Quantitative Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT = eINSTANCE.getTechnologyFeatureConcernMeasurement_QuantitativeResult();

		/**
		 * The meta object literal for the '<em><b>Qualitative Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT = eINSTANCE.getTechnologyFeatureConcernMeasurement_QualitativeResult();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl <em>Technology Features Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologyFeaturesComparisonImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getTechnologyFeaturesComparison()
		 * @generated
		 */
		EClass TECHNOLOGY_FEATURES_COMPARISON = eINSTANCE.getTechnologyFeaturesComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURES_COMPARISON__SOURCE = eINSTANCE.getTechnologyFeaturesComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURES_COMPARISON__SCOPE = eINSTANCE.getTechnologyFeaturesComparison_Scope();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURES_COMPARISON__DATE = eINSTANCE.getTechnologyFeaturesComparison_Date();

		/**
		 * The meta object literal for the '<em><b>Trust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY_FEATURES_COMPARISON__TRUST = eINSTANCE.getTechnologyFeaturesComparison_Trust();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl <em>ASTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ASTAImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getASTA()
		 * @generated
		 */
		EClass ASTA = eINSTANCE.getASTA();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__DESCRIPTION = eINSTANCE.getASTA_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__CONDITION = eINSTANCE.getASTA_Condition();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTA__CAPABILITY_TYPE = eINSTANCE.getASTA_CapabilityType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.BenefitImpl <em>Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.BenefitImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getBenefit()
		 * @generated
		 */
		EClass BENEFIT = eINSTANCE.getBenefit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedBenefitImpl <em>Feature Based Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedBenefitImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureBasedBenefit()
		 * @generated
		 */
		EClass FEATURE_BASED_BENEFIT = eINSTANCE.getFeatureBasedBenefit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedBenefitImpl <em>Concern Based Benefit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedBenefitImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConcernBasedBenefit()
		 * @generated
		 */
		EClass CONCERN_BASED_BENEFIT = eINSTANCE.getConcernBasedBenefit();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_BASED_BENEFIT__CONCERN = eINSTANCE.getConcernBasedBenefit_Concern();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DrawbackImpl <em>Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DrawbackImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDrawback()
		 * @generated
		 */
		EClass DRAWBACK = eINSTANCE.getDrawback();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedDrawbackImpl <em>Feature Based Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.FeatureBasedDrawbackImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getFeatureBasedDrawback()
		 * @generated
		 */
		EClass FEATURE_BASED_DRAWBACK = eINSTANCE.getFeatureBasedDrawback();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedDrawbackImpl <em>Concern Based Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConcernBasedDrawbackImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConcernBasedDrawback()
		 * @generated
		 */
		EClass CONCERN_BASED_DRAWBACK = eINSTANCE.getConcernBasedDrawback();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN_BASED_DRAWBACK__CONCERN = eINSTANCE.getConcernBasedDrawback_Concern();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionsImpl <em>Conceptual Solutions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionsImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolutions()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTIONS = eINSTANCE.getConceptualSolutions();

		/**
		 * The meta object literal for the '<em><b>Conceptual Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS = eINSTANCE.getConceptualSolutions_ConceptualSolutions();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionImpl <em>Conceptual Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getConceptualSolution()
		 * @generated
		 */
		EClass CONCEPTUAL_SOLUTION = eINSTANCE.getConceptualSolution();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION__DESCRIPTION = eINSTANCE.getConceptualSolution_Description();

		/**
		 * The meta object literal for the '<em><b>Variation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTUAL_SOLUTION__VARIATION = eINSTANCE.getConceptualSolution_Variation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentsImpl <em>Development Environments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentsImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironments()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getDevelopmentEnvironments();

		/**
		 * The meta object literal for the '<em><b>Development Environments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS = eINSTANCE.getDevelopmentEnvironments_DevelopmentEnvironments();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentImpl <em>Development Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getDevelopmentEnvironment()
		 * @generated
		 */
		EClass DEVELOPMENT_ENVIRONMENT = eINSTANCE.getDevelopmentEnvironment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__DESCRIPTION = eINSTANCE.getDevelopmentEnvironment_Description();

		/**
		 * The meta object literal for the '<em><b>Programming Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_ENVIRONMENT__PROGRAMMING_LANGUAGE = eINSTANCE.getDevelopmentEnvironment_ProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationsImpl <em>Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationsImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelations()
		 * @generated
		 */
		EClass RELATIONS = eINSTANCE.getRelations();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__RELATIONS = eINSTANCE.getRelations_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DESCRIPTION = eINSTANCE.getRelation_Description();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE_ELEMENT = eINSTANCE.getRelation_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET_ELEMENT = eINSTANCE.getRelation_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationSourceTypeImpl <em>Relation Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationSourceTypeImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationSourceType()
		 * @generated
		 */
		EClass RELATION_SOURCE_TYPE = eINSTANCE.getRelationSourceType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.impl.RelationTargetTypeImpl <em>Relation Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.RelationTargetTypeImpl
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationTargetType()
		 * @generated
		 */
		EClass RELATION_TARGET_TYPE = eINSTANCE.getRelationTargetType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.CapabilityType <em>Capability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.CapabilityType
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getCapabilityType()
		 * @generated
		 */
		EEnum CAPABILITY_TYPE = eINSTANCE.getCapabilityType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationType
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

	}

} //TechnologySolutionModelPackage
