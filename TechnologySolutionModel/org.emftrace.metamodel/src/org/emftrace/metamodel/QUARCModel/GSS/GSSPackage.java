/**
 */
package org.emftrace.metamodel.QUARCModel.GSS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSFactory
 * @model kind="package"
 * @generated
 */
public interface GSSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GSS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "GSS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSSPackage eINSTANCE = org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GSSBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSBaseImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGSSBase()
	 * @generated
	 */
	int GSS_BASE = 12;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_BASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ElementImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = GSS_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = GSS_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALIAS = GSS_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGS = GSS_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = GSS_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RelationImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = GSS_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = GSS_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = GSS_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RefinementImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__TARGET = RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.DecompositionImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SOURCE = REFINEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET = REFINEMENT__TARGET;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ImpactImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__WEIGHT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GoalImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALIAS = ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TAGS = ELEMENT__TAGS;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ConstrainedElementImpl <em>Constrained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ConstrainedElementImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getConstrainedElement()
	 * @generated
	 */
	int CONSTRAINED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__ALIAS = ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__TAGS = ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT__PRECONDITION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constrained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.PrincipleImpl <em>Principle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.PrincipleImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getPrinciple()
	 * @generated
	 */
	int PRINCIPLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__NAME = CONSTRAINED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__DESCRIPTION = CONSTRAINED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__ALIAS = CONSTRAINED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__TAGS = CONSTRAINED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__PRECONDITION = CONSTRAINED_ELEMENT__PRECONDITION;

	/**
	 * The number of structural features of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_FEATURE_COUNT = CONSTRAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl <em>Solution Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getSolutionInstrument()
	 * @generated
	 */
	int SOLUTION_INSTRUMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__NAME = CONSTRAINED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__DESCRIPTION = CONSTRAINED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__ALIAS = CONSTRAINED_ELEMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__TAGS = CONSTRAINED_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__PRECONDITION = CONSTRAINED_ELEMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Related Instruments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS = CONSTRAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT__LINK = CONSTRAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_INSTRUMENT_FEATURE_COUNT = CONSTRAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.PatternImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = SOLUTION_INSTRUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__DESCRIPTION = SOLUTION_INSTRUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ALIAS = SOLUTION_INSTRUMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__TAGS = SOLUTION_INSTRUMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PRECONDITION = SOLUTION_INSTRUMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Related Instruments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RELATED_INSTRUMENTS = SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__LINK = SOLUTION_INSTRUMENT__LINK;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__STRUCTURE = SOLUTION_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONSEQUENCES = SOLUTION_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__EXAMPLE = SOLUTION_INSTRUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = SOLUTION_INSTRUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RefactoringImpl <em>Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RefactoringImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRefactoring()
	 * @generated
	 */
	int REFACTORING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__NAME = SOLUTION_INSTRUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__DESCRIPTION = SOLUTION_INSTRUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__ALIAS = SOLUTION_INSTRUMENT__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__TAGS = SOLUTION_INSTRUMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__PRECONDITION = SOLUTION_INSTRUMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Related Instruments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__RELATED_INSTRUMENTS = SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__LINK = SOLUTION_INSTRUMENT__LINK;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__ACTIONS = SOLUTION_INSTRUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__CONSEQUENCES = SOLUTION_INSTRUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_FEATURE_COUNT = SOLUTION_INSTRUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.OffsetImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__VALUE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl <em>Flaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getFlaw()
	 * @generated
	 */
	int FLAW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__NAME = PRINCIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__DESCRIPTION = PRINCIPLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__ALIAS = PRINCIPLE__ALIAS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__TAGS = PRINCIPLE__TAGS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__PRECONDITION = PRINCIPLE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__METRICS = PRINCIPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpretation Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW__INTERPRETATION_RULE = PRINCIPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAW_FEATURE_COUNT = PRINCIPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GSSImpl <em>GSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGSS()
	 * @generated
	 */
	int GSS = 13;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS__ELEMENTS = GSS_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS__RELATIONS = GSS_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FEATURE_COUNT = GSS_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.TagImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = GSS_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = GSS_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.TagsCatalogueImpl <em>Tags Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.TagsCatalogueImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getTagsCatalogue()
	 * @generated
	 */
	int TAGS_CATALOGUE = 15;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CATALOGUE__TAGS = GSS_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tags Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_CATALOGUE_FEATURE_COUNT = GSS_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.isAImpl <em>is A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.isAImpl
	 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getisA()
	 * @generated
	 */
	int IS_A = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__SOURCE = REFINEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__TARGET = REFINEMENT__TARGET;

	/**
	 * The number of structural features of the '<em>is A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Element#getDescription()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Element#getAlias()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Alias();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.QUARCModel.GSS.Element#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Element#getTags()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Tags();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.QUARCModel.GSS.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.emftrace.metamodel.QUARCModel.GSS.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Impact#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Impact#getWeight()
	 * @see #getImpact()
	 * @generated
	 */
	EAttribute getImpact_Weight();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Element</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement
	 * @generated
	 */
	EClass getConstrainedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.ConstrainedElement#getPrecondition()
	 * @see #getConstrainedElement()
	 * @generated
	 */
	EReference getConstrainedElement_Precondition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principle</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Principle
	 * @generated
	 */
	EClass getPrinciple();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument <em>Solution Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Instrument</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument
	 * @generated
	 */
	EClass getSolutionInstrument();

	/**
	 * Returns the meta object for the reference list '{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getRelatedInstruments <em>Related Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Instruments</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getRelatedInstruments()
	 * @see #getSolutionInstrument()
	 * @generated
	 */
	EReference getSolutionInstrument_RelatedInstruments();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.SolutionInstrument#getLink()
	 * @see #getSolutionInstrument()
	 * @generated
	 */
	EAttribute getSolutionInstrument_Link();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Pattern#getStructure()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Structure();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Pattern#getConsequences()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Consequences();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Pattern#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Pattern#getExample()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Example();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Refactoring
	 * @generated
	 */
	EClass getRefactoring();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Refactoring#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Refactoring#getActions()
	 * @see #getRefactoring()
	 * @generated
	 */
	EAttribute getRefactoring_Actions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Refactoring#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Refactoring#getConsequences()
	 * @see #getRefactoring()
	 * @generated
	 */
	EAttribute getRefactoring_Consequences();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Offset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Offset#getValue()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_Value();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Flaw <em>Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flaw</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Flaw
	 * @generated
	 */
	EClass getFlaw();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Flaw#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrics</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Flaw#getMetrics()
	 * @see #getFlaw()
	 * @generated
	 */
	EAttribute getFlaw_Metrics();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Flaw#getInterpretationRule <em>Interpretation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation Rule</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Flaw#getInterpretationRule()
	 * @see #getFlaw()
	 * @generated
	 */
	EAttribute getFlaw_InterpretationRule();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.GSSBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSBase
	 * @generated
	 */
	EClass getGSSBase();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.GSS <em>GSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSS
	 * @generated
	 */
	EClass getGSS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.QUARCModel.GSS.GSS#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSS#getElements()
	 * @see #getGSS()
	 * @generated
	 */
	EReference getGSS_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.QUARCModel.GSS.GSS#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.GSS#getRelations()
	 * @see #getGSS()
	 * @generated
	 */
	EReference getGSS_Relations();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.QUARCModel.GSS.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue <em>Tags Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Catalogue</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue
	 * @generated
	 */
	EClass getTagsCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue#getTags()
	 * @see #getTagsCatalogue()
	 * @generated
	 */
	EReference getTagsCatalogue_Tags();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.isA <em>is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>is A</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.isA
	 * @generated
	 */
	EClass getisA();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.QUARCModel.GSS.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see org.emftrace.metamodel.QUARCModel.GSS.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GSSFactory getGSSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ElementImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ALIAS = eINSTANCE.getElement_Alias();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TAGS = eINSTANCE.getElement_Tags();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RelationImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.DecompositionImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ImpactImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT__WEIGHT = eINSTANCE.getImpact_Weight();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GoalImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.ConstrainedElementImpl <em>Constrained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.ConstrainedElementImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getConstrainedElement()
		 * @generated
		 */
		EClass CONSTRAINED_ELEMENT = eINSTANCE.getConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_ELEMENT__PRECONDITION = eINSTANCE.getConstrainedElement_Precondition();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.PrincipleImpl <em>Principle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.PrincipleImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getPrinciple()
		 * @generated
		 */
		EClass PRINCIPLE = eINSTANCE.getPrinciple();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl <em>Solution Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.SolutionInstrumentImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getSolutionInstrument()
		 * @generated
		 */
		EClass SOLUTION_INSTRUMENT = eINSTANCE.getSolutionInstrument();

		/**
		 * The meta object literal for the '<em><b>Related Instruments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_INSTRUMENT__RELATED_INSTRUMENTS = eINSTANCE.getSolutionInstrument_RelatedInstruments();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_INSTRUMENT__LINK = eINSTANCE.getSolutionInstrument_Link();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.PatternImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__STRUCTURE = eINSTANCE.getPattern_Structure();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__CONSEQUENCES = eINSTANCE.getPattern_Consequences();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__EXAMPLE = eINSTANCE.getPattern_Example();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RefactoringImpl <em>Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RefactoringImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRefactoring()
		 * @generated
		 */
		EClass REFACTORING = eINSTANCE.getRefactoring();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING__ACTIONS = eINSTANCE.getRefactoring_Actions();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING__CONSEQUENCES = eINSTANCE.getRefactoring_Consequences();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.OffsetImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__VALUE = eINSTANCE.getOffset_Value();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl <em>Flaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.FlawImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getFlaw()
		 * @generated
		 */
		EClass FLAW = eINSTANCE.getFlaw();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAW__METRICS = eINSTANCE.getFlaw_Metrics();

		/**
		 * The meta object literal for the '<em><b>Interpretation Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAW__INTERPRETATION_RULE = eINSTANCE.getFlaw_InterpretationRule();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GSSBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSBaseImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGSSBase()
		 * @generated
		 */
		EClass GSS_BASE = eINSTANCE.getGSSBase();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.GSSImpl <em>GSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getGSS()
		 * @generated
		 */
		EClass GSS = eINSTANCE.getGSS();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS__ELEMENTS = eINSTANCE.getGSS_Elements();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS__RELATIONS = eINSTANCE.getGSS_Relations();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.TagImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.TagsCatalogueImpl <em>Tags Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.TagsCatalogueImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getTagsCatalogue()
		 * @generated
		 */
		EClass TAGS_CATALOGUE = eINSTANCE.getTagsCatalogue();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS_CATALOGUE__TAGS = eINSTANCE.getTagsCatalogue_Tags();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.isAImpl <em>is A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.isAImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getisA()
		 * @generated
		 */
		EClass IS_A = eINSTANCE.getisA();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.QUARCModel.GSS.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.RefinementImpl
		 * @see org.emftrace.metamodel.QUARCModel.GSS.impl.GSSPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

	}

} //GSSPackage
