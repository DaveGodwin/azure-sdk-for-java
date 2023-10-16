// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response indicates CDN service is not able to process the incoming request. The reason is provided in the error
 * message.
 */
@Immutable
public final class MigrationErrorType {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Resource which has the problem.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /*
     * Error message indicating why the operation failed.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * Describes what needs to be done to fix the problem
     */
    @JsonProperty(value = "nextSteps", access = JsonProperty.Access.WRITE_ONLY)
    private String nextSteps;

    /** Creates an instance of MigrationErrorType class. */
    public MigrationErrorType() {
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the resourceName property: Resource which has the problem.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the errorMessage property: Error message indicating why the operation failed.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the nextSteps property: Describes what needs to be done to fix the problem.
     *
     * @return the nextSteps value.
     */
    public String nextSteps() {
        return this.nextSteps;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
