// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SybaseSource;

public final class SybaseSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseSource model = BinaryData.fromString(
            "{\"type\":\"SybaseSource\",\"query\":\"dataodrvwnqbpxyofft\",\"queryTimeout\":\"dataovbhqelsslfxejp\",\"additionalColumns\":\"datasgigs\",\"sourceRetryCount\":\"datatx\",\"sourceRetryWait\":\"datayjwmglgstrzfh\",\"maxConcurrentConnections\":\"datadzovkbcbefohny\",\"disableMetricsCollection\":\"datahmlj\",\"\":{\"szxdbgl\":\"datagfvzvmtjcxig\",\"ivmbu\":\"dataeet\",\"wfhfptbdxtvl\":\"dataizw\"}}")
            .toObject(SybaseSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseSource model = new SybaseSource().withSourceRetryCount("datatx").withSourceRetryWait("datayjwmglgstrzfh")
            .withMaxConcurrentConnections("datadzovkbcbefohny").withDisableMetricsCollection("datahmlj")
            .withQueryTimeout("dataovbhqelsslfxejp").withAdditionalColumns("datasgigs")
            .withQuery("dataodrvwnqbpxyofft");
        model = BinaryData.fromObject(model).toObject(SybaseSource.class);
    }
}
