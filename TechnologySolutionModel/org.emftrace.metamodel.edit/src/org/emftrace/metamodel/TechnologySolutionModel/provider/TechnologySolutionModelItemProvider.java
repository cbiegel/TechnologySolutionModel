/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelFactory;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologySolutionModelItemProvider
	extends TechnologySolutionBaseItemProvider
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
	public TechnologySolutionModelItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addTechnologySolutionsPropertyDescriptor(object);
			addConceptualSolutionsPropertyDescriptor(object);
			addDevelopmentEnvironmentsPropertyDescriptor(object);
			addRelationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionModel_Version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionModel_Version_feature", "_UI_TechnologySolutionModel_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Technology Solutions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologySolutionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionModel_TechnologySolutions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionModel_TechnologySolutions_feature", "_UI_TechnologySolutionModel_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conceptual Solutions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConceptualSolutionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionModel_ConceptualSolutions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionModel_ConceptualSolutions_feature", "_UI_TechnologySolutionModel_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Development Environments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopmentEnvironmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionModel_DevelopmentEnvironments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionModel_DevelopmentEnvironments_feature", "_UI_TechnologySolutionModel_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologySolutionModel_Relations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologySolutionModel_Relations_feature", "_UI_TechnologySolutionModel_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__RELATIONS,
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
			childrenFeatures.add(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS);
			childrenFeatures.add(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS);
			childrenFeatures.add(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS);
			childrenFeatures.add(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__RELATIONS);
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
	 * This returns TechnologySolutionModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologySolutionModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TechnologySolutionModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TechnologySolutionModel_type") :
			getString("_UI_TechnologySolutionModel_type") + " " + label;
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

		switch (notification.getFeatureID(TechnologySolutionModel.class)) {
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS:
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS:
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS:
			case TechnologySolutionModelPackage.TECHNOLOGY_SOLUTION_MODEL__RELATIONS:
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
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__TECHNOLOGY_SOLUTIONS,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologySolutions()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__CONCEPTUAL_SOLUTIONS,
				 TechnologySolutionModelFactory.eINSTANCE.createConceptualSolutions()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__DEVELOPMENT_ENVIRONMENTS,
				 TechnologySolutionModelFactory.eINSTANCE.createDevelopmentEnvironments()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_SOLUTION_MODEL__RELATIONS,
				 TechnologySolutionModelFactory.eINSTANCE.createRelations()));
	}

}
