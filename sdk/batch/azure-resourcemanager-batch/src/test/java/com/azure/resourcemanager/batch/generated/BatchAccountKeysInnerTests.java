// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountKeysInner;

public final class BatchAccountKeysInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BatchAccountKeysInner model = BinaryData
            .fromString(
                "{\"accountName\":\"ibmadgakeqsrxy\",\"primary\":\"qqedqytbciqfou\",\"secondary\":\"mmnkzsmodmgl\"}")
            .toObject(BatchAccountKeysInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BatchAccountKeysInner model = new BatchAccountKeysInner();
        model = BinaryData.fromObject(model).toObject(BatchAccountKeysInner.class);
    }
}
