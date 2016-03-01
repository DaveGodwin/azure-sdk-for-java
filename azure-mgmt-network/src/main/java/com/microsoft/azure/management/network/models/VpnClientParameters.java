/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientParameters.
 */
public class VpnClientParameters {
    /**
     * VPN client Processor Architecture -Amd64/X86. Possible values include:
     * 'Amd64', 'X86'.
     */
    @JsonProperty(value = "ProcessorArchitecture")
    private String processorArchitecture;

    /**
     * Get the processorArchitecture value.
     *
     * @return the processorArchitecture value
     */
    public String getProcessorArchitecture() {
        return this.processorArchitecture;
    }

    /**
     * Set the processorArchitecture value.
     *
     * @param processorArchitecture the processorArchitecture value to set
     */
    public void setProcessorArchitecture(String processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
    }

}
