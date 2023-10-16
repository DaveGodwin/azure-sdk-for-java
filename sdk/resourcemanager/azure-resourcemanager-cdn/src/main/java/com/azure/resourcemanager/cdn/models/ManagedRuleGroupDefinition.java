// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a managed rule group. */
@Immutable
public final class ManagedRuleGroupDefinition {
    /*
     * Name of the managed rule group.
     */
    @JsonProperty(value = "ruleGroupName", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleGroupName;

    /*
     * Description of the managed rule group.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * List of rules within the managed rule group.
     */
    @JsonProperty(value = "rules", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleDefinition> rules;

    /** Creates an instance of ManagedRuleGroupDefinition class. */
    public ManagedRuleGroupDefinition() {
    }

    /**
     * Get the ruleGroupName property: Name of the managed rule group.
     *
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Get the description property: Description of the managed rule group.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the rules property: List of rules within the managed rule group.
     *
     * @return the rules value.
     */
    public List<ManagedRuleDefinition> rules() {
        return this.rules;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
