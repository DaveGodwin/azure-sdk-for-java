// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for AdminRules Delete.
 */
public final class AdminRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkManagerAdminRuleDelete.json
     */
    /**
     * Sample code: Deletes an admin rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesAnAdminRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getAdminRules()
            .delete("rg1", "testNetworkManager", "myTestSecurityConfig", "testRuleCollection", "SampleAdminRule", false,
                com.azure.core.util.Context.NONE);
    }
}
