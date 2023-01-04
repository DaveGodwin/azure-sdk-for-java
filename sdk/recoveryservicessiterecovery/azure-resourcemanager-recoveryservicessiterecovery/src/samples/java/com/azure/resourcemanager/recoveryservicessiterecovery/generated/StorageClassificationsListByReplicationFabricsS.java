// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for StorageClassifications ListByReplicationFabrics. */
public final class StorageClassificationsListByReplicationFabricsS {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationStorageClassifications_ListByReplicationFabrics.json
     */
    /**
     * Sample code: Gets the list of storage classification objects under a fabric.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfStorageClassificationObjectsUnderAFabric(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .storageClassifications()
            .listByReplicationFabrics(
                "vault1",
                "resourceGroupPS1",
                "2a48e3770ac08aa2be8bfbd94fcfb1cbf2dcc487b78fb9d3bd778304441b06a0",
                Context.NONE);
    }
}
