// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.VaultPropertiesRedundancySettings;

public final class VaultPropertiesRedundancySettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultPropertiesRedundancySettings model =
            BinaryData
                .fromString(
                    "{\"standardTierStorageRedundancy\":\"LocallyRedundant\",\"crossRegionRestore\":\"Disabled\"}")
                .toObject(VaultPropertiesRedundancySettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultPropertiesRedundancySettings model = new VaultPropertiesRedundancySettings();
        model = BinaryData.fromObject(model).toObject(VaultPropertiesRedundancySettings.class);
    }
}
