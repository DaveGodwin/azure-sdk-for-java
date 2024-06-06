// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationSecurityGroups List.
 */
public final class ApplicationSecurityGroupsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/ApplicationSecurityGroupListAll.json
     */
    /**
     * Sample code: List all application security groups.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllApplicationSecurityGroups(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationSecurityGroups()
            .list(com.azure.core.util.Context.NONE);
    }
}
