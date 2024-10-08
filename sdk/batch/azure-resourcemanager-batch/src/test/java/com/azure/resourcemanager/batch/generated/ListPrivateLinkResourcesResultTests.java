// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.batch.models.ListPrivateLinkResourcesResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ListPrivateLinkResourcesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListPrivateLinkResourcesResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupId\":\"ntypmrbpizcdrqj\",\"requiredMembers\":[\"ydnfyhxdeoejz\"],\"requiredZoneNames\":[\"ifsjttgzfbishcb\"]},\"etag\":\"ajdeyeamdphaga\",\"tags\":{\"ow\":\"uxwgipwho\",\"injep\":\"gshwankixz\"},\"id\":\"ttmrywnuzoqf\",\"name\":\"iyqzrnk\",\"type\":\"qvyxlwhzlsicoho\"},{\"properties\":{\"groupId\":\"wvl\",\"requiredMembers\":[\"vwhheunmmqhgyx\",\"konocu\",\"oklyaxuconuq\"],\"requiredZoneNames\":[\"kbeype\",\"rmjmwvvjektc\"]},\"etag\":\"enhwlrs\",\"tags\":{\"qdqgbi\":\"zpwv\",\"fcivfsnkym\":\"ylihkaetckt\",\"jf\":\"ctq\",\"fuwutttxf\":\"ebrjcxe\"},\"id\":\"jrbirphxepcyv\",\"name\":\"hfnljkyq\",\"type\":\"j\"},{\"properties\":{\"groupId\":\"j\",\"requiredMembers\":[\"dokgjl\",\"yoxgvcltbgsnc\"],\"requiredZoneNames\":[\"jeszzhbijhtxfv\",\"xbf\"]},\"etag\":\"xnehmpvec\",\"tags\":{\"flz\":\"debfqkkrbmpukgri\",\"qzahmgkbrp\":\"fbxzpuzycisp\",\"hibnuqqkpika\":\"y\",\"buynhijggm\":\"rgvtqag\"},\"id\":\"bfs\",\"name\":\"arbu\",\"type\":\"rcvpnazzmhjrunmp\"},{\"properties\":{\"groupId\":\"dbhrbnlankxm\",\"requiredMembers\":[\"pbh\"],\"requiredZoneNames\":[\"tkcxywnytnrsy\",\"lqidyby\",\"czfc\",\"haaxdbabphl\"]},\"etag\":\"qlfktsths\",\"tags\":{\"wwrq\":\"cmnyyazttb\",\"ywbiexzfeyueax\":\"uedck\",\"wbhqwal\":\"bxu\",\"kzjancuxrhdwbav\":\"uzyoxaep\"},\"id\":\"bniwdj\",\"name\":\"wz\",\"type\":\"s\"}],\"nextLink\":\"pgn\"}")
            .toObject(ListPrivateLinkResourcesResult.class);
        Assertions.assertEquals("uxwgipwho", model.value().get(0).tags().get("ow"));
        Assertions.assertEquals("pgn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListPrivateLinkResourcesResult model = new ListPrivateLinkResourcesResult().withValue(
            Arrays.asList(new PrivateLinkResourceInner().withTags(mapOf("ow", "uxwgipwho", "injep", "gshwankixz")),
                new PrivateLinkResourceInner().withTags(
                    mapOf("qdqgbi", "zpwv", "fcivfsnkym", "ylihkaetckt", "jf", "ctq", "fuwutttxf", "ebrjcxe")),
                new PrivateLinkResourceInner().withTags(mapOf("flz", "debfqkkrbmpukgri", "qzahmgkbrp", "fbxzpuzycisp",
                    "hibnuqqkpika", "y", "buynhijggm", "rgvtqag")),
                new PrivateLinkResourceInner().withTags(mapOf("wwrq", "cmnyyazttb", "ywbiexzfeyueax", "uedck",
                    "wbhqwal", "bxu", "kzjancuxrhdwbav", "uzyoxaep"))))
            .withNextLink("pgn");
        model = BinaryData.fromObject(model).toObject(ListPrivateLinkResourcesResult.class);
        Assertions.assertEquals("uxwgipwho", model.value().get(0).tags().get("ow"));
        Assertions.assertEquals("pgn", model.nextLink());
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
