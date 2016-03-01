/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * NetworkSecurityGroup resource.
 */
@JsonFlatten
public class NetworkSecurityGroup extends Resource {
    /**
     * Gets or sets Security rules of network security group.
     */
    @JsonProperty(value = "properties.securityRules")
    private List<SecurityRule> securityRules;

    /**
     * Gets or sets Default security rules of network security group.
     */
    @JsonProperty(value = "properties.defaultSecurityRules")
    private List<SecurityRule> defaultSecurityRules;

    /**
     * Gets collection of references to Network Interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces")
    private List<NetworkInterface> networkInterfaces;

    /**
     * Gets collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets")
    private List<Subnet> subnets;

    /**
     * Gets or sets resource guid property of the network security group
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Get the securityRules value.
     *
     * @return the securityRules value
     */
    public List<SecurityRule> getSecurityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules value.
     *
     * @param securityRules the securityRules value to set
     */
    public void setSecurityRules(List<SecurityRule> securityRules) {
        this.securityRules = securityRules;
    }

    /**
     * Get the defaultSecurityRules value.
     *
     * @return the defaultSecurityRules value
     */
    public List<SecurityRule> getDefaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Set the defaultSecurityRules value.
     *
     * @param defaultSecurityRules the defaultSecurityRules value to set
     */
    public void setDefaultSecurityRules(List<SecurityRule> defaultSecurityRules) {
        this.defaultSecurityRules = defaultSecurityRules;
    }

    /**
     * Get the networkInterfaces value.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Set the networkInterfaces value.
     *
     * @param networkInterfaces the networkInterfaces value to set
     */
    public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    /**
     * Get the subnets value.
     *
     * @return the subnets value
     */
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    /**
     * Set the subnets value.
     *
     * @param subnets the subnets value to set
     */
    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     */
    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
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
