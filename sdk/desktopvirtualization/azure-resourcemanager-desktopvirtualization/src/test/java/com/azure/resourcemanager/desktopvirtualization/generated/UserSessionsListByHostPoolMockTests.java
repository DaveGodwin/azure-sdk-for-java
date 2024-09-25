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
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionState;
import com.azure.resourcemanager.desktopvirtualization.models.UserSession;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UserSessionsListByHostPoolMockTests {
    @Test
    public void testListByHostPool() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"objectId\":\"guyxlyk\",\"userPrincipalName\":\"hvxzcwxhmp\",\"applicationType\":\"RemoteApp\",\"sessionState\":\"UserProfileDiskMounted\",\"activeDirectoryUserName\":\"xaonwivkcqh\",\"createTime\":\"2021-11-27T12:45:35Z\"},\"id\":\"knlccrmmkyup\",\"name\":\"jubyqjfkakfq\",\"type\":\"rke\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<UserSession> response = manager.userSessions()
            .listByHostPool("fexl", "xn", "akizvoaikna", 2097899264, true, 427869575, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hvxzcwxhmp", response.iterator().next().userPrincipalName());
        Assertions.assertEquals(ApplicationType.REMOTE_APP, response.iterator().next().applicationType());
        Assertions.assertEquals(SessionState.USER_PROFILE_DISK_MOUNTED, response.iterator().next().sessionState());
        Assertions.assertEquals("xaonwivkcqh", response.iterator().next().activeDirectoryUsername());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-27T12:45:35Z"), response.iterator().next().createTime());
    }
}
