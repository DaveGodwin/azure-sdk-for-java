/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Pool of backend IP addresseses.
 */
@JsonFlatten
public class BackendAddressPool extends SubResource {
    /**
     * Gets collection of references to IPs defined in NICs.
     */
    @JsonProperty(value = "properties.backendIPConfigurations")
    private List<NetworkInterfaceIPConfiguration> backendIPConfigurations;

    /**
     * Gets Load Balancing rules that use this Backend Address Pool.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<SubResource> loadBalancingRules;

    /**
     * Gets outbound rules that use this Backend Address Pool.
     */
    @JsonProperty(value = "properties.outboundNatRule")
    private SubResource outboundNatRule;

    /**
     * Provisioning state of the PublicIP resource Updating/Deleting/Failed.
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
     * Get the backendIPConfigurations value.
     *
     * @return the backendIPConfigurations value
     */
    public List<NetworkInterfaceIPConfiguration> getBackendIPConfigurations() {
        return this.backendIPConfigurations;
    }

    /**
     * Set the backendIPConfigurations value.
     *
     * @param backendIPConfigurations the backendIPConfigurations value to set
     */
    public void setBackendIPConfigurations(List<NetworkInterfaceIPConfiguration> backendIPConfigurations) {
        this.backendIPConfigurations = backendIPConfigurations;
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
     * Get the outboundNatRule value.
     *
     * @return the outboundNatRule value
     */
    public SubResource getOutboundNatRule() {
        return this.outboundNatRule;
    }

    /**
     * Set the outboundNatRule value.
     *
     * @param outboundNatRule the outboundNatRule value to set
     */
    public void setOutboundNatRule(SubResource outboundNatRule) {
        this.outboundNatRule = outboundNatRule;
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
