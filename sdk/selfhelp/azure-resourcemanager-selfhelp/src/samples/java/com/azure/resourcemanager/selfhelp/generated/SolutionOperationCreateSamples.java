// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.resourcemanager.selfhelp.models.Name;
import com.azure.resourcemanager.selfhelp.models.TriggerCriterion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SolutionOperation Create.
 */
public final class SolutionOperationCreateSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/preview/2024-03-01-preview/examples/Solution_Create.json
     */
    /**
     * Sample code: Solution_Create.
     * 
     * @param manager Entry point to SelfHelpManager.
     */
    public static void solutionCreate(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager.solutionOperations()
            .define("SolutionResourceName1")
            .withExistingScope(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp")
            .withTriggerCriteria(
                Arrays.asList(new TriggerCriterion().withName(Name.SOLUTION_ID).withValue("SolutionId1")))
            .withParameters(mapOf("resourceUri",
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp"))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
