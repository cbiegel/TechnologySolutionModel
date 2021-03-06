/**
 */
package org.emftrace.metamodel.FeatureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.FeatureModel.Constant#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Value {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.emftrace.metamodel.FeatureModel.FeatureModelPackage#getConstant_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.emftrace.metamodel.FeatureModel.Constant#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Constant
