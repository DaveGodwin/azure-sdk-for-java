/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Frontend IP address of the load balancer.
 */
@JsonFlatten
public class FrontendIPConfiguration extends SubResource {
    /**
     * Read only.Inbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<SubResource> inboundNatRules;

    /**
     * Read only.Inbound pools URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<SubResource> inboundNatPools;

    /**
     * Read only.Outbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.outboundNatRules")
    private List<SubResource> outboundNatRules;

    /**
     * Gets Load Balancing rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<SubResource> loadBalancingRules;

    /**
     * Gets or sets the privateIPAddress of the IP Configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * Gets or sets PrivateIP allocation method (Static/Dynamic). Possible
     * values include: 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private String privateIPAllocationMethod;

    /**
     * Gets or sets the reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private Subnet subnet;

    /**
     * Gets or sets the reference of the PublicIP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddress publicIPAddress;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
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
     * Get the inboundNatRules value.
     *
     * @return the inboundNatRules value
     */
    public List<SubResource> getInboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules value.
     *
     * @param inboundNatRules the inboundNatRules value to set
     */
    public void setInboundNatRules(List<SubResource> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
    }

    /**
     * Get the inboundNatPools value.
     *
     * @return the inboundNatPools value
     */
    public List<SubResource> getInboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools value.
     *
     * @param inboundNatPools the inboundNatPools value to set
     */
    public void setInboundNatPools(List<SubResource> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
    }

    /**
     * Get the outboundNatRules value.
     *
     * @return the outboundNatRules value
     */
    public List<SubResource> getOutboundNatRules() {
        return this.outboundNatRules;
    }

    /**
     * Set the outboundNatRules value.
     *
     * @param outboundNatRules the outboundNatRules value to set
     */
    public void setOutboundNatRules(List<SubResource> outboundNatRules) {
        this.outboundNatRules = outboundNatRules;
    }

    /**
     * Get the loadBalancingRules value.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> getLoadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules value.
     *
     * @param loadBalancingRules the loadBalancingRules value to set
     */
    public void setLoadBalancingRules(List<SubResource> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
    }

    /**
     * Get the privateIPAddress value.
     *
     * @return the privateIPAddress value
     */
    public String getPrivateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the privateIPAddress value.
     *
     * @param privateIPAddress the privateIPAddress value to set
     */
    public void setPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
    }

    /**
     * Get the privateIPAllocationMethod value.
     *
     * @return the privateIPAllocationMethod value
     */
    public String getPrivateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the privateIPAllocationMethod value.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     */
    public void setPrivateIPAllocationMethod(String privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public Subnet getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     */
    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }

    /**
     * Get the publicIPAddress value.
     *
     * @return the publicIPAddress value
     */
    public PublicIPAddress getPublicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the publicIPAddress value.
     *
     * @param publicIPAddress the publicIPAddress value to set
     */
    public void setPublicIPAddress(PublicIPAddress publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
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
