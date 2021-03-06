/**
 */
package org.emftrace.metamodel.FeatureModel.provider;

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

import org.emftrace.metamodel.FeatureModel.util.FeatureModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelItemProviderAdapterFactory extends FeatureModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FeatureModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.ConsulModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsulModelItemProvider consulModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.ConsulModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConsulModelAdapter() {
		if (consulModelItemProvider == null) {
			consulModelItemProvider = new ConsulModelItemProvider(this);
		}

		return consulModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Head} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadItemProvider headItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Head}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadAdapter() {
		if (headItemProvider == null) {
			headItemProvider = new HeadItemProvider(this);
		}

		return headItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Properties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if (propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Restrictions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsItemProvider restrictionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Restrictions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestrictionsAdapter() {
		if (restrictionsItemProvider == null) {
			restrictionsItemProvider = new RestrictionsItemProvider(this);
		}

		return restrictionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.RestSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestSetItemProvider restSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.RestSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestSetAdapter() {
		if (restSetItemProvider == null) {
			restSetItemProvider = new RestSetItemProvider(this);
		}

		return restSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Restriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionItemProvider restrictionItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Restriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestrictionAdapter() {
		if (restrictionItemProvider == null) {
			restrictionItemProvider = new RestrictionItemProvider(this);
		}

		return restrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Elements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementsItemProvider elementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Elements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementsAdapter() {
		if (elementsItemProvider == null) {
			elementsItemProvider = new ElementsItemProvider(this);
		}

		return elementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementItemProvider elementItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementAdapter() {
		if (elementItemProvider == null) {
			elementItemProvider = new ElementItemProvider(this);
		}

		return elementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.VName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VNameItemProvider vNameItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.VName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVNameAdapter() {
		if (vNameItemProvider == null) {
			vNameItemProvider = new VNameItemProvider(this);
		}

		return vNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Relations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsItemProvider relationsItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Relations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationsAdapter() {
		if (relationsItemProvider == null) {
			relationsItemProvider = new RelationsItemProvider(this);
		}

		return relationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Target} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetItemProvider targetItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetAdapter() {
		if (targetItemProvider == null) {
			targetItemProvider = new TargetItemProvider(this);
		}

		return targetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Calculate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculateItemProvider calculateItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Calculate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalculateAdapter() {
		if (calculateItemProvider == null) {
			calculateItemProvider = new CalculateItemProvider(this);
		}

		return calculateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Script} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptItemProvider scriptItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptAdapter() {
		if (scriptItemProvider == null) {
			scriptItemProvider = new ScriptItemProvider(this);
		}

		return scriptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.emftrace.metamodel.FeatureModel.Desc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescItemProvider descItemProvider;

	/**
	 * This creates an adapter for a {@link org.emftrace.metamodel.FeatureModel.Desc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescAdapter() {
		if (descItemProvider == null) {
			descItemProvider = new DescItemProvider(this);
		}

		return descItemProvider;
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
		if (consulModelItemProvider != null) consulModelItemProvider.dispose();
		if (headItemProvider != null) headItemProvider.dispose();
		if (propertiesItemProvider != null) propertiesItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (restrictionsItemProvider != null) restrictionsItemProvider.dispose();
		if (restSetItemProvider != null) restSetItemProvider.dispose();
		if (restrictionItemProvider != null) restrictionItemProvider.dispose();
		if (elementsItemProvider != null) elementsItemProvider.dispose();
		if (elementItemProvider != null) elementItemProvider.dispose();
		if (vNameItemProvider != null) vNameItemProvider.dispose();
		if (relationsItemProvider != null) relationsItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
		if (targetItemProvider != null) targetItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (calculateItemProvider != null) calculateItemProvider.dispose();
		if (scriptItemProvider != null) scriptItemProvider.dispose();
		if (descItemProvider != null) descItemProvider.dispose();
	}

}
