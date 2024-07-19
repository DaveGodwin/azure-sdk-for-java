// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specifies a list of virtual machine instance IDs from the Network Virtual Appliance VM instances.
 */
@Fluent
public final class NetworkVirtualApplianceInstanceIdsInner {
    /*
     * The network virtual appliance instance ids. Omitting the network virtual appliance instance ids will result in
     * the operation being performed on all virtual machines belonging to the network virtual appliance.
     */
    @JsonProperty(value = "instanceIds")
    private List<String> instanceIds;

    /**
     * Creates an instance of NetworkVirtualApplianceInstanceIdsInner class.
     */
    public NetworkVirtualApplianceInstanceIdsInner() {
    }

    /**
     * Get the instanceIds property: The network virtual appliance instance ids. Omitting the network virtual appliance
     * instance ids will result in the operation being performed on all virtual machines belonging to the network
     * virtual appliance.
     * 
     * @return the instanceIds value.
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The network virtual appliance instance ids. Omitting the network virtual appliance
     * instance ids will result in the operation being performed on all virtual machines belonging to the network
     * virtual appliance.
     * 
     * @param instanceIds the instanceIds value to set.
     * @return the NetworkVirtualApplianceInstanceIdsInner object itself.
     */
    public NetworkVirtualApplianceInstanceIdsInner withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
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
