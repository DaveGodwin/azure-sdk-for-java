/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Peering in a ExpressRouteCircuit resource.
 */
@JsonFlatten
public class ExpressRouteCircuitPeering extends SubResource {
    /**
     * Gets or sets PeeringType. Possible values include:
     * 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'.
     */
    @JsonProperty(value = "properties.peeringType")
    private String peeringType;

    /**
     * Gets or sets state of Peering. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Gets or sets the azure ASN.
     */
    @JsonProperty(value = "properties.azureASN")
    private Integer azureASN;

    /**
     * Gets or sets the peer ASN.
     */
    @JsonProperty(value = "properties.peerASN")
    private Integer peerASN;

    /**
     * Gets or sets the primary address prefix.
     */
    @JsonProperty(value = "properties.primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /**
     * Gets or sets the secondary address prefix.
     */
    @JsonProperty(value = "properties.secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /**
     * Gets or sets the primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort")
    private String primaryAzurePort;

    /**
     * Gets or sets the secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort")
    private String secondaryAzurePort;

    /**
     * Gets or sets the shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * Gets or sets the vlan id.
     */
    @JsonProperty(value = "properties.vlanId")
    private Integer vlanId;

    /**
     * Gets or sets the mircosoft peering config.
     */
    @JsonProperty(value = "properties.microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /**
     * Gets or peering stats.
     */
    @JsonProperty(value = "properties.stats")
    private ExpressRouteCircuitStats stats;

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
     * Get the peeringType value.
     *
     * @return the peeringType value
     */
    public String getPeeringType() {
        return this.peeringType;
    }

    /**
     * Set the peeringType value.
     *
     * @param peeringType the peeringType value to set
     */
    public void setPeeringType(String peeringType) {
        this.peeringType = peeringType;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get the azureASN value.
     *
     * @return the azureASN value
     */
    public Integer getAzureASN() {
        return this.azureASN;
    }

    /**
     * Set the azureASN value.
     *
     * @param azureASN the azureASN value to set
     */
    public void setAzureASN(Integer azureASN) {
        this.azureASN = azureASN;
    }

    /**
     * Get the peerASN value.
     *
     * @return the peerASN value
     */
    public Integer getPeerASN() {
        return this.peerASN;
    }

    /**
     * Set the peerASN value.
     *
     * @param peerASN the peerASN value to set
     */
    public void setPeerASN(Integer peerASN) {
        this.peerASN = peerASN;
    }

    /**
     * Get the primaryPeerAddressPrefix value.
     *
     * @return the primaryPeerAddressPrefix value
     */
    public String getPrimaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix value.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set
     */
    public void setPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
    }

    /**
     * Get the secondaryPeerAddressPrefix value.
     *
     * @return the secondaryPeerAddressPrefix value
     */
    public String getSecondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix value.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set
     */
    public void setSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
    }

    /**
     * Get the primaryAzurePort value.
     *
     * @return the primaryAzurePort value
     */
    public String getPrimaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Set the primaryAzurePort value.
     *
     * @param primaryAzurePort the primaryAzurePort value to set
     */
    public void setPrimaryAzurePort(String primaryAzurePort) {
        this.primaryAzurePort = primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort value.
     *
     * @return the secondaryAzurePort value
     */
    public String getSecondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Set the secondaryAzurePort value.
     *
     * @param secondaryAzurePort the secondaryAzurePort value to set
     */
    public void setSecondaryAzurePort(String secondaryAzurePort) {
        this.secondaryAzurePort = secondaryAzurePort;
    }

    /**
     * Get the sharedKey value.
     *
     * @return the sharedKey value
     */
    public String getSharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey value.
     *
     * @param sharedKey the sharedKey value to set
     */
    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
    }

    /**
     * Get the vlanId value.
     *
     * @return the vlanId value
     */
    public Integer getVlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId value.
     *
     * @param vlanId the vlanId value to set
     */
    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    /**
     * Get the microsoftPeeringConfig value.
     *
     * @return the microsoftPeeringConfig value
     */
    public ExpressRouteCircuitPeeringConfig getMicrosoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig value.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set
     */
    public void setMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
    }

    /**
     * Get the stats value.
     *
     * @return the stats value
     */
    public ExpressRouteCircuitStats getStats() {
        return this.stats;
    }

    /**
     * Set the stats value.
     *
     * @param stats the stats value to set
     */
    public void setStats(ExpressRouteCircuitStats stats) {
        this.stats = stats;
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
