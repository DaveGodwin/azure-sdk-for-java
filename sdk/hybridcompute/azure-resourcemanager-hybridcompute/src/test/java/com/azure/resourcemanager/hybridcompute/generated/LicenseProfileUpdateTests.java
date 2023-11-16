// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LicenseProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LicenseProfileUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"esuProfile\":{\"assignedLicense\":\"a\"}},\"tags\":{\"nowkgshw\":\"hagalpbuxwgipwh\"}}")
                .toObject(LicenseProfileUpdate.class);
        Assertions.assertEquals("hagalpbuxwgipwh", model.tags().get("nowkgshw"));
        Assertions.assertEquals("a", model.assignedLicense());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LicenseProfileUpdate model =
            new LicenseProfileUpdate().withTags(mapOf("nowkgshw", "hagalpbuxwgipwh")).withAssignedLicense("a");
        model = BinaryData.fromObject(model).toObject(LicenseProfileUpdate.class);
        Assertions.assertEquals("hagalpbuxwgipwh", model.tags().get("nowkgshw"));
        Assertions.assertEquals("a", model.assignedLicense());
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
