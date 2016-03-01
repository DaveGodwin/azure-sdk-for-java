/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A common class for general resource information.
 */
@JsonFlatten
public class VirtualNetworkGatewayConnection extends Resource {
    /**
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * The virtualNetworkGateway1 property.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1")
    private VirtualNetworkGateway virtualNetworkGateway1;

    /**
     * The virtualNetworkGateway2 property.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkGateway virtualNetworkGateway2;

    /**
     * The localNetworkGateway2 property.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private LocalNetworkGateway localNetworkGateway2;

    /**
     * Gateway connection type -Ipsec/Dedicated/VpnClient/Vnet2Vnet. Possible
     * values include: 'IPsec', 'Vnet2Vnet', 'ExpressRoute', 'VPNClient'.
     */
    @JsonProperty(value = "properties.connectionType")
    private String connectionType;

    /**
     * The Routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /**
     * The Ipsec share key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * Virtual network Gateway connection status. Possible values include:
     * 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionStatus")
    private String connectionStatus;

    /**
     * The Egress Bytes Transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred")
    private Long egressBytesTransferred;

    /**
     * The Ingress Bytes Transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred")
    private Long ingressBytesTransferred;

    /**
     * The reference to peerings resource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /**
     * Gets or sets resource guid property of the
     * VirtualNetworkGatewayConnection resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the VirtualNetworkGatewayConnection
     * resource Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Get the authorizationKey value.
     *
     * @return the authorizationKey value
     */
    public String getAuthorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey value.
     *
     * @param authorizationKey the authorizationKey value to set
     */
    public void setAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
    }

    /**
     * Get the virtualNetworkGateway1 value.
     *
     * @return the virtualNetworkGateway1 value
     */
    public VirtualNetworkGateway getVirtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 value.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set
     */
    public void setVirtualNetworkGateway1(VirtualNetworkGateway virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
    }

    /**
     * Get the virtualNetworkGateway2 value.
     *
     * @return the virtualNetworkGateway2 value
     */
    public VirtualNetworkGateway getVirtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 value.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set
     */
    public void setVirtualNetworkGateway2(VirtualNetworkGateway virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
    }

    /**
     * Get the localNetworkGateway2 value.
     *
     * @return the localNetworkGateway2 value
     */
    public LocalNetworkGateway getLocalNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 value.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set
     */
    public void setLocalNetworkGateway2(LocalNetworkGateway localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
    }

    /**
     * Get the connectionType value.
     *
     * @return the connectionType value
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType value.
     *
     * @param connectionType the connectionType value to set
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * Get the routingWeight value.
     *
     * @return the routingWeight value
     */
    public Integer getRoutingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight value.
     *
     * @param routingWeight the routingWeight value to set
     */
    public void setRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
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
     * Get the connectionStatus value.
     *
     * @return the connectionStatus value
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Set the connectionStatus value.
     *
     * @param connectionStatus the connectionStatus value to set
     */
    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * Get the egressBytesTransferred value.
     *
     * @return the egressBytesTransferred value
     */
    public Long getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Set the egressBytesTransferred value.
     *
     * @param egressBytesTransferred the egressBytesTransferred value to set
     */
    public void setEgressBytesTransferred(Long egressBytesTransferred) {
        this.egressBytesTransferred = egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred value.
     *
     * @return the ingressBytesTransferred value
     */
    public Long getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Set the ingressBytesTransferred value.
     *
     * @param ingressBytesTransferred the ingressBytesTransferred value to set
     */
    public void setIngressBytesTransferred(Long ingressBytesTransferred) {
        this.ingressBytesTransferred = ingressBytesTransferred;
    }

    /**
     * Get the peer value.
     *
     * @return the peer value
     */
    public SubResource getPeer() {
        return this.peer;
    }

    /**
     * Set the peer value.
     *
     * @param peer the peer value to set
     */
    public void setPeer(SubResource peer) {
        this.peer = peer;
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
