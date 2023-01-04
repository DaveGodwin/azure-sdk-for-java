// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaAzureUpdateReplicationProtectedItemInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.IpConfigInputDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LicenseType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateReplicationProtectedItemInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMNicInputDetails;
import java.util.Arrays;

/** Samples for ReplicationProtectedItems Update. */
public final class ReplicationProtectedItemsUpdateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectedItems_Update.json
     */
    /**
     * Sample code: Updates the replication protected Item settings.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void updatesTheReplicationProtectedItemSettings(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        ReplicationProtectedItem resource =
            manager
                .replicationProtectedItems()
                .getWithResponse(
                    "vault1",
                    "resourceGroupPS1",
                    "cloud1",
                    "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                    "f8491e4f-817a-40dd-a90c-af773978c75b",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new UpdateReplicationProtectedItemInputProperties()
                    .withRecoveryAzureVMName("vm1")
                    .withRecoveryAzureVMSize("Basic_A0")
                    .withSelectedRecoveryAzureNetworkId(
                        "/subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/siterecoveryProd1/providers/Microsoft.Network/virtualNetworks/vnetavrai")
                    .withVmNics(
                        Arrays
                            .asList(
                                new VMNicInputDetails()
                                    .withNicId(
                                        "TWljcm9zb2Z0OkY4NDkxRTRGLTgxN0EtNDBERC1BOTBDLUFGNzczOTc4Qzc1Qlw3NjAwMzMxRS03NDk4LTQ0QTQtQjdDNy0xQjY1NkJDREQ1MkQ=")
                                    .withIpConfigs(
                                        Arrays
                                            .asList(
                                                new IpConfigInputDetails()
                                                    .withIpConfigName("ipconfig1")
                                                    .withIsPrimary(true)
                                                    .withRecoverySubnetName("subnet1")
                                                    .withRecoveryStaticIpAddress("10.0.2.46")))
                                    .withSelectionType("SelectedByUser")))
                    .withLicenseType(LicenseType.WINDOWS_SERVER)
                    .withProviderSpecificDetails(new HyperVReplicaAzureUpdateReplicationProtectedItemInput()))
            .apply();
    }
}
