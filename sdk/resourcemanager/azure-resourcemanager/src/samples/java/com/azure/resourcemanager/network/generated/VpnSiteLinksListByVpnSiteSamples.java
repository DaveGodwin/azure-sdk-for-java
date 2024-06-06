// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnSiteLinks ListByVpnSite.
 */
public final class VpnSiteLinksListByVpnSiteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VpnSiteLinkListByVpnSite.json
     */
    /**
     * Sample code: VpnSiteLinkListByVpnSite.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteLinkListByVpnSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVpnSiteLinks()
            .listByVpnSite("rg1", "vpnSite1", com.azure.core.util.Context.NONE);
    }
}
