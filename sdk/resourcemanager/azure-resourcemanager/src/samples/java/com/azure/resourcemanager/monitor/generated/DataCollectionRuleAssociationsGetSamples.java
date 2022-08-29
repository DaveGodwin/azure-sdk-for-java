// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for DataCollectionRuleAssociations Get. */
public final class DataCollectionRuleAssociationsGetSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-09-01-preview/examples/DataCollectionRuleAssociationsGet.json
     */
    /**
     * Sample code: Get association.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAssociation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getDataCollectionRuleAssociations()
            .getWithResponse(
                "subscriptions/703362b3-f278-4e4b-9179-c76eaf41ffc2/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVm",
                "myAssociation",
                Context.NONE);
    }
}
