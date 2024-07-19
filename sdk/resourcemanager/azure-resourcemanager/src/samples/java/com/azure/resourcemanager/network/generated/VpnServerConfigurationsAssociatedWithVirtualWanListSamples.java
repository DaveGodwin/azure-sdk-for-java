// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnServerConfigurationsAssociatedWithVirtualWan List.
 */
public final class VpnServerConfigurationsAssociatedWithVirtualWanListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/
     * GetVirtualWanVpnServerConfigurations.json
     */
    /**
     * Sample code: GetVirtualWanVpnServerConfigurations.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualWanVpnServerConfigurations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnServerConfigurationsAssociatedWithVirtualWans()
            .list("rg1", "wan1", com.azure.core.util.Context.NONE);
    }
}
