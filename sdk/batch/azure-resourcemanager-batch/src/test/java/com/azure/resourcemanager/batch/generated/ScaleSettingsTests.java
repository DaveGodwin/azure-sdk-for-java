// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.AutoScaleSettings;
import com.azure.resourcemanager.batch.models.ComputeNodeDeallocationOption;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import com.azure.resourcemanager.batch.models.ScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScaleSettings model = BinaryData.fromString(
            "{\"fixedScale\":{\"resizeTimeout\":\"PT134H36S\",\"targetDedicatedNodes\":107730122,\"targetLowPriorityNodes\":2107852573,\"nodeDeallocationOption\":\"Requeue\"},\"autoScale\":{\"formula\":\"pajqgxysm\",\"evaluationInterval\":\"PT187H48M14S\"}}")
            .toObject(ScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT134H36S"), model.fixedScale().resizeTimeout());
        Assertions.assertEquals(107730122, model.fixedScale().targetDedicatedNodes());
        Assertions.assertEquals(2107852573, model.fixedScale().targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.REQUEUE, model.fixedScale().nodeDeallocationOption());
        Assertions.assertEquals("pajqgxysm", model.autoScale().formula());
        Assertions.assertEquals(Duration.parse("PT187H48M14S"), model.autoScale().evaluationInterval());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScaleSettings model = new ScaleSettings()
            .withFixedScale(new FixedScaleSettings().withResizeTimeout(Duration.parse("PT134H36S"))
                .withTargetDedicatedNodes(107730122)
                .withTargetLowPriorityNodes(2107852573)
                .withNodeDeallocationOption(ComputeNodeDeallocationOption.REQUEUE))
            .withAutoScale(new AutoScaleSettings().withFormula("pajqgxysm")
                .withEvaluationInterval(Duration.parse("PT187H48M14S")));
        model = BinaryData.fromObject(model).toObject(ScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT134H36S"), model.fixedScale().resizeTimeout());
        Assertions.assertEquals(107730122, model.fixedScale().targetDedicatedNodes());
        Assertions.assertEquals(2107852573, model.fixedScale().targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.REQUEUE, model.fixedScale().nodeDeallocationOption());
        Assertions.assertEquals("pajqgxysm", model.autoScale().formula());
        Assertions.assertEquals(Duration.parse("PT187H48M14S"), model.autoScale().evaluationInterval());
    }
}
