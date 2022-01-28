// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetastoreRegistrationResponse model. */
@Fluent
public final class MetastoreRegistrationResponse {
    /*
     * Enumerates possible request statuses.
     */
    @JsonProperty(value = "status")
    private RequestStatus status;

    /**
     * Get the status property: Enumerates possible request statuses.
     *
     * @return the status value.
     */
    public RequestStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates possible request statuses.
     *
     * @param status the status value to set.
     * @return the MetastoreRegistrationResponse object itself.
     */
    public MetastoreRegistrationResponse setStatus(RequestStatus status) {
        this.status = status;
        return this;
    }
}
