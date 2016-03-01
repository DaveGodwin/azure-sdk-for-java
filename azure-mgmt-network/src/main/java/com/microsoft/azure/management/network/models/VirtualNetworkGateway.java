/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A common class for general resource information.
 */
@JsonFlatten
public class VirtualNetworkGateway extends Resource {
    /**
     * IpConfigurations for Virtual network gateway.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualNetworkGatewayIPConfiguration> ipConfigurations;

    /**
     * The type of this virtual network gateway. Possible values include:
     * 'Vpn', 'ExpressRoute'.
     */
    @JsonProperty(value = "properties.gatewayType")
    private String gatewayType;

    /**
     * The type of this virtual network gateway. Possible values include:
     * 'PolicyBased', 'RouteBased'.
     */
    @JsonProperty(value = "properties.vpnType")
    private String vpnType;

    /**
     * EnableBgp Flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /**
     * Gets or sets the reference of the LocalNetworkGateway resource which
     * represents Local network site having default routes. Assign Null value
     * in case of removing existing default site setting.
     */
    @JsonProperty(value = "properties.gatewayDefaultSite")
    private SubResource gatewayDefaultSite;

    /**
     * Gets or sets the reference of the VirtualNetworkGatewaySku resource
     * which represents the sku selected for Virtual network gateway.
     */
    @JsonProperty(value = "properties.sku")
    private VirtualNetworkGatewaySku sku;

    /**
     * Gets or sets the reference of the VpnClientConfiguration resource which
     * represents the P2S VpnClient configurations.
     */
    @JsonProperty(value = "properties.vpnClientConfiguration")
    private VpnClientConfiguration vpnClientConfiguration;

    /**
     * Gets or sets resource guid property of the VirtualNetworkGateway
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the VirtualNetworkGateway resource
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
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value
     */
    public List<VirtualNetworkGatewayIPConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations value.
     *
     * @param ipConfigurations the ipConfigurations value to set
     */
    public void setIpConfigurations(List<VirtualNetworkGatewayIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
    }

    /**
     * Get the gatewayType value.
     *
     * @return the gatewayType value
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType value.
     *
     * @param gatewayType the gatewayType value to set
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * Get the vpnType value.
     *
     * @return the vpnType value
     */
    public String getVpnType() {
        return this.vpnType;
    }

    /**
     * Set the vpnType value.
     *
     * @param vpnType the vpnType value to set
     */
    public void setVpnType(String vpnType) {
        this.vpnType = vpnType;
    }

    /**
     * Get the enableBgp value.
     *
     * @return the enableBgp value
     */
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp value.
     *
     * @param enableBgp the enableBgp value to set
     */
    public void setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
    }

    /**
     * Get the gatewayDefaultSite value.
     *
     * @return the gatewayDefaultSite value
     */
    public SubResource getGatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the gatewayDefaultSite value.
     *
     * @param gatewayDefaultSite the gatewayDefaultSite value to set
     */
    public void setGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public VirtualNetworkGatewaySku getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
    }

    /**
     * Get the vpnClientConfiguration value.
     *
     * @return the vpnClientConfiguration value
     */
    public VpnClientConfiguration getVpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the vpnClientConfiguration value.
     *
     * @param vpnClientConfiguration the vpnClientConfiguration value to set
     */
    public void setVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
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
