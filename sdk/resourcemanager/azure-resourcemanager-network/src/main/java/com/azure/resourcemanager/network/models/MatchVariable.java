// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define match variables.
 */
@Fluent
public final class MatchVariable {
    /*
     * Match Variable.
     */
    @JsonProperty(value = "variableName", required = true)
    private WebApplicationFirewallMatchVariable variableName;

    /*
     * The selector of match variable.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Creates an instance of MatchVariable class.
     */
    public MatchVariable() {
    }

    /**
     * Get the variableName property: Match Variable.
     * 
     * @return the variableName value.
     */
    public WebApplicationFirewallMatchVariable variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Match Variable.
     * 
     * @param variableName the variableName value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withVariableName(WebApplicationFirewallMatchVariable variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the selector property: The selector of match variable.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: The selector of match variable.
     * 
     * @param selector the selector value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (variableName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property variableName in model MatchVariable"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MatchVariable.class);
}
