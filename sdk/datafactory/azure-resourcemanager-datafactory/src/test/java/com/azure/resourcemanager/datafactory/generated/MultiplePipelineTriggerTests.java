// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MultiplePipelineTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MultiplePipelineTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MultiplePipelineTrigger model = BinaryData.fromString(
            "{\"type\":\"MultiplePipelineTrigger\",\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"knehpuhljmlu\",\"name\":\"tptpjabszqczig\"},\"parameters\":{\"scrpabaw\":\"dataqkoxbghp\",\"x\":\"datavawmrmwrzmfnjs\",\"vragr\":\"datanst\"}},{\"pipelineReference\":{\"referenceName\":\"munmgtkyzup\",\"name\":\"qmjmpx\"},\"parameters\":{\"mpydaxgwgbpbls\":\"dataxie\",\"lfxf\":\"datas\"}},{\"pipelineReference\":{\"referenceName\":\"fybpwzgwhntkmutt\",\"name\":\"obrx\"},\"parameters\":{\"scbgarfbx\":\"dataft\",\"nshlu\":\"dataalpig\"}},{\"pipelineReference\":{\"referenceName\":\"lm\",\"name\":\"ncats\"},\"parameters\":{\"gtxpbvmc\":\"datatxgtibmxhudpjn\"}}],\"description\":\"sahpswspyifg\",\"runtimeState\":\"Disabled\",\"annotations\":[\"datah\",\"datadybjgyxbwhuta\",\"datahmckzbuadoxlle\",\"datahvcyyvpobcxnrwaz\"],\"\":{\"xnbkcwee\":\"datahaajhllnkwquw\",\"rwospsok\":\"datakg\",\"ydywwjsqdchbuvi\":\"datatdrvihuifih\"}}")
            .toObject(MultiplePipelineTrigger.class);
        Assertions.assertEquals("sahpswspyifg", model.description());
        Assertions.assertEquals("knehpuhljmlu", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("tptpjabszqczig", model.pipelines().get(0).pipelineReference().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MultiplePipelineTrigger model = new MultiplePipelineTrigger().withDescription("sahpswspyifg")
            .withAnnotations(Arrays.asList("datah", "datadybjgyxbwhuta", "datahmckzbuadoxlle",
                "datahvcyyvpobcxnrwaz"))
            .withPipelines(Arrays.asList(
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("knehpuhljmlu").withName("tptpjabszqczig"))
                    .withParameters(mapOf("scrpabaw", "dataqkoxbghp", "x", "datavawmrmwrzmfnjs", "vragr", "datanst")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("munmgtkyzup").withName("qmjmpx"))
                    .withParameters(mapOf("mpydaxgwgbpbls", "dataxie", "lfxf", "datas")),
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("fybpwzgwhntkmutt").withName("obrx"))
                    .withParameters(mapOf("scbgarfbx", "dataft", "nshlu", "dataalpig")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("lm").withName("ncats"))
                    .withParameters(mapOf("gtxpbvmc", "datatxgtibmxhudpjn"))));
        model = BinaryData.fromObject(model).toObject(MultiplePipelineTrigger.class);
        Assertions.assertEquals("sahpswspyifg", model.description());
        Assertions.assertEquals("knehpuhljmlu", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("tptpjabszqczig", model.pipelines().get(0).pipelineReference().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
