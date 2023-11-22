// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sap Cloud For Customer OData resource dataset properties.
 */
@Fluent
public final class SapCloudForCustomerResourceDatasetTypeProperties {
    /*
     * The path of the SAP Cloud for Customer OData entity. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "path", required = true)
    private Object path;

    /**
     * Creates an instance of SapCloudForCustomerResourceDatasetTypeProperties class.
     */
    public SapCloudForCustomerResourceDatasetTypeProperties() {
    }

    /**
     * Get the path property: The path of the SAP Cloud for Customer OData entity. Type: string (or Expression with
     * resultType string).
     * 
     * @return the path value.
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path property: The path of the SAP Cloud for Customer OData entity. Type: string (or Expression with
     * resultType string).
     * 
     * @param path the path value to set.
     * @return the SapCloudForCustomerResourceDatasetTypeProperties object itself.
     */
    public SapCloudForCustomerResourceDatasetTypeProperties withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (path() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property path in model SapCloudForCustomerResourceDatasetTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapCloudForCustomerResourceDatasetTypeProperties.class);
}
