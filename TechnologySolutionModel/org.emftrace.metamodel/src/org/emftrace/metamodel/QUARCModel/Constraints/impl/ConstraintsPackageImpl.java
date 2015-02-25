/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

import org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.BaseConditionOperators;
import org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.Constraint;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsBase;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalConnectiveTypes;
import org.emftrace.metamodel.QUARCModel.Constraints.LogicalValues;
import org.emftrace.metamodel.QUARCModel.Constraints.NumericalTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.Precondition;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSet;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalProperty;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertyCategory;
import org.emftrace.metamodel.QUARCModel.Constraints.ToleranceTypes;

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

import org.emftrace.metamodel.UMLModel.UMLModelPackage;

import org.emftrace.metamodel.UMLModel.impl.UMLModelPackageImpl;

import org.emftrace.metamodel.URNModel.URNModelPackage;

import org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedConstraintSetEClass = null;

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
	private EClass preconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularExpressionTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalTechnicalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalPropertiesCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedConstraintSetCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalPropertyCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalConnectiveTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baseConditionOperatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum toleranceTypesEEnum = null;

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
	 * @see org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited) return (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintsPackageImpl());

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
		UMLModelPackageImpl theUMLModelPackage = (UMLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) instanceof UMLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLModelPackage.eNS_URI) : UMLModelPackage.eINSTANCE);
		BPMN2ModelPackageImpl theBPMN2ModelPackage = (BPMN2ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) instanceof BPMN2ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN2ModelPackage.eNS_URI) : BPMN2ModelPackage.eINSTANCE);
		EMFfitModelPackageImpl theEMFfitModelPackage = (EMFfitModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) instanceof EMFfitModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EMFfitModelPackage.eNS_URI) : EMFfitModelPackage.eINSTANCE);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) instanceof GSSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI) : GSSPackage.eINSTANCE);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI) : QueryPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		TechnologySolutionModelPackageImpl theTechnologySolutionModelPackage = (TechnologySolutionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionModelPackage.eNS_URI) instanceof TechnologySolutionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionModelPackage.eNS_URI) : TechnologySolutionModelPackage.eINSTANCE);
		TechnologySolutionCatalogPackagePackageImpl theTechnologySolutionCatalogPackagePackage = (TechnologySolutionCatalogPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) instanceof TechnologySolutionCatalogPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologySolutionCatalogPackagePackage.eNS_URI) : TechnologySolutionCatalogPackagePackage.eINSTANCE);
		ChangeModelPackageImpl theChangeModelPackage = (ChangeModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) instanceof ChangeModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChangeModelPackage.eNS_URI) : ChangeModelPackage.eINSTANCE);

		// Load packages
		theOWLModelPackage.loadPackage();
		theUMLModelPackage.loadPackage();
		theBPMN2ModelPackage.loadPackage();

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();
		theLinkModelPackage.createPackageContents();
		theRuleModelPackage.createPackageContents();
		theReportModelPackage.createPackageContents();
		theFeatureModelPackage.createPackageContents();
		theURNModelPackage.createPackageContents();
		theEMFfitModelPackage.createPackageContents();
		theGSSPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theTechnologySolutionModelPackage.createPackageContents();
		theTechnologySolutionCatalogPackagePackage.createPackageContents();
		theChangeModelPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();
		theLinkModelPackage.initializePackageContents();
		theRuleModelPackage.initializePackageContents();
		theReportModelPackage.initializePackageContents();
		theFeatureModelPackage.initializePackageContents();
		theURNModelPackage.initializePackageContents();
		theEMFfitModelPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theTechnologySolutionModelPackage.initializePackageContents();
		theTechnologySolutionCatalogPackagePackage.initializePackageContents();
		theChangeModelPackage.initializePackageContents();

		// Fix loaded packages
		theOWLModelPackage.fixPackageContents();
		theUMLModelPackage.fixPackageContents();
		theBPMN2ModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsBase() {
		return constraintsBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalProperty() {
		return technicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnicalProperty_Name() {
		return (EAttribute)technicalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnicalProperty_Alias() {
		return (EAttribute)technicalPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnicalProperty_Description() {
		return (EAttribute)technicalPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnicalProperty_Entries() {
		return (EReference)technicalPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicCondition() {
		return logicConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicCondition_LogicalConnectiveType() {
		return (EAttribute)logicConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicCondition_LogicConditions() {
		return (EReference)logicConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicCondition_BaseConditions() {
		return (EReference)logicConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseCondition() {
		return baseConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseCondition_TechnicalProperty() {
		return (EReference)baseConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCondition_Operator() {
		return (EAttribute)baseConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCondition_Value() {
		return (EAttribute)baseConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCondition_Tolerance() {
		return (EAttribute)baseConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseCondition_ToleranceType() {
		return (EAttribute)baseConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedConstraintSet() {
		return predefinedConstraintSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedConstraintSet_Name() {
		return (EAttribute)predefinedConstraintSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedConstraintSet_Description() {
		return (EAttribute)predefinedConstraintSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredefinedConstraintSet_Constraints() {
		return (EReference)predefinedConstraintSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecondition() {
		return preconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringTechnicalProperty() {
		return stringTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerTechnicalProperty() {
		return integerTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanTechnicalProperty() {
		return booleanTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatTechnicalProperty() {
		return floatTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularExpressionTechnicalProperty() {
		return regularExpressionTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTechnicalProperty() {
		return enumTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumTechnicalProperty_PossibleValues() {
		return (EAttribute)enumTechnicalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalTechnicalProperty() {
		return numericalTechnicalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalTechnicalProperty_Unit() {
		return (EAttribute)numericalTechnicalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalTechnicalProperty_Min() {
		return (EAttribute)numericalTechnicalPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalTechnicalProperty_Max() {
		return (EAttribute)numericalTechnicalPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalTechnicalProperty_UnitDescription() {
		return (EAttribute)numericalTechnicalPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalPropertiesCatalogue() {
		return technicalPropertiesCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnicalPropertiesCatalogue_CatalogueProperties() {
		return (EReference)technicalPropertiesCatalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedConstraintSetCatalogue() {
		return predefinedConstraintSetCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredefinedConstraintSetCatalogue_CatalogueItems() {
		return (EReference)predefinedConstraintSetCatalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnicalPropertyCategory() {
		return technicalPropertyCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalConnectiveTypes() {
		return logicalConnectiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBaseConditionOperators() {
		return baseConditionOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalValues() {
		return logicalValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getToleranceTypes() {
		return toleranceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		constraintsBaseEClass = createEClass(CONSTRAINTS_BASE);

		technicalPropertyEClass = createEClass(TECHNICAL_PROPERTY);
		createEAttribute(technicalPropertyEClass, TECHNICAL_PROPERTY__NAME);
		createEAttribute(technicalPropertyEClass, TECHNICAL_PROPERTY__ALIAS);
		createEAttribute(technicalPropertyEClass, TECHNICAL_PROPERTY__DESCRIPTION);
		createEReference(technicalPropertyEClass, TECHNICAL_PROPERTY__ENTRIES);

		logicConditionEClass = createEClass(LOGIC_CONDITION);
		createEAttribute(logicConditionEClass, LOGIC_CONDITION__LOGICAL_CONNECTIVE_TYPE);
		createEReference(logicConditionEClass, LOGIC_CONDITION__LOGIC_CONDITIONS);
		createEReference(logicConditionEClass, LOGIC_CONDITION__BASE_CONDITIONS);

		baseConditionEClass = createEClass(BASE_CONDITION);
		createEReference(baseConditionEClass, BASE_CONDITION__TECHNICAL_PROPERTY);
		createEAttribute(baseConditionEClass, BASE_CONDITION__OPERATOR);
		createEAttribute(baseConditionEClass, BASE_CONDITION__VALUE);
		createEAttribute(baseConditionEClass, BASE_CONDITION__TOLERANCE);
		createEAttribute(baseConditionEClass, BASE_CONDITION__TOLERANCE_TYPE);

		predefinedConstraintSetEClass = createEClass(PREDEFINED_CONSTRAINT_SET);
		createEAttribute(predefinedConstraintSetEClass, PREDEFINED_CONSTRAINT_SET__NAME);
		createEAttribute(predefinedConstraintSetEClass, PREDEFINED_CONSTRAINT_SET__DESCRIPTION);
		createEReference(predefinedConstraintSetEClass, PREDEFINED_CONSTRAINT_SET__CONSTRAINTS);

		constraintEClass = createEClass(CONSTRAINT);

		preconditionEClass = createEClass(PRECONDITION);

		stringTechnicalPropertyEClass = createEClass(STRING_TECHNICAL_PROPERTY);

		integerTechnicalPropertyEClass = createEClass(INTEGER_TECHNICAL_PROPERTY);

		booleanTechnicalPropertyEClass = createEClass(BOOLEAN_TECHNICAL_PROPERTY);

		floatTechnicalPropertyEClass = createEClass(FLOAT_TECHNICAL_PROPERTY);

		regularExpressionTechnicalPropertyEClass = createEClass(REGULAR_EXPRESSION_TECHNICAL_PROPERTY);

		enumTechnicalPropertyEClass = createEClass(ENUM_TECHNICAL_PROPERTY);
		createEAttribute(enumTechnicalPropertyEClass, ENUM_TECHNICAL_PROPERTY__POSSIBLE_VALUES);

		numericalTechnicalPropertyEClass = createEClass(NUMERICAL_TECHNICAL_PROPERTY);
		createEAttribute(numericalTechnicalPropertyEClass, NUMERICAL_TECHNICAL_PROPERTY__UNIT);
		createEAttribute(numericalTechnicalPropertyEClass, NUMERICAL_TECHNICAL_PROPERTY__MIN);
		createEAttribute(numericalTechnicalPropertyEClass, NUMERICAL_TECHNICAL_PROPERTY__MAX);
		createEAttribute(numericalTechnicalPropertyEClass, NUMERICAL_TECHNICAL_PROPERTY__UNIT_DESCRIPTION);

		technicalPropertiesCatalogueEClass = createEClass(TECHNICAL_PROPERTIES_CATALOGUE);
		createEReference(technicalPropertiesCatalogueEClass, TECHNICAL_PROPERTIES_CATALOGUE__CATALOGUE_PROPERTIES);

		predefinedConstraintSetCatalogueEClass = createEClass(PREDEFINED_CONSTRAINT_SET_CATALOGUE);
		createEReference(predefinedConstraintSetCatalogueEClass, PREDEFINED_CONSTRAINT_SET_CATALOGUE__CATALOGUE_ITEMS);

		technicalPropertyCategoryEClass = createEClass(TECHNICAL_PROPERTY_CATEGORY);

		// Create enums
		logicalConnectiveTypesEEnum = createEEnum(LOGICAL_CONNECTIVE_TYPES);
		baseConditionOperatorsEEnum = createEEnum(BASE_CONDITION_OPERATORS);
		logicalValuesEEnum = createEEnum(LOGICAL_VALUES);
		toleranceTypesEEnum = createEEnum(TOLERANCE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		technicalPropertyEClass.getESuperTypes().add(this.getConstraintsBase());
		logicConditionEClass.getESuperTypes().add(this.getConstraintsBase());
		baseConditionEClass.getESuperTypes().add(this.getConstraintsBase());
		predefinedConstraintSetEClass.getESuperTypes().add(this.getConstraintsBase());
		constraintEClass.getESuperTypes().add(this.getBaseCondition());
		preconditionEClass.getESuperTypes().add(this.getLogicCondition());
		stringTechnicalPropertyEClass.getESuperTypes().add(this.getTechnicalProperty());
		integerTechnicalPropertyEClass.getESuperTypes().add(this.getNumericalTechnicalProperty());
		booleanTechnicalPropertyEClass.getESuperTypes().add(this.getTechnicalProperty());
		floatTechnicalPropertyEClass.getESuperTypes().add(this.getNumericalTechnicalProperty());
		regularExpressionTechnicalPropertyEClass.getESuperTypes().add(this.getTechnicalProperty());
		enumTechnicalPropertyEClass.getESuperTypes().add(this.getTechnicalProperty());
		numericalTechnicalPropertyEClass.getESuperTypes().add(this.getTechnicalProperty());
		technicalPropertiesCatalogueEClass.getESuperTypes().add(this.getConstraintsBase());
		predefinedConstraintSetCatalogueEClass.getESuperTypes().add(this.getConstraintsBase());
		technicalPropertyCategoryEClass.getESuperTypes().add(this.getTechnicalProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(constraintsBaseEClass, ConstraintsBase.class, "ConstraintsBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technicalPropertyEClass, TechnicalProperty.class, "TechnicalProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnicalProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, TechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnicalProperty_Alias(), ecorePackage.getEString(), "alias", null, 0, -1, TechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnicalProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, TechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnicalProperty_Entries(), this.getTechnicalProperty(), null, "entries", null, 0, -1, TechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicConditionEClass, LogicCondition.class, "LogicCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicCondition_LogicalConnectiveType(), this.getLogicalConnectiveTypes(), "logicalConnectiveType", null, 0, 1, LogicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCondition_LogicConditions(), this.getLogicCondition(), null, "logicConditions", null, 0, -1, LogicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicCondition_BaseConditions(), this.getBaseCondition(), null, "baseConditions", null, 0, -1, LogicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseConditionEClass, BaseCondition.class, "BaseCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseCondition_TechnicalProperty(), this.getTechnicalProperty(), null, "technicalProperty", null, 1, 1, BaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCondition_Operator(), this.getBaseConditionOperators(), "operator", null, 0, 1, BaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, BaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCondition_Tolerance(), ecorePackage.getEString(), "tolerance", "0.0", 0, 1, BaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseCondition_ToleranceType(), this.getToleranceTypes(), "toleranceType", "absolute", 0, 1, BaseCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedConstraintSetEClass, PredefinedConstraintSet.class, "PredefinedConstraintSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefinedConstraintSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, PredefinedConstraintSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredefinedConstraintSet_Description(), ecorePackage.getEString(), "description", null, 0, 1, PredefinedConstraintSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredefinedConstraintSet_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, PredefinedConstraintSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTechnicalPropertyEClass, StringTechnicalProperty.class, "StringTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTechnicalPropertyEClass, IntegerTechnicalProperty.class, "IntegerTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTechnicalPropertyEClass, BooleanTechnicalProperty.class, "BooleanTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatTechnicalPropertyEClass, FloatTechnicalProperty.class, "FloatTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularExpressionTechnicalPropertyEClass, RegularExpressionTechnicalProperty.class, "RegularExpressionTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumTechnicalPropertyEClass, EnumTechnicalProperty.class, "EnumTechnicalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumTechnicalProperty_PossibleValues(), ecorePackage.getEString(), "possibleValues", null, 0, -1, EnumTechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericalTechnicalPropertyEClass, NumericalTechnicalProperty.class, "NumericalTechnicalProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalTechnicalProperty_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, NumericalTechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalTechnicalProperty_Min(), ecorePackage.getEString(), "min", "", 0, 1, NumericalTechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalTechnicalProperty_Max(), ecorePackage.getEString(), "max", null, 0, 1, NumericalTechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericalTechnicalProperty_UnitDescription(), ecorePackage.getEString(), "unitDescription", null, 0, 1, NumericalTechnicalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalPropertiesCatalogueEClass, TechnicalPropertiesCatalogue.class, "TechnicalPropertiesCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnicalPropertiesCatalogue_CatalogueProperties(), this.getTechnicalProperty(), null, "catalogueProperties", null, 0, -1, TechnicalPropertiesCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedConstraintSetCatalogueEClass, PredefinedConstraintSetCatalogue.class, "PredefinedConstraintSetCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredefinedConstraintSetCatalogue_CatalogueItems(), this.getPredefinedConstraintSet(), null, "catalogueItems", null, 0, -1, PredefinedConstraintSetCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalPropertyCategoryEClass, TechnicalPropertyCategory.class, "TechnicalPropertyCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.class, "LogicalConnectiveTypes");
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.NOT);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.AND);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.OR);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.XOR);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.NAND);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.NOR);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.IMPLIES);
		addEEnumLiteral(logicalConnectiveTypesEEnum, LogicalConnectiveTypes.EQUIVALENT);

		initEEnum(baseConditionOperatorsEEnum, BaseConditionOperators.class, "BaseConditionOperators");
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.EQUALS);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.GREATER_THAN);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.LESS_THAN);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.MINIMAL);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.MAXIMAL);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.MATCHES);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.EQUALS_IGNORE_CASE);
		addEEnumLiteral(baseConditionOperatorsEEnum, BaseConditionOperators.APPROXIMATELY_EQUALS);

		initEEnum(logicalValuesEEnum, LogicalValues.class, "LogicalValues");
		addEEnumLiteral(logicalValuesEEnum, LogicalValues.TRUE);
		addEEnumLiteral(logicalValuesEEnum, LogicalValues.FALSE);
		addEEnumLiteral(logicalValuesEEnum, LogicalValues.UNDEFINED);
		addEEnumLiteral(logicalValuesEEnum, LogicalValues.INVALID);

		initEEnum(toleranceTypesEEnum, ToleranceTypes.class, "ToleranceTypes");
		addEEnumLiteral(toleranceTypesEEnum, ToleranceTypes.ABSOLUTE);
		addEEnumLiteral(toleranceTypesEEnum, ToleranceTypes.RELATIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstraintsPackageImpl
