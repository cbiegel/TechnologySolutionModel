/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftrace.metamodel.TechnologySolutionModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage
 * @generated
 */
public class TechnologySolutionModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TechnologySolutionModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TechnologySolutionModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionModelSwitch<Adapter> modelSwitch =
		new TechnologySolutionModelSwitch<Adapter>() {
			@Override
			public Adapter caseTechnologySolutionBase(TechnologySolutionBase object) {
				return createTechnologySolutionBaseAdapter();
			}
			@Override
			public Adapter caseTechnologySolutionModel(TechnologySolutionModel object) {
				return createTechnologySolutionModelAdapter();
			}
			@Override
			public Adapter caseTechnologySolutionCatalog(TechnologySolutionCatalog object) {
				return createTechnologySolutionCatalogAdapter();
			}
			@Override
			public Adapter caseTechnologyFeatureCatalog(TechnologyFeatureCatalog object) {
				return createTechnologyFeatureCatalogAdapter();
			}
			@Override
			public Adapter caseRelationCatalog(RelationCatalog object) {
				return createRelationCatalogAdapter();
			}
			@Override
			public Adapter caseASTACatalog(ASTACatalog object) {
				return createASTACatalogAdapter();
			}
			@Override
			public Adapter caseConceptualSolutionCatalog(ConceptualSolutionCatalog object) {
				return createConceptualSolutionCatalogAdapter();
			}
			@Override
			public Adapter caseDevelopmentEnvironmentCatalog(DevelopmentEnvironmentCatalog object) {
				return createDevelopmentEnvironmentCatalogAdapter();
			}
			@Override
			public Adapter caseTechnologyFeatureEvaluationCatalog(TechnologyFeatureEvaluationCatalog object) {
				return createTechnologyFeatureEvaluationCatalogAdapter();
			}
			@Override
			public Adapter caseTechnologySolutions(TechnologySolutions object) {
				return createTechnologySolutionsAdapter();
			}
			@Override
			public Adapter caseTechnologySolution(TechnologySolution object) {
				return createTechnologySolutionAdapter();
			}
			@Override
			public Adapter caseTechnologyFeature(TechnologyFeature object) {
				return createTechnologyFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureEvaluation(FeatureEvaluation object) {
				return createFeatureEvaluationAdapter();
			}
			@Override
			public Adapter caseTechnologyFeatureConcernMeasurement(TechnologyFeatureConcernMeasurement object) {
				return createTechnologyFeatureConcernMeasurementAdapter();
			}
			@Override
			public Adapter caseTechnologyFeaturesComparison(TechnologyFeaturesComparison object) {
				return createTechnologyFeaturesComparisonAdapter();
			}
			@Override
			public Adapter caseASTA(ASTA object) {
				return createASTAAdapter();
			}
			@Override
			public Adapter caseBenefit(Benefit object) {
				return createBenefitAdapter();
			}
			@Override
			public Adapter caseFeatureBasedBenefit(FeatureBasedBenefit object) {
				return createFeatureBasedBenefitAdapter();
			}
			@Override
			public Adapter caseConcernBasedBenefit(ConcernBasedBenefit object) {
				return createConcernBasedBenefitAdapter();
			}
			@Override
			public Adapter caseDrawback(Drawback object) {
				return createDrawbackAdapter();
			}
			@Override
			public Adapter caseFeatureBasedDrawback(FeatureBasedDrawback object) {
				return createFeatureBasedDrawbackAdapter();
			}
			@Override
			public Adapter caseConcernBasedDrawback(ConcernBasedDrawback object) {
				return createConcernBasedDrawbackAdapter();
			}
			@Override
			public Adapter caseConceptualSolutions(ConceptualSolutions object) {
				return createConceptualSolutionsAdapter();
			}
			@Override
			public Adapter caseConceptualSolution(ConceptualSolution object) {
				return createConceptualSolutionAdapter();
			}
			@Override
			public Adapter caseDevelopmentEnvironments(DevelopmentEnvironments object) {
				return createDevelopmentEnvironmentsAdapter();
			}
			@Override
			public Adapter caseDevelopmentEnvironment(DevelopmentEnvironment object) {
				return createDevelopmentEnvironmentAdapter();
			}
			@Override
			public Adapter caseRelations(Relations object) {
				return createRelationsAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseRelationSourceType(RelationSourceType object) {
				return createRelationSourceTypeAdapter();
			}
			@Override
			public Adapter caseRelationTargetType(RelationTargetType object) {
				return createRelationTargetTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase <em>Technology Solution Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionBase
	 * @generated
	 */
	public Adapter createTechnologySolutionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel <em>Technology Solution Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel
	 * @generated
	 */
	public Adapter createTechnologySolutionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog <em>Technology Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog
	 * @generated
	 */
	public Adapter createTechnologySolutionCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog <em>Technology Feature Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog
	 * @generated
	 */
	public Adapter createTechnologyFeatureCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog <em>Relation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationCatalog
	 * @generated
	 */
	public Adapter createRelationCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog <em>ASTA Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog
	 * @generated
	 */
	public Adapter createASTACatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog <em>Conceptual Solution Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutionCatalog
	 * @generated
	 */
	public Adapter createConceptualSolutionCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog <em>Development Environment Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironmentCatalog
	 * @generated
	 */
	public Adapter createDevelopmentEnvironmentCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog <em>Technology Feature Evaluation Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog
	 * @generated
	 */
	public Adapter createTechnologyFeatureEvaluationCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions <em>Technology Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions
	 * @generated
	 */
	public Adapter createTechnologySolutionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution <em>Technology Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution
	 * @generated
	 */
	public Adapter createTechnologySolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature <em>Technology Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeature
	 * @generated
	 */
	public Adapter createTechnologyFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation <em>Feature Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureEvaluation
	 * @generated
	 */
	public Adapter createFeatureEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement <em>Technology Feature Concern Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement
	 * @generated
	 */
	public Adapter createTechnologyFeatureConcernMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison <em>Technology Features Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeaturesComparison
	 * @generated
	 */
	public Adapter createTechnologyFeaturesComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ASTA <em>ASTA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ASTA
	 * @generated
	 */
	public Adapter createASTAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.Benefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Benefit
	 * @generated
	 */
	public Adapter createBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedBenefit <em>Feature Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedBenefit
	 * @generated
	 */
	public Adapter createFeatureBasedBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit <em>Concern Based Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedBenefit
	 * @generated
	 */
	public Adapter createConcernBasedBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Drawback
	 * @generated
	 */
	public Adapter createDrawbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedDrawback <em>Feature Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.FeatureBasedDrawback
	 * @generated
	 */
	public Adapter createFeatureBasedDrawbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback <em>Concern Based Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConcernBasedDrawback
	 * @generated
	 */
	public Adapter createConcernBasedDrawbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions <em>Conceptual Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions
	 * @generated
	 */
	public Adapter createConceptualSolutionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution <em>Conceptual Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution
	 * @generated
	 */
	public Adapter createConceptualSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments <em>Development Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments
	 * @generated
	 */
	public Adapter createDevelopmentEnvironmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment <em>Development Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment
	 * @generated
	 */
	public Adapter createDevelopmentEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relations
	 * @generated
	 */
	public Adapter createRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationSourceType <em>Relation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationSourceType
	 * @generated
	 */
	public Adapter createRelationSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftrace.metamodel.TechnologySolutionModel.RelationTargetType <em>Relation Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftrace.metamodel.TechnologySolutionModel.RelationTargetType
	 * @generated
	 */
	public Adapter createRelationTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TechnologySolutionModelAdapterFactory
