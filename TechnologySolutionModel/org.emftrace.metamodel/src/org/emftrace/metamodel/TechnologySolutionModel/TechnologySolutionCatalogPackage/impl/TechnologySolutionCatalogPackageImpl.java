/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftrace.metamodel.TechnologySolutionModel.ASTACatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureCatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalog;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Solution Catalog Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl#getTechnologySolutionCatalog <em>Technology Solution Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl#getTechnologyFeatureCatalog <em>Technology Feature Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl#getTechnologyFeatureEvaluationCatalog <em>Technology Feature Evaluation Catalog</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.impl.TechnologySolutionCatalogPackageImpl#getASTACatalog <em>ASTA Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologySolutionCatalogPackageImpl extends EObjectImpl implements TechnologySolutionCatalogPackage {
	/**
	 * The cached value of the '{@link #getTechnologySolutionCatalog() <em>Technology Solution Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologySolutionCatalog()
	 * @generated
	 * @ordered
	 */
	protected TechnologySolutionCatalog technologySolutionCatalog;

	/**
	 * The cached value of the '{@link #getTechnologyFeatureCatalog() <em>Technology Feature Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyFeatureCatalog()
	 * @generated
	 * @ordered
	 */
	protected TechnologyFeatureCatalog technologyFeatureCatalog;

	/**
	 * The cached value of the '{@link #getTechnologyFeatureEvaluationCatalog() <em>Technology Feature Evaluation Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyFeatureEvaluationCatalog()
	 * @generated
	 * @ordered
	 */
	protected TechnologyFeatureEvaluationCatalog technologyFeatureEvaluationCatalog;

	/**
	 * The cached value of the '{@link #getASTACatalog() <em>ASTA Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASTACatalog()
	 * @generated
	 * @ordered
	 */
	protected ASTACatalog astaCatalog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionCatalogPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionCatalog getTechnologySolutionCatalog() {
		return technologySolutionCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologySolutionCatalog(TechnologySolutionCatalog newTechnologySolutionCatalog, NotificationChain msgs) {
		TechnologySolutionCatalog oldTechnologySolutionCatalog = technologySolutionCatalog;
		technologySolutionCatalog = newTechnologySolutionCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG, oldTechnologySolutionCatalog, newTechnologySolutionCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologySolutionCatalog(TechnologySolutionCatalog newTechnologySolutionCatalog) {
		if (newTechnologySolutionCatalog != technologySolutionCatalog) {
			NotificationChain msgs = null;
			if (technologySolutionCatalog != null)
				msgs = ((InternalEObject)technologySolutionCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG, null, msgs);
			if (newTechnologySolutionCatalog != null)
				msgs = ((InternalEObject)newTechnologySolutionCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG, null, msgs);
			msgs = basicSetTechnologySolutionCatalog(newTechnologySolutionCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG, newTechnologySolutionCatalog, newTechnologySolutionCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureCatalog getTechnologyFeatureCatalog() {
		return technologyFeatureCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologyFeatureCatalog(TechnologyFeatureCatalog newTechnologyFeatureCatalog, NotificationChain msgs) {
		TechnologyFeatureCatalog oldTechnologyFeatureCatalog = technologyFeatureCatalog;
		technologyFeatureCatalog = newTechnologyFeatureCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG, oldTechnologyFeatureCatalog, newTechnologyFeatureCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologyFeatureCatalog(TechnologyFeatureCatalog newTechnologyFeatureCatalog) {
		if (newTechnologyFeatureCatalog != technologyFeatureCatalog) {
			NotificationChain msgs = null;
			if (technologyFeatureCatalog != null)
				msgs = ((InternalEObject)technologyFeatureCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG, null, msgs);
			if (newTechnologyFeatureCatalog != null)
				msgs = ((InternalEObject)newTechnologyFeatureCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG, null, msgs);
			msgs = basicSetTechnologyFeatureCatalog(newTechnologyFeatureCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG, newTechnologyFeatureCatalog, newTechnologyFeatureCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyFeatureEvaluationCatalog getTechnologyFeatureEvaluationCatalog() {
		return technologyFeatureEvaluationCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologyFeatureEvaluationCatalog(TechnologyFeatureEvaluationCatalog newTechnologyFeatureEvaluationCatalog, NotificationChain msgs) {
		TechnologyFeatureEvaluationCatalog oldTechnologyFeatureEvaluationCatalog = technologyFeatureEvaluationCatalog;
		technologyFeatureEvaluationCatalog = newTechnologyFeatureEvaluationCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG, oldTechnologyFeatureEvaluationCatalog, newTechnologyFeatureEvaluationCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologyFeatureEvaluationCatalog(TechnologyFeatureEvaluationCatalog newTechnologyFeatureEvaluationCatalog) {
		if (newTechnologyFeatureEvaluationCatalog != technologyFeatureEvaluationCatalog) {
			NotificationChain msgs = null;
			if (technologyFeatureEvaluationCatalog != null)
				msgs = ((InternalEObject)technologyFeatureEvaluationCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG, null, msgs);
			if (newTechnologyFeatureEvaluationCatalog != null)
				msgs = ((InternalEObject)newTechnologyFeatureEvaluationCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG, null, msgs);
			msgs = basicSetTechnologyFeatureEvaluationCatalog(newTechnologyFeatureEvaluationCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG, newTechnologyFeatureEvaluationCatalog, newTechnologyFeatureEvaluationCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTACatalog getASTACatalog() {
		return astaCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetASTACatalog(ASTACatalog newASTACatalog, NotificationChain msgs) {
		ASTACatalog oldASTACatalog = astaCatalog;
		astaCatalog = newASTACatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG, oldASTACatalog, newASTACatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setASTACatalog(ASTACatalog newASTACatalog) {
		if (newASTACatalog != astaCatalog) {
			NotificationChain msgs = null;
			if (astaCatalog != null)
				msgs = ((InternalEObject)astaCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG, null, msgs);
			if (newASTACatalog != null)
				msgs = ((InternalEObject)newASTACatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG, null, msgs);
			msgs = basicSetASTACatalog(newASTACatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG, newASTACatalog, newASTACatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
				return basicSetTechnologySolutionCatalog(null, msgs);
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
				return basicSetTechnologyFeatureCatalog(null, msgs);
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
				return basicSetTechnologyFeatureEvaluationCatalog(null, msgs);
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				return basicSetASTACatalog(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
				return getTechnologySolutionCatalog();
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
				return getTechnologyFeatureCatalog();
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
				return getTechnologyFeatureEvaluationCatalog();
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				return getASTACatalog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
				setTechnologySolutionCatalog((TechnologySolutionCatalog)newValue);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
				setTechnologyFeatureCatalog((TechnologyFeatureCatalog)newValue);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
				setTechnologyFeatureEvaluationCatalog((TechnologyFeatureEvaluationCatalog)newValue);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				setASTACatalog((ASTACatalog)newValue);
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
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
				setTechnologySolutionCatalog((TechnologySolutionCatalog)null);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
				setTechnologyFeatureCatalog((TechnologyFeatureCatalog)null);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
				setTechnologyFeatureEvaluationCatalog((TechnologyFeatureEvaluationCatalog)null);
				return;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				setASTACatalog((ASTACatalog)null);
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
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
				return technologySolutionCatalog != null;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
				return technologyFeatureCatalog != null;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
				return technologyFeatureEvaluationCatalog != null;
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				return astaCatalog != null;
		}
		return super.eIsSet(featureID);
	}

} //TechnologySolutionCatalogPackageImpl
