/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolution;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Solutions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionsImpl#getTechnologySolutions <em>Technology Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologySolutionsImpl extends TechnologySolutionBaseImpl implements TechnologySolutions {
	/**
	 * The cached value of the '{@link #getTechnologySolutions() <em>Technology Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologySolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TechnologySolution> technologySolutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TechnologySolution> getTechnologySolutions() {
		if (technologySolutions == null) {
			technologySolutions = new EObjectResolvingEList<TechnologySolution>(TechnologySolution.class, this, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS);
		}
		return technologySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS:
				return getTechnologySolutions();
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS:
				getTechnologySolutions().clear();
				getTechnologySolutions().addAll((Collection<? extends TechnologySolution>)newValue);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS:
				getTechnologySolutions().clear();
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTIONS__TECHNOLOGY_SOLUTIONS:
				return technologySolutions != null && !technologySolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TechnologySolutionsImpl
