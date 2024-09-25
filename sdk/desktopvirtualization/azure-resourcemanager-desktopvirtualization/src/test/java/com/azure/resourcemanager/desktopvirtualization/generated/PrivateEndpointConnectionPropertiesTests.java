// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpoint;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"groupIds\":[\"rolfpfp\",\"algbquxigjyjg\"],\"privateEndpoint\":{\"id\":\"o\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"txilnerkujy\",\"actionsRequired\":\"l\"},\"provisioningState\":\"Deleting\"}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("txilnerkujy", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("l", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("txilnerkujy")
                        .withActionsRequired("l"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("txilnerkujy", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("l", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
