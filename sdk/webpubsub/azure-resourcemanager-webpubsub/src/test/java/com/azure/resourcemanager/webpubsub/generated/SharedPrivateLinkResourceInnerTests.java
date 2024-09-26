// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import org.junit.jupiter.api.Assertions;

public final class SharedPrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedPrivateLinkResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"groupId\":\"wwa\",\"privateLinkResourceId\":\"zkoj\",\"provisioningState\":\"Running\",\"requestMessage\":\"zfoqouicybxar\",\"status\":\"Disconnected\"},\"id\":\"ufoxc\",\"name\":\"q\",\"type\":\"p\"}")
            .toObject(SharedPrivateLinkResourceInner.class);
        Assertions.assertEquals("wwa", model.groupId());
        Assertions.assertEquals("zkoj", model.privateLinkResourceId());
        Assertions.assertEquals("zfoqouicybxar", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedPrivateLinkResourceInner model = new SharedPrivateLinkResourceInner().withGroupId("wwa")
            .withPrivateLinkResourceId("zkoj")
            .withRequestMessage("zfoqouicybxar");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceInner.class);
        Assertions.assertEquals("wwa", model.groupId());
        Assertions.assertEquals("zkoj", model.privateLinkResourceId());
        Assertions.assertEquals("zfoqouicybxar", model.requestMessage());
    }
}
