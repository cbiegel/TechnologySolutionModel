/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironment;
import org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Environments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.DevelopmentEnvironmentsImpl#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentEnvironmentsImpl extends TechnologySolutionBaseImpl implements DevelopmentEnvironments {
	/**
	 * The cached value of the '{@link #getDevelopmentEnvironments() <em>Development Environments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<DevelopmentEnvironment> developmentEnvironments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEnvironmentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.DEVELOPMENT_ENVIRONMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevelopmentEnvironment> getDevelopmentEnvironments() {
		if (developmentEnvironments == null) {
			developmentEnvironments = new EObjectResolvingEList<DevelopmentEnvironment>(DevelopmentEnvironment.class, this, TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS);
		}
		return developmentEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS:
				return getDevelopmentEnvironments();
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
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS:
				getDevelopmentEnvironments().clear();
				getDevelopmentEnvironments().addAll((Collection<? extends DevelopmentEnvironment>)newValue);
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
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS:
				getDevelopmentEnvironments().clear();
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
			case TechnologySolutionModelPackage.DEVELOPMENT_ENVIRONMENTS__DEVELOPMENT_ENVIRONMENTS:
				return developmentEnvironments != null && !developmentEnvironments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DevelopmentEnvironmentsImpl
