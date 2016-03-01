/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * IPConfiguration in a NetworkInterface.
 */
@JsonFlatten
public class NetworkInterfaceIPConfiguration extends SubResource {
    /**
     * Gets or sets the reference of LoadBalancerBackendAddressPool resource.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<BackendAddressPool> loadBalancerBackendAddressPools;

    /**
     * Gets or sets list of references of LoadBalancerInboundNatRules.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatRules")
    private List<InboundNatRule> loadBalancerInboundNatRules;

    /**
     * The privateIPAddress property.
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
     * The subnet property.
     */
    @JsonProperty(value = "properties.subnet")
    private Subnet subnet;

    /**
     * The publicIPAddress property.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddress publicIPAddress;

    /**
     * The provisioningState property.
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
     * Creates an instance of NetworkInterfaceIPConfiguration class.
     */
    public NetworkInterfaceIPConfiguration() {
        subnet = new Subnet();
    }

    /**
     * Get the loadBalancerBackendAddressPools value.
     *
     * @return the loadBalancerBackendAddressPools value
     */
    public List<BackendAddressPool> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools value.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set
     */
    public void setLoadBalancerBackendAddressPools(List<BackendAddressPool> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
    }

    /**
     * Get the loadBalancerInboundNatRules value.
     *
     * @return the loadBalancerInboundNatRules value
     */
    public List<InboundNatRule> getLoadBalancerInboundNatRules() {
        return this.loadBalancerInboundNatRules;
    }

    /**
     * Set the loadBalancerInboundNatRules value.
     *
     * @param loadBalancerInboundNatRules the loadBalancerInboundNatRules value to set
     */
    public void setLoadBalancerInboundNatRules(List<InboundNatRule> loadBalancerInboundNatRules) {
        this.loadBalancerInboundNatRules = loadBalancerInboundNatRules;
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
