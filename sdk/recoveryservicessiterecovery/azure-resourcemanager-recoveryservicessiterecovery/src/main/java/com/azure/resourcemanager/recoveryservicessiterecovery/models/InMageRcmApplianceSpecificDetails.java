// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** InMageRcm appliance specific details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Immutable
public final class InMageRcmApplianceSpecificDetails extends ApplianceSpecificDetails {
    /*
     * The list of appliances.
     */
    @JsonProperty(value = "appliances", access = JsonProperty.Access.WRITE_ONLY)
    private List<InMageRcmApplianceDetails> appliances;

    /** Creates an instance of InMageRcmApplianceSpecificDetails class. */
    public InMageRcmApplianceSpecificDetails() {
    }

    /**
     * Get the appliances property: The list of appliances.
     *
     * @return the appliances value.
     */
    public List<InMageRcmApplianceDetails> appliances() {
        return this.appliances;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (appliances() != null) {
            appliances().forEach(e -> e.validate());
        }
    }
}
