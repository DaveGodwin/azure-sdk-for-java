// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForLogSpecification;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryForServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryForServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"logSpecifications\":[{\"name\":\"obpxjmflbvvn\",\"displayName\":\"rkcciwwzjuqk\",\"blobDuration\":\"sa\"},{\"name\":\"wkuofoskghsauu\",\"displayName\":\"jmvxie\",\"blobDuration\":\"ugidyjrr\"},{\"name\":\"y\",\"displayName\":\"svexcsonpclhoco\",\"blobDuration\":\"lkevle\"},{\"name\":\"zfbuhf\",\"displayName\":\"faxkffeii\",\"blobDuration\":\"lvmezyvshxmzsbbz\"}]}")
                .toObject(ClientDiscoveryForServiceSpecification.class);
        Assertions.assertEquals("obpxjmflbvvn", model.logSpecifications().get(0).name());
        Assertions.assertEquals("rkcciwwzjuqk", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("sa", model.logSpecifications().get(0).blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryForServiceSpecification model =
            new ClientDiscoveryForServiceSpecification()
                .withLogSpecifications(
                    Arrays
                        .asList(
                            new ClientDiscoveryForLogSpecification()
                                .withName("obpxjmflbvvn")
                                .withDisplayName("rkcciwwzjuqk")
                                .withBlobDuration("sa"),
                            new ClientDiscoveryForLogSpecification()
                                .withName("wkuofoskghsauu")
                                .withDisplayName("jmvxie")
                                .withBlobDuration("ugidyjrr"),
                            new ClientDiscoveryForLogSpecification()
                                .withName("y")
                                .withDisplayName("svexcsonpclhoco")
                                .withBlobDuration("lkevle"),
                            new ClientDiscoveryForLogSpecification()
                                .withName("zfbuhf")
                                .withDisplayName("faxkffeii")
                                .withBlobDuration("lvmezyvshxmzsbbz")));
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryForServiceSpecification.class);
        Assertions.assertEquals("obpxjmflbvvn", model.logSpecifications().get(0).name());
        Assertions.assertEquals("rkcciwwzjuqk", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("sa", model.logSpecifications().get(0).blobDuration());
    }
}
