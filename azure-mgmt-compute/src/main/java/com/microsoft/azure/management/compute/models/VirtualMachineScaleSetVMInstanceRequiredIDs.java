/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the list of virtual machine scale set instance IDs.
 */
public class VirtualMachineScaleSetVMInstanceRequiredIDs {
    /**
     * Gets or sets the virtual machine scale set instance ids.
     */
    @JsonProperty(required = true)
    private List<String> instanceIds;

    /**
     * Get the instanceIds value.
     *
     * @return the instanceIds value
     */
    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds value.
     *
     * @param instanceIds the instanceIds value to set
     */
    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}
