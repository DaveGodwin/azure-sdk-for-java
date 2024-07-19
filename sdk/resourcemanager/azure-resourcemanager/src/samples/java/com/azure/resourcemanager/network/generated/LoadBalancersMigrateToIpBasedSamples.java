// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.MigrateLoadBalancerToIpBasedRequest;
import java.util.Arrays;

/**
 * Samples for LoadBalancers MigrateToIpBased.
 */
public final class LoadBalancersMigrateToIpBasedSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/MigrateLoadBalancerToIPBased.
     * json
     */
    /**
     * Sample code: Migrate load balancer to IP Based.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void migrateLoadBalancerToIPBased(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getLoadBalancers()
            .migrateToIpBasedWithResponse("rg1", "lb1",
                new MigrateLoadBalancerToIpBasedRequest().withPools(Arrays.asList("pool1", "pool2")),
                com.azure.core.util.Context.NONE);
    }
}
