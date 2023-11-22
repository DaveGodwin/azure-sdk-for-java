// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure Databricks Delta Lake import command settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeImportCommand")
@Fluent
public final class AzureDatabricksDeltaLakeImportCommand extends ImportSettings {
    /*
     * Specify the date format for csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "dateFormat")
    private Object dateFormat;

    /*
     * Specify the timestamp format for csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "timestampFormat")
    private Object timestampFormat;

    /**
     * Creates an instance of AzureDatabricksDeltaLakeImportCommand class.
     */
    public AzureDatabricksDeltaLakeImportCommand() {
    }

    /**
     * Get the dateFormat property: Specify the date format for csv in Azure Databricks Delta Lake Copy. Type: string
     * (or Expression with resultType string).
     * 
     * @return the dateFormat value.
     */
    public Object dateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the dateFormat property: Specify the date format for csv in Azure Databricks Delta Lake Copy. Type: string
     * (or Expression with resultType string).
     * 
     * @param dateFormat the dateFormat value to set.
     * @return the AzureDatabricksDeltaLakeImportCommand object itself.
     */
    public AzureDatabricksDeltaLakeImportCommand withDateFormat(Object dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the timestampFormat property: Specify the timestamp format for csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     * 
     * @return the timestampFormat value.
     */
    public Object timestampFormat() {
        return this.timestampFormat;
    }

    /**
     * Set the timestampFormat property: Specify the timestamp format for csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     * 
     * @param timestampFormat the timestampFormat value to set.
     * @return the AzureDatabricksDeltaLakeImportCommand object itself.
     */
    public AzureDatabricksDeltaLakeImportCommand withTimestampFormat(Object timestampFormat) {
        this.timestampFormat = timestampFormat;
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
    }
}
