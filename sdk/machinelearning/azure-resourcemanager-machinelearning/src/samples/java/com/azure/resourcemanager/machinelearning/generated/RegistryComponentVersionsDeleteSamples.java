// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/**
 * Samples for RegistryComponentVersions Delete.
 */
public final class RegistryComponentVersionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2024-04-01/
     * examples/Registry/ComponentVersion/delete.json
     */
    /**
     * Sample code: Delete Registry Component Version.
     * 
     * @param manager Entry point to MachineLearningManager.
     */
    public static void
        deleteRegistryComponentVersion(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.registryComponentVersions()
            .delete("test-rg", "my-aml-registry", "string", "string", com.azure.core.util.Context.NONE);
    }
}
