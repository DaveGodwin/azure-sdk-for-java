// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Moving\",\"privateEndpoint\":{\"id\":\"grauwjuetaebur\"},\"groupIds\":[\"movsmzlxwabmqoe\",\"kif\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"qujmqlgkf\",\"actionsRequired\":\"ndo\"}}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("grauwjuetaebur", model.privateEndpoint().id());
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qujmqlgkf", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ndo", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model = new PrivateEndpointConnectionProperties()
            .withPrivateEndpoint(new PrivateEndpoint().withId("grauwjuetaebur"))
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                    .withDescription("qujmqlgkf")
                    .withActionsRequired("ndo"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("grauwjuetaebur", model.privateEndpoint().id());
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qujmqlgkf", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ndo", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
