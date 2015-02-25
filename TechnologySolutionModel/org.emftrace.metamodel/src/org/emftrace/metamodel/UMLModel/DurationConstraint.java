/**
 */
package org.emftrace.metamodel.UMLModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.DurationConstraint#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDurationConstraint()
 * @model
 * @generated
 */
public interface DurationConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Event</em>' attribute list.
	 * @see org.emftrace.metamodel.UMLModel.UMLModelPackage#getDurationConstraint_FirstEvent()
	 * @model default="true" dataType="org.emftrace.metamodel.UMLModel.Boolean" upper="2" ordered="false"
	 * @generated
	 */
	EList<Boolean> getFirstEvent();

} // DurationConstraint