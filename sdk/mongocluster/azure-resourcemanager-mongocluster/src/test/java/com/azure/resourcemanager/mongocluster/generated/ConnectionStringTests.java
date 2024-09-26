// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.ConnectionString;

public final class ConnectionStringTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionString model = BinaryData
            .fromString("{\"connectionString\":\"jfkgiawxk\",\"description\":\"ypl\",\"name\":\"kbasyypn\"}")
            .toObject(ConnectionString.class);
    }
}
