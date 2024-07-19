// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuitConnections List.
 */
public final class ExpressRouteCircuitConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * ExpressRouteCircuitConnectionList.json
     */
    /**
     * Sample code: List ExpressRouteCircuit Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExpressRouteCircuitConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuitConnections()
            .list("rg1", "ExpressRouteARMCircuitA", "AzurePrivatePeering", com.azure.core.util.Context.NONE);
    }
}
