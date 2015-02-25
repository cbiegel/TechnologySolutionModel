/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.LinkModel.provider.MetaModelEditPlugin;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackagePackage;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelFactory;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionCatalogPackage.TechnologySolutionCatalogPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologySolutionCatalogPackageItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologySolutionCatalogPackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTechnologySolutionCatalogPropertyDescriptor(object);
			addTechnologyFeatureCatalogPropertyDescriptor(object);
			addTechnologyFeatureEvaluationCatalogPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Technology Solution Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologySolutionCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionCatalogPackage_TechnologySolutionCatalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionCatalogPackage_TechnologySolutionCatalog_feature", "_UI_TechnologySolutionCatalogPackage_type"),
				 TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology Feature Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyFeatureCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionCatalogPackage_TechnologyFeatureCatalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionCatalogPackage_TechnologyFeatureCatalog_feature", "_UI_TechnologySolutionCatalogPackage_type"),
				 TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology Feature Evaluation Catalog feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyFeatureEvaluationCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionCatalogPackage_TechnologyFeatureEvaluationCatalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionCatalogPackage_TechnologyFeatureEvaluationCatalog_feature", "_UI_TechnologySolutionCatalogPackage_type"),
				 TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG);
			childrenFeatures.add(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG);
			childrenFeatures.add(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG);
			childrenFeatures.add(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TechnologySolutionCatalogPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologySolutionCatalogPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TechnologySolutionCatalogPackage_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TechnologySolutionCatalogPackage.class)) {
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG:
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG:
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG:
			case TechnologySolutionCatalogPackagePackage.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_SOLUTION_CATALOG,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologySolutionCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_CATALOG,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologyFeatureCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__TECHNOLOGY_FEATURE_EVALUATION_CATALOG,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologyFeatureEvaluationCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionCatalogPackagePackage.Literals.TECHNOLOGY_SOLUTION_CATALOG_PACKAGE__ASTA_CATALOG,
				 TechnologySolutionModelFactory.eINSTANCE.createASTACatalog()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetaModelEditPlugin.INSTANCE;
	}

}
