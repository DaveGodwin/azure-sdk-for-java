// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationRecoveryPlans Reprotect. */
public final class ReplicationRecoveryPlansReprotectSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationRecoveryPlans_Reprotect.json
     */
    /**
     * Sample code: Execute reprotect of the recovery plan.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void executeReprotectOfTheRecoveryPlan(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationRecoveryPlans().reprotect("vault1", "resourceGroupPS1", "RPtest1", Context.NONE);
    }
}
