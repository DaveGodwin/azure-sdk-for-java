// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage object properties. */
@Fluent
public final class StorageClassificationProperties {
    /*
     * Friendly name of the Storage classification.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /** Creates an instance of StorageClassificationProperties class. */
    public StorageClassificationProperties() {
    }

    /**
     * Get the friendlyName property: Friendly name of the Storage classification.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the Storage classification.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the StorageClassificationProperties object itself.
     */
    public StorageClassificationProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
