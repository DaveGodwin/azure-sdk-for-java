// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a Extension Metadata. */
@Immutable
public final class ExtensionValueInner extends ProxyResource {
    /*
     * The single extension based on search criteria
     */
    @JsonProperty(value = "properties")
    private ExtensionValueProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ExtensionValueInner class. */
    public ExtensionValueInner() {
    }

    /**
     * Get the innerProperties property: The single extension based on search criteria.
     *
     * @return the innerProperties value.
     */
    private ExtensionValueProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the version property: The version of the Extension being received.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the extensionType property: The type of the Extension being received.
     *
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionType();
    }

    /**
     * Get the publisher property: The publisher of the Extension being received.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
