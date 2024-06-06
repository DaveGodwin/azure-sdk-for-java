// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworkGatewayConnections GetByResourceGroup.
 */
public final class VirtualNetworkGatewayConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VirtualNetworkGatewayConnectionGet.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayConnection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkGatewayConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayConnections()
            .getByResourceGroupWithResponse("rg1", "connS2S", com.azure.core.util.Context.NONE);
    }
}
