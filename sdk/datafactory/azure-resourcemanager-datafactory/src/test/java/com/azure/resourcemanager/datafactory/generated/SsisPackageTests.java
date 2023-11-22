// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisPackage;
import com.azure.resourcemanager.datafactory.models.SsisParameter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SsisPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisPackage model = BinaryData.fromString(
            "{\"type\":\"Package\",\"folderId\":6651825404909310646,\"projectVersion\":7223417905186130883,\"projectId\":1360651727253551961,\"parameters\":[{\"id\":8650974882472476312,\"name\":\"yyhd\",\"description\":\"embr\",\"dataType\":\"wvcwcehzrtrgp\",\"required\":true,\"sensitive\":false,\"designDefaultValue\":\"hyfwjfqktuzr\",\"defaultValue\":\"pecsdk\",\"sensitiveDefaultValue\":\"fzbvttqjntvhnjp\",\"valueType\":\"j\",\"valueSet\":false,\"variable\":\"upcyfrhoo\"},{\"id\":6293329636058257373,\"name\":\"xyeeafd\",\"description\":\"uwlynxzhgbs\",\"dataType\":\"xbhj\",\"required\":true,\"sensitive\":true,\"designDefaultValue\":\"qomzdf\",\"defaultValue\":\"pqveidzwnkbj\",\"sensitiveDefaultValue\":\"zmod\",\"valueType\":\"qux\",\"valueSet\":false,\"variable\":\"tuxa\"},{\"id\":1183271586003783289,\"name\":\"q\",\"description\":\"xmynslcv\",\"dataType\":\"avwtttsmczroddc\",\"required\":true,\"sensitive\":false,\"designDefaultValue\":\"nbjmjxkhbucmz\",\"defaultValue\":\"tkfjacktav\",\"sensitiveDefaultValue\":\"bgodjfyplavbvs\",\"valueType\":\"edsoqwe\",\"valueSet\":false,\"variable\":\"nzoteikffjqdfad\"}],\"id\":7898712268378713188,\"name\":\"avetqjvohystdgj\",\"description\":\"btkogfggyl\"}")
            .toObject(SsisPackage.class);
        Assertions.assertEquals(7898712268378713188L, model.id());
        Assertions.assertEquals("avetqjvohystdgj", model.name());
        Assertions.assertEquals("btkogfggyl", model.description());
        Assertions.assertEquals(6651825404909310646L, model.folderId());
        Assertions.assertEquals(7223417905186130883L, model.projectVersion());
        Assertions.assertEquals(1360651727253551961L, model.projectId());
        Assertions.assertEquals(8650974882472476312L, model.parameters().get(0).id());
        Assertions.assertEquals("yyhd", model.parameters().get(0).name());
        Assertions.assertEquals("embr", model.parameters().get(0).description());
        Assertions.assertEquals("wvcwcehzrtrgp", model.parameters().get(0).dataType());
        Assertions.assertEquals(true, model.parameters().get(0).required());
        Assertions.assertEquals(false, model.parameters().get(0).sensitive());
        Assertions.assertEquals("hyfwjfqktuzr", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("pecsdk", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("fzbvttqjntvhnjp", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("j", model.parameters().get(0).valueType());
        Assertions.assertEquals(false, model.parameters().get(0).valueSet());
        Assertions.assertEquals("upcyfrhoo", model.parameters().get(0).variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisPackage model
            = new SsisPackage().withId(7898712268378713188L).withName("avetqjvohystdgj").withDescription("btkogfggyl")
                .withFolderId(6651825404909310646L).withProjectVersion(7223417905186130883L)
                .withProjectId(1360651727253551961L)
                .withParameters(Arrays.asList(new SsisParameter().withId(8650974882472476312L).withName("yyhd")
                    .withDescription("embr").withDataType("wvcwcehzrtrgp").withRequired(true).withSensitive(false)
                    .withDesignDefaultValue("hyfwjfqktuzr").withDefaultValue("pecsdk")
                    .withSensitiveDefaultValue("fzbvttqjntvhnjp").withValueType("j").withValueSet(false)
                    .withVariable("upcyfrhoo"),
                    new SsisParameter().withId(6293329636058257373L).withName("xyeeafd").withDescription("uwlynxzhgbs")
                        .withDataType("xbhj").withRequired(true).withSensitive(true).withDesignDefaultValue("qomzdf")
                        .withDefaultValue("pqveidzwnkbj").withSensitiveDefaultValue("zmod").withValueType("qux")
                        .withValueSet(false).withVariable("tuxa"),
                    new SsisParameter().withId(1183271586003783289L).withName("q").withDescription("xmynslcv")
                        .withDataType("avwtttsmczroddc").withRequired(true).withSensitive(false)
                        .withDesignDefaultValue("nbjmjxkhbucmz").withDefaultValue("tkfjacktav")
                        .withSensitiveDefaultValue("bgodjfyplavbvs").withValueType("edsoqwe").withValueSet(false)
                        .withVariable("nzoteikffjqdfad")));
        model = BinaryData.fromObject(model).toObject(SsisPackage.class);
        Assertions.assertEquals(7898712268378713188L, model.id());
        Assertions.assertEquals("avetqjvohystdgj", model.name());
        Assertions.assertEquals("btkogfggyl", model.description());
        Assertions.assertEquals(6651825404909310646L, model.folderId());
        Assertions.assertEquals(7223417905186130883L, model.projectVersion());
        Assertions.assertEquals(1360651727253551961L, model.projectId());
        Assertions.assertEquals(8650974882472476312L, model.parameters().get(0).id());
        Assertions.assertEquals("yyhd", model.parameters().get(0).name());
        Assertions.assertEquals("embr", model.parameters().get(0).description());
        Assertions.assertEquals("wvcwcehzrtrgp", model.parameters().get(0).dataType());
        Assertions.assertEquals(true, model.parameters().get(0).required());
        Assertions.assertEquals(false, model.parameters().get(0).sensitive());
        Assertions.assertEquals("hyfwjfqktuzr", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("pecsdk", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("fzbvttqjntvhnjp", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("j", model.parameters().get(0).valueType());
        Assertions.assertEquals(false, model.parameters().get(0).valueSet());
        Assertions.assertEquals("upcyfrhoo", model.parameters().get(0).variable());
    }
}
