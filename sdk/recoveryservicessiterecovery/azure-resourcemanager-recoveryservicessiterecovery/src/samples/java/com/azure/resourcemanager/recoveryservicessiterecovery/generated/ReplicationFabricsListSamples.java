// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationFabrics List. */
public final class ReplicationFabricsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationFabrics_List.json
     */
    /**
     * Sample code: Gets the list of ASR fabrics.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfASRFabrics(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationFabrics().list("vault1", "resourceGroupPS1", Context.NONE);
    }
}
