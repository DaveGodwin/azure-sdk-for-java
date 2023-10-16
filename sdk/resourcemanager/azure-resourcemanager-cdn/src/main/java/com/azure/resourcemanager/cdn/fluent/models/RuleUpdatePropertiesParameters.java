// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.models.DeliveryRuleAction;
import com.azure.resourcemanager.cdn.models.DeliveryRuleCondition;
import com.azure.resourcemanager.cdn.models.MatchProcessingBehavior;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties of the rule to update. */
@Fluent
public class RuleUpdatePropertiesParameters {
    /*
     * The name of the rule set containing the rule.
     */
    @JsonProperty(value = "ruleSetName", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetName;

    /*
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser
     * order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not
     * require any condition and actions listed in it will always be applied.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * A list of conditions that must be matched for the actions to be executed
     */
    @JsonProperty(value = "conditions")
    private List<DeliveryRuleCondition> conditions;

    /*
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     */
    @JsonProperty(value = "actions")
    private List<DeliveryRuleAction> actions;

    /*
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present,
     * defaults to Continue.
     */
    @JsonProperty(value = "matchProcessingBehavior")
    private MatchProcessingBehavior matchProcessingBehavior;

    /** Creates an instance of RuleUpdatePropertiesParameters class. */
    public RuleUpdatePropertiesParameters() {
    }

    /**
     * Get the ruleSetName property: The name of the rule set containing the rule.
     *
     * @return the ruleSetName value.
     */
    public String ruleSetName() {
        return this.ruleSetName;
    }

    /**
     * Get the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}.
     * A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special
     * rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @param order the order value to set.
     * @return the RuleUpdatePropertiesParameters object itself.
     */
    public RuleUpdatePropertiesParameters withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @return the conditions value.
     */
    public List<DeliveryRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: A list of conditions that must be matched for the actions to be executed.
     *
     * @param conditions the conditions value to set.
     * @return the RuleUpdatePropertiesParameters object itself.
     */
    public RuleUpdatePropertiesParameters withConditions(List<DeliveryRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @return the actions value.
     */
    public List<DeliveryRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: A list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @param actions the actions value to set.
     * @return the RuleUpdatePropertiesParameters object itself.
     */
    public RuleUpdatePropertiesParameters withActions(List<DeliveryRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @return the matchProcessingBehavior value.
     */
    public MatchProcessingBehavior matchProcessingBehavior() {
        return this.matchProcessingBehavior;
    }

    /**
     * Set the matchProcessingBehavior property: If this rule is a match should the rules engine continue running the
     * remaining rules or stop. If not present, defaults to Continue.
     *
     * @param matchProcessingBehavior the matchProcessingBehavior value to set.
     * @return the RuleUpdatePropertiesParameters object itself.
     */
    public RuleUpdatePropertiesParameters withMatchProcessingBehavior(MatchProcessingBehavior matchProcessingBehavior) {
        this.matchProcessingBehavior = matchProcessingBehavior;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (conditions() != null) {
            conditions().forEach(e -> e.validate());
        }
        if (actions() != null) {
            actions().forEach(e -> e.validate());
        }
    }
}
