// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DocumentDbCollectionSource;

public final class DocumentDbCollectionSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentDbCollectionSource model = BinaryData.fromString(
            "{\"type\":\"DocumentDbCollectionSource\",\"query\":\"datanrgmgnvcusv\",\"nestingSeparator\":\"datakzbdbv\",\"queryTimeout\":\"datanchymrfomlh\",\"additionalColumns\":\"dataiktecs\",\"sourceRetryCount\":\"datacqweydaa\",\"sourceRetryWait\":\"datattmfcx\",\"maxConcurrentConnections\":\"datawfsqjxxbs\",\"disableMetricsCollection\":\"dataqiwl\",\"\":{\"zpr\":\"datatsyjzdasgk\",\"lbddlnzmff\":\"dataqomuzohnpkof\",\"junmgd\":\"datavowlammvazvwzien\"}}")
            .toObject(DocumentDbCollectionSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentDbCollectionSource model = new DocumentDbCollectionSource().withSourceRetryCount("datacqweydaa")
            .withSourceRetryWait("datattmfcx").withMaxConcurrentConnections("datawfsqjxxbs")
            .withDisableMetricsCollection("dataqiwl").withQuery("datanrgmgnvcusv").withNestingSeparator("datakzbdbv")
            .withQueryTimeout("datanchymrfomlh").withAdditionalColumns("dataiktecs");
        model = BinaryData.fromObject(model).toObject(DocumentDbCollectionSource.class);
    }
}
