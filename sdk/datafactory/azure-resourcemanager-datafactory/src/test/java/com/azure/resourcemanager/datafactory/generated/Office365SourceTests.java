// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Office365Source;

public final class Office365SourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Source model = BinaryData.fromString(
            "{\"type\":\"Office365Source\",\"allowedGroups\":\"dataul\",\"userScopeFilterUri\":\"dataaycnkirmiecfmqc\",\"dateFilterColumn\":\"datapcdbvcxo\",\"startTime\":\"datahefuhnbdl\",\"endTime\":\"datawectz\",\"outputColumns\":\"datagvcbt\",\"sourceRetryCount\":\"datampnkyvujhej\",\"sourceRetryWait\":\"datarvlguy\",\"maxConcurrentConnections\":\"datarngnbqhmuqyzxko\",\"disableMetricsCollection\":\"datarcjshtcfnbf\",\"\":{\"huboqozx\":\"dataxlyhxpdqo\"}}")
            .toObject(Office365Source.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Source model = new Office365Source().withSourceRetryCount("datampnkyvujhej")
            .withSourceRetryWait("datarvlguy").withMaxConcurrentConnections("datarngnbqhmuqyzxko")
            .withDisableMetricsCollection("datarcjshtcfnbf").withAllowedGroups("dataul")
            .withUserScopeFilterUri("dataaycnkirmiecfmqc").withDateFilterColumn("datapcdbvcxo")
            .withStartTime("datahefuhnbdl").withEndTime("datawectz").withOutputColumns("datagvcbt");
        model = BinaryData.fromObject(model).toObject(Office365Source.class);
    }
}
