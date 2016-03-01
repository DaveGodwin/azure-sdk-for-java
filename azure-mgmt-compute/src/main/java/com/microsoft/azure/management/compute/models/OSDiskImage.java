/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the os disk image information.
 */
public class OSDiskImage {
    /**
     * Gets or sets the operating system of the osDiskImage. Possible values
     * include: 'Windows', 'Linux'.
     */
    @JsonProperty(required = true)
    private String operatingSystem;

    /**
     * Get the operatingSystem value.
     *
     * @return the operatingSystem value
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem value.
     *
     * @param operatingSystem the operatingSystem value to set
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
