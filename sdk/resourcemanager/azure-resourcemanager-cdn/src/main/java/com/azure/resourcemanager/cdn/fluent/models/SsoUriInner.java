// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The URI required to login to the supplemental portal from the Azure portal. */
@Immutable
public final class SsoUriInner {
    /*
     * The URI used to login to the supplemental portal.
     */
    @JsonProperty(value = "ssoUriValue", access = JsonProperty.Access.WRITE_ONLY)
    private String ssoUriValue;

    /** Creates an instance of SsoUriInner class. */
    public SsoUriInner() {
    }

    /**
     * Get the ssoUriValue property: The URI used to login to the supplemental portal.
     *
     * @return the ssoUriValue value.
     */
    public String ssoUriValue() {
        return this.ssoUriValue;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
