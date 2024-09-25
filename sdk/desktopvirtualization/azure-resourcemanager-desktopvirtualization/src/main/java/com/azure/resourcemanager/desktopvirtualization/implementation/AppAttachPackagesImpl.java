// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.AppAttachPackagesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.AppAttachPackageInner;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackage;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackages;

public final class AppAttachPackagesImpl implements AppAttachPackages {
    private static final ClientLogger LOGGER = new ClientLogger(AppAttachPackagesImpl.class);

    private final AppAttachPackagesClient innerClient;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    public AppAttachPackagesImpl(AppAttachPackagesClient innerClient,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AppAttachPackage> getByResourceGroupWithResponse(String resourceGroupName,
        String appAttachPackageName, Context context) {
        Response<AppAttachPackageInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AppAttachPackageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AppAttachPackage getByResourceGroup(String resourceGroupName, String appAttachPackageName) {
        AppAttachPackageInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, appAttachPackageName);
        if (inner != null) {
            return new AppAttachPackageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String appAttachPackageName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, appAttachPackageName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String appAttachPackageName) {
        this.serviceClient().delete(resourceGroupName, appAttachPackageName);
    }

    public PagedIterable<AppAttachPackage> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AppAttachPackageInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AppAttachPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<AppAttachPackage> listByResourceGroup(String resourceGroupName, String filter,
        Context context) {
        PagedIterable<AppAttachPackageInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AppAttachPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<AppAttachPackage> list() {
        PagedIterable<AppAttachPackageInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AppAttachPackageImpl(inner1, this.manager()));
    }

    public PagedIterable<AppAttachPackage> list(String filter, Context context) {
        PagedIterable<AppAttachPackageInner> inner = this.serviceClient().list(filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AppAttachPackageImpl(inner1, this.manager()));
    }

    public AppAttachPackage getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String appAttachPackageName = ResourceManagerUtils.getValueFromIdByName(id, "appAttachPackages");
        if (appAttachPackageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'appAttachPackages'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, Context.NONE).getValue();
    }

    public Response<AppAttachPackage> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String appAttachPackageName = ResourceManagerUtils.getValueFromIdByName(id, "appAttachPackages");
        if (appAttachPackageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'appAttachPackages'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String appAttachPackageName = ResourceManagerUtils.getValueFromIdByName(id, "appAttachPackages");
        if (appAttachPackageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'appAttachPackages'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String appAttachPackageName = ResourceManagerUtils.getValueFromIdByName(id, "appAttachPackages");
        if (appAttachPackageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'appAttachPackages'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, appAttachPackageName, context);
    }

    private AppAttachPackagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }

    public AppAttachPackageImpl define(String name) {
        return new AppAttachPackageImpl(name, this.manager());
    }
}
