// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapOdpSource;

public final class SapOdpSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOdpSource model = BinaryData.fromString(
            "{\"type\":\"SapOdpSource\",\"extractionMode\":\"datapbdbicjzntiblxey\",\"subscriberProcess\":\"datasuhroicj\",\"selection\":\"dataqdymoa\",\"projection\":\"datakcm\",\"queryTimeout\":\"dataxiuxqb\",\"additionalColumns\":\"datalgspzoafprz\",\"sourceRetryCount\":\"datahohzkcsjddzpo\",\"sourceRetryWait\":\"datanmky\",\"maxConcurrentConnections\":\"dataqmuu\",\"disableMetricsCollection\":\"dataxmkrulavxeaymf\",\"\":{\"unptsry\":\"datawp\"}}")
            .toObject(SapOdpSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOdpSource model = new SapOdpSource().withSourceRetryCount("datahohzkcsjddzpo")
            .withSourceRetryWait("datanmky").withMaxConcurrentConnections("dataqmuu")
            .withDisableMetricsCollection("dataxmkrulavxeaymf").withQueryTimeout("dataxiuxqb")
            .withAdditionalColumns("datalgspzoafprz").withExtractionMode("datapbdbicjzntiblxey")
            .withSubscriberProcess("datasuhroicj").withSelection("dataqdymoa").withProjection("datakcm");
        model = BinaryData.fromObject(model).toObject(SapOdpSource.class);
    }
}
