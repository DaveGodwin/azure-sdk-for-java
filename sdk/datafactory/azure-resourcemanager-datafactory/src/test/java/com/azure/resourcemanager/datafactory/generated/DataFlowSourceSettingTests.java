// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowSourceSettingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowSourceSetting model = BinaryData.fromString(
            "{\"sourceName\":\"oxgjiuqhibt\",\"rowLimit\":645359051,\"\":{\"ktvqylkmqpzoy\":\"datawjedmurrxxgew\"}}")
            .toObject(DataFlowSourceSetting.class);
        Assertions.assertEquals("oxgjiuqhibt", model.sourceName());
        Assertions.assertEquals(645359051, model.rowLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowSourceSetting model = new DataFlowSourceSetting().withSourceName("oxgjiuqhibt").withRowLimit(645359051)
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DataFlowSourceSetting.class);
        Assertions.assertEquals("oxgjiuqhibt", model.sourceName());
        Assertions.assertEquals(645359051, model.rowLimit());
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
