// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.FeaturesetContainersClient;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturesetContainerInner;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainer;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainers;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

public final class FeaturesetContainersImpl implements FeaturesetContainers {
    private static final ClientLogger LOGGER = new ClientLogger(FeaturesetContainersImpl.class);

    private final FeaturesetContainersClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public FeaturesetContainersImpl(FeaturesetContainersClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FeaturesetContainer> list(String resourceGroupName, String workspaceName) {
        PagedIterable<FeaturesetContainerInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FeaturesetContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<FeaturesetContainer> list(String resourceGroupName, String workspaceName, String skip,
        String tags, ListViewType listViewType, Integer pageSize, String name, String description, String createdBy,
        Context context) {
        PagedIterable<FeaturesetContainerInner> inner = this.serviceClient()
            .list(resourceGroupName, workspaceName, skip, tags, listViewType, pageSize, name, description, createdBy,
                context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FeaturesetContainerImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String name) {
        this.serviceClient().delete(resourceGroupName, workspaceName, name);
    }

    public void delete(String resourceGroupName, String workspaceName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, name, context);
    }

    public Response<FeaturesetContainer> getEntityWithResponse(String resourceGroupName, String workspaceName,
        String name, Context context) {
        Response<FeaturesetContainerInner> inner
            = this.serviceClient().getEntityWithResponse(resourceGroupName, workspaceName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FeaturesetContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FeaturesetContainer getEntity(String resourceGroupName, String workspaceName, String name) {
        FeaturesetContainerInner inner = this.serviceClient().getEntity(resourceGroupName, workspaceName, name);
        if (inner != null) {
            return new FeaturesetContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FeaturesetContainer getEntityById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "featuresets");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'featuresets'.", id)));
        }
        return this.getEntityWithResponse(resourceGroupName, workspaceName, name, Context.NONE).getValue();
    }

    public Response<FeaturesetContainer> getEntityByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "featuresets");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'featuresets'.", id)));
        }
        return this.getEntityWithResponse(resourceGroupName, workspaceName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "featuresets");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'featuresets'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = ResourceManagerUtils.getValueFromIdByName(id, "featuresets");
        if (name == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'featuresets'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, name, context);
    }

    private FeaturesetContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public FeaturesetContainerImpl define(String name) {
        return new FeaturesetContainerImpl(name, this.manager());
    }
}
