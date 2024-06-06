// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnLinkConnections GetIkeSas.
 */
public final class VpnLinkConnectionsGetIkeSasSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VpnSiteLinkConnectionGetIkeSas.json
     */
    /**
     * Sample code: GetVpnLinkConnectionIkeSa.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVpnLinkConnectionIkeSa(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnLinkConnections()
            .getIkeSas("rg1", "gateway1", "vpnConnection1", "Connection-Link1", com.azure.core.util.Context.NONE);
    }
}
