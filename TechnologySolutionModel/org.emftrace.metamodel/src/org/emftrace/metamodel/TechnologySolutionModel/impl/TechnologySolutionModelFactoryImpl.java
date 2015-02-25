/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.TechnologySolutionModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologySolutionModelFactoryImpl extends EFactoryImpl implements TechnologySolutionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TechnologySolutionModelFactory init() {
		try {
			TechnologySolutionModelFactory theTechnologySolutionModelFactory = (TechnologySolutionModelFactory)EPackage.Registry.INSTANCE.getEFactory(TechnologySolutionModelPackage.eNS_URI);
			if (theTechnologySolutionModelFactory != null) {
				return theTechnologySolutionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TechnologySolutionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL: return createTechnologySolutionModel();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_CATALOG: return createTechnologySolutionCatalog();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CATALOG: return createTechnologyFeatureCatalog();
			case TechnologySolutionModelPackage.RELATION_CATALOG: return createRelationCatalog();
			case TechnologySolutionModelPackage.ASTA_CATALOG: return createASTACatalog();
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTION_CATALOG: return createConceptualSolutionCatalog();
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENT_CATALOG: return createDevelopmentEnvironmentCatalog();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG: return createTechnologyFeatureEvaluationCatalog();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS: return createTechnologySolutions();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION: return createTechnologySolution();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE: return createTechnologyFeature();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT: return createTechnologyFeatureConcernMeasurement();
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON: return createTechnologyFeaturesComparison();
			case TechnologySolutionModelPackage.FEATURE_BASED_BENEFIT: return createFeatureBasedBenefit();
			case TechnologySolutionModelPackage.CONCERN_BASED_BENEFIT: return createConcernBasedBenefit();
			case TechnologySolutionModelPackage.FEATURE_BASED_DRAWBACK: return createFeatureBasedDrawback();
			case TechnologySolutionModelPackage.CONCERN_BASED_DRAWBACK: return createConcernBasedDrawback();
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS: return createConceptualSolutions();
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTION: return createConceptualSolution();
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS: return createDevelopmentEnvironments();
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENT: return createDevelopmentEnvironment();
			case TechnologySolutionModelPackage.RELATIONS: return createRelations();
			case TechnologySolutionModelPackage.RELATION: return createRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TechnologySolutionModelPackage.CAPABILITY_TYPE:
				return createCapabilityTypeFromString(eDataType, initialValue);
			case TechnologySolutionModelPackage.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			case TechnologySolutionModelPackage.ID:
				return createIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TechnologySolutionModelPackage.CAPABILITY_TYPE:
				return convertCapabilityTypeToString(eDataType, instanceValue);
			case TechnologySolutionModelPackage.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			case TechnologySolutionModelPackage.ID:
				return convertIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionModel createTechnologySolutionModel() {
		TechnologySolutionModelImpl technologySolutionModel = new TechnologySolutionModelImpl();
		return technologySolutionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionCatalog createTechnologySolutionCatalog() {
		TechnologySolutionCatalogImpl technologySolutionCatalog = new TechnologySolutionCatalogImpl();
		return technologySolutionCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureCatalog createTechnologyFeatureCatalog() {
		TechnologyFeatureCatalogImpl technologyFeatureCatalog = new TechnologyFeatureCatalogImpl();
		return technologyFeatureCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationCatalog createRelationCatalog() {
		RelationCatalogImpl relationCatalog = new RelationCatalogImpl();
		return relationCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTACatalog createASTACatalog() {
		ASTACatalogImpl astaCatalog = new ASTACatalogImpl();
		return astaCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSolutionCatalog createConceptualSolutionCatalog() {
		ConceptualSolutionCatalogImpl conceptualSolutionCatalog = new ConceptualSolutionCatalogImpl();
		return conceptualSolutionCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironmentCatalog createDevelopmentEnvironmentCatalog() {
		DevelopmentEnvironmentCatalogImpl developmentEnvironmentCatalog = new DevelopmentEnvironmentCatalogImpl();
		return developmentEnvironmentCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureEvaluationCatalog createTechnologyFeatureEvaluationCatalog() {
		TechnologyFeatureEvaluationCatalogImpl technologyFeatureEvaluationCatalog = new TechnologyFeatureEvaluationCatalogImpl();
		return technologyFeatureEvaluationCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutions createTechnologySolutions() {
		TechnologySolutionsImpl technologySolutions = new TechnologySolutionsImpl();
		return technologySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolution createTechnologySolution() {
		TechnologySolutionImpl technologySolution = new TechnologySolutionImpl();
		return technologySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeature createTechnologyFeature() {
		TechnologyFeatureImpl technologyFeature = new TechnologyFeatureImpl();
		return technologyFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureConcernMeasurement createTechnologyFeatureConcernMeasurement() {
		TechnologyFeatureConcernMeasurementImpl technologyFeatureConcernMeasurement = new TechnologyFeatureConcernMeasurementImpl();
		return technologyFeatureConcernMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeaturesComparison createTechnologyFeaturesComparison() {
		TechnologyFeaturesComparisonImpl technologyFeaturesComparison = new TechnologyFeaturesComparisonImpl();
		return technologyFeaturesComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureBasedBenefit createFeatureBasedBenefit() {
		FeatureBasedBenefitImpl featureBasedBenefit = new FeatureBasedBenefitImpl();
		return featureBasedBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernBasedBenefit createConcernBasedBenefit() {
		ConcernBasedBenefitImpl concernBasedBenefit = new ConcernBasedBenefitImpl();
		return concernBasedBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureBasedDrawback createFeatureBasedDrawback() {
		FeatureBasedDrawbackImpl featureBasedDrawback = new FeatureBasedDrawbackImpl();
		return featureBasedDrawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernBasedDrawback createConcernBasedDrawback() {
		ConcernBasedDrawbackImpl concernBasedDrawback = new ConcernBasedDrawbackImpl();
		return concernBasedDrawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSolutions createConceptualSolutions() {
		ConceptualSolutionsImpl conceptualSolutions = new ConceptualSolutionsImpl();
		return conceptualSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSolution createConceptualSolution() {
		ConceptualSolutionImpl conceptualSolution = new ConceptualSolutionImpl();
		return conceptualSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironments createDevelopmentEnvironments() {
		DevelopmentEnvironmentsImpl developmentEnvironments = new DevelopmentEnvironmentsImpl();
		return developmentEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironment createDevelopmentEnvironment() {
		DevelopmentEnvironmentImpl developmentEnvironment = new DevelopmentEnvironmentImpl();
		return developmentEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations createRelations() {
		RelationsImpl relations = new RelationsImpl();
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType createCapabilityTypeFromString(EDataType eDataType, String initialValue) {
		CapabilityType result = CapabilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionModelPackage getTechnologySolutionModelPackage() {
		return (TechnologySolutionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TechnologySolutionModelPackage getPackage() {
		return TechnologySolutionModelPackage.eINSTANCE;
	}

} //TechnologySolutionModelFactoryImpl
