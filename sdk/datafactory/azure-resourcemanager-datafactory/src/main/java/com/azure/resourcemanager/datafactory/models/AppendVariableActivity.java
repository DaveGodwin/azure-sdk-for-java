// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AppendVariableActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Append value for a Variable of type Array.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AppendVariable")
@Fluent
public final class AppendVariableActivity extends ControlActivity {
    /*
     * Append Variable activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AppendVariableActivityTypeProperties innerTypeProperties = new AppendVariableActivityTypeProperties();

    /**
     * Creates an instance of AppendVariableActivity class.
     */
    public AppendVariableActivity() {
    }

    /**
     * Get the innerTypeProperties property: Append Variable activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AppendVariableActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppendVariableActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @return the variableName value.
     */
    public String variableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variableName();
    }

    /**
     * Set the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @param variableName the variableName value to set.
     * @return the AppendVariableActivity object itself.
     */
    public AppendVariableActivity withVariableName(String variableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AppendVariableActivityTypeProperties();
        }
        this.innerTypeProperties().withVariableName(variableName);
        return this;
    }

    /**
     * Get the value property: Value to be appended. Type: could be a static value matching type of the variable item
     * or Expression with resultType matching type of the variable item.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().value();
    }

    /**
     * Set the value property: Value to be appended. Type: could be a static value matching type of the variable item
     * or Expression with resultType matching type of the variable item.
     * 
     * @param value the value value to set.
     * @return the AppendVariableActivity object itself.
     */
    public AppendVariableActivity withValue(Object value) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AppendVariableActivityTypeProperties();
        }
        this.innerTypeProperties().withValue(value);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model AppendVariableActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AppendVariableActivity.class);
}
