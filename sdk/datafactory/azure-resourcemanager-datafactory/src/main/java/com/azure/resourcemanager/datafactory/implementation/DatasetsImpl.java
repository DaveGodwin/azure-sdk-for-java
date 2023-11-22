// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.DatasetsClient;
import com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner;
import com.azure.resourcemanager.datafactory.models.DatasetResource;
import com.azure.resourcemanager.datafactory.models.Datasets;

public final class DatasetsImpl implements Datasets {
    private static final ClientLogger LOGGER = new ClientLogger(DatasetsImpl.class);

    private final DatasetsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public DatasetsImpl(DatasetsClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DatasetResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<DatasetResourceInner> inner = this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return Utils.mapPage(inner, inner1 -> new DatasetResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DatasetResource> listByFactory(String resourceGroupName, String factoryName, Context context) {
        PagedIterable<DatasetResourceInner> inner
            = this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return Utils.mapPage(inner, inner1 -> new DatasetResourceImpl(inner1, this.manager()));
    }

    public Response<DatasetResource> getWithResponse(String resourceGroupName, String factoryName, String datasetName,
        String ifNoneMatch, Context context) {
        Response<DatasetResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, factoryName, datasetName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DatasetResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatasetResource get(String resourceGroupName, String factoryName, String datasetName) {
        DatasetResourceInner inner = this.serviceClient().get(resourceGroupName, factoryName, datasetName);
        if (inner != null) {
            return new DatasetResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String factoryName, String datasetName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, datasetName, context);
    }

    public void delete(String resourceGroupName, String factoryName, String datasetName) {
        this.serviceClient().delete(resourceGroupName, factoryName, datasetName);
    }

    public DatasetResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String datasetName = Utils.getValueFromIdByName(id, "datasets");
        if (datasetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'datasets'.", id)));
        }
        String localIfNoneMatch = null;
        return this.getWithResponse(resourceGroupName, factoryName, datasetName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<DatasetResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String datasetName = Utils.getValueFromIdByName(id, "datasets");
        if (datasetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'datasets'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, datasetName, ifNoneMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String datasetName = Utils.getValueFromIdByName(id, "datasets");
        if (datasetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'datasets'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, datasetName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String datasetName = Utils.getValueFromIdByName(id, "datasets");
        if (datasetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'datasets'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, datasetName, context);
    }

    private DatasetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public DatasetResourceImpl define(String name) {
        return new DatasetResourceImpl(name, this.manager());
    }
}
