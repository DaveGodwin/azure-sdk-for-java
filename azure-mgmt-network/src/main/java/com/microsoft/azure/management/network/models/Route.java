/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Route resource.
 */
@JsonFlatten
public class Route extends SubResource {
    /**
     * Gets or sets the destination CIDR to which the route applies.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * Gets or sets the type of Azure hop the packet should be sent to.
     * Possible values include: 'VirtualNetworkGateway', 'VnetLocal',
     * 'Internet', 'VirtualAppliance', 'None'.
     */
    @JsonProperty(value = "properties.nextHopType", required = true)
    private String nextHopType;

    /**
     * Gets or sets the IP address packets should be forwarded to. Next hop
     * values are only allowed in routes where the next hop type is
     * VirtualAppliance.
     */
    @JsonProperty(value = "properties.nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * Gets or sets Provisioning state of the resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the addressPrefix value.
     *
     * @return the addressPrefix value
     */
    public String getAddressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix value.
     *
     * @param addressPrefix the addressPrefix value to set
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * Get the nextHopType value.
     *
     * @return the nextHopType value
     */
    public String getNextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType value.
     *
     * @param nextHopType the nextHopType value to set
     */
    public void setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
    }

    /**
     * Get the nextHopIpAddress value.
     *
     * @return the nextHopIpAddress value
     */
    public String getNextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress value.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     */
    public void setNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
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

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}
