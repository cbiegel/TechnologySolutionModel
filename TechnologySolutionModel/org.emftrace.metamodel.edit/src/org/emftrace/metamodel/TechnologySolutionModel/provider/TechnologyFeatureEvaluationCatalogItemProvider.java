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

import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelFactory;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureEvaluationCatalog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologyFeatureEvaluationCatalogItemProvider
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
	public TechnologyFeatureEvaluationCatalogItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addFeatureEvaluationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureEvaluationCatalog_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureEvaluationCatalog_Description_feature", "_UI_TechnologyFeatureEvaluationCatalog_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Evaluation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureEvaluationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureEvaluationCatalog_FeatureEvaluation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureEvaluationCatalog_FeatureEvaluation_feature", "_UI_TechnologyFeatureEvaluationCatalog_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION,
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
			childrenFeatures.add(TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION);
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
	 * This returns TechnologyFeatureEvaluationCatalog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologyFeatureEvaluationCatalog"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TechnologyFeatureEvaluationCatalog)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TechnologyFeatureEvaluationCatalog_type") :
			getString("_UI_TechnologyFeatureEvaluationCatalog_type") + " " + label;
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

		switch (notification.getFeatureID(TechnologyFeatureEvaluationCatalog.class)) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION:
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
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologyFeatureConcernMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_EVALUATION_CATALOG__FEATURE_EVALUATION,
				 TechnologySolutionModelFactory.eINSTANCE.createTechnologyFeaturesComparison()));
	}

}
