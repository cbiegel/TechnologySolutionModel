/**
 */
package org.emftrace.metamodel.QUARCModel.Constraints.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.emftrace.metamodel.QUARCModel.Constraints.util.ConstraintsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsItemProviderAdapterFactory extends ConstraintsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicConditionItemProvider logicConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.LogicCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicConditionAdapter() {
		if (logicConditionItemProvider == null) {
			logicConditionItemProvider = new LogicConditionItemProvider(this);
		}

		return logicConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseConditionItemProvider baseConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.BaseCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseConditionAdapter() {
		if (baseConditionItemProvider == null) {
			baseConditionItemProvider = new BaseConditionItemProvider(this);
		}

		return baseConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedConstraintSetItemProvider predefinedConstraintSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedConstraintSetAdapter() {
		if (predefinedConstraintSetItemProvider == null) {
			predefinedConstraintSetItemProvider = new PredefinedConstraintSetItemProvider(this);
		}

		return predefinedConstraintSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.Precondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionItemProvider preconditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.Precondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreconditionAdapter() {
		if (preconditionItemProvider == null) {
			preconditionItemProvider = new PreconditionItemProvider(this);
		}

		return preconditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTechnicalPropertyItemProvider stringTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.StringTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringTechnicalPropertyAdapter() {
		if (stringTechnicalPropertyItemProvider == null) {
			stringTechnicalPropertyItemProvider = new StringTechnicalPropertyItemProvider(this);
		}

		return stringTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTechnicalPropertyItemProvider integerTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.IntegerTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerTechnicalPropertyAdapter() {
		if (integerTechnicalPropertyItemProvider == null) {
			integerTechnicalPropertyItemProvider = new IntegerTechnicalPropertyItemProvider(this);
		}

		return integerTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTechnicalPropertyItemProvider booleanTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.BooleanTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanTechnicalPropertyAdapter() {
		if (booleanTechnicalPropertyItemProvider == null) {
			booleanTechnicalPropertyItemProvider = new BooleanTechnicalPropertyItemProvider(this);
		}

		return booleanTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatTechnicalPropertyItemProvider floatTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.FloatTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatTechnicalPropertyAdapter() {
		if (floatTechnicalPropertyItemProvider == null) {
			floatTechnicalPropertyItemProvider = new FloatTechnicalPropertyItemProvider(this);
		}

		return floatTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularExpressionTechnicalPropertyItemProvider regularExpressionTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.RegularExpressionTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegularExpressionTechnicalPropertyAdapter() {
		if (regularExpressionTechnicalPropertyItemProvider == null) {
			regularExpressionTechnicalPropertyItemProvider = new RegularExpressionTechnicalPropertyItemProvider(this);
		}

		return regularExpressionTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTechnicalPropertyItemProvider enumTechnicalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.EnumTechnicalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumTechnicalPropertyAdapter() {
		if (enumTechnicalPropertyItemProvider == null) {
			enumTechnicalPropertyItemProvider = new EnumTechnicalPropertyItemProvider(this);
		}

		return enumTechnicalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalPropertiesCatalogueItemProvider technicalPropertiesCatalogueItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnicalPropertiesCatalogueAdapter() {
		if (technicalPropertiesCatalogueItemProvider == null) {
			technicalPropertiesCatalogueItemProvider = new TechnicalPropertiesCatalogueItemProvider(this);
		}

		return technicalPropertiesCatalogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedConstraintSetCatalogueItemProvider predefinedConstraintSetCatalogueItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedConstraintSetCatalogueAdapter() {
		if (predefinedConstraintSetCatalogueItemProvider == null) {
			predefinedConstraintSetCatalogueItemProvider = new PredefinedConstraintSetCatalogueItemProvider(this);
		}

		return predefinedConstraintSetCatalogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertyCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalPropertyCategoryItemProvider technicalPropertyCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertyCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnicalPropertyCategoryAdapter() {
		if (technicalPropertyCategoryItemProvider == null) {
			technicalPropertyCategoryItemProvider = new TechnicalPropertyCategoryItemProvider(this);
		}

		return technicalPropertyCategoryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (logicConditionItemProvider != null) logicConditionItemProvider.dispose();
		if (baseConditionItemProvider != null) baseConditionItemProvider.dispose();
		if (predefinedConstraintSetItemProvider != null) predefinedConstraintSetItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (preconditionItemProvider != null) preconditionItemProvider.dispose();
		if (stringTechnicalPropertyItemProvider != null) stringTechnicalPropertyItemProvider.dispose();
		if (integerTechnicalPropertyItemProvider != null) integerTechnicalPropertyItemProvider.dispose();
		if (booleanTechnicalPropertyItemProvider != null) booleanTechnicalPropertyItemProvider.dispose();
		if (floatTechnicalPropertyItemProvider != null) floatTechnicalPropertyItemProvider.dispose();
		if (regularExpressionTechnicalPropertyItemProvider != null) regularExpressionTechnicalPropertyItemProvider.dispose();
		if (enumTechnicalPropertyItemProvider != null) enumTechnicalPropertyItemProvider.dispose();
		if (technicalPropertiesCatalogueItemProvider != null) technicalPropertiesCatalogueItemProvider.dispose();
		if (predefinedConstraintSetCatalogueItemProvider != null) predefinedConstraintSetCatalogueItemProvider.dispose();
		if (technicalPropertyCategoryItemProvider != null) technicalPropertyCategoryItemProvider.dispose();
	}

}
