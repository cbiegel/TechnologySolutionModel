/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.TechnologySolutionModel.ConceptualSolutions;
import org.emftrace.metamodel.TechnologySolutionModel.DevelopmentEnvironments;
import org.emftrace.metamodel.TechnologySolutionModel.Relations;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Solution Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl#getTechnologySolutions <em>Technology Solutions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl#getConceptualSolutions <em>Conceptual Solutions</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl#getDevelopmentEnvironments <em>Development Environments</em>}</li>
 *   <li>{@link org.emftrace.metamodel.TechnologySolutionModel.impl.TechnologySolutionModelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologySolutionModelImpl extends TechnologySolutionBaseImpl implements TechnologySolutionModel {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechnologySolutions() <em>Technology Solutions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologySolutions()
	 * @generated
	 * @ordered
	 */
	protected TechnologySolutions technologySolutions;

	/**
	 * The cached value of the '{@link #getConceptualSolutions() <em>Conceptual Solutions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualSolutions()
	 * @generated
	 * @ordered
	 */
	protected ConceptualSolutions conceptualSolutions;

	/**
	 * The cached value of the '{@link #getDevelopmentEnvironments() <em>Development Environments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopmentEnvironments()
	 * @generated
	 * @ordered
	 */
	protected DevelopmentEnvironments developmentEnvironments;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected Relations relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologySolutionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutions getTechnologySolutions() {
		return technologySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologySolutions(TechnologySolutions newTechnologySolutions, NotificationChain msgs) {
		TechnologySolutions oldTechnologySolutions = technologySolutions;
		technologySolutions = newTechnologySolutions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS, oldTechnologySolutions, newTechnologySolutions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologySolutions(TechnologySolutions newTechnologySolutions) {
		if (newTechnologySolutions != technologySolutions) {
			NotificationChain msgs = null;
			if (technologySolutions != null)
				msgs = ((InternalEObject)technologySolutions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS, null, msgs);
			if (newTechnologySolutions != null)
				msgs = ((InternalEObject)newTechnologySolutions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS, null, msgs);
			msgs = basicSetTechnologySolutions(newTechnologySolutions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS, newTechnologySolutions, newTechnologySolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptualSolutions getConceptualSolutions() {
		return conceptualSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptualSolutions(ConceptualSolutions newConceptualSolutions, NotificationChain msgs) {
		ConceptualSolutions oldConceptualSolutions = conceptualSolutions;
		conceptualSolutions = newConceptualSolutions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS, oldConceptualSolutions, newConceptualSolutions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptualSolutions(ConceptualSolutions newConceptualSolutions) {
		if (newConceptualSolutions != conceptualSolutions) {
			NotificationChain msgs = null;
			if (conceptualSolutions != null)
				msgs = ((InternalEObject)conceptualSolutions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS, null, msgs);
			if (newConceptualSolutions != null)
				msgs = ((InternalEObject)newConceptualSolutions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS, null, msgs);
			msgs = basicSetConceptualSolutions(newConceptualSolutions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS, newConceptualSolutions, newConceptualSolutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEnvironments getDevelopmentEnvironments() {
		return developmentEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevelopmentEnvironments(DevelopmentEnvironments newDevelopmentEnvironments, NotificationChain msgs) {
		DevelopmentEnvironments oldDevelopmentEnvironments = developmentEnvironments;
		developmentEnvironments = newDevelopmentEnvironments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS, oldDevelopmentEnvironments, newDevelopmentEnvironments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopmentEnvironments(DevelopmentEnvironments newDevelopmentEnvironments) {
		if (newDevelopmentEnvironments != developmentEnvironments) {
			NotificationChain msgs = null;
			if (developmentEnvironments != null)
				msgs = ((InternalEObject)developmentEnvironments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS, null, msgs);
			if (newDevelopmentEnvironments != null)
				msgs = ((InternalEObject)newDevelopmentEnvironments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS, null, msgs);
			msgs = basicSetDevelopmentEnvironments(newDevelopmentEnvironments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS, newDevelopmentEnvironments, newDevelopmentEnvironments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations getRelations() {
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelations(Relations newRelations, NotificationChain msgs) {
		Relations oldRelations = relations;
		relations = newRelations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS, oldRelations, newRelations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelations(Relations newRelations) {
		if (newRelations != relations) {
			NotificationChain msgs = null;
			if (relations != null)
				msgs = ((InternalEObject)relations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS, null, msgs);
			if (newRelations != null)
				msgs = ((InternalEObject)newRelations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS, null, msgs);
			msgs = basicSetRelations(newRelations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS, newRelations, newRelations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
				return basicSetTechnologySolutions(null, msgs);
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
				return basicSetConceptualSolutions(null, msgs);
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
				return basicSetDevelopmentEnvironments(null, msgs);
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
				return basicSetRelations(null, msgs);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION:
				return getVersion();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
				return getTechnologySolutions();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
				return getConceptualSolutions();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
				return getDevelopmentEnvironments();
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
				return getRelations();
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
				setTechnologySolutions((TechnologySolutions)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
				setConceptualSolutions((ConceptualSolutions)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
				setDevelopmentEnvironments((DevelopmentEnvironments)newValue);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
				setRelations((Relations)newValue);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
				setTechnologySolutions((TechnologySolutions)null);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
				setConceptualSolutions((ConceptualSolutions)null);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
				setDevelopmentEnvironments((DevelopmentEnvironments)null);
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
				setRelations((Relations)null);
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
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
				return technologySolutions != null;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
				return conceptualSolutions != null;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
				return developmentEnvironments != null;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
				return relations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //TechnologySolutionModelImpl
