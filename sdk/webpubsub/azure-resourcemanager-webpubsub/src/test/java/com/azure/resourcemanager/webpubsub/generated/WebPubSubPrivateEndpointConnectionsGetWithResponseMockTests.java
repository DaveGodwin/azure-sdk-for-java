// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointConnection;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WebPubSubPrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Running\",\"privateEndpoint\":{\"id\":\"zudnigrfiho\"},\"groupIds\":[\"wlpxuzzjg\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"yhqotoihiqakydi\",\"actionsRequired\":\"brkwpzdqt\"}},\"id\":\"cspodaqax\",\"name\":\"ipietgbe\",\"type\":\"jfulbmoic\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        WebPubSubManager manager = WebPubSubManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.webPubSubPrivateEndpointConnections()
            .getWithResponse("memczjkmmyk", "ujxsglhsr", "rye", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zudnigrfiho", response.privateEndpoint().id());
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.APPROVED,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("yhqotoihiqakydi", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("brkwpzdqt", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
