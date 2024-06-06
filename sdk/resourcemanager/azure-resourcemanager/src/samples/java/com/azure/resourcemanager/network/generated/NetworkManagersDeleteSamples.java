// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkManagers Delete.
 */
public final class NetworkManagersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkManagerDelete.json
     */
    /**
     * Sample code: NetworkManagersDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkManagersDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkManagers()
            .delete("rg1", "testNetworkManager", false, com.azure.core.util.Context.NONE);
    }
}
