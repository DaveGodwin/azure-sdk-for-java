// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonSink;
import com.azure.resourcemanager.datafactory.models.JsonWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class JsonSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonSink model = BinaryData.fromString(
            "{\"type\":\"JsonSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"datatsduf\",\"disableMetricsCollection\":\"databvvkuzyg\",\"copyBehavior\":\"datazubdtzsachmh\",\"metadata\":[{\"name\":\"datanpkkbxkzc\",\"value\":\"dataosralbxhdxnlu\"},{\"name\":\"datawuafbh\",\"value\":\"dataaqf\"}],\"\":{\"rmlbkvqogzaw\":\"datap\"}},\"formatSettings\":{\"type\":\"JsonWriteSettings\",\"filePattern\":\"datadnxum\",\"\":{\"qwsyntcwrluqa\":\"datanvscyu\"}},\"writeBatchSize\":\"datalygfvbfejb\",\"writeBatchTimeout\":\"dataklgpifvpsmvksa\",\"sinkRetryCount\":\"datamsnplqfivxfqmdjz\",\"sinkRetryWait\":\"datavmkplrjkmpaxoey\",\"maxConcurrentConnections\":\"dataofaogvmqzagrqcqh\",\"disableMetricsCollection\":\"dataskmkdr\",\"\":{\"ldwcxjvexlutxcmc\":\"datapn\",\"yypvhdulds\":\"datacotqocn\"}}")
            .toObject(JsonSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonSink model = new JsonSink().withWriteBatchSize("datalygfvbfejb")
            .withWriteBatchTimeout("dataklgpifvpsmvksa")
            .withSinkRetryCount("datamsnplqfivxfqmdjz")
            .withSinkRetryWait("datavmkplrjkmpaxoey")
            .withMaxConcurrentConnections("dataofaogvmqzagrqcqh")
            .withDisableMetricsCollection("dataskmkdr")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("datatsduf")
                .withDisableMetricsCollection("databvvkuzyg")
                .withCopyBehavior("datazubdtzsachmh")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datanpkkbxkzc").withValue("dataosralbxhdxnlu"),
                    new MetadataItem().withName("datawuafbh").withValue("dataaqf")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(new JsonWriteSettings().withFilePattern("datadnxum"));
        model = BinaryData.fromObject(model).toObject(JsonSink.class);
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
