// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.CustomDomainInner;
import com.azure.resourcemanager.webpubsub.models.CustomDomainList;
import com.azure.resourcemanager.webpubsub.models.ResourceReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomainList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Unknown\",\"domainName\":\"kvpbjxbkzbz\",\"customCertificate\":{\"id\":\"vncjabudurgk\"}},\"id\":\"mokzhjjklf\",\"name\":\"hmouwqlgzrfze\",\"type\":\"yebizikayuh\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"domainName\":\"jbsybbqw\",\"customCertificate\":{\"id\":\"t\"}},\"id\":\"gmfpgvmp\",\"name\":\"paslthaqfxssmwu\",\"type\":\"wbdsr\"},{\"properties\":{\"provisioningState\":\"Deleting\",\"domainName\":\"drhneuyow\",\"customCertificate\":{\"id\":\"d\"}},\"id\":\"t\",\"name\":\"sibircgpi\",\"type\":\"pzimejzanlfzxi\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"domainName\":\"mbzonokix\",\"customCertificate\":{\"id\":\"q\"}},\"id\":\"rgz\",\"name\":\"frl\",\"type\":\"zszrnwoiindfpw\"}],\"nextLink\":\"ylwbtlhflsjcdhsz\"}")
            .toObject(CustomDomainList.class);
        Assertions.assertEquals("kvpbjxbkzbz", model.value().get(0).domainName());
        Assertions.assertEquals("vncjabudurgk", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("ylwbtlhflsjcdhsz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomainList model = new CustomDomainList().withValue(Arrays.asList(
            new CustomDomainInner().withDomainName("kvpbjxbkzbz")
                .withCustomCertificate(new ResourceReference().withId("vncjabudurgk")),
            new CustomDomainInner().withDomainName("jbsybbqw")
                .withCustomCertificate(new ResourceReference().withId("t")),
            new CustomDomainInner().withDomainName("drhneuyow")
                .withCustomCertificate(new ResourceReference().withId("d")),
            new CustomDomainInner().withDomainName("mbzonokix")
                .withCustomCertificate(new ResourceReference().withId("q"))))
            .withNextLink("ylwbtlhflsjcdhsz");
        model = BinaryData.fromObject(model).toObject(CustomDomainList.class);
        Assertions.assertEquals("kvpbjxbkzbz", model.value().get(0).domainName());
        Assertions.assertEquals("vncjabudurgk", model.value().get(0).customCertificate().id());
        Assertions.assertEquals("ylwbtlhflsjcdhsz", model.nextLink());
    }
}
