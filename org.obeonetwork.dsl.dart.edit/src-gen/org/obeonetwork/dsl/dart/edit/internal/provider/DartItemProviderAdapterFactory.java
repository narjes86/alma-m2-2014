/**
 *  Copyright (c) 2014 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.dart.edit.internal.provider;

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

import org.obeonetwork.dsl.dart.util.DartAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters
 * generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged
 * fireNotifyChanged}. The adapters also support Eclipse property sheets. Note that most of the adapters are
 * shared among multiple instances. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DartItemProviderAdapterFactory extends DartAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2014 Obeo.\r\n All rights reserved. This program and the accompanying materials\r\n are made available under the terms of the Eclipse Public License v1.0\r\n which accompanies this distribution, and is available at\r\n http://www.eclipse.org/legal/epl-v10.html\r\n \r\n Contributors:\r\n     Obeo - initial API and implementation";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DartItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Project} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Project}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Asset} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssetItemProvider assetItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Asset}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createAssetAdapter() {
		if (assetItemProvider == null) {
			assetItemProvider = new AssetItemProvider(this);
		}

		return assetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Folder} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FolderItemProvider folderItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Folder}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFolderAdapter() {
		if (folderItemProvider == null) {
			folderItemProvider = new FolderItemProvider(this);
		}

		return folderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Package} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Package}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Import} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ImportItemProvider importItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Import}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createImportAdapter() {
		if (importItemProvider == null) {
			importItemProvider = new ImportItemProvider(this);
		}

		return importItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Export} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExportItemProvider exportItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Export}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createExportAdapter() {
		if (exportItemProvider == null) {
			exportItemProvider = new ExportItemProvider(this);
		}

		return exportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Typedef} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TypedefItemProvider typedefItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Typedef}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTypedefAdapter() {
		if (typedefItemProvider == null) {
			typedefItemProvider = new TypedefItemProvider(this);
		}

		return typedefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.HTML} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HTMLItemProvider htmlItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.HTML}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createHTMLAdapter() {
		if (htmlItemProvider == null) {
			htmlItemProvider = new HTMLItemProvider(this);
		}

		return htmlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Stylesheet} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StylesheetItemProvider stylesheetItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Stylesheet}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createStylesheetAdapter() {
		if (stylesheetItemProvider == null) {
			stylesheetItemProvider = new StylesheetItemProvider(this);
		}

		return stylesheetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Module} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModuleItemProvider moduleItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Module}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createModuleAdapter() {
		if (moduleItemProvider == null) {
			moduleItemProvider = new ModuleItemProvider(this);
		}

		return moduleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Controller} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Controller}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Component} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Component}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Decorator} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DecoratorItemProvider decoratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Decorator}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDecoratorAdapter() {
		if (decoratorItemProvider == null) {
			decoratorItemProvider = new DecoratorItemProvider(this);
		}

		return decoratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Formatter} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FormatterItemProvider formatterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Formatter}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFormatterAdapter() {
		if (formatterItemProvider == null) {
			formatterItemProvider = new FormatterItemProvider(this);
		}

		return formatterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Route} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RouteItemProvider routeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Route}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createRouteAdapter() {
		if (routeItemProvider == null) {
			routeItemProvider = new RouteItemProvider(this);
		}

		return routeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Library} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Library}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Metadata} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MetadataItemProvider metadataItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Metadata}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMetadataAdapter() {
		if (metadataItemProvider == null) {
			metadataItemProvider = new MetadataItemProvider(this);
		}

		return metadataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Class} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Class}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Variable} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Variable}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Constructor}
	 * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConstructorItemProvider constructorItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Constructor}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createConstructorAdapter() {
		if (constructorItemProvider == null) {
			constructorItemProvider = new ConstructorItemProvider(this);
		}

		return constructorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Function} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Function}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.dart.Parameter} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.dart.Parameter}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (projectItemProvider != null)
			projectItemProvider.dispose();
		if (assetItemProvider != null)
			assetItemProvider.dispose();
		if (folderItemProvider != null)
			folderItemProvider.dispose();
		if (packageItemProvider != null)
			packageItemProvider.dispose();
		if (importItemProvider != null)
			importItemProvider.dispose();
		if (exportItemProvider != null)
			exportItemProvider.dispose();
		if (libraryItemProvider != null)
			libraryItemProvider.dispose();
		if (metadataItemProvider != null)
			metadataItemProvider.dispose();
		if (classItemProvider != null)
			classItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (constructorItemProvider != null)
			constructorItemProvider.dispose();
		if (functionItemProvider != null)
			functionItemProvider.dispose();
		if (parameterItemProvider != null)
			parameterItemProvider.dispose();
		if (typedefItemProvider != null)
			typedefItemProvider.dispose();
		if (htmlItemProvider != null)
			htmlItemProvider.dispose();
		if (stylesheetItemProvider != null)
			stylesheetItemProvider.dispose();
		if (moduleItemProvider != null)
			moduleItemProvider.dispose();
		if (controllerItemProvider != null)
			controllerItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (decoratorItemProvider != null)
			decoratorItemProvider.dispose();
		if (formatterItemProvider != null)
			formatterItemProvider.dispose();
		if (routeItemProvider != null)
			routeItemProvider.dispose();
	}

}
