/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;

import org.emftrace.metamodel.BPMN2Model.impl.BPMN2ModelPackageImpl;

import org.emftrace.metamodel.ChangeModel.ChangeModelPackage;

import org.emftrace.metamodel.ChangeModel.impl.ChangeModelPackageImpl;

import org.emftrace.metamodel.EMFfitModel.EMFfitModelPackage;

import org.emftrace.metamodel.EMFfitModel.impl.EMFfitModelPackageImpl;

import org.emftrace.metamodel.FeatureModel.FeatureModelPackage;

import org.emftrace.metamodel.FeatureModel.impl.FeatureModelPackageImpl;

import org.emftrace.metamodel.LinkModel.LinkModelPackage;

import org.emftrace.metamodel.LinkModel.impl.LinkModelPackageImpl;

import org.emftrace.metamodel.OWLModel.OWLModelPackage;

import org.emftrace.metamodel.OWLModel.impl.OWLModelPackageImpl;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;

import org.emftrace.metamodel.QUARCModel.Constraints.impl.ConstraintsPackageImpl;

import org.emftrace.metamodel.QUARCModel.GSS.GSSPackage;

import org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl;

import org.emftrace.metamodel.QUARCModel.Packages.PackagesPackage;

import org.emftrace.metamodel.QUARCModel.Packages.impl.PackagesPackageImpl;

import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;

import org.emftrace.metamodel.QUARCModel.Query.impl.QueryPackageImpl;

import org.emftrace.metamodel.ReportModel.ReportModelPackage;

import org.emftrace.metamodel.ReportModel.impl.ReportModelPackageImpl;

import org.emftrace.metamodel.RuleModel.RuleModelPackage;

import org.emftrace.metamodel.RuleModel.impl.RuleModelPackageImpl;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackagePackage;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackagePackageImpl;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

import org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelPackageImpl;

import org.emftrace.metamodel.UMLModel.UMLModelFactory;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;

import org.emftrace.metamodel.URNModel.URNModelPackage;

