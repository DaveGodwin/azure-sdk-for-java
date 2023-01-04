// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationLogicalNetworksClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LogicalNetwork;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationLogicalNetworks;

public final class ReplicationLogicalNetworksImpl implements ReplicationLogicalNetworks {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationLogicalNetworksImpl.class);

    private final ReplicationLogicalNetworksClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationLogicalNetworksImpl(
        ReplicationLogicalNetworksClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LogicalNetwork> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName) {
        PagedIterable<LogicalNetworkInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName);
        return Utils.mapPage(inner, inner1 -> new LogicalNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<LogicalNetwork> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        PagedIterable<LogicalNetworkInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName, context);
        return Utils.mapPage(inner, inner1 -> new LogicalNetworkImpl(inner1, this.manager()));
    }

    public Response<LogicalNetwork> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName, Context context) {
        Response<LogicalNetworkInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceName, resourceGroupName, fabricName, logicalNetworkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogicalNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LogicalNetwork get(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName) {
        LogicalNetworkInner inner =
            this.serviceClient().get(resourceName, resourceGroupName, fabricName, logicalNetworkName);
        if (inner != null) {
            return new LogicalNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ReplicationLogicalNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
