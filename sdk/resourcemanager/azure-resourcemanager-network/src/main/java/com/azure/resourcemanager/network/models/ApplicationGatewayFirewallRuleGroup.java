// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * A web application firewall rule group.
 */
@Fluent
public final class ApplicationGatewayFirewallRuleGroup {
    /*
     * The name of the web application firewall rule group.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /*
     * The description of the web application firewall rule group.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The rules of the web application firewall rule group.
     */
    @JsonProperty(value = "rules", required = true)
    private List<ApplicationGatewayFirewallRule> rules;

    /**
     * Creates an instance of ApplicationGatewayFirewallRuleGroup class.
     */
    public ApplicationGatewayFirewallRuleGroup() {
    }

    /**
     * Get the ruleGroupName property: The name of the web application firewall rule group.
     *
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: The name of the web application firewall rule group.
     *
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the description property: The description of the web application firewall rule group.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the web application firewall rule group.
     *
     * @param description the description value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rules property: The rules of the web application firewall rule group.
     *
     * @return the rules value.
     */
    public List<ApplicationGatewayFirewallRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules of the web application firewall rule group.
     *
     * @param rules the rules value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRules(List<ApplicationGatewayFirewallRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroupName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleGroupName in model ApplicationGatewayFirewallRuleGroup"));
        }
        if (rules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rules in model ApplicationGatewayFirewallRuleGroup"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGatewayFirewallRuleGroup.class);
}
