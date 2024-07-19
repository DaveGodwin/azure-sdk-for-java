// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for IpAllocations List.
 */
public final class IpAllocationsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-01-01/examples/IpAllocationList.json
     */
    /**
     * Sample code: List all IpAllocations.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllIpAllocations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getIpAllocations().list(com.azure.core.util.Context.NONE);
    }
}