import org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLModelPackageImpl extends EPackageImpl implements UMLModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "UMLModel.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveOperationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveSignalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterEffectKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudostateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLModelPackageImpl() {
		super(eNS_URI, UMLModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UMLModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UMLModelPackage init() {
		if (isInited) return (UMLModelPackage)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI);

		// Obtain or create and register package
		UMLModelPackageImpl theUMLModelPackage = (UMLModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UMLModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UMLModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LinkModelPackageImpl theLinkModelPackage = (LinkModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) instanceof LinkModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkModelPackage.eNS_URI) : LinkModelPackage.eINSTANCE);
		RuleModelPackageImpl theRuleModelPackage = (RuleModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) instanceof RuleModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuleModelPackage.eNS_URI) : RuleModelPackage.eINSTANCE);
		ReportModelPackageImpl theReportModelPackage = (ReportModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) instanceof ReportModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReportModelPackage.eNS_URI) : ReportModelPackage.eINSTANCE);
		FeatureModelPackageImpl theFeatureModelPackage = (FeatureModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) instanceof FeatureModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureModelPackage.eNS_URI) : FeatureModelPackage.eINSTANCE);
		OWLModelPackageImpl theOWLModelPackage = (OWLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) instanceof OWLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OWLModelPackage.eNS_URI) : OWLModelPackage.eINSTANCE);
		URNModelPackageImpl theURNModelPackage = (URNModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) instanceof URNModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(URNModelPackage.eNS_URI) : URNModelPackage.eINSTANCE);
		BPMN2ModelPackageImpl theBPMN2ModelPackage = (BPMN2ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) instanceof BPMN2ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) : BPMN2ModelPackage.eINSTANCE);
		EMFfitModelPackageImpl theEMFfitModelPackage = (EMFfitModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) instanceof EMFfitModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) : EMFfitModelPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		TechnologySolutionModelPackageImpl theTechnologySolutionModelPackage = (TechnologySolutionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionModelPackage.eNS_URI) instanceof TechnologySolutionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionModelPackage.eNS_URI) : TechnologySolutionModelPackage.eINSTANCE);
		TechnologySolutionCatalogPackagePackageImpl theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) instanceof TechnologySolutionCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) : TechnologySolutionCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theUMLModelPackage.loadPackage();
		theOWLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theTechnologySolutionModelPackage.createPackageContents();
		theTechnologySolutionCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theTechnologySolutionModelPackage.initializePackageContents();
		theTechnologySolutionCatalogPackagePackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theUMLModelPackage.fixPackageContents();
		theOWLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUMLModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLModelPackage.eNS_URI, theUMLModelPackage);
		return theUMLModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstraction() {
		if (abstractionEClass == null) {
			abstractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstraction_Mapping() {
        return (EReference)getAbstraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		if (acceptCallActionEClass == null) {
			acceptCallActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(2);
		}
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
        return (EReference)getAcceptCallAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		if (acceptEventActionEClass == null) {
			acceptEventActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(3);
		}
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
        return (EAttribute)getAcceptEventAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
        return (EReference)getAcceptEventAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
        return (EReference)getAcceptEventAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		if (actionEClass == null) {
			actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(4);
		}
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPrecondition() {
        return (EReference)getAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPostcondition() {
        return (EReference)getAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Output() {
        return (EAttribute)getAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Input() {
        return (EAttribute)getAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Context() {
        return (EAttribute)getAction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecutionSpecification() {
		if (actionExecutionSpecificationEClass == null) {
			actionExecutionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(5);
		}
		return actionExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionExecutionSpecification_Action() {
        return (EAttribute)getActionExecutionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPin() {
		if (actionInputPinEClass == null) {
			actionInputPinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(6);
		}
		return actionInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInputPin_FromAction() {
        return (EReference)getActionInputPin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		if (activityEClass == null) {
			activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(7);
		}
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Variable() {
        return (EReference)getActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Node() {
        return (EReference)getActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsReadOnly() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edge() {
        return (EReference)getActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsSingleExecution() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Group() {
        return (EReference)getActivity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_StructuredNode() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Partition() {
        return (EAttribute)getActivity().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		if (activityEdgeEClass == null) {
			activityEdgeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(8);
		}
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
        return (EReference)getActivityEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
        return (EReference)getActivityEdge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Source() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Target() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_RedefinedEdge() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_InPartition() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Interrupts() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_InGroup() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_Activity() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_InStructuredNode() {
        return (EAttribute)getActivityEdge().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		if (activityFinalNodeEClass == null) {
			activityFinalNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(9);
		}
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		if (activityNodeEClass == null) {
			activityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(10);
		}
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_InInterruptibleRegion() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Outgoing() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Incoming() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_InPartition() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_InGroup() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_RedefinedNode() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Activity() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_InStructuredNode() {
        return (EAttribute)getActivityNode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		if (activityGroupEClass == null) {
			activityGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(11);
		}
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedEdge() {
        return (EReference)getActivityGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedNode() {
        return (EReference)getActivityGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityGroup_Subgroup() {
        return (EAttribute)getActivityGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityGroup_SuperGroup() {
        return (EAttribute)getActivityGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityGroup_InActivity() {
        return (EAttribute)getActivityGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		if (activityPartitionEClass == null) {
			activityPartitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(12);
		}
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_Edge() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_Represents() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_SuperPartition() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_Node() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_Subpartition() {
        return (EAttribute)getActivityPartition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNode() {
		if (activityParameterNodeEClass == null) {
			activityParameterNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(13);
		}
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityParameterNode_Parameter() {
        return (EAttribute)getActivityParameterNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		if (actorEClass == null) {
			actorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(14);
		}
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		if (addStructuralFeatureValueActionEClass == null) {
			addStructuralFeatureValueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(15);
		}
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_IsReplaceAll() {
        return (EAttribute)getAddStructuralFeatureValueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
        return (EReference)getAddStructuralFeatureValueAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		if (addVariableValueActionEClass == null) {
			addVariableValueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(16);
		}
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableValueAction_IsReplaceAll() {
        return (EAttribute)getAddVariableValueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
        return (EReference)getAddVariableValueAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEvent() {
		if (anyReceiveEventEClass == null) {
			anyReceiveEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(17);
		}
		return anyReceiveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		if (artifactEClass == null) {
			artifactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(18);
		}
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_FileName() {
        return (EAttribute)getArtifact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_NestedArtifact() {
        return (EReference)getArtifact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Manifestation() {
        return (EReference)getArtifact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedOperation() {
        return (EReference)getArtifact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedAttribute() {
        return (EReference)getArtifact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		if (associationEClass == null) {
			associationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(19);
		}
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
        return (EReference)getAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_NavigableOwnedEnd() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_MemberEnd() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_EndType() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		if (associationClassEClass == null) {
			associationClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(20);
		}
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		if (behaviorEClass == null) {
			behaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(21);
		}
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_RedefinedBahavior() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameter() {
        return (EReference)getBehavior().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameterSet() {
        return (EReference)getBehavior().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Specification() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Context() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Postcondition() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Precondition() {
        return (EAttribute)getBehavior().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecification() {
		if (behaviorExecutionSpecificationEClass == null) {
			behaviorExecutionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(22);
		}
		return behaviorExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorExecutionSpecification_Behavior() {
        return (EAttribute)getBehaviorExecutionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		if (behavioralFeatureEClass == null) {
			behavioralFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(23);
		}
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameter() {
        return (EReference)getBehavioralFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_IsAbstract() {
        return (EAttribute)getBehavioralFeature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
        return (EAttribute)getBehavioralFeature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_RaisedException() {
        return (EAttribute)getBehavioralFeature().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameterSet() {
        return (EReference)getBehavioralFeature().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Method() {
        return (EAttribute)getBehavioralFeature().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		if (behavioredClassifierEClass == null) {
			behavioredClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(24);
		}
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedBehavior() {
        return (EReference)getBehavioredClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioredClassifier_ClassifierBehavior() {
        return (EAttribute)getBehavioredClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_InterfaceRealization() {
        return (EReference)getBehavioredClassifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedTrigger() {
        return (EReference)getBehavioredClassifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		if (broadcastSignalActionEClass == null) {
			broadcastSignalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(26);
		}
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBroadcastSignalAction_Signal() {
        return (EAttribute)getBroadcastSignalAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		if (callActionEClass == null) {
			callActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(27);
		}
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAction_IsSynchronous() {
        return (EAttribute)getCallAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_Result() {
        return (EReference)getCallAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		if (callBehaviorActionEClass == null) {
			callBehaviorActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(28);
		}
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallBehaviorAction_Behavior() {
        return (EAttribute)getCallBehaviorAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEvent() {
		if (callEventEClass == null) {
			callEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(30);
		}
		return callEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallEvent_Operation() {
        return (EAttribute)getCallEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction() {
		if (callOperationActionEClass == null) {
			callOperationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(31);
		}
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Target() {
        return (EReference)getCallOperationAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallOperationAction_Operation() {
        return (EAttribute)getCallOperationAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		if (changeEventEClass == null) {
			changeEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(32);
		}
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
        return (EReference)getChangeEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (classEClass == null) {
			classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(33);
		}
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
        return (EReference)getClass_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
        return (EReference)getClass_().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
        return (EReference)getClass_().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Superclass() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Extension() {
        return (EAttribute)getClass_().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		if (classifierEClass == null) {
			classifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(34);
		}
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
        return (EReference)getClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_PowertypeExtent() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Feature() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_InheritedMember() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_RedefinedClassifier() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_General() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Substitution() {
        return (EReference)getClassifier().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Representation() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_CollaborationUse() {
        return (EReference)getClassifier().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedUseCase() {
        return (EReference)getClassifier().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Attribute() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_UseCase() {
        return (EAttribute)getClassifier().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameter() {
		if (classifierTemplateParameterEClass == null) {
			classifierTemplateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(35);
		}
		return classifierTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
        return (EAttribute)getClassifierTemplateParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_DefaultClassifier() {
        return (EAttribute)getClassifierTemplateParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_ConstrainingClassifier() {
        return (EAttribute)getClassifierTemplateParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		if (clauseEClass == null) {
			clauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(36);
		}
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_PredecessorClause() {
        return (EAttribute)getClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_SuccessorClause() {
        return (EAttribute)getClause().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_Decider() {
        return (EAttribute)getClause().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_BodyOutput() {
        return (EAttribute)getClause().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_Test() {
        return (EAttribute)getClause().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClause_Body() {
        return (EAttribute)getClause().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		if (clearVariableActionEClass == null) {
			clearVariableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(37);
		}
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		if (clearAssociationActionEClass == null) {
			clearAssociationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(38);
		}
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
        return (EReference)getClearAssociationAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClearAssociationAction_Association() {
        return (EAttribute)getClearAssociationAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		if (clearStructuralFeatureActionEClass == null) {
			clearStructuralFeatureActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(39);
		}
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		if (collaborationEClass == null) {
			collaborationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(40);
		}
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaboration_CollaborationRole() {
        return (EAttribute)getCollaboration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		if (collaborationUseEClass == null) {
			collaborationUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(41);
		}
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationUse_Type() {
        return (EAttribute)getCollaborationUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_RoleBinding() {
        return (EReference)getCollaborationUse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(42);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
        return (EAttribute)getComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_AnnotatedElement() {
        return (EAttribute)getComment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPath() {
		if (communicationPathEClass == null) {
			communicationPathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(43);
		}
		return communicationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		if (componentEClass == null) {
			componentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(44);
		}
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IndirectlyInstantiated() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Required() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Provided() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_PackagedElement() {
        return (EReference)getComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Realization() {
        return (EReference)getComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRealization() {
		if (componentRealizationEClass == null) {
			componentRealizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(45);
		}
		return componentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRealization_Abstraction() {
        return (EAttribute)getComponentRealization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentRealization_RealizingClassifier() {
        return (EAttribute)getComponentRealization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		if (combinedFragmentEClass == null) {
			combinedFragmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(46);
		}
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
        return (EAttribute)getCombinedFragment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
        return (EReference)getCombinedFragment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
        return (EReference)getCombinedFragment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		if (conditionalNodeEClass == null) {
			conditionalNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(47);
		}
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsDeterminate() {
        return (EAttribute)getConditionalNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsAssured() {
        return (EAttribute)getConditionalNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Clause() {
        return (EReference)getConditionalNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Result() {
        return (EReference)getConditionalNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		if (constraintEClass == null) {
			constraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(48);
		}
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ConstrainedElement() {
        return (EAttribute)getConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
        return (EReference)getConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Context() {
        return (EAttribute)getConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragment() {
		if (considerIgnoreFragmentEClass == null) {
			considerIgnoreFragmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(49);
		}
		return considerIgnoreFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsiderIgnoreFragment_Message() {
        return (EAttribute)getConsiderIgnoreFragment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		if (continuationEClass == null) {
			continuationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(50);
		}
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
        return (EAttribute)getContinuation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		if (connectableElementEClass == null) {
			connectableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(51);
		}
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectableElement_End() {
        return (EAttribute)getConnectableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameter() {
		if (connectableElementTemplateParameterEClass == null) {
			connectableElementTemplateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(52);
		}
		return connectableElementTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEnd() {
		if (connectorEndEClass == null) {
			connectorEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(53);
		}
		return connectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorEnd_DefiningEnd() {
        return (EAttribute)getConnectorEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorEnd_PartWithPort() {
        return (EAttribute)getConnectorEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorEnd_Role() {
        return (EAttribute)getConnectorEnd().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReference() {
		if (connectionPointReferenceEClass == null) {
			connectionPointReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(54);
		}
		return connectionPointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPointReference_Entry() {
        return (EAttribute)getConnectionPointReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPointReference_Exit() {
        return (EAttribute)getConnectionPointReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionPointReference_State() {
        return (EAttribute)getConnectionPointReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		if (connectorEClass == null) {
			connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(55);
		}
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_RedefinedConnector() {
        return (EAttribute)getConnector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_End() {
        return (EReference)getConnector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Kind() {
        return (EAttribute)getConnector().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Contract() {
        return (EAttribute)getConnector().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Type() {
        return (EAttribute)getConnector().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		if (controlFlowEClass == null) {
			controlFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(57);
		}
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		if (controlNodeEClass == null) {
			controlNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(58);
		}
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationEvent() {
		if (creationEventEClass == null) {
			creationEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(59);
		}
		return creationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		if (createLinkObjectActionEClass == null) {
			createLinkObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(60);
		}
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction_Result() {
        return (EReference)getCreateLinkObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		if (createObjectActionEClass == null) {
			createObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(61);
		}
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
        return (EReference)getCreateObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateObjectAction_Classifier() {
        return (EAttribute)getCreateObjectAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		if (createLinkActionEClass == null) {
			createLinkActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(62);
		}
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNode() {
		if (centralBufferNodeEClass == null) {
			centralBufferNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(63);
		}
		return centralBufferNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNode() {
		if (dataStoreNodeEClass == null) {
			dataStoreNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(64);
		}
		return dataStoreNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(65);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
        return (EReference)getDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedOperation() {
        return (EReference)getDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		if (decisionNodeEClass == null) {
			decisionNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(66);
		}
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionNode_DecisionInput() {
        return (EAttribute)getDecisionNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		if (dependencyEClass == null) {
			dependencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(67);
		}
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Supplier() {
        return (EAttribute)getDependency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Client() {
        return (EAttribute)getDependency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		if (deploymentTargetEClass == null) {
			deploymentTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(68);
		}
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_Deployment() {
        return (EReference)getDeploymentTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentTarget_DeployedElement() {
        return (EAttribute)getDeploymentTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		if (deploymentEClass == null) {
			deploymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(69);
		}
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_DeployedArtifact() {
        return (EAttribute)getDeployment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Configuration() {
        return (EReference)getDeployment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Location() {
        return (EAttribute)getDeployment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedArtifact() {
		if (deployedArtifactEClass == null) {
			deployedArtifactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(70);
		}
		return deployedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		if (deploymentSpecificationEClass == null) {
			deploymentSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(71);
		}
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_DeploymentLocation() {
        return (EAttribute)getDeploymentSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_ExecutionLocation() {
        return (EAttribute)getDeploymentSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_Deployment() {
        return (EAttribute)getDeploymentSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		if (directedRelationshipEClass == null) {
			directedRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(72);
		}
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_Source() {
        return (EAttribute)getDirectedRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectedRelationship_Target() {
        return (EAttribute)getDirectedRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		if (deviceEClass == null) {
			deviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(73);
		}
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		if (destroyLinkActionEClass == null) {
			destroyLinkActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(74);
		}
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		if (destroyObjectActionEClass == null) {
			destroyObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(75);
		}
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyLinks() {
        return (EAttribute)getDestroyObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyOwnedObjects() {
        return (EAttribute)getDestroyObjectAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
        return (EReference)getDestroyObjectAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionEvent() {
		if (destructionEventEClass == null) {
			destructionEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(76);
		}
		return destructionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		if (durationEClass == null) {
			durationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(77);
		}
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Expr() {
        return (EAttribute)getDuration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Observation() {
        return (EAttribute)getDuration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		if (durationConstraintEClass == null) {
			durationConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(78);
		}
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationConstraint_FirstEvent() {
        return (EAttribute)getDurationConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		if (durationIntervalEClass == null) {
			durationIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(79);
		}
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservation() {
		if (durationObservationEClass == null) {
			durationObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(80);
		}
		return durationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_Event() {
        return (EAttribute)getDurationObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_FirstEvent() {
        return (EAttribute)getDurationObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(81);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
        return (EReference)getElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Owner() {
        return (EAttribute)getElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_OwnedElement() {
        return (EAttribute)getElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Href() {
        return (EAttribute)getElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		if (elementImportEClass == null) {
			elementImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(82);
		}
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
        return (EAttribute)getElementImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
        return (EAttribute)getElementImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
        return (EReference)getElementImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_ImportingNamespace() {
        return (EAttribute)getElementImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifier() {
		if (encapsulatedClassifierEClass == null) {
			encapsulatedClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(83);
		}
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedClassifier_OwnedPort() {
        return (EAttribute)getEncapsulatedClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		if (enumerationEClass == null) {
			enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(84);
		}
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
        return (EReference)getEnumeration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		if (enumerationLiteralEClass == null) {
			enumerationLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(85);
		}
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Enumeration() {
        return (EAttribute)getEnumerationLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		if (exceptionHandlerEClass == null) {
			exceptionHandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(86);
		}
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionHandler_HandlerBody() {
        return (EAttribute)getExceptionHandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionHandler_ExceptionInput() {
        return (EAttribute)getExceptionHandler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionHandler_ExceptionType() {
        return (EAttribute)getExceptionHandler().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionHandler_ProtectedNode() {
        return (EAttribute)getExceptionHandler().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		if (executableNodeEClass == null) {
			executableNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(87);
		}
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_Handler() {
        return (EReference)getExecutableNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		if (executionEnvironmentEClass == null) {
			executionEnvironmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(88);
		}
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEvent() {
		if (executionEventEClass == null) {
			executionEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(89);
		}
		return executionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrenceSpecification() {
		if (executionOccurrenceSpecificationEClass == null) {
			executionOccurrenceSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(90);
		}
		return executionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionOccurrenceSpecification_Execution() {
        return (EAttribute)getExecutionOccurrenceSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecification() {
		if (executionSpecificationEClass == null) {
			executionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(91);
		}
		return executionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionSpecification_Start() {
        return (EAttribute)getExecutionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionSpecification_Finish() {
        return (EAttribute)getExecutionSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		if (expansionNodeEClass == null) {
			expansionNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(93);
		}
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionNode_RegionAsOutput() {
        return (EAttribute)getExpansionNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionNode_RegionAsInput() {
        return (EAttribute)getExpansionNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		if (expansionRegionEClass == null) {
			expansionRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(94);
		}
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
        return (EAttribute)getExpansionRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_InputElement() {
        return (EAttribute)getExpansionRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_OutputElement() {
        return (EAttribute)getExpansionRegion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtend() {
		if (extendEClass == null) {
			extendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(95);
		}
		return extendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtend_ExtendedCase() {
        return (EAttribute)getExtend().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Condition() {
        return (EReference)getExtend().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtend_ExtensionLocation() {
        return (EAttribute)getExtend().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtend_Extension() {
        return (EAttribute)getExtend().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		if (extensionEClass == null) {
			extensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(96);
		}
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_IsRequired() {
        return (EAttribute)getExtension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_MetaClass() {
        return (EAttribute)getExtension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEnd() {
		if (extensionEndEClass == null) {
			extensionEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(97);
		}
		return extensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPoint() {
		if (extensionPointEClass == null) {
			extensionPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(98);
		}
		return extensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionPoint_UseCase() {
        return (EAttribute)getExtensionPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(99);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
        return (EAttribute)getExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
        return (EReference)getExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		if (eventEClass == null) {
			eventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(100);
		}
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		if (featureEClass == null) {
			featureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(101);
		}
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
        return (EAttribute)getFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_FeaturingClassifier() {
        return (EAttribute)getFeature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		if (finalStateEClass == null) {
			finalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(102);
		}
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		if (forkNodeEClass == null) {
			forkNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(103);
		}
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		if (flowFinalNodeEClass == null) {
			flowFinalNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(104);
		}
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		if (finalNodeEClass == null) {
			finalNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(105);
		}
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehavior() {
		if (functionBehaviorEClass == null) {
			functionBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(106);
		}
		return functionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		if (gateEClass == null) {
			gateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(107);
		}
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrdering() {
		if (generalOrderingEClass == null) {
			generalOrderingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(108);
		}
		return generalOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralOrdering_Before() {
        return (EAttribute)getGeneralOrdering().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralOrdering_After() {
        return (EAttribute)getGeneralOrdering().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		if (generalizationEClass == null) {
			generalizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(109);
		}
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
        return (EAttribute)getGeneralization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_General() {
        return (EAttribute)getGeneralization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_GeneralizationSet() {
        return (EAttribute)getGeneralization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_Specific() {
        return (EAttribute)getGeneralization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		if (generalizationSetEClass == null) {
			generalizationSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(110);
		}
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
        return (EAttribute)getGeneralizationSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
        return (EAttribute)getGeneralizationSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_Generalization() {
        return (EAttribute)getGeneralizationSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_PowerType() {
        return (EAttribute)getGeneralizationSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		if (imageEClass == null) {
			imageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(111);
		}
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Content() {
        return (EAttribute)getImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Location() {
        return (EAttribute)getImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Format() {
        return (EAttribute)getImage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealization() {
		if (interfaceRealizationEClass == null) {
			interfaceRealizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(113);
		}
		return interfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceRealization_Contract() {
        return (EAttribute)getInterfaceRealization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceRealization_RealizingClassifier() {
        return (EAttribute)getInterfaceRealization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		if (interfaceEClass == null) {
			interfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(114);
		}
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
        return (EReference)getInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
        return (EReference)getInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
        return (EReference)getInterface().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_RedefinedInterface() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
        return (EReference)getInterface().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Protocol() {
        return (EReference)getInterface().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_IsActive() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		if (includeEClass == null) {
			includeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(115);
		}
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_Addition() {
        return (EAttribute)getInclude().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_IncludingCase() {
        return (EAttribute)getInclude().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		if (instanceSpecificationEClass == null) {
			instanceSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(116);
		}
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceSpecification_Classifier() {
        return (EAttribute)getInstanceSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
        return (EReference)getInstanceSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
        return (EReference)getInstanceSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		if (instanceValueEClass == null) {
			instanceValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(117);
		}
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceValue_Instance() {
        return (EAttribute)getInstanceValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		if (interruptibleActivityRegionEClass == null) {
			interruptibleActivityRegionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(118);
		}
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptibleActivityRegion_InterruptingEdge() {
        return (EAttribute)getInterruptibleActivityRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterruptibleActivityRegion_Node() {
        return (EAttribute)getInterruptibleActivityRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		if (inputPinEClass == null) {
			inputPinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(119);
		}
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		if (invocationActionEClass == null) {
			invocationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(120);
		}
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Argument() {
        return (EReference)getInvocationAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvocationAction_OnPort() {
        return (EAttribute)getInvocationAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		if (initialNodeEClass == null) {
			initialNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(121);
		}
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		if (interactionEClass == null) {
			interactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(122);
		}
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
        return (EReference)getInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
        return (EReference)getInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Action() {
        return (EReference)getInteraction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
        return (EReference)getInteraction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
        return (EReference)getInteraction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		if (interactionFragmentEClass == null) {
			interactionFragmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(123);
		}
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionFragment_Covered() {
        return (EAttribute)getInteractionFragment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
        return (EReference)getInteractionFragment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionFragment_EnclosingInteraction() {
        return (EAttribute)getInteractionFragment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionFragment_EnclosingOperand() {
        return (EAttribute)getInteractionFragment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUse() {
		if (interactionUseEClass == null) {
			interactionUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(124);
		}
		return interactionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionUse_RefersTo() {
        return (EAttribute)getInteractionUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ActualGate() {
        return (EReference)getInteractionUse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_Argument() {
        return (EReference)getInteractionUse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		if (interactionOperandEClass == null) {
			interactionOperandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(125);
		}
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
        return (EReference)getInteractionOperand().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
        return (EReference)getInteractionOperand().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		if (interactionConstraintEClass == null) {
			interactionConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(126);
		}
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
        return (EReference)getInteractionConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
        return (EReference)getInteractionConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		if (intervalEClass == null) {
			intervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(127);
		}
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Min() {
        return (EAttribute)getInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Max() {
        return (EAttribute)getInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		if (intervalConstraintEClass == null) {
			intervalConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(128);
		}
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItem() {
		if (informationItemEClass == null) {
			informationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(129);
		}
		return informationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationItem_Represented() {
        return (EAttribute)getInformationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		if (informationFlowEClass == null) {
			informationFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(130);
		}
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_Realization() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_Conveyed() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_InformationSource() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_InformationTarget() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_RealizingActivityEdge() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_RealizingConnector() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationFlow_RealizingMessage() {
        return (EAttribute)getInformationFlow().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		if (joinNodeEClass == null) {
			joinNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(132);
		}
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinNode_IsCombineDuplicate() {
        return (EAttribute)getJoinNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinNode_JoinSpec() {
        return (EReference)getJoinNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		if (literalSpecificationEClass == null) {
			literalSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(133);
		}
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		if (literalIntegerEClass == null) {
			literalIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(134);
		}
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
        return (EAttribute)getLiteralInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		if (literalStringEClass == null) {
			literalStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(135);
		}
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
        return (EAttribute)getLiteralString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		if (literalBooleanEClass == null) {
			literalBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(136);
		}
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
        return (EAttribute)getLiteralBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		if (literalNullEClass == null) {
			literalNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(137);
		}
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		if (literalUnlimitedNaturalEClass == null) {
			literalUnlimitedNaturalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(138);
		}
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
        return (EAttribute)getLiteralUnlimitedNatural().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		if (lifelineEClass == null) {
			lifelineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(139);
		}
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeline_Represents() {
        return (EAttribute)getLifeline().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeline_Interaction() {
        return (EAttribute)getLifeline().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
        return (EReference)getLifeline().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeline_DecomposedAs() {
        return (EAttribute)getLifeline().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeline_CoveredBy() {
        return (EAttribute)getLifeline().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		if (linkActionEClass == null) {
			linkActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(140);
		}
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
        return (EReference)getLinkAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
        return (EReference)getLinkAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		if (linkEndDataEClass == null) {
			linkEndDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(141);
		}
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
        return (EReference)getLinkEndData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndData_Value() {
        return (EAttribute)getLinkEndData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndData_End() {
        return (EAttribute)getLinkEndData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		if (linkEndCreationDataEClass == null) {
			linkEndCreationDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(142);
		}
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
        return (EAttribute)getLinkEndCreationData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_InsertAt() {
        return (EAttribute)getLinkEndCreationData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		if (linkEndDestructionDataEClass == null) {
			linkEndDestructionDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(143);
		}
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_IsDestroyDuplicates() {
        return (EAttribute)getLinkEndDestructionData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_DestroyAt() {
        return (EAttribute)getLinkEndDestructionData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNode() {
		if (loopNodeEClass == null) {
			loopNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(144);
		}
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_IsTestedFirst() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_BodyPart() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_SetupPart() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_Decider() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_Test() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Result() {
        return (EReference)getLoopNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_LoopVariable() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_BodyOutput() {
        return (EAttribute)getLoopNode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariableInput() {
        return (EReference)getLoopNode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestation() {
		if (manifestationEClass == null) {
			manifestationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(145);
		}
		return manifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestation_UtilizedElement() {
        return (EAttribute)getManifestation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		if (messageEClass == null) {
			messageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(146);
		}
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageKind() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_ReceiveEvent() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_SendEvent() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Connector() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Interaction() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Argument() {
        return (EReference)getMessage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Signature() {
        return (EAttribute)getMessage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		if (messageEndEClass == null) {
			messageEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(149);
		}
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageEnd_Message() {
        return (EAttribute)getMessageEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		if (messageEventEClass == null) {
			messageEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(150);
		}
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecification() {
		if (messageOccurrenceSpecificationEClass == null) {
			messageOccurrenceSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(151);
		}
		return messageOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		if (mergeNodeEClass == null) {
			mergeNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(152);
		}
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		if (modelEClass == null) {
			modelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(153);
		}
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
        return (EAttribute)getModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		if (multiplicityElementEClass == null) {
			multiplicityElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(154);
		}
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
        return (EReference)getMultiplicityElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
        return (EReference)getMultiplicityElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		if (namedElementEClass == null) {
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(155);
		}
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_ClientDependency() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Namespace() {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
        return (EReference)getNamedElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		if (namespaceEClass == null) {
			namespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(156);
		}
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
        return (EReference)getNamespace().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
        return (EReference)getNamespace().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
        return (EReference)getNamespace().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Member() {
        return (EAttribute)getNamespace().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_ImportedMember() {
        return (EAttribute)getNamespace().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_OwnedMember() {
        return (EAttribute)getNamespace().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		if (nodeEClass == null) {
			nodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(157);
		}
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NestedNode() {
        return (EReference)getNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		if (operationEClass == null) {
			operationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(158);
		}
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Interface() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Class() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsQuery() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsOrdered() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsUnique() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Lower() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Upper() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Precondition() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Postcondition() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_RedefinedOperation() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Datatype() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_BodyCondition() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Type() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameter() {
		if (operationTemplateParameterEClass == null) {
			operationTemplateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(159);
		}
		return operationTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		if (opaqueActionEClass == null) {
			opaqueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(160);
		}
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Body() {
        return (EAttribute)getOpaqueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Language() {
        return (EAttribute)getOpaqueAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_InputValue() {
        return (EReference)getOpaqueAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_OutputValue() {
        return (EReference)getOpaqueAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		if (opaqueBehaviorEClass == null) {
			opaqueBehaviorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(161);
		}
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Body() {
        return (EAttribute)getOpaqueBehavior().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Language() {
        return (EAttribute)getOpaqueBehavior().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		if (opaqueExpressionEClass == null) {
			opaqueExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(162);
		}
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Result() {
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Behavior() {
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecification() {
		if (occurrenceSpecificationEClass == null) {
			occurrenceSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(163);
		}
		return occurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceSpecification_ToBefore() {
        return (EAttribute)getOccurrenceSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceSpecification_ToAfter() {
        return (EAttribute)getOccurrenceSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceSpecification_Event() {
        return (EAttribute)getOccurrenceSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		if (objectFlowEClass == null) {
			objectFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(164);
		}
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
        return (EAttribute)getObjectFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
        return (EAttribute)getObjectFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_Transformation() {
        return (EAttribute)getObjectFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_Selection() {
        return (EAttribute)getObjectFlow().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		if (observationEClass == null) {
			observationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(165);
		}
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		if (objectNodeEClass == null) {
			objectNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(166);
		}
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
        return (EAttribute)getObjectNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_IsControlType() {
        return (EAttribute)getObjectNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_UpperBound() {
        return (EReference)getObjectNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_InState() {
        return (EAttribute)getObjectNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Selection() {
        return (EAttribute)getObjectNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		if (outputPinEClass == null) {
			outputPinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(168);
		}
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		if (parameterEClass == null) {
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(169);
		}
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterSet() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Operation() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
        return (EReference)getParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsException() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsStream() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Effect() {
        return (EAttribute)getParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElement() {
		if (parameterableElementEClass == null) {
			parameterableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(170);
		}
		return parameterableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterableElement_OwningTemplateParameter() {
        return (EAttribute)getParameterableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterableElement_TemplateParameter() {
        return (EAttribute)getParameterableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(171);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_OwnedType() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
        return (EReference)getPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
        return (EReference)getPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_NestedPackage() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_NestingPackage() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ProfileApplication() {
        return (EReference)getPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		if (packageableElementEClass == null) {
			packageableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(172);
		}
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		if (packageImportEClass == null) {
			packageImportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(173);
		}
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
        return (EAttribute)getPackageImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_ImportingNamespace() {
        return (EAttribute)getPackageImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
        return (EReference)getPackageImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		if (packageMergeEClass == null) {
			packageMergeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(174);
		}
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMerge_MergedPackage() {
        return (EAttribute)getPackageMerge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageMerge_ReceivingPackage() {
        return (EAttribute)getPackageMerge().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		if (parameterSetEClass == null) {
			parameterSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(175);
		}
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSet_Parameter() {
        return (EAttribute)getParameterSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Condition() {
        return (EReference)getParameterSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		if (partDecompositionEClass == null) {
			partDecompositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(178);
		}
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		if (pinEClass == null) {
			pinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(179);
		}
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
        return (EAttribute)getPin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		if (primitiveTypeEClass == null) {
			primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(180);
		}
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransition() {
		if (protocolTransitionEClass == null) {
			protocolTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(181);
		}
		return protocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolTransition_PostCondition() {
        return (EAttribute)getProtocolTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolTransition_Referred() {
        return (EAttribute)getProtocolTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolTransition_PreCondition() {
        return (EAttribute)getProtocolTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		if (profileEClass == null) {
			profileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(182);
		}
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfile_OwnedStereotype() {
        return (EAttribute)getProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfile_MetaclassReference() {
        return (EAttribute)getProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfile_MetamodelReference() {
        return (EAttribute)getProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplication() {
		if (profileApplicationEClass == null) {
			profileApplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(183);
		}
		return profileApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_AppliedProfile() {
        return (EAttribute)getProfileApplication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_IsStrict() {
        return (EAttribute)getProfileApplication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_ApplyingPackage() {
        return (EAttribute)getProfileApplication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(184);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Class() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Datatype() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_RedefinedProperty() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_OwningAssociation() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
        return (EReference)getProperty().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Opposite() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_SubsettedProperty() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Association() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Qualifier() {
        return (EReference)getProperty().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_AssociationEnd() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachine() {
		if (protocolStateMachineEClass == null) {
			protocolStateMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(185);
		}
		return protocolStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStateMachine_Conformance() {
        return (EReference)getProtocolStateMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformance() {
		if (protocolConformanceEClass == null) {
			protocolConformanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(186);
		}
		return protocolConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolConformance_GeneralMachine() {
        return (EAttribute)getProtocolConformance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolConformance_SpecificMachine() {
        return (EAttribute)getProtocolConformance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		if (portEClass == null) {
			portEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(187);
		}
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
        return (EAttribute)getPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
        return (EAttribute)getPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Required() {
        return (EAttribute)getPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_RedefinedPort() {
        return (EAttribute)getPort().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Provided() {
        return (EAttribute)getPort().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Protocol() {
        return (EAttribute)getPort().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		if (pseudostateEClass == null) {
			pseudostateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(188);
		}
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_Kind() {
        return (EAttribute)getPseudostate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_StateMachine() {
        return (EAttribute)getPseudostate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_State() {
        return (EAttribute)getPseudostate().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		if (qualifierValueEClass == null) {
			qualifierValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(189);
		}
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifierValue_Qualifier() {
        return (EAttribute)getQualifierValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifierValue_Value() {
        return (EAttribute)getQualifierValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		if (raiseExceptionActionEClass == null) {
			raiseExceptionActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(191);
		}
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
        return (EReference)getRaiseExceptionAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveOperationEvent() {
		if (receiveOperationEventEClass == null) {
			receiveOperationEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(192);
		}
		return receiveOperationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveOperationEvent_Operation() {
        return (EAttribute)getReceiveOperationEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveSignalEvent() {
		if (receiveSignalEventEClass == null) {
			receiveSignalEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(193);
		}
		return receiveSignalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveSignalEvent_Signal() {
        return (EAttribute)getReceiveSignalEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		if (reclassifyObjectActionEClass == null) {
			reclassifyObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(194);
		}
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
        return (EAttribute)getReclassifyObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_OldClassifier() {
        return (EAttribute)getReclassifyObjectAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_NewClassifier() {
        return (EAttribute)getReclassifyObjectAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
        return (EReference)getReclassifyObjectAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		if (readIsClassifiedObjectActionEClass == null) {
			readIsClassifiedObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(195);
		}
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_IsDirect() {
        return (EAttribute)getReadIsClassifiedObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_Classifier() {
        return (EAttribute)getReadIsClassifiedObjectAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Result() {
        return (EReference)getReadIsClassifiedObjectAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
        return (EReference)getReadIsClassifiedObjectAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		if (readExtentActionEClass == null) {
			readExtentActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(196);
		}
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Result() {
        return (EReference)getReadExtentAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadExtentAction_Classifier() {
        return (EAttribute)getReadExtentAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		if (readLinkActionEClass == null) {
			readLinkActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(197);
		}
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
        return (EReference)getReadLinkAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		if (readLinkObjectEndActionEClass == null) {
			readLinkObjectEndActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(198);
		}
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
        return (EReference)getReadLinkObjectEndAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Result() {
        return (EReference)getReadLinkObjectEndAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadLinkObjectEndAction_End() {
        return (EAttribute)getReadLinkObjectEndAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		if (readLinkObjectEndQualifierActionEClass == null) {
			readLinkObjectEndQualifierActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(199);
		}
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
        return (EReference)getReadLinkObjectEndQualifierAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Result() {
        return (EReference)getReadLinkObjectEndQualifierAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadLinkObjectEndQualifierAction_Qualifier() {
        return (EAttribute)getReadLinkObjectEndQualifierAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		if (readSelfActionEClass == null) {
			readSelfActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(200);
		}
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
        return (EReference)getReadSelfAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		if (readStructuralFeatureActionEClass == null) {
			readStructuralFeatureActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(201);
		}
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
        return (EReference)getReadStructuralFeatureAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		if (readVariableActionEClass == null) {
			readVariableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(202);
		}
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction_Result() {
        return (EReference)getReadVariableAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignature() {
		if (redefinableTemplateSignatureEClass == null) {
			redefinableTemplateSignatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(203);
		}
		return redefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableTemplateSignature_ExtendedSignature() {
        return (EAttribute)getRedefinableTemplateSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableTemplateSignature_InheritedParameter() {
        return (EAttribute)getRedefinableTemplateSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableTemplateSignature_Classifier() {
        return (EAttribute)getRedefinableTemplateSignature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		if (reduceActionEClass == null) {
			reduceActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(204);
		}
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_Reducer() {
        return (EAttribute)getReduceAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Result() {
        return (EReference)getReduceAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
        return (EReference)getReduceAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_IsOrdered() {
        return (EAttribute)getReduceAction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		if (replyActionEClass == null) {
			replyActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(205);
		}
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyAction_ReplyToCall() {
        return (EAttribute)getReplyAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
        return (EReference)getReplyAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
        return (EReference)getReplyAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		if (removeVariableValueActionEClass == null) {
			removeVariableValueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(206);
		}
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveVariableValueAction_IsRemoveDuplicates() {
        return (EAttribute)getRemoveVariableValueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveVariableValueAction_RemoveAt() {
        return (EReference)getRemoveVariableValueAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		if (removeStructuralFeatureValueActionEClass == null) {
			removeStructuralFeatureValueActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(207);
		}
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveStructuralFeatureValueAction_IsRemoveDuplicates() {
        return (EAttribute)getRemoveStructuralFeatureValueAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
        return (EReference)getRemoveStructuralFeatureValueAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		if (redefinableElementEClass == null) {
			redefinableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(208);
		}
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
        return (EAttribute)getRedefinableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_RedefinedElement() {
        return (EAttribute)getRedefinableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_RedefinitionContext() {
        return (EAttribute)getRedefinableElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		if (relationshipEClass == null) {
			relationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(209);
		}
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_RelatedElement() {
        return (EAttribute)getRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		if (realizationEClass == null) {
			realizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(210);
		}
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		if (receptionEClass == null) {
			receptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(211);
		}
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReception_Signal() {
        return (EAttribute)getReception().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		if (regionEClass == null) {
			regionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(212);
		}
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
        return (EReference)getRegion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transition() {
        return (EReference)getRegion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_State() {
        return (EAttribute)getRegion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_ExtendedRegion() {
        return (EAttribute)getRegion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_StateMachine() {
        return (EAttribute)getRegion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		if (sendSignalActionEClass == null) {
			sendSignalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(213);
		}
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
        return (EReference)getSendSignalAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendSignalAction_Signal() {
        return (EAttribute)getSendSignalAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalEvent() {
		if (sendSignalEventEClass == null) {
			sendSignalEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(214);
		}
		return sendSignalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendSignalEvent_Signal() {
        return (EAttribute)getSendSignalEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		if (sequenceNodeEClass == null) {
			sequenceNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(215);
		}
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_ExecutableNode() {
        return (EReference)getSequenceNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		if (signalEventEClass == null) {
			signalEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(216);
		}
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEvent_Signal() {
        return (EAttribute)getSignalEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		if (slotEClass == null) {
			slotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(217);
		}
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlot_DefiningFeature() {
        return (EAttribute)getSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
        return (EReference)getSlot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlot_OwningInstance() {
        return (EAttribute)getSlot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariant() {
		if (stateInvariantEClass == null) {
			stateInvariantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(218);
		}
		return stateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInvariant_Invariant() {
        return (EReference)getStateInvariant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		if (startClassifierBehaviorActionEClass == null) {
			startClassifierBehaviorActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(219);
		}
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
        return (EReference)getStartClassifierBehaviorAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		if (sendObjectActionEClass == null) {
			sendObjectActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(220);
		}
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
        return (EReference)getSendObjectAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
        return (EReference)getSendObjectAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		if (stringExpressionEClass == null) {
			stringExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(221);
		}
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
        return (EReference)getStringExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringExpression_OwningExpression() {
        return (EAttribute)getStringExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		if (structuredActivityNodeEClass == null) {
			structuredActivityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(222);
		}
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Variable() {
        return (EReference)getStructuredActivityNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Edge() {
        return (EReference)getStructuredActivityNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredActivityNode_MustIsolate() {
        return (EAttribute)getStructuredActivityNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Node() {
        return (EReference)getStructuredActivityNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		if (structuralFeatureEClass == null) {
			structuralFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(223);
		}
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
        return (EAttribute)getStructuralFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		if (structuralFeatureActionEClass == null) {
			structuralFeatureActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(224);
		}
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeatureAction_StructuralFeature() {
        return (EAttribute)getStructuralFeatureAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
        return (EReference)getStructuralFeatureAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitution() {
		if (substitutionEClass == null) {
			substitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(226);
		}
		return substitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitution_Contract() {
        return (EAttribute)getSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitution_SubstitutingClassifier() {
        return (EAttribute)getSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		if (signalEClass == null) {
			signalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(227);
		}
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
        return (EReference)getSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		if (stateEClass == null) {
			stateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(228);
		}
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsComposite() {
        return (EAttribute)getState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsOrthogonal() {
        return (EAttribute)getState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSimple() {
        return (EAttribute)getState().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSubmachineState() {
        return (EAttribute)getState().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Submachine() {
        return (EAttribute)getState().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Connection() {
        return (EReference)getState().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoint() {
        return (EReference)getState().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_RedefinedState() {
        return (EAttribute)getState().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
        return (EReference)getState().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
        return (EReference)getState().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
        return (EReference)getState().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
        return (EReference)getState().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DeferrableTrigger() {
        return (EReference)getState().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Region() {
        return (EReference)getState().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		if (stateMachineEClass == null) {
			stateMachineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(229);
		}
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
        return (EReference)getStateMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateMachine_SubmachineState() {
        return (EAttribute)getStateMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ConnectionPoint() {
        return (EReference)getStateMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateMachine_ExtendedStateMachine() {
        return (EAttribute)getStateMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifier() {
		if (structuredClassifierEClass == null) {
			structuredClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(230);
		}
		return structuredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedAttribute() {
        return (EReference)getStructuredClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredClassifier_Part() {
        return (EAttribute)getStructuredClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredClassifier_Role() {
        return (EAttribute)getStructuredClassifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedConnector() {
        return (EReference)getStructuredClassifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		if (stereotypeEClass == null) {
			stereotypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(231);
		}
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Icon() {
        return (EReference)getStereotype().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElement() {
		if (templateableElementEClass == null) {
			templateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(232);
		}
		return templateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_TemplateBinding() {
        return (EReference)getTemplateableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedTemplateSignature() {
        return (EReference)getTemplateableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		if (templateBindingEClass == null) {
			templateBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(233);
		}
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateBinding_Signature() {
        return (EAttribute)getTemplateBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_ParameterSubstitution() {
        return (EReference)getTemplateBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateBinding_BoundElement() {
        return (EAttribute)getTemplateBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		if (templateSignatureEClass == null) {
			templateSignatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(234);
		}
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateSignature_Parameter() {
        return (EAttribute)getTemplateSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_OwnedParameter() {
        return (EReference)getTemplateSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateSignature_Template() {
        return (EAttribute)getTemplateSignature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		if (templateParameterEClass == null) {
			templateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(235);
		}
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameter_Signature() {
        return (EAttribute)getTemplateParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameter_ParameteredElement() {
        return (EAttribute)getTemplateParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedParameteredElement() {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameter_Default() {
        return (EAttribute)getTemplateParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedDefault() {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitution() {
		if (templateParameterSubstitutionEClass == null) {
			templateParameterSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(236);
		}
		return templateParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameterSubstitution_Formal() {
        return (EAttribute)getTemplateParameterSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameterSubstitution_Actual() {
        return (EAttribute)getTemplateParameterSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_OwnedActual() {
        return (EReference)getTemplateParameterSubstitution().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateParameterSubstitution_TemplateBinding() {
        return (EAttribute)getTemplateParameterSubstitution().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		if (testIdentityActionEClass == null) {
			testIdentityActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(237);
		}
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
        return (EReference)getTestIdentityAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
        return (EReference)getTestIdentityAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
        return (EReference)getTestIdentityAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		if (timeConstraintEClass == null) {
			timeConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(238);
		}
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstraint_FirstEvent() {
        return (EAttribute)getTimeConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		if (timeEventEClass == null) {
			timeEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(239);
		}
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_IsRelative() {
        return (EAttribute)getTimeEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEvent_When() {
        return (EReference)getTimeEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		if (timeExpressionEClass == null) {
			timeExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(240);
		}
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExpression_Expr() {
        return (EAttribute)getTimeExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExpression_Observation() {
        return (EAttribute)getTimeExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		if (timeIntervalEClass == null) {
			timeIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(241);
		}
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservation() {
		if (timeObservationEClass == null) {
			timeObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(242);
		}
		return timeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_Event() {
        return (EAttribute)getTimeObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_FirstEvent() {
        return (EAttribute)getTimeObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		if (transitionEClass == null) {
			transitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(244);
		}
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Kind() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Container() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_RedefinedTransition() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Guard() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
        return (EReference)getTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
        return (EReference)getTransition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Target() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Source() {
        return (EAttribute)getTransition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		if (triggerEClass == null) {
			triggerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(245);
		}
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Event() {
        return (EAttribute)getTrigger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Port() {
        return (EAttribute)getTrigger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		if (typedElementEClass == null) {
			typedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(246);
		}
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_Type() {
        return (EAttribute)getTypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(247);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Package() {
        return (EAttribute)getType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallAction() {
		if (unmarshallActionEClass == null) {
			unmarshallActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(249);
		}
		return unmarshallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Result() {
        return (EReference)getUnmarshallAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnmarshallAction_UnmarshallType() {
        return (EAttribute)getUnmarshallAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Object() {
        return (EReference)getUnmarshallAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLBase() {
		if (umlBaseEClass == null) {
			umlBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(250);
		}
		return umlBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLBase_UmlID() {
        return (EAttribute)getUMLBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		if (usageEClass == null) {
			usageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(251);
		}
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		if (useCaseEClass == null) {
			useCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(252);
		}
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Include() {
        return (EReference)getUseCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Extend() {
        return (EReference)getUseCase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_ExtensionPoint() {
        return (EReference)getUseCase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Subject() {
        return (EAttribute)getUseCase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		if (valuePinEClass == null) {
			valuePinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(253);
		}
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
        return (EReference)getValuePin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		if (valueSpecificationActionEClass == null) {
			valueSpecificationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(254);
		}
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
        return (EReference)getValueSpecificationAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Result() {
        return (EReference)getValueSpecificationAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		if (valueSpecificationEClass == null) {
			valueSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(255);
		}
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		if (variableEClass == null) {
			variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(256);
		}
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Scope() {
        return (EAttribute)getVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_ActivityScope() {
        return (EAttribute)getVariable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		if (variableActionEClass == null) {
			variableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(257);
		}
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableAction_Variable() {
        return (EAttribute)getVariableAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		if (vertexEClass == null) {
			vertexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(258);
		}
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Incoming() {
        return (EAttribute)getVertex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Outgoing() {
        return (EAttribute)getVertex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Container() {
        return (EAttribute)getVertex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		if (writeLinkActionEClass == null) {
			writeLinkActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(260);
		}
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		if (writeVariableActionEClass == null) {
			writeVariableActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(261);
		}
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
        return (EReference)getWriteVariableAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		if (writeStructuralFeatureActionEClass == null) {
			writeStructuralFeatureActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(262);
		}
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
        return (EReference)getWriteStructuralFeatureAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		if (aggregationKindEEnum == null) {
			aggregationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(1);
		}
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyKind() {
		if (callConcurrencyKindEEnum == null) {
			callConcurrencyKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(29);
		}
		return callConcurrencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		if (connectorKindEEnum == null) {
			connectorKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(56);
		}
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		if (expansionKindEEnum == null) {
			expansionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(92);
		}
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperatorKind() {
		if (interactionOperatorKindEEnum == null) {
			interactionOperatorKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(131);
		}
		return interactionOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		if (messageKindEEnum == null) {
			messageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(147);
		}
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		if (messageSortEEnum == null) {
			messageSortEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(148);
		}
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		if (objectNodeOrderingKindEEnum == null) {
			objectNodeOrderingKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(167);
		}
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		if (parameterDirectionKindEEnum == null) {
			parameterDirectionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(176);
		}
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterEffectKind() {
		if (parameterEffectKindEEnum == null) {
			parameterEffectKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(177);
		}
		return parameterEffectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudostateKind() {
		if (pseudostateKindEEnum == null) {
			pseudostateKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(190);
		}
		return pseudostateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		if (transitionKindEEnum == null) {
			transitionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(243);
		}
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		if (visibilityKindEEnum == null) {
			visibilityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(259);
		}
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		if (booleanEDataType == null) {
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(25);
		}
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		if (integerEDataType == null) {
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(112);
		}
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		if (stringEDataType == null) {
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(225);
		}
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		if (unlimitedNaturalEDataType == null) {
			unlimitedNaturalEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI).getEClassifiers().get(248);
		}
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLModelFactory getUMLModelFactory() {
		return (UMLModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.emftrace.metamodel.UMLModel." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UMLModelPackageImpl
