/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ExpressRouteResourceProvider object.
 */
@JsonFlatten
public class ExpressRouteServiceProvider extends Resource {
    /**
     * Gets or list of peering locations.
     */
    @JsonProperty(value = "properties.peeringLocations")
    private List<String> peeringLocations;

    /**
     * Gets or bandwidths offered.
     */
    @JsonProperty(value = "properties.bandwidthsOffered")
    private List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered;

    /**
     * Gets or sets Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the peeringLocations value.
     *
     * @return the peeringLocations value
     */
    public List<String> getPeeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set the peeringLocations value.
     *
     * @param peeringLocations the peeringLocations value to set
     */
    public void setPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
    }

    /**
     * Get the bandwidthsOffered value.
     *
     * @return the bandwidthsOffered value
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> getBandwidthsOffered() {
        return this.bandwidthsOffered;
    }

    /**
     * Set the bandwidthsOffered value.
     *
     * @param bandwidthsOffered the bandwidthsOffered value to set
     */
    public void setBandwidthsOffered(List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        this.bandwidthsOffered = bandwidthsOffered;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}
