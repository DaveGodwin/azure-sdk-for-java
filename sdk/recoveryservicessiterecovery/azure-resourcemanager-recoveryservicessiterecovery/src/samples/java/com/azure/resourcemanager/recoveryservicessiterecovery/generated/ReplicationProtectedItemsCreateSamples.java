// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.EnableProtectionInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureEnableProtectionInput;

/** Samples for ReplicationProtectedItems Create. */
public final class ReplicationProtectedItemsCreateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectedItems_Create.json
     */
    /**
     * Sample code: Enables protection.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void enablesProtection(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectedItems()
            .define("f8491e4f-817a-40dd-a90c-af773978c75b")
            .withExistingReplicationProtectionContainer(
                "vault1", "resourceGroupPS1", "cloud1", "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179")
            .withProperties(
                new EnableProtectionInputProperties()
                    .withPolicyId(
                        "/Subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/resourceGroupPS1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationPolicies/protectionprofile1")
                    .withProtectableItemId(
                        "/Subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/resourceGroupPS1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationFabrics/cloud1/replicationProtectionContainers/cloud_6d224fc6-f326-5d35-96de-fbf51efb3179/replicationProtectableItems/f8491e4f-817a-40dd-a90c-af773978c75b")
                    .withProviderSpecificDetails(new HyperVReplicaAzureEnableProtectionInput()))
            .create();
    }
}
