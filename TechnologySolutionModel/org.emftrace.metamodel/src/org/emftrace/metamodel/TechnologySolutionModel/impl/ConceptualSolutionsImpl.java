/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolution;
import org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptual Solutions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.ConceptualSolutionsImpl#getConceptualSolutions <em>Conceptual Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualSolutionsImpl extends TechnologySolutionBaseImpl implements ConceptualSolutions {
	/**
	 * The cached value of the '{@link #getConceptualSolutions() <em>Conceptual Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptualSolution> conceptualSolutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualSolutionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.CONCEPTUAL_SOLUTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptualSolution> getConceptualSolutions() {
		if (conceptualSolutions == null) {
			conceptualSolutions = new EObjectResolvingEList<ConceptualSolution>(ConceptualSolution.class, this, TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS);
		}
		return conceptualSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS:
				return getConceptualSolutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS:
				getConceptualSolutions().clear();
				getConceptualSolutions().addAll((Collection<? extends ConceptualSolution>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS:
				getConceptualSolutions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TechnologySolutionModelPackage.CONCEPTUAL_SOLUTIONS__CONCEPTUAL_SOLUTIONS:
				return conceptualSolutions != null && !conceptualSolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptualSolutionsImpl
