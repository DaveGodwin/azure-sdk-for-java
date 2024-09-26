// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.OutboundEnvironmentEndpointCollection;
import org.junit.jupiter.api.Assertions;

public final class OutboundEnvironmentEndpointCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpointCollection model = BinaryData.fromString(
            "{\"value\":[{\"category\":\"wuggwolu\",\"endpoints\":[{\"domainName\":\"wem\",\"description\":\"i\",\"endpointDetails\":[{}]},{\"domainName\":\"gzd\",\"description\":\"swe\",\"endpointDetails\":[{},{},{}]}]},{\"category\":\"dxggicccnxqhuexm\",\"endpoints\":[{\"domainName\":\"stvlzywemhzrnc\",\"description\":\"tclusiypbsfgy\",\"endpointDetails\":[{},{}]},{\"domainName\":\"lfeadcygq\",\"description\":\"yhejhzisxgfp\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"p\",\"description\":\"ksrpqv\",\"endpointDetails\":[{},{}]}]},{\"category\":\"aehtwd\",\"endpoints\":[{\"domainName\":\"swibyr\",\"description\":\"l\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"fwpracstwi\",\"description\":\"khevxccedc\",\"endpointDetails\":[{}]},{\"domainName\":\"yodnwzxltj\",\"description\":\"nhltiugcxn\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"xqi\",\"description\":\"qunyowxwlmdjr\",\"endpointDetails\":[{},{},{}]}]}],\"nextLink\":\"bvfvpdbod\"}")
            .toObject(OutboundEnvironmentEndpointCollection.class);
        Assertions.assertEquals("bvfvpdbod", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpointCollection model
            = new OutboundEnvironmentEndpointCollection().withNextLink("bvfvpdbod");
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointCollection.class);
        Assertions.assertEquals("bvfvpdbod", model.nextLink());
    }
}
