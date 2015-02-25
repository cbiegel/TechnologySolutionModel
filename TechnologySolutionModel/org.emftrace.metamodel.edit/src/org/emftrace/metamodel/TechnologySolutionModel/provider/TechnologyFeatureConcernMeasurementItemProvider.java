/**
 */
package org.emftrace.metamodel.TechnologySolutionModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement;
import org.emftrace.metamodel.TechnologySolutionModel.TechnologySolutionModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.TechnologySolutionModel.TechnologyFeatureConcernMeasurement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologyFeatureConcernMeasurementItemProvider
	extends FeatureEvaluationItemProvider
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
	public TechnologyFeatureConcernMeasurementItemProvider(AdapterFactory adapterFactory) {
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

			addAspectPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addMetricsPropertyDescriptor(object);
			addAssumptionsPropertyDescriptor(object);
			addQuantitativeResultPropertyDescriptor(object);
			addQualitativeResultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aspect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_Aspect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_Aspect_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_Context_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_Context_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metrics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetricsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_Metrics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_Metrics_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assumptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_Assumptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_Assumptions_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quantitative Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuantitativeResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_QuantitativeResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_QuantitativeResult_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualitative Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualitativeResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TechnologyFeatureConcernMeasurement_QualitativeResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyFeatureConcernMeasurement_QualitativeResult_feature", "_UI_TechnologyFeatureConcernMeasurement_type"),
				 TechnologySolutionModelPackage.Literals.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TechnologyFeatureConcernMeasurement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TechnologyFeatureConcernMeasurement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TechnologyFeatureConcernMeasurement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TechnologyFeatureConcernMeasurement_type") :
			getString("_UI_TechnologyFeatureConcernMeasurement_type") + " " + label;
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

		switch (notification.getFeatureID(TechnologyFeatureConcernMeasurement.class)) {
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASPECT:
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__CONTEXT:
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__METRICS:
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__ASSUMPTIONS:
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUANTITATIVE_RESULT:
			case TechnologySolutionModelPackage.TECHNOLOGY_FEATURE_CONCERN_MEASUREMENT__QUALITATIVE_RESULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
