/**
 */
package org.emftrace.metamodel.BPMN2Model;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallActivity <em>Call Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallChoreography <em>Call Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallConversation <em>Call Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCatchEvent <em>Catch Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategory <em>Category</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataAssociation <em>Data Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObjectReference <em>Data Object Reference</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStore <em>Data Store</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getError <em>Error</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEvent <em>Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalConversation <em>Global Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalTask <em>Global Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getHumanPerformer <em>Human Performer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLane <em>Lane</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getManualTask <em>Manual Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessage <em>Message</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProcess <em>Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getReceiveTask <em>Receive Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScript <em>Script</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScriptTask <em>Script Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSendTask <em>Send Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getServiceTask <em>Service Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubChoreography <em>Sub Choreography</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubConversation <em>Sub Conversation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getThrowEvent <em>Throw Event</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getUserTask <em>User Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends BPMNBase {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Activity()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ad Hoc Sub Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ad Hoc Sub Process</em>' containment reference.
	 * @see #setAdHocSubProcess(AdHocSubProcess)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_AdHocSubProcess()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	AdHocSubProcess getAdHocSubProcess();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ad Hoc Sub Process</em>' containment reference.
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	void setAdHocSubProcess(AdHocSubProcess value);

	/**
	 * Returns the value of the '<em><b>Flow Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Element</em>' containment reference.
	 * @see #setFlowElement(FlowElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_FlowElement()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	FlowElement getFlowElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowElement <em>Flow Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Element</em>' containment reference.
	 * @see #getFlowElement()
	 * @generated
	 */
	void setFlowElement(FlowElement value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see #setArtifact(Artifact)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Artifact()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getArtifact <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' containment reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference.
	 * @see #setAssignment(Assignment)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Assignment()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Assignment getAssignment();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssignment <em>Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' containment reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(Assignment value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference.
	 * @see #setAssociation(Association)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Association()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAssociation <em>Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' containment reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditing</em>' containment reference.
	 * @see #setAuditing(Auditing)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Auditing()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Auditing getAuditing();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getAuditing <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditing</em>' containment reference.
	 * @see #getAuditing()
	 * @generated
	 */
	void setAuditing(Auditing value);

	/**
	 * Returns the value of the '<em><b>Base Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Element</em>' containment reference.
	 * @see #setBaseElement(BaseElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_BaseElement()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	BaseElement getBaseElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElement <em>Base Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Element</em>' containment reference.
	 * @see #getBaseElement()
	 * @generated
	 */
	void setBaseElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element With Mixed Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Element With Mixed Content</em>' containment reference.
	 * @see #setBaseElementWithMixedContent(BaseElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_BaseElementWithMixedContent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	BaseElement getBaseElementWithMixedContent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Element With Mixed Content</em>' containment reference.
	 * @see #getBaseElementWithMixedContent()
	 * @generated
	 */
	void setBaseElementWithMixedContent(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Boundary Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event</em>' containment reference.
	 * @see #setBoundaryEvent(BoundaryEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_BoundaryEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	BoundaryEvent getBoundaryEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBoundaryEvent <em>Boundary Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Event</em>' containment reference.
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	void setBoundaryEvent(BoundaryEvent value);

	/**
	 * Returns the value of the '<em><b>Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Rule Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Rule Task</em>' containment reference.
	 * @see #setBusinessRuleTask(BusinessRuleTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_BusinessRuleTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	BusinessRuleTask getBusinessRuleTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getBusinessRuleTask <em>Business Rule Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Rule Task</em>' containment reference.
	 * @see #getBusinessRuleTask()
	 * @generated
	 */
	void setBusinessRuleTask(BusinessRuleTask value);

	/**
	 * Returns the value of the '<em><b>Callable Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Element</em>' containment reference.
	 * @see #setCallableElement(CallableElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CallableElement()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CallableElement getCallableElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallableElement <em>Callable Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Element</em>' containment reference.
	 * @see #getCallableElement()
	 * @generated
	 */
	void setCallableElement(CallableElement value);

	/**
	 * Returns the value of the '<em><b>Call Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Activity</em>' containment reference.
	 * @see #setCallActivity(CallActivity)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CallActivity()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CallActivity getCallActivity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallActivity <em>Call Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Activity</em>' containment reference.
	 * @see #getCallActivity()
	 * @generated
	 */
	void setCallActivity(CallActivity value);

	/**
	 * Returns the value of the '<em><b>Call Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Choreography</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Choreography</em>' containment reference.
	 * @see #setCallChoreography(CallChoreography)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CallChoreography()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CallChoreography getCallChoreography();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallChoreography <em>Call Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Choreography</em>' containment reference.
	 * @see #getCallChoreography()
	 * @generated
	 */
	void setCallChoreography(CallChoreography value);

	/**
	 * Returns the value of the '<em><b>Call Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Conversation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Conversation</em>' containment reference.
	 * @see #setCallConversation(CallConversation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CallConversation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CallConversation getCallConversation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCallConversation <em>Call Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Conversation</em>' containment reference.
	 * @see #getCallConversation()
	 * @generated
	 */
	void setCallConversation(CallConversation value);

	/**
	 * Returns the value of the '<em><b>Conversation Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Node</em>' containment reference.
	 * @see #setConversationNode(ConversationNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ConversationNode()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ConversationNode getConversationNode();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationNode <em>Conversation Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Node</em>' containment reference.
	 * @see #getConversationNode()
	 * @generated
	 */
	void setConversationNode(ConversationNode value);

	/**
	 * Returns the value of the '<em><b>Cancel Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Event Definition</em>' containment reference.
	 * @see #setCancelEventDefinition(CancelEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CancelEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CancelEventDefinition getCancelEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Event Definition</em>' containment reference.
	 * @see #getCancelEventDefinition()
	 * @generated
	 */
	void setCancelEventDefinition(CancelEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition</em>' containment reference.
	 * @see #setEventDefinition(EventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_EventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EventDefinition getEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventDefinition <em>Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Definition</em>' containment reference.
	 * @see #getEventDefinition()
	 * @generated
	 */
	void setEventDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' containment reference.
	 * @see #setRootElement(RootElement)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_RootElement()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	RootElement getRootElement();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRootElement <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' containment reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(RootElement value);

	/**
	 * Returns the value of the '<em><b>Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Event</em>' containment reference.
	 * @see #setCatchEvent(CatchEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CatchEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CatchEvent getCatchEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCatchEvent <em>Catch Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Event</em>' containment reference.
	 * @see #getCatchEvent()
	 * @generated
	 */
	void setCatchEvent(CatchEvent value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(Category)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Category()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Category Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value</em>' containment reference.
	 * @see #setCategoryValue(CategoryValue)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CategoryValue()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CategoryValue getCategoryValue();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCategoryValue <em>Category Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value</em>' containment reference.
	 * @see #getCategoryValue()
	 * @generated
	 */
	void setCategoryValue(CategoryValue value);

	/**
	 * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography</em>' containment reference.
	 * @see #setChoreography(Choreography)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Choreography()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Choreography getChoreography();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreography <em>Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography</em>' containment reference.
	 * @see #getChoreography()
	 * @generated
	 */
	void setChoreography(Choreography value);

	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' containment reference.
	 * @see #setCollaboration(Collaboration)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Collaboration()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Collaboration getCollaboration();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCollaboration <em>Collaboration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration</em>' containment reference.
	 * @see #getCollaboration()
	 * @generated
	 */
	void setCollaboration(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Choreography Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Activity</em>' containment reference.
	 * @see #setChoreographyActivity(ChoreographyActivity)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ChoreographyActivity()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ChoreographyActivity getChoreographyActivity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyActivity <em>Choreography Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Activity</em>' containment reference.
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	void setChoreographyActivity(ChoreographyActivity value);

	/**
	 * Returns the value of the '<em><b>Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Task</em>' containment reference.
	 * @see #setChoreographyTask(ChoreographyTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ChoreographyTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ChoreographyTask getChoreographyTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getChoreographyTask <em>Choreography Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Task</em>' containment reference.
	 * @see #getChoreographyTask()
	 * @generated
	 */
	void setChoreographyTask(ChoreographyTask value);

	/**
	 * Returns the value of the '<em><b>Compensate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensate Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensate Event Definition</em>' containment reference.
	 * @see #setCompensateEventDefinition(CompensateEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CompensateEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CompensateEventDefinition getCompensateEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensate Event Definition</em>' containment reference.
	 * @see #getCompensateEventDefinition()
	 * @generated
	 */
	void setCompensateEventDefinition(CompensateEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Complex Behavior Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Behavior Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Behavior Definition</em>' containment reference.
	 * @see #setComplexBehaviorDefinition(ComplexBehaviorDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ComplexBehaviorDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ComplexBehaviorDefinition getComplexBehaviorDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Behavior Definition</em>' containment reference.
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 */
	void setComplexBehaviorDefinition(ComplexBehaviorDefinition value);

	/**
	 * Returns the value of the '<em><b>Complex Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Gateway</em>' containment reference.
	 * @see #setComplexGateway(ComplexGateway)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ComplexGateway()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ComplexGateway getComplexGateway();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getComplexGateway <em>Complex Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Gateway</em>' containment reference.
	 * @see #getComplexGateway()
	 * @generated
	 */
	void setComplexGateway(ComplexGateway value);

	/**
	 * Returns the value of the '<em><b>Conditional Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Event Definition</em>' containment reference.
	 * @see #setConditionalEventDefinition(ConditionalEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ConditionalEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ConditionalEventDefinition getConditionalEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Event Definition</em>' containment reference.
	 * @see #getConditionalEventDefinition()
	 * @generated
	 */
	void setConditionalEventDefinition(ConditionalEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation</em>' containment reference.
	 * @see #setConversation(Conversation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Conversation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Conversation getConversation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversation <em>Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation</em>' containment reference.
	 * @see #getConversation()
	 * @generated
	 */
	void setConversation(Conversation value);

	/**
	 * Returns the value of the '<em><b>Conversation Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Association</em>' containment reference.
	 * @see #setConversationAssociation(ConversationAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ConversationAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ConversationAssociation getConversationAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationAssociation <em>Conversation Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Association</em>' containment reference.
	 * @see #getConversationAssociation()
	 * @generated
	 */
	void setConversationAssociation(ConversationAssociation value);

	/**
	 * Returns the value of the '<em><b>Conversation Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Link</em>' containment reference.
	 * @see #setConversationLink(ConversationLink)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ConversationLink()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ConversationLink getConversationLink();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getConversationLink <em>Conversation Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Link</em>' containment reference.
	 * @see #getConversationLink()
	 * @generated
	 */
	void setConversationLink(ConversationLink value);

	/**
	 * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key</em>' containment reference.
	 * @see #setCorrelationKey(CorrelationKey)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CorrelationKey()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CorrelationKey getCorrelationKey();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationKey <em>Correlation Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Key</em>' containment reference.
	 * @see #getCorrelationKey()
	 * @generated
	 */
	void setCorrelationKey(CorrelationKey value);

	/**
	 * Returns the value of the '<em><b>Correlation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property</em>' containment reference.
	 * @see #setCorrelationProperty(CorrelationProperty)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CorrelationProperty()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CorrelationProperty getCorrelationProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationProperty <em>Correlation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property</em>' containment reference.
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	void setCorrelationProperty(CorrelationProperty value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Binding</em>' containment reference.
	 * @see #setCorrelationPropertyBinding(CorrelationPropertyBinding)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CorrelationPropertyBinding()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CorrelationPropertyBinding getCorrelationPropertyBinding();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Binding</em>' containment reference.
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 */
	void setCorrelationPropertyBinding(CorrelationPropertyBinding value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Retrieval Expression</em>' containment reference.
	 * @see #setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CorrelationPropertyRetrievalExpression()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Retrieval Expression</em>' containment reference.
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	void setCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Subscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Subscription</em>' containment reference.
	 * @see #setCorrelationSubscription(CorrelationSubscription)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_CorrelationSubscription()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	CorrelationSubscription getCorrelationSubscription();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getCorrelationSubscription <em>Correlation Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Subscription</em>' containment reference.
	 * @see #getCorrelationSubscription()
	 * @generated
	 */
	void setCorrelationSubscription(CorrelationSubscription value);

	/**
	 * Returns the value of the '<em><b>Data Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Association</em>' containment reference.
	 * @see #setDataAssociation(DataAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataAssociation getDataAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataAssociation <em>Data Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Association</em>' containment reference.
	 * @see #getDataAssociation()
	 * @generated
	 */
	void setDataAssociation(DataAssociation value);

	/**
	 * Returns the value of the '<em><b>Data Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input</em>' containment reference.
	 * @see #setDataInput(DataInput)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataInput()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataInput getDataInput();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInput <em>Data Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Input</em>' containment reference.
	 * @see #getDataInput()
	 * @generated
	 */
	void setDataInput(DataInput value);

	/**
	 * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Association</em>' containment reference.
	 * @see #setDataInputAssociation(DataInputAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataInputAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataInputAssociation getDataInputAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataInputAssociation <em>Data Input Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Input Association</em>' containment reference.
	 * @see #getDataInputAssociation()
	 * @generated
	 */
	void setDataInputAssociation(DataInputAssociation value);

	/**
	 * Returns the value of the '<em><b>Data Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object</em>' containment reference.
	 * @see #setDataObject(DataObject)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataObject()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataObject getDataObject();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObject <em>Data Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object</em>' containment reference.
	 * @see #getDataObject()
	 * @generated
	 */
	void setDataObject(DataObject value);

	/**
	 * Returns the value of the '<em><b>Data Object Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Reference</em>' containment reference.
	 * @see #setDataObjectReference(DataObjectReference)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataObjectReference()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataObjectReference getDataObjectReference();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataObjectReference <em>Data Object Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Reference</em>' containment reference.
	 * @see #getDataObjectReference()
	 * @generated
	 */
	void setDataObjectReference(DataObjectReference value);

	/**
	 * Returns the value of the '<em><b>Data Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output</em>' containment reference.
	 * @see #setDataOutput(DataOutput)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataOutput()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataOutput getDataOutput();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutput <em>Data Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Output</em>' containment reference.
	 * @see #getDataOutput()
	 * @generated
	 */
	void setDataOutput(DataOutput value);

	/**
	 * Returns the value of the '<em><b>Data Output Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Association</em>' containment reference.
	 * @see #setDataOutputAssociation(DataOutputAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataOutputAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataOutputAssociation getDataOutputAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataOutputAssociation <em>Data Output Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Output Association</em>' containment reference.
	 * @see #getDataOutputAssociation()
	 * @generated
	 */
	void setDataOutputAssociation(DataOutputAssociation value);

	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(DataState)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataState()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataState getDataState();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(DataState value);

	/**
	 * Returns the value of the '<em><b>Data Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Store</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store</em>' containment reference.
	 * @see #setDataStore(DataStore)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataStore()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataStore getDataStore();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStore <em>Data Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store</em>' containment reference.
	 * @see #getDataStore()
	 * @generated
	 */
	void setDataStore(DataStore value);

	/**
	 * Returns the value of the '<em><b>Data Store Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Store Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Reference</em>' containment reference.
	 * @see #setDataStoreReference(DataStoreReference)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_DataStoreReference()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	DataStoreReference getDataStoreReference();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDataStoreReference <em>Data Store Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Reference</em>' containment reference.
	 * @see #getDataStoreReference()
	 * @generated
	 */
	void setDataStoreReference(DataStoreReference value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(Definitions)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Definitions()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Definitions getDefinitions();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(Definitions value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Documentation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Documentation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Documentation getDocumentation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Documentation value);

	/**
	 * Returns the value of the '<em><b>End Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Event</em>' containment reference.
	 * @see #setEndEvent(EndEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_EndEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EndEvent getEndEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndEvent <em>End Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Event</em>' containment reference.
	 * @see #getEndEvent()
	 * @generated
	 */
	void setEndEvent(EndEvent value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' containment reference.
	 * @see #setEndPoint(EndPoint)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_EndPoint()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EndPoint getEndPoint();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEndPoint <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' containment reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(EndPoint value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference.
	 * @see #setError(org.emftrace.metamodel.BPMN2Model.Error)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Error()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	org.emftrace.metamodel.BPMN2Model.Error getError();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getError <em>Error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' containment reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(org.emftrace.metamodel.BPMN2Model.Error value);

	/**
	 * Returns the value of the '<em><b>Error Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Event Definition</em>' containment reference.
	 * @see #setErrorEventDefinition(ErrorEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ErrorEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ErrorEventDefinition getErrorEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getErrorEventDefinition <em>Error Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Event Definition</em>' containment reference.
	 * @see #getErrorEventDefinition()
	 * @generated
	 */
	void setErrorEventDefinition(ErrorEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Escalation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escalation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation</em>' containment reference.
	 * @see #setEscalation(Escalation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Escalation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Escalation getEscalation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalation <em>Escalation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation</em>' containment reference.
	 * @see #getEscalation()
	 * @generated
	 */
	void setEscalation(Escalation value);

	/**
	 * Returns the value of the '<em><b>Escalation Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escalation Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Event Definition</em>' containment reference.
	 * @see #setEscalationEventDefinition(EscalationEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_EscalationEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EscalationEventDefinition getEscalationEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Event Definition</em>' containment reference.
	 * @see #getEscalationEventDefinition()
	 * @generated
	 */
	void setEscalationEventDefinition(EscalationEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Event()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Event Based Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Based Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Based Gateway</em>' containment reference.
	 * @see #setEventBasedGateway(EventBasedGateway)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_EventBasedGateway()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EventBasedGateway getEventBasedGateway();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getEventBasedGateway <em>Event Based Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Based Gateway</em>' containment reference.
	 * @see #getEventBasedGateway()
	 * @generated
	 */
	void setEventBasedGateway(EventBasedGateway value);

	/**
	 * Returns the value of the '<em><b>Exclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Gateway</em>' containment reference.
	 * @see #setExclusiveGateway(ExclusiveGateway)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ExclusiveGateway()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ExclusiveGateway getExclusiveGateway();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExclusiveGateway <em>Exclusive Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Gateway</em>' containment reference.
	 * @see #getExclusiveGateway()
	 * @generated
	 */
	void setExclusiveGateway(ExclusiveGateway value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Expression()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Extension)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Extension()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Extension getExtension();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Extension value);

	/**
	 * Returns the value of the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Elements</em>' containment reference.
	 * @see #setExtensionElements(ExtensionAttributeValue)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ExtensionElements()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ExtensionAttributeValue getExtensionElements();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getExtensionElements <em>Extension Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Elements</em>' containment reference.
	 * @see #getExtensionElements()
	 * @generated
	 */
	void setExtensionElements(ExtensionAttributeValue value);

	/**
	 * Returns the value of the '<em><b>Flow Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Node</em>' containment reference.
	 * @see #setFlowNode(FlowNode)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_FlowNode()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	FlowNode getFlowNode();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFlowNode <em>Flow Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Node</em>' containment reference.
	 * @see #getFlowNode()
	 * @generated
	 */
	void setFlowNode(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Formal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Expression</em>' containment reference.
	 * @see #setFormalExpression(FormalExpression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_FormalExpression()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	FormalExpression getFormalExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getFormalExpression <em>Formal Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Expression</em>' containment reference.
	 * @see #getFormalExpression()
	 * @generated
	 */
	void setFormalExpression(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference.
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Gateway()
	 * @model containment="true" upper="-2" changeable="false" derived="true"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Returns the value of the '<em><b>Global Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Business Rule Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Business Rule Task</em>' containment reference.
	 * @see #setGlobalBusinessRuleTask(GlobalBusinessRuleTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalBusinessRuleTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalBusinessRuleTask getGlobalBusinessRuleTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Business Rule Task</em>' containment reference.
	 * @see #getGlobalBusinessRuleTask()
	 * @generated
	 */
	void setGlobalBusinessRuleTask(GlobalBusinessRuleTask value);

	/**
	 * Returns the value of the '<em><b>Global Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Choreography Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Choreography Task</em>' containment reference.
	 * @see #setGlobalChoreographyTask(GlobalChoreographyTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalChoreographyTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalChoreographyTask getGlobalChoreographyTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Choreography Task</em>' containment reference.
	 * @see #getGlobalChoreographyTask()
	 * @generated
	 */
	void setGlobalChoreographyTask(GlobalChoreographyTask value);

	/**
	 * Returns the value of the '<em><b>Global Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Conversation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Conversation</em>' containment reference.
	 * @see #setGlobalConversation(GlobalConversation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalConversation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalConversation getGlobalConversation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalConversation <em>Global Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Conversation</em>' containment reference.
	 * @see #getGlobalConversation()
	 * @generated
	 */
	void setGlobalConversation(GlobalConversation value);

	/**
	 * Returns the value of the '<em><b>Global Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Manual Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Manual Task</em>' containment reference.
	 * @see #setGlobalManualTask(GlobalManualTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalManualTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalManualTask getGlobalManualTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalManualTask <em>Global Manual Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Manual Task</em>' containment reference.
	 * @see #getGlobalManualTask()
	 * @generated
	 */
	void setGlobalManualTask(GlobalManualTask value);

	/**
	 * Returns the value of the '<em><b>Global Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Script Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Script Task</em>' containment reference.
	 * @see #setGlobalScriptTask(GlobalScriptTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalScriptTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalScriptTask getGlobalScriptTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalScriptTask <em>Global Script Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Script Task</em>' containment reference.
	 * @see #getGlobalScriptTask()
	 * @generated
	 */
	void setGlobalScriptTask(GlobalScriptTask value);

	/**
	 * Returns the value of the '<em><b>Global Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Task</em>' containment reference.
	 * @see #setGlobalTask(GlobalTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalTask getGlobalTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalTask <em>Global Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Task</em>' containment reference.
	 * @see #getGlobalTask()
	 * @generated
	 */
	void setGlobalTask(GlobalTask value);

	/**
	 * Returns the value of the '<em><b>Global User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global User Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global User Task</em>' containment reference.
	 * @see #setGlobalUserTask(GlobalUserTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_GlobalUserTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	GlobalUserTask getGlobalUserTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGlobalUserTask <em>Global User Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global User Task</em>' containment reference.
	 * @see #getGlobalUserTask()
	 * @generated
	 */
	void setGlobalUserTask(GlobalUserTask value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Human Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Performer</em>' containment reference.
	 * @see #setHumanPerformer(HumanPerformer)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_HumanPerformer()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	HumanPerformer getHumanPerformer();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getHumanPerformer <em>Human Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Performer</em>' containment reference.
	 * @see #getHumanPerformer()
	 * @generated
	 */
	void setHumanPerformer(HumanPerformer value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Performer)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Performer()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Performer getPerformer();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Performer value);

	/**
	 * Returns the value of the '<em><b>Resource Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Role</em>' containment reference.
	 * @see #setResourceRole(ResourceRole)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ResourceRole()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ResourceRole getResourceRole();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceRole <em>Resource Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Role</em>' containment reference.
	 * @see #getResourceRole()
	 * @generated
	 */
	void setResourceRole(ResourceRole value);

	/**
	 * Returns the value of the '<em><b>Implicit Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Throw Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Throw Event</em>' containment reference.
	 * @see #setImplicitThrowEvent(ImplicitThrowEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ImplicitThrowEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ImplicitThrowEvent getImplicitThrowEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Throw Event</em>' containment reference.
	 * @see #getImplicitThrowEvent()
	 * @generated
	 */
	void setImplicitThrowEvent(ImplicitThrowEvent value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(Import)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Import()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Inclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclusive Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive Gateway</em>' containment reference.
	 * @see #setInclusiveGateway(InclusiveGateway)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_InclusiveGateway()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	InclusiveGateway getInclusiveGateway();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInclusiveGateway <em>Inclusive Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive Gateway</em>' containment reference.
	 * @see #getInclusiveGateway()
	 * @generated
	 */
	void setInclusiveGateway(InclusiveGateway value);

	/**
	 * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set</em>' containment reference.
	 * @see #setInputSet(InputSet)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_InputSet()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	InputSet getInputSet();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInputSet <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Set</em>' containment reference.
	 * @see #getInputSet()
	 * @generated
	 */
	void setInputSet(InputSet value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Interface()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Intermediate Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Catch Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Catch Event</em>' containment reference.
	 * @see #setIntermediateCatchEvent(IntermediateCatchEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_IntermediateCatchEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	IntermediateCatchEvent getIntermediateCatchEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Catch Event</em>' containment reference.
	 * @see #getIntermediateCatchEvent()
	 * @generated
	 */
	void setIntermediateCatchEvent(IntermediateCatchEvent value);

	/**
	 * Returns the value of the '<em><b>Intermediate Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Throw Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Throw Event</em>' containment reference.
	 * @see #setIntermediateThrowEvent(IntermediateThrowEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_IntermediateThrowEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	IntermediateThrowEvent getIntermediateThrowEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Throw Event</em>' containment reference.
	 * @see #getIntermediateThrowEvent()
	 * @generated
	 */
	void setIntermediateThrowEvent(IntermediateThrowEvent value);

	/**
	 * Returns the value of the '<em><b>Io Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Binding</em>' containment reference.
	 * @see #setIoBinding(InputOutputBinding)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_IoBinding()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	InputOutputBinding getIoBinding();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoBinding <em>Io Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Binding</em>' containment reference.
	 * @see #getIoBinding()
	 * @generated
	 */
	void setIoBinding(InputOutputBinding value);

	/**
	 * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Specification</em>' containment reference.
	 * @see #setIoSpecification(InputOutputSpecification)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_IoSpecification()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	InputOutputSpecification getIoSpecification();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getIoSpecification <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Specification</em>' containment reference.
	 * @see #getIoSpecification()
	 * @generated
	 */
	void setIoSpecification(InputOutputSpecification value);

	/**
	 * Returns the value of the '<em><b>Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Definition</em>' containment reference.
	 * @see #setItemDefinition(ItemDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ItemDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ItemDefinition getItemDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getItemDefinition <em>Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Definition</em>' containment reference.
	 * @see #getItemDefinition()
	 * @generated
	 */
	void setItemDefinition(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Lane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane</em>' containment reference.
	 * @see #setLane(Lane)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Lane()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Lane getLane();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLane <em>Lane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lane</em>' containment reference.
	 * @see #getLane()
	 * @generated
	 */
	void setLane(Lane value);

	/**
	 * Returns the value of the '<em><b>Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane Set</em>' containment reference.
	 * @see #setLaneSet(LaneSet)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_LaneSet()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	LaneSet getLaneSet();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLaneSet <em>Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lane Set</em>' containment reference.
	 * @see #getLaneSet()
	 * @generated
	 */
	void setLaneSet(LaneSet value);

	/**
	 * Returns the value of the '<em><b>Link Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Event Definition</em>' containment reference.
	 * @see #setLinkEventDefinition(LinkEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_LinkEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	LinkEventDefinition getLinkEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLinkEventDefinition <em>Link Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Event Definition</em>' containment reference.
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	void setLinkEventDefinition(LinkEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Characteristics</em>' containment reference.
	 * @see #setLoopCharacteristics(LoopCharacteristics)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_LoopCharacteristics()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	LoopCharacteristics getLoopCharacteristics();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getLoopCharacteristics <em>Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Characteristics</em>' containment reference.
	 * @see #getLoopCharacteristics()
	 * @generated
	 */
	void setLoopCharacteristics(LoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Task</em>' containment reference.
	 * @see #setManualTask(ManualTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ManualTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ManualTask getManualTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getManualTask <em>Manual Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Task</em>' containment reference.
	 * @see #getManualTask()
	 * @generated
	 */
	void setManualTask(ManualTask value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Message()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Message Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Event Definition</em>' containment reference.
	 * @see #setMessageEventDefinition(MessageEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_MessageEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	MessageEventDefinition getMessageEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageEventDefinition <em>Message Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Event Definition</em>' containment reference.
	 * @see #getMessageEventDefinition()
	 * @generated
	 */
	void setMessageEventDefinition(MessageEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Message Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow</em>' containment reference.
	 * @see #setMessageFlow(MessageFlow)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_MessageFlow()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	MessageFlow getMessageFlow();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlow <em>Message Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Flow</em>' containment reference.
	 * @see #getMessageFlow()
	 * @generated
	 */
	void setMessageFlow(MessageFlow value);

	/**
	 * Returns the value of the '<em><b>Message Flow Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Association</em>' containment reference.
	 * @see #setMessageFlowAssociation(MessageFlowAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_MessageFlowAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	MessageFlowAssociation getMessageFlowAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMessageFlowAssociation <em>Message Flow Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Flow Association</em>' containment reference.
	 * @see #getMessageFlowAssociation()
	 * @generated
	 */
	void setMessageFlowAssociation(MessageFlowAssociation value);

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' containment reference.
	 * @see #setMonitoring(Monitoring)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Monitoring()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Monitoring getMonitoring();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMonitoring <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' containment reference.
	 * @see #getMonitoring()
	 * @generated
	 */
	void setMonitoring(Monitoring value);

	/**
	 * Returns the value of the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Instance Loop Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Instance Loop Characteristics</em>' containment reference.
	 * @see #setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_MultiInstanceLoopCharacteristics()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	MultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Instance Loop Characteristics</em>' containment reference.
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	void setMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Operation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set</em>' containment reference.
	 * @see #setOutputSet(OutputSet)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_OutputSet()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	OutputSet getOutputSet();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getOutputSet <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Set</em>' containment reference.
	 * @see #getOutputSet()
	 * @generated
	 */
	void setOutputSet(OutputSet value);

	/**
	 * Returns the value of the '<em><b>Parallel Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Gateway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Gateway</em>' containment reference.
	 * @see #setParallelGateway(ParallelGateway)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ParallelGateway()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ParallelGateway getParallelGateway();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParallelGateway <em>Parallel Gateway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Gateway</em>' containment reference.
	 * @see #getParallelGateway()
	 * @generated
	 */
	void setParallelGateway(ParallelGateway value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference.
	 * @see #setParticipant(Participant)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Participant()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipant <em>Participant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' containment reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

	/**
	 * Returns the value of the '<em><b>Participant Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Association</em>' containment reference.
	 * @see #setParticipantAssociation(ParticipantAssociation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ParticipantAssociation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ParticipantAssociation getParticipantAssociation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantAssociation <em>Participant Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Association</em>' containment reference.
	 * @see #getParticipantAssociation()
	 * @generated
	 */
	void setParticipantAssociation(ParticipantAssociation value);

	/**
	 * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #setParticipantMultiplicity(ParticipantMultiplicity)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ParticipantMultiplicity()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ParticipantMultiplicity getParticipantMultiplicity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	void setParticipantMultiplicity(ParticipantMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Partner Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Entity</em>' containment reference.
	 * @see #setPartnerEntity(PartnerEntity)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_PartnerEntity()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	PartnerEntity getPartnerEntity();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerEntity <em>Partner Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Entity</em>' containment reference.
	 * @see #getPartnerEntity()
	 * @generated
	 */
	void setPartnerEntity(PartnerEntity value);

	/**
	 * Returns the value of the '<em><b>Partner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Role</em>' containment reference.
	 * @see #setPartnerRole(PartnerRole)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_PartnerRole()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	PartnerRole getPartnerRole();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPartnerRole <em>Partner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Role</em>' containment reference.
	 * @see #getPartnerRole()
	 * @generated
	 */
	void setPartnerRole(PartnerRole value);

	/**
	 * Returns the value of the '<em><b>Potential Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potential Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Owner</em>' containment reference.
	 * @see #setPotentialOwner(PotentialOwner)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_PotentialOwner()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	PotentialOwner getPotentialOwner();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getPotentialOwner <em>Potential Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potential Owner</em>' containment reference.
	 * @see #getPotentialOwner()
	 * @generated
	 */
	void setPotentialOwner(PotentialOwner value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(org.emftrace.metamodel.BPMN2Model.Process)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Process()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	org.emftrace.metamodel.BPMN2Model.Process getProcess();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.emftrace.metamodel.BPMN2Model.Process value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(Property)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Receive Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Task</em>' containment reference.
	 * @see #setReceiveTask(ReceiveTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ReceiveTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ReceiveTask getReceiveTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getReceiveTask <em>Receive Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Task</em>' containment reference.
	 * @see #getReceiveTask()
	 * @generated
	 */
	void setReceiveTask(ReceiveTask value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Relationship)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Relationship()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference.
	 * @see #setRendering(Rendering)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Rendering()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Rendering getRendering();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getRendering <em>Rendering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' containment reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(Rendering value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Resource()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Assignment Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #setResourceAssignmentExpression(ResourceAssignmentExpression)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ResourceAssignmentExpression()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ResourceAssignmentExpression getResourceAssignmentExpression();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	void setResourceAssignmentExpression(ResourceAssignmentExpression value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter</em>' containment reference.
	 * @see #setResourceParameter(ResourceParameter)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ResourceParameter()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ResourceParameter getResourceParameter();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameter <em>Resource Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Parameter</em>' containment reference.
	 * @see #getResourceParameter()
	 * @generated
	 */
	void setResourceParameter(ResourceParameter value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Binding</em>' containment reference.
	 * @see #setResourceParameterBinding(ResourceParameterBinding)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ResourceParameterBinding()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ResourceParameterBinding getResourceParameterBinding();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Parameter Binding</em>' containment reference.
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	void setResourceParameterBinding(ResourceParameterBinding value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(EObject)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Script()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EObject getScript();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(EObject value);

	/**
	 * Returns the value of the '<em><b>Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Task</em>' containment reference.
	 * @see #setScriptTask(ScriptTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ScriptTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ScriptTask getScriptTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getScriptTask <em>Script Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Task</em>' containment reference.
	 * @see #getScriptTask()
	 * @generated
	 */
	void setScriptTask(ScriptTask value);

	/**
	 * Returns the value of the '<em><b>Send Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Task</em>' containment reference.
	 * @see #setSendTask(SendTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SendTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SendTask getSendTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSendTask <em>Send Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Task</em>' containment reference.
	 * @see #getSendTask()
	 * @generated
	 */
	void setSendTask(SendTask value);

	/**
	 * Returns the value of the '<em><b>Sequence Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Flow</em>' containment reference.
	 * @see #setSequenceFlow(SequenceFlow)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SequenceFlow()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SequenceFlow getSequenceFlow();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSequenceFlow <em>Sequence Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Flow</em>' containment reference.
	 * @see #getSequenceFlow()
	 * @generated
	 */
	void setSequenceFlow(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Service Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Task</em>' containment reference.
	 * @see #setServiceTask(ServiceTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ServiceTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ServiceTask getServiceTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getServiceTask <em>Service Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Task</em>' containment reference.
	 * @see #getServiceTask()
	 * @generated
	 */
	void setServiceTask(ServiceTask value);

	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference.
	 * @see #setSignal(Signal)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Signal()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignal <em>Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' containment reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Signal Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Event Definition</em>' containment reference.
	 * @see #setSignalEventDefinition(SignalEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SignalEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SignalEventDefinition getSignalEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSignalEventDefinition <em>Signal Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Event Definition</em>' containment reference.
	 * @see #getSignalEventDefinition()
	 * @generated
	 */
	void setSignalEventDefinition(SignalEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Loop Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Loop Characteristics</em>' containment reference.
	 * @see #setStandardLoopCharacteristics(StandardLoopCharacteristics)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_StandardLoopCharacteristics()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	StandardLoopCharacteristics getStandardLoopCharacteristics();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Loop Characteristics</em>' containment reference.
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	void setStandardLoopCharacteristics(StandardLoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Start Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Event</em>' containment reference.
	 * @see #setStartEvent(StartEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_StartEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	StartEvent getStartEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getStartEvent <em>Start Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Event</em>' containment reference.
	 * @see #getStartEvent()
	 * @generated
	 */
	void setStartEvent(StartEvent value);

	/**
	 * Returns the value of the '<em><b>Sub Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Choreography</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Choreography</em>' containment reference.
	 * @see #setSubChoreography(SubChoreography)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SubChoreography()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SubChoreography getSubChoreography();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubChoreography <em>Sub Choreography</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Choreography</em>' containment reference.
	 * @see #getSubChoreography()
	 * @generated
	 */
	void setSubChoreography(SubChoreography value);

	/**
	 * Returns the value of the '<em><b>Sub Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Conversation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Conversation</em>' containment reference.
	 * @see #setSubConversation(SubConversation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SubConversation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SubConversation getSubConversation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubConversation <em>Sub Conversation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Conversation</em>' containment reference.
	 * @see #getSubConversation()
	 * @generated
	 */
	void setSubConversation(SubConversation value);

	/**
	 * Returns the value of the '<em><b>Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Process</em>' containment reference.
	 * @see #setSubProcess(SubProcess)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_SubProcess()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	SubProcess getSubProcess();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getSubProcess <em>Sub Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Process</em>' containment reference.
	 * @see #getSubProcess()
	 * @generated
	 */
	void setSubProcess(SubProcess value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Task()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Terminate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminate Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminate Event Definition</em>' containment reference.
	 * @see #setTerminateEventDefinition(TerminateEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_TerminateEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	TerminateEventDefinition getTerminateEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminate Event Definition</em>' containment reference.
	 * @see #getTerminateEventDefinition()
	 * @generated
	 */
	void setTerminateEventDefinition(TerminateEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(EObject)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Text()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	EObject getText();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(EObject value);

	/**
	 * Returns the value of the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Annotation</em>' containment reference.
	 * @see #setTextAnnotation(TextAnnotation)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_TextAnnotation()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	TextAnnotation getTextAnnotation();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTextAnnotation <em>Text Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Annotation</em>' containment reference.
	 * @see #getTextAnnotation()
	 * @generated
	 */
	void setTextAnnotation(TextAnnotation value);

	/**
	 * Returns the value of the '<em><b>Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Event</em>' containment reference.
	 * @see #setThrowEvent(ThrowEvent)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_ThrowEvent()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	ThrowEvent getThrowEvent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getThrowEvent <em>Throw Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw Event</em>' containment reference.
	 * @see #getThrowEvent()
	 * @generated
	 */
	void setThrowEvent(ThrowEvent value);

	/**
	 * Returns the value of the '<em><b>Timer Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Event Definition</em>' containment reference.
	 * @see #setTimerEventDefinition(TimerEventDefinition)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_TimerEventDefinition()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	TimerEventDefinition getTimerEventDefinition();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTimerEventDefinition <em>Timer Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Event Definition</em>' containment reference.
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	void setTimerEventDefinition(TimerEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(Transaction)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_Transaction()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Task</em>' containment reference.
	 * @see #setUserTask(UserTask)
	 * @see org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage#getDocumentRoot_UserTask()
	 * @model containment="true" upper="-2" derived="true"
	 * @generated
	 */
	UserTask getUserTask();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.BPMN2Model.DocumentRoot#getUserTask <em>User Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Task</em>' containment reference.
	 * @see #getUserTask()
	 * @generated
	 */
	void setUserTask(UserTask value);

} // DocumentRoot
