// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** InMageAzureV2 switch provider blocking error details. */
@Immutable
public final class InMageAzureV2SwitchProviderBlockingErrorDetails {
    /*
     * The error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /*
     * The error message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * The possible causes.
     */
    @JsonProperty(value = "possibleCauses", access = JsonProperty.Access.WRITE_ONLY)
    private String possibleCauses;

    /*
     * The recommended action.
     */
    @JsonProperty(value = "recommendedAction", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendedAction;

    /*
     * The error message parameters.
     */
    @JsonProperty(value = "errorMessageParameters", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> errorMessageParameters;

    /*
     * The error tags.
     */
    @JsonProperty(value = "errorTags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> errorTags;

    /** Creates an instance of InMageAzureV2SwitchProviderBlockingErrorDetails class. */
    public InMageAzureV2SwitchProviderBlockingErrorDetails() {
    }

    /**
     * Get the errorCode property: The error code.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage property: The error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the possibleCauses property: The possible causes.
     *
     * @return the possibleCauses value.
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Get the recommendedAction property: The recommended action.
     *
     * @return the recommendedAction value.
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Get the errorMessageParameters property: The error message parameters.
     *
     * @return the errorMessageParameters value.
     */
    public Map<String, String> errorMessageParameters() {
        return this.errorMessageParameters;
    }

    /**
     * Get the errorTags property: The error tags.
     *
     * @return the errorTags value.
     */
    public Map<String, String> errorTags() {
        return this.errorTags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
