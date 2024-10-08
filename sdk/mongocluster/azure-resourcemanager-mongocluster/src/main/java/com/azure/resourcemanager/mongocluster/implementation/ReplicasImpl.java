// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mongocluster.fluent.ReplicasClient;
import com.azure.resourcemanager.mongocluster.fluent.models.ReplicaInner;
import com.azure.resourcemanager.mongocluster.models.Replica;
import com.azure.resourcemanager.mongocluster.models.Replicas;

public final class ReplicasImpl implements Replicas {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicasImpl.class);

    private final ReplicasClient innerClient;

    private final com.azure.resourcemanager.mongocluster.MongoClusterManager serviceManager;

    public ReplicasImpl(ReplicasClient innerClient,
        com.azure.resourcemanager.mongocluster.MongoClusterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Replica> listByParent(String resourceGroupName, String mongoClusterName) {
        PagedIterable<ReplicaInner> inner = this.serviceClient().listByParent(resourceGroupName, mongoClusterName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReplicaImpl(inner1, this.manager()));
    }

    public PagedIterable<Replica> listByParent(String resourceGroupName, String mongoClusterName, Context context) {
        PagedIterable<ReplicaInner> inner
            = this.serviceClient().listByParent(resourceGroupName, mongoClusterName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReplicaImpl(inner1, this.manager()));
    }

    private ReplicasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mongocluster.MongoClusterManager manager() {
        return this.serviceManager;
    }
}
