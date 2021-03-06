/**
 */
package de.tu_bs.cs.isf.mbse.website.provider;

import de.tu_bs.cs.isf.mbse.website.util.WebsiteAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteItemProviderAdapterFactory extends WebsiteAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public WebsiteItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.Website} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebsiteItemProvider websiteItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.Website}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebsiteAdapter() {
		if (websiteItemProvider == null) {
			websiteItemProvider = new WebsiteItemProvider(this);
		}

		return websiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.Widget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetItemProvider widgetItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWidgetAdapter() {
		if (widgetItemProvider == null) {
			widgetItemProvider = new WidgetItemProvider(this);
		}

		return widgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.TextBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextBoxItemProvider textBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.TextBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextBoxAdapter() {
		if (textBoxItemProvider == null) {
			textBoxItemProvider = new TextBoxItemProvider(this);
		}

		return textBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.ImageBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageBoxItemProvider imageBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.ImageBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageBoxAdapter() {
		if (imageBoxItemProvider == null) {
			imageBoxItemProvider = new ImageBoxItemProvider(this);
		}

		return imageBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.ButtonBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonBoxItemProvider buttonBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.ButtonBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonBoxAdapter() {
		if (buttonBoxItemProvider == null) {
			buttonBoxItemProvider = new ButtonBoxItemProvider(this);
		}

		return buttonBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.tu_bs.cs.isf.mbse.website.SearchBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchBoxItemProvider searchBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.tu_bs.cs.isf.mbse.website.SearchBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSearchBoxAdapter() {
		if (searchBoxItemProvider == null) {
			searchBoxItemProvider = new SearchBoxItemProvider(this);
		}

		return searchBoxItemProvider;
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
		if (websiteItemProvider != null) websiteItemProvider.dispose();
		if (widgetItemProvider != null) widgetItemProvider.dispose();
		if (textBoxItemProvider != null) textBoxItemProvider.dispose();
		if (imageBoxItemProvider != null) imageBoxItemProvider.dispose();
		if (buttonBoxItemProvider != null) buttonBoxItemProvider.dispose();
		if (searchBoxItemProvider != null) searchBoxItemProvider.dispose();
	}

}
