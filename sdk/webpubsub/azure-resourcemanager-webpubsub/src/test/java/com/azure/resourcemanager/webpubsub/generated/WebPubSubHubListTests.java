// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubHubInner;
import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListenerFilter;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubList;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WebPubSubHubListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebPubSubHubList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"eventHandlers\":[{\"urlTemplate\":\"syqtfi\",\"userEventPattern\":\"hbotzingamvppho\",\"systemEvents\":[\"zudphqamvdkfw\",\"nwcvtbvkayhmtnv\"],\"auth\":{}},{\"urlTemplate\":\"iatkzwpcnp\",\"userEventPattern\":\"cjaesgvvs\",\"systemEvents\":[\"ajguqf\",\"wygzlvdnkfxusem\",\"wzrmuh\",\"pfcqdp\"],\"auth\":{}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"psvuoymgc\",\"webSocketKeepAliveIntervalInSeconds\":841424592},\"id\":\"ezrypql\",\"name\":\"feo\",\"type\":\"erqwkyhkobopg\"},{\"properties\":{\"eventHandlers\":[{\"urlTemplate\":\"k\",\"userEventPattern\":\"epbqpcrfkbw\",\"systemEvents\":[\"njv\",\"dw\",\"lpqekf\",\"nkhtjsyingw\"],\"auth\":{}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"tdhtmdvyp\",\"webSocketKeepAliveIntervalInSeconds\":811019553},\"id\":\"gszywk\",\"name\":\"irryuzhlh\",\"type\":\"joqrvqqaatj\"},{\"properties\":{\"eventHandlers\":[{\"urlTemplate\":\"vgoup\",\"userEventPattern\":\"iibfggj\",\"systemEvents\":[\"lvrwxkvtkk\",\"llqwjygvjayvblmh\"],\"auth\":{}}],\"eventListeners\":[{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}},{\"filter\":{\"type\":\"EventListenerFilter\"},\"endpoint\":{\"type\":\"EventListenerEndpoint\"}}],\"anonymousConnectPolicy\":\"bxvvyhg\",\"webSocketKeepAliveIntervalInSeconds\":610233368},\"id\":\"yrqufegxuvwz\",\"name\":\"bnhlmc\",\"type\":\"l\"}],\"nextLink\":\"ngitvgbmhrixkwm\"}")
            .toObject(WebPubSubHubList.class);
        Assertions.assertEquals("syqtfi", model.value().get(0).properties().eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("hbotzingamvppho",
            model.value().get(0).properties().eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("zudphqamvdkfw",
            model.value().get(0).properties().eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals("psvuoymgc", model.value().get(0).properties().anonymousConnectPolicy());
        Assertions.assertEquals(841424592, model.value().get(0).properties().webSocketKeepAliveIntervalInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebPubSubHubList model
            = new WebPubSubHubList()
                .withValue(
                    Arrays
                        .asList(
                            new WebPubSubHubInner()
                                .withProperties(
                                    new WebPubSubHubProperties()
                                        .withEventHandlers(
                                            Arrays
                                                .asList(
                                                    new EventHandler().withUrlTemplate("syqtfi")
                                                        .withUserEventPattern("hbotzingamvppho")
                                                        .withSystemEvents(
                                                            Arrays.asList("zudphqamvdkfw", "nwcvtbvkayhmtnv"))
                                                        .withAuth(new UpstreamAuthSettings()),
                                                    new EventHandler().withUrlTemplate("iatkzwpcnp")
                                                        .withUserEventPattern("cjaesgvvs")
                                                        .withSystemEvents(Arrays.asList("ajguqf", "wygzlvdnkfxusem",
                                                            "wzrmuh", "pfcqdp"))
                                                        .withAuth(new UpstreamAuthSettings())))
                                        .withEventListeners(Arrays.asList(
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint()),
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint()),
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint())))
                                        .withAnonymousConnectPolicy("psvuoymgc")
                                        .withWebSocketKeepAliveIntervalInSeconds(841424592)),
                            new WebPubSubHubInner()
                                .withProperties(
                                    new WebPubSubHubProperties()
                                        .withEventHandlers(Arrays.asList(new EventHandler().withUrlTemplate("k")
                                            .withUserEventPattern("epbqpcrfkbw")
                                            .withSystemEvents(Arrays.asList("njv", "dw", "lpqekf", "nkhtjsyingw"))
                                            .withAuth(new UpstreamAuthSettings())))
                                        .withEventListeners(Arrays.asList(
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint()),
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint()),
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint()),
                                            new EventListener().withFilter(new EventListenerFilter())
                                                .withEndpoint(new EventListenerEndpoint())))
                                        .withAnonymousConnectPolicy("tdhtmdvyp")
                                        .withWebSocketKeepAliveIntervalInSeconds(811019553)),
                            new WebPubSubHubInner().withProperties(new WebPubSubHubProperties()
                                .withEventHandlers(Arrays.asList(new EventHandler().withUrlTemplate("vgoup")
                                    .withUserEventPattern("iibfggj")
                                    .withSystemEvents(Arrays.asList("lvrwxkvtkk", "llqwjygvjayvblmh"))
                                    .withAuth(new UpstreamAuthSettings())))
                                .withEventListeners(Arrays.asList(
                                    new EventListener().withFilter(new EventListenerFilter())
                                        .withEndpoint(new EventListenerEndpoint()),
                                    new EventListener().withFilter(new EventListenerFilter())
                                        .withEndpoint(new EventListenerEndpoint())))
                                .withAnonymousConnectPolicy("bxvvyhg")
                                .withWebSocketKeepAliveIntervalInSeconds(610233368))));
        model = BinaryData.fromObject(model).toObject(WebPubSubHubList.class);
        Assertions.assertEquals("syqtfi", model.value().get(0).properties().eventHandlers().get(0).urlTemplate());
        Assertions.assertEquals("hbotzingamvppho",
            model.value().get(0).properties().eventHandlers().get(0).userEventPattern());
        Assertions.assertEquals("zudphqamvdkfw",
            model.value().get(0).properties().eventHandlers().get(0).systemEvents().get(0));
        Assertions.assertEquals("psvuoymgc", model.value().get(0).properties().anonymousConnectPolicy());
        Assertions.assertEquals(841424592, model.value().get(0).properties().webSocketKeepAliveIntervalInSeconds());
    }
}
