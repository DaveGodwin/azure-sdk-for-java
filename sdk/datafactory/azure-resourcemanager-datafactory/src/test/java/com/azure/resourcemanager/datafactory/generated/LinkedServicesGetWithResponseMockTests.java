// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.LinkedServiceResource;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LinkedServicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"type\":\"LinkedService\",\"version\":\"dfvd\",\"connectVia\":{\"referenceName\":\"b\",\"parameters\":{\"dad\":\"databvyuarbycuux\",\"ugmfersbktrei\":\"datalilkmptvmtn\",\"gjrkuepr\":\"datalszpusb\"}},\"description\":\"zbfoldbbli\",\"parameters\":{\"vqbnzrrkmanr\":{\"type\":\"Bool\",\"defaultValue\":\"datapvmaywpra\"},\"keseazgf\":{\"type\":\"Int\",\"defaultValue\":\"dataqojxyabvvbsilah\"}},\"annotations\":[\"datassi\",\"dataelbtgexiwcqeihuy\",\"datazidoyvquufplm\"],\"\":{\"otpvoehs\":\"datazbtrf\"}},\"name\":\"rao\",\"type\":\"r\",\"etag\":\"wdgzfqsreyui\",\"id\":\"rr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        LinkedServiceResource response = manager.linkedServices()
            .getWithResponse("frisreh", "yfi", "lpiqei", "jboghjdihtc", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rr", response.id());
        Assertions.assertEquals("dfvd", response.properties().version());
        Assertions.assertEquals("b", response.properties().connectVia().referenceName());
        Assertions.assertEquals("zbfoldbbli", response.properties().description());
        Assertions.assertEquals(ParameterType.BOOL, response.properties().parameters().get("vqbnzrrkmanr").type());
    }
}
