// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for RoutingIntent Get.
 */
public final class RoutingIntentGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/RoutingIntentGet.json
     */
    /**
     * Sample code: RouteTableGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeTableGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getRoutingIntents()
            .getWithResponse("rg1", "virtualHub1", "Intent1", com.azure.core.util.Context.NONE);
    }
}
