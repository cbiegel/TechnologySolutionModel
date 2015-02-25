/**
 */
package org.emftrace.metamodel.OWLModel.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.emftrace.metamodel.OWLModel.ClassAssertion;
import org.emftrace.metamodel.OWLModel.OWLModelFactory;
import org.emftrace.metamodel.OWLModel.OWLModelPackage;

/**
 * This is the item provider adapter for a {@link org.emftrace.metamodel.OWLModel.ClassAssertion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassAssertionItemProvider
	extends AssertionItemProvider
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
	public ClassAssertionItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addObjectIntersectionOfPropertyDescriptor(object);
			addObjectUnionOfPropertyDescriptor(object);
			addObjectComplementOfPropertyDescriptor(object);
			addObjectOneOfPropertyDescriptor(object);
			addObjectSomeValuesFromPropertyDescriptor(object);
			addObjectAllValuesFromPropertyDescriptor(object);
			addObjectHasValuePropertyDescriptor(object);
			addObjectHasSelfPropertyDescriptor(object);
			addObjectMinCardinalityPropertyDescriptor(object);
			addObjectMaxCardinalityPropertyDescriptor(object);
			addObjectExactCardinalityPropertyDescriptor(object);
			addDataSomeValuesFromPropertyDescriptor(object);
			addDataAllValuesFromPropertyDescriptor(object);
			addDataHasValuePropertyDescriptor(object);
			addDataMinCardinalityPropertyDescriptor(object);
			addDataMaxCardinalityPropertyDescriptor(object);
			addDataExactCardinalityPropertyDescriptor(object);
			addNamedIndividualPropertyDescriptor(object);
			addAnonymousIndividualPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_Class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_Class_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_Class(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Intersection Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectIntersectionOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectIntersectionOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectIntersectionOf_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectIntersectionOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Union Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectUnionOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectUnionOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectUnionOf_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectUnionOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Complement Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectComplementOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectComplementOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectComplementOf_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectComplementOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object One Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectOneOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectOneOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectOneOf_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectOneOf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Some Values From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectSomeValuesFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectSomeValuesFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectSomeValuesFrom_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectSomeValuesFrom(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object All Values From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectAllValuesFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectAllValuesFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectAllValuesFrom_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectAllValuesFrom(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Has Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectHasValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectHasValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectHasValue_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Has Self feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectHasSelfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectHasSelf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectHasSelf_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasSelf(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Min Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectMinCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectMinCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectMinCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMinCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Max Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectMaxCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectMaxCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectMaxCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMaxCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Exact Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectExactCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_ObjectExactCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_ObjectExactCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_ObjectExactCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Some Values From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSomeValuesFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataSomeValuesFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataSomeValuesFrom_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataSomeValuesFrom(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data All Values From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataAllValuesFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataAllValuesFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataAllValuesFrom_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataAllValuesFrom(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Has Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataHasValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataHasValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataHasValue_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataHasValue(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Min Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataMinCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataMinCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataMinCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataMinCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Max Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataMaxCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataMaxCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataMaxCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataMaxCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Exact Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataExactCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_DataExactCardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_DataExactCardinality_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_DataExactCardinality(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Named Individual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamedIndividualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_NamedIndividual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_NamedIndividual_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_NamedIndividual(),
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anonymous Individual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnonymousIndividualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAssertion_AnonymousIndividual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAssertion_AnonymousIndividual_feature", "_UI_ClassAssertion_type"),
				 OWLModelPackage.eINSTANCE.getClassAssertion_AnonymousIndividual(),
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
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_Class());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectIntersectionOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectUnionOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectComplementOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectOneOf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectSomeValuesFrom());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectAllValuesFrom());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasValue());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasSelf());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMinCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMaxCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectExactCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataSomeValuesFrom());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataAllValuesFrom());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataHasValue());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataMinCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataMaxCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_DataExactCardinality());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_NamedIndividual());
			childrenFeatures.add(OWLModelPackage.eINSTANCE.getClassAssertion_AnonymousIndividual());
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
	 * This returns ClassAssertion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassAssertion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassAssertion)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassAssertion_type") :
			getString("_UI_ClassAssertion_type") + " " + label;
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

		switch (notification.getFeatureID(ClassAssertion.class)) {
			case OWLModelPackage.CLASS_ASSERTION__CLASS:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_INTERSECTION_OF:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_UNION_OF:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_COMPLEMENT_OF:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_ONE_OF:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_SOME_VALUES_FROM:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_ALL_VALUES_FROM:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_HAS_VALUE:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_HAS_SELF:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_MIN_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_MAX_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__OBJECT_EXACT_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__DATA_SOME_VALUES_FROM:
			case OWLModelPackage.CLASS_ASSERTION__DATA_ALL_VALUES_FROM:
			case OWLModelPackage.CLASS_ASSERTION__DATA_HAS_VALUE:
			case OWLModelPackage.CLASS_ASSERTION__DATA_MIN_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__DATA_MAX_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__DATA_EXACT_CARDINALITY:
			case OWLModelPackage.CLASS_ASSERTION__NAMED_INDIVIDUAL:
			case OWLModelPackage.CLASS_ASSERTION__ANONYMOUS_INDIVIDUAL:
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
				(OWLModelPackage.eINSTANCE.getClassAssertion_Class(),
				 OWLModelFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectIntersectionOf(),
				 OWLModelFactory.eINSTANCE.createObjectIntersectionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectUnionOf(),
				 OWLModelFactory.eINSTANCE.createObjectUnionOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectComplementOf(),
				 OWLModelFactory.eINSTANCE.createObjectComplementOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectOneOf(),
				 OWLModelFactory.eINSTANCE.createObjectOneOf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectSomeValuesFrom(),
				 OWLModelFactory.eINSTANCE.createObjectSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectAllValuesFrom(),
				 OWLModelFactory.eINSTANCE.createObjectAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasValue(),
				 OWLModelFactory.eINSTANCE.createObjectHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectHasSelf(),
				 OWLModelFactory.eINSTANCE.createObjectHasSelf()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMinCardinality(),
				 OWLModelFactory.eINSTANCE.createObjectMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectMaxCardinality(),
				 OWLModelFactory.eINSTANCE.createObjectMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_ObjectExactCardinality(),
				 OWLModelFactory.eINSTANCE.createObjectExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataSomeValuesFrom(),
				 OWLModelFactory.eINSTANCE.createDataSomeValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataAllValuesFrom(),
				 OWLModelFactory.eINSTANCE.createDataAllValuesFrom()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataHasValue(),
				 OWLModelFactory.eINSTANCE.createDataHasValue()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataMinCardinality(),
				 OWLModelFactory.eINSTANCE.createDataMinCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataMaxCardinality(),
				 OWLModelFactory.eINSTANCE.createDataMaxCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_DataExactCardinality(),
				 OWLModelFactory.eINSTANCE.createDataExactCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_NamedIndividual(),
				 OWLModelFactory.eINSTANCE.createNamedIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(OWLModelPackage.eINSTANCE.getClassAssertion_AnonymousIndividual(),
				 OWLModelFactory.eINSTANCE.createAnonymousIndividual()));
	}

}
