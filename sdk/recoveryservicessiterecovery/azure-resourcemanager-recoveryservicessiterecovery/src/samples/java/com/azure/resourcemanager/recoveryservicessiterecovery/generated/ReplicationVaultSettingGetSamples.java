// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationVaultSetting Get. */
public final class ReplicationVaultSettingGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationVaultSetting_Get.json
     */
    /**
     * Sample code: Gets the vault setting.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheVaultSetting(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationVaultSettings().getWithResponse("vault1", "resourceGroupPS1", "default", Context.NONE);
    }
}
