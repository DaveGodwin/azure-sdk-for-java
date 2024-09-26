// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.MongoClusterRestoreParameters;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class MongoClusterRestoreParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoClusterRestoreParameters model = BinaryData
            .fromString("{\"pointInTimeUTC\":\"2021-05-03T09:30:55Z\",\"sourceResourceId\":\"snhsjcnyejhkryh\"}")
            .toObject(MongoClusterRestoreParameters.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T09:30:55Z"), model.pointInTimeUTC());
        Assertions.assertEquals("snhsjcnyejhkryh", model.sourceResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoClusterRestoreParameters model
            = new MongoClusterRestoreParameters().withPointInTimeUTC(OffsetDateTime.parse("2021-05-03T09:30:55Z"))
                .withSourceResourceId("snhsjcnyejhkryh");
        model = BinaryData.fromObject(model).toObject(MongoClusterRestoreParameters.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T09:30:55Z"), model.pointInTimeUTC());
        Assertions.assertEquals("snhsjcnyejhkryh", model.sourceResourceId());
    }
}
