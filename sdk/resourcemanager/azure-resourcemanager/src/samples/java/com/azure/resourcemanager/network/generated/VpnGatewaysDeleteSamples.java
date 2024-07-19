// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnGateways Delete.
 */
public final class VpnGatewaysDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/VpnGatewayDelete.json
     */
    /**
     * Sample code: VpnGatewayDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnGatewayDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnGateways()
            .delete("rg1", "gateway1", com.azure.core.util.Context.NONE);
    }
}
