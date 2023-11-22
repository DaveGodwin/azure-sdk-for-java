// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceMarketingCloudSource;

public final class SalesforceMarketingCloudSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceMarketingCloudSource model = BinaryData.fromString(
            "{\"type\":\"SalesforceMarketingCloudSource\",\"query\":\"databky\",\"queryTimeout\":\"datagkouf\",\"additionalColumns\":\"dataaomy\",\"sourceRetryCount\":\"dataxrw\",\"sourceRetryWait\":\"databyaavfm\",\"maxConcurrentConnections\":\"dataamncuhxz\",\"disableMetricsCollection\":\"dataakxyhuetztorh\",\"\":{\"loorhxduregljqp\":\"datauysszhsewjqg\"}}")
            .toObject(SalesforceMarketingCloudSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceMarketingCloudSource model
            = new SalesforceMarketingCloudSource().withSourceRetryCount("dataxrw").withSourceRetryWait("databyaavfm")
                .withMaxConcurrentConnections("dataamncuhxz").withDisableMetricsCollection("dataakxyhuetztorh")
                .withQueryTimeout("datagkouf").withAdditionalColumns("dataaomy").withQuery("databky");
        model = BinaryData.fromObject(model).toObject(SalesforceMarketingCloudSource.class);
    }
}
