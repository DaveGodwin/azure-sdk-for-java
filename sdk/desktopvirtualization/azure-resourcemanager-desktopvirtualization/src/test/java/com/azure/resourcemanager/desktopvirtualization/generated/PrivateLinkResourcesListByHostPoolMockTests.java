// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkResourcesListByHostPoolMockTests {
    @Test
    public void testListByHostPool() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"groupId\":\"wkpqhjpenuygbq\",\"requiredMembers\":[\"ekewvnqvcdlguauc\",\"f\",\"jwnlax\"],\"requiredZoneNames\":[\"jqi\",\"czvvit\"]},\"id\":\"gx\",\"name\":\"fcsserxhtvsox\",\"type\":\"lwntsjgqrs\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateLinkResource> response = manager.privateLinkResources()
            .listByHostPool("ji", "xfz", 9701584, false, 2008272584, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jqi", response.iterator().next().requiredZoneNames().get(0));
    }
}
