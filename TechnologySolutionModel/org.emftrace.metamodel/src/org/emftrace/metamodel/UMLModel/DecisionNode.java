/**
 */
package org.emftrace.metamodel.UMLModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Input</em>' attribute.
	 * @see #setDecisionInput(String)
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDecisionNode_DecisionInput()
	 * @model
	 * @generated
	 */
	String getDecisionInput();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.UMLModel.DecisionNode#getDecisionInput <em>Decision Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input</em>' attribute.
	 * @see #getDecisionInput()
	 * @generated
	 */
	void setDecisionInput(String value);

} // DecisionNode
