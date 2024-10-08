// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.NameAvailabilityCheckRequestParameters;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityCheckRequestParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityCheckRequestParameters model
            = BinaryData.fromString("{\"name\":\"ftumrtwnawjslbiw\",\"type\":\"jgcyztsfmznba\"}")
                .toObject(NameAvailabilityCheckRequestParameters.class);
        Assertions.assertEquals("ftumrtwnawjslbiw", model.name());
        Assertions.assertEquals("jgcyztsfmznba", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityCheckRequestParameters model
            = new NameAvailabilityCheckRequestParameters().withName("ftumrtwnawjslbiw").withType("jgcyztsfmznba");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityCheckRequestParameters.class);
        Assertions.assertEquals("ftumrtwnawjslbiw", model.name());
        Assertions.assertEquals("jgcyztsfmznba", model.type());
    }
}
