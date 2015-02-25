/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.TechnologySolutionModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage
 * @generated
 */
public class TechnologySolutionModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TechnologySolutionModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionModelSwitch() {
		if (modelPackage == null) {
			modelPackage = TechnologySolutionModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_BASE: {
				TechnologySolutionBase technologySolutionBase = (TechnologySolutionBase)theEObject;
				T result = caseTechnologySolutionBase(technologySolutionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL: {
				TechnologySolutionModel technologySolutionModel = (TechnologySolutionModel)theEObject;
				T result = caseTechnologySolutionModel(technologySolutionModel);
				if (result == null) result = caseTechnologySolutionBase(technologySolutionModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_CATALOG: {
				TechnologySolutionCatalog technologySolutionCatalog = (TechnologySolutionCatalog)theEObject;
				T result = caseTechnologySolutionCatalog(technologySolutionCatalog);
				if (result == null) result = caseTechnologySolutionBase(technologySolutionCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CATALOG: {
				TechnologyFeatureCatalog technologyFeatureCatalog = (TechnologyFeatureCatalog)theEObject;
				T result = caseTechnologyFeatureCatalog(technologyFeatureCatalog);
				if (result == null) result = caseTechnologySolutionBase(technologyFeatureCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.RELATION_CATALOG: {
				RelationCatalog relationCatalog = (RelationCatalog)theEObject;
				T result = caseRelationCatalog(relationCatalog);
				if (result == null) result = caseTechnologySolutionBase(relationCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.ASTA_CATALOG: {
				ASTACatalog astaCatalog = (ASTACatalog)theEObject;
				T result = caseASTACatalog(astaCatalog);
				if (result == null) result = caseTechnologySolutionBase(astaCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTION_CATALOG: {
				ConceptualSolutionCatalog conceptualSolutionCatalog = (ConceptualSolutionCatalog)theEObject;
				T result = caseConceptualSolutionCatalog(conceptualSolutionCatalog);
				if (result == null) result = caseTechnologySolutionBase(conceptualSolutionCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENT_CATALOG: {
				DevelopmentEnvironmentCatalog developmentEnvironmentCatalog = (DevelopmentEnvironmentCatalog)theEObject;
				T result = caseDevelopmentEnvironmentCatalog(developmentEnvironmentCatalog);
				if (result == null) result = caseTechnologySolutionBase(developmentEnvironmentCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG: {
				TechnologyFeatureEvaluationCatalog technologyFeatureEvaluationCatalog = (TechnologyFeatureEvaluationCatalog)theEObject;
				T result = caseTechnologyFeatureEvaluationCatalog(technologyFeatureEvaluationCatalog);
				if (result == null) result = caseTechnologySolutionBase(technologyFeatureEvaluationCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS: {
				TechnologySolutions technologySolutions = (TechnologySolutions)theEObject;
				T result = caseTechnologySolutions(technologySolutions);
				if (result == null) result = caseTechnologySolutionBase(technologySolutions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION: {
				TechnologySolution technologySolution = (TechnologySolution)theEObject;
				T result = caseTechnologySolution(technologySolution);
				if (result == null) result = caseRelationSourceType(technologySolution);
				if (result == null) result = caseRelationTargetType(technologySolution);
				if (result == null) result = caseTechnologySolutionBase(technologySolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE: {
				TechnologyFeature technologyFeature = (TechnologyFeature)theEObject;
				T result = caseTechnologyFeature(technologyFeature);
				if (result == null) result = caseRelationSourceType(technologyFeature);
				if (result == null) result = caseRelationTargetType(technologyFeature);
				if (result == null) result = caseTechnologySolutionBase(technologyFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.FEATURE_EVALUATION: {
				FeatureEvaluation featureEvaluation = (FeatureEvaluation)theEObject;
				T result = caseFeatureEvaluation(featureEvaluation);
				if (result == null) result = caseTechnologySolutionBase(featureEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT: {
				TechnologyFeatureConcernMeasurement technologyFeatureConcernMeasurement = (TechnologyFeatureConcernMeasurement)theEObject;
				T result = caseTechnologyFeatureConcernMeasurement(technologyFeatureConcernMeasurement);
				if (result == null) result = caseFeatureEvaluation(technologyFeatureConcernMeasurement);
				if (result == null) result = caseTechnologySolutionBase(technologyFeatureConcernMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURES_COMPARISON: {
				TechnologyFeaturesComparison technologyFeaturesComparison = (TechnologyFeaturesComparison)theEObject;
				T result = caseTechnologyFeaturesComparison(technologyFeaturesComparison);
				if (result == null) result = caseFeatureEvaluation(technologyFeaturesComparison);
				if (result == null) result = caseTechnologySolutionBase(technologyFeaturesComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.ASTA: {
				ASTA asta = (ASTA)theEObject;
				T result = caseASTA(asta);
				if (result == null) result = caseTechnologySolutionBase(asta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.BENEFIT: {
				Benefit benefit = (Benefit)theEObject;
				T result = caseBenefit(benefit);
				if (result == null) result = caseASTA(benefit);
				if (result == null) result = caseTechnologySolutionBase(benefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.FEATURE_BASED_BENEFIT: {
				FeatureBasedBenefit featureBasedBenefit = (FeatureBasedBenefit)theEObject;
				T result = caseFeatureBasedBenefit(featureBasedBenefit);
				if (result == null) result = caseBenefit(featureBasedBenefit);
				if (result == null) result = caseASTA(featureBasedBenefit);
				if (result == null) result = caseTechnologySolutionBase(featureBasedBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.CONCERN_BASED_BENEFIT: {
				ConcernBasedBenefit concernBasedBenefit = (ConcernBasedBenefit)theEObject;
				T result = caseConcernBasedBenefit(concernBasedBenefit);
				if (result == null) result = caseBenefit(concernBasedBenefit);
				if (result == null) result = caseASTA(concernBasedBenefit);
				if (result == null) result = caseTechnologySolutionBase(concernBasedBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.DRAWBACK: {
				Drawback drawback = (Drawback)theEObject;
				T result = caseDrawback(drawback);
				if (result == null) result = caseASTA(drawback);
				if (result == null) result = caseTechnologySolutionBase(drawback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.FEATURE_BASED_DRAWBACK: {
				FeatureBasedDrawback featureBasedDrawback = (FeatureBasedDrawback)theEObject;
				T result = caseFeatureBasedDrawback(featureBasedDrawback);
				if (result == null) result = caseDrawback(featureBasedDrawback);
				if (result == null) result = caseASTA(featureBasedDrawback);
				if (result == null) result = caseTechnologySolutionBase(featureBasedDrawback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.CONCERN_BASED_DRAWBACK: {
				ConcernBasedDrawback concernBasedDrawback = (ConcernBasedDrawback)theEObject;
				T result = caseConcernBasedDrawback(concernBasedDrawback);
				if (result == null) result = caseDrawback(concernBasedDrawback);
				if (result == null) result = caseASTA(concernBasedDrawback);
				if (result == null) result = caseTechnologySolutionBase(concernBasedDrawback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS: {
				ConceptualSolutions conceptualSolutions = (ConceptualSolutions)theEObject;
				T result = caseConceptualSolutions(conceptualSolutions);
				if (result == null) result = caseTechnologySolutionBase(conceptualSolutions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTION: {
				ConceptualSolution conceptualSolution = (ConceptualSolution)theEObject;
				T result = caseConceptualSolution(conceptualSolution);
				if (result == null) result = caseRelationSourceType(conceptualSolution);
				if (result == null) result = caseRelationTargetType(conceptualSolution);
				if (result == null) result = caseTechnologySolutionBase(conceptualSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS: {
				DevelopmentEnvironments developmentEnvironments = (DevelopmentEnvironments)theEObject;
				T result = caseDevelopmentEnvironments(developmentEnvironments);
				if (result == null) result = caseTechnologySolutionBase(developmentEnvironments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENT: {
				DevelopmentEnvironment developmentEnvironment = (DevelopmentEnvironment)theEObject;
				T result = caseDevelopmentEnvironment(developmentEnvironment);
				if (result == null) result = caseRelationSourceType(developmentEnvironment);
				if (result == null) result = caseRelationTargetType(developmentEnvironment);
				if (result == null) result = caseTechnologySolutionBase(developmentEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.RELATIONS: {
				Relations relations = (Relations)theEObject;
				T result = caseRelations(relations);
				if (result == null) result = caseTechnologySolutionBase(relations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseTechnologySolutionBase(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.RELATION_SOURCE_TYPE: {
				RelationSourceType relationSourceType = (RelationSourceType)theEObject;
				T result = caseRelationSourceType(relationSourceType);
				if (result == null) result = caseTechnologySolutionBase(relationSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TechnologySolutionModelPackage.RELATION_TARGET_TYPE: {
				RelationTargetType relationTargetType = (RelationTargetType)theEObject;
				T result = caseRelationTargetType(relationTargetType);
				if (result == null) result = caseTechnologySolutionBase(relationTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Solution Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Solution Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySolutionBase(TechnologySolutionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Solution Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Solution Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySolutionModel(TechnologySolutionModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Solution Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Solution Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySolutionCatalog(TechnologySolutionCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Feature Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Feature Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyFeatureCatalog(TechnologyFeatureCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationCatalog(RelationCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASTA Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASTA Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTACatalog(ASTACatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Solution Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Solution Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualSolutionCatalog(ConceptualSolutionCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Environment Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Environment Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevelopmentEnvironmentCatalog(DevelopmentEnvironmentCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Feature Evaluation Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Feature Evaluation Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyFeatureEvaluationCatalog(TechnologyFeatureEvaluationCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Solutions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Solutions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySolutions(TechnologySolutions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySolution(TechnologySolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyFeature(TechnologyFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureEvaluation(FeatureEvaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Feature Concern Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Feature Concern Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyFeatureConcernMeasurement(TechnologyFeatureConcernMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Features Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Features Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyFeaturesComparison(TechnologyFeaturesComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASTA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASTA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTA(ASTA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBenefit(Benefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Based Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Based Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureBasedBenefit(FeatureBasedBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern Based Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Based Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernBasedBenefit(ConcernBasedBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawback(Drawback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Based Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Based Drawback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureBasedDrawback(FeatureBasedDrawback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concern Based Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Based Drawback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernBasedDrawback(ConcernBasedDrawback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Solutions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Solutions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualSolutions(ConceptualSolutions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualSolution(ConceptualSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Environments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Environments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevelopmentEnvironments(DevelopmentEnvironments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevelopmentEnvironment(DevelopmentEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelations(Relations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationSourceType(RelationSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationTargetType(RelationTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TechnologySolutionModelSwitch
