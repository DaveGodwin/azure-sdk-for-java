// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkResource;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    PrivateLinkResourceImpl(PrivateLinkResourceInner innerObject,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public List<String> requiredMembers() {
        List<String> inner = this.innerModel().requiredMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> requiredZoneNames() {
        List<String> inner = this.innerModel().requiredZoneNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes() {
        List<ShareablePrivateLinkResourceType> inner = this.innerModel().shareablePrivateLinkResourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }
}
