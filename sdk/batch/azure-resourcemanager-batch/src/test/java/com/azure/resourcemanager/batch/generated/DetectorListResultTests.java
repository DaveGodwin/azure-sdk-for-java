// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.batch.models.DetectorListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DetectorListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DetectorListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"value\":\"atkpnp\"},\"etag\":\"exxbczwtr\",\"tags\":{\"yokacspkw\":\"qzbqjvsov\",\"rkcciwwzjuqk\":\"hzdobpxjmflbvvnc\"},\"id\":\"rsa\",\"name\":\"iwkuofos\",\"type\":\"ghsauuimjmvxied\"}],\"nextLink\":\"gidyjrrf\"}")
            .toObject(DetectorListResult.class);
        Assertions.assertEquals("qzbqjvsov", model.value().get(0).tags().get("yokacspkw"));
        Assertions.assertEquals("atkpnp", model.value().get(0).value());
        Assertions.assertEquals("gidyjrrf", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DetectorListResult model = new DetectorListResult().withValue(Arrays.asList(
            new DetectorResponseInner().withTags(mapOf("yokacspkw", "qzbqjvsov", "rkcciwwzjuqk", "hzdobpxjmflbvvnc"))
                .withValue("atkpnp")))
            .withNextLink("gidyjrrf");
        model = BinaryData.fromObject(model).toObject(DetectorListResult.class);
        Assertions.assertEquals("qzbqjvsov", model.value().get(0).tags().get("yokacspkw"));
        Assertions.assertEquals("atkpnp", model.value().get(0).value());
        Assertions.assertEquals("gidyjrrf", model.nextLink());
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
