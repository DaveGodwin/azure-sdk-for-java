/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Rules of the load balancer.
 */
@JsonFlatten
public class LoadBalancingRule extends SubResource {
    /**
     * Gets or sets a reference to frontend IP Addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Gets or sets  a reference to a pool of DIPs. Inbound traffic is
     * randomly load balanced across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool", required = true)
    private SubResource backendAddressPool;

    /**
     * Gets or sets the reference of the load balancer probe used by the Load
     * Balancing rule.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * Gets or sets the transport protocol for the external endpoint. Possible
     * values are Udp or Tcp. Possible values include: 'Udp', 'Tcp'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private String protocol;

    /**
     * Gets or sets the load distribution policy for this rule. Possible
     * values include: 'Default', 'SourceIP', 'SourceIPProtocol'.
     */
    @JsonProperty(value = "properties.loadDistribution")
    private String loadDistribution;

    /**
     * Gets or sets the port for the external endpoint. You can specify any
     * port number you choose, but the port numbers specified for each role
     * in the service must be unique. Possible values range between 1 and
     * 65535, inclusive.
     */
    @JsonProperty(value = "properties.frontendPort", required = true)
    private int frontendPort;

    /**
     * Gets or sets a port used for internal connections on the endpoint. The
     * localPort attribute maps the eternal port of the endpoint to an
     * internal port on a role. This is useful in scenarios where a role must
     * communicate to an internal compotnent on a port that is different from
     * the one that is exposed externally. If not specified, the value of
     * localPort is the same as the port attribute. Set the value of
     * localPort to '*' to automatically assign an unallocated port that is
     * discoverable using the runtime API.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /**
     * Gets or sets the timeout for the Tcp idle connection. The value can be
     * set between 4 and 30 minutes. The default value is 4 minutes. This
     * emlement is only used when the protocol is set to Tcp.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn availability Group. This setting
     * is required when using the SQL Always ON availability Groups in SQL
     * server. This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP", required = true)
    private boolean enableFloatingIP;

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
     * Get the frontendIPConfiguration value.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource getFrontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration value.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     */
    public void setFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
    }

    /**
     * Get the backendAddressPool value.
     *
     * @return the backendAddressPool value
     */
    public SubResource getBackendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool value.
     *
     * @param backendAddressPool the backendAddressPool value to set
     */
    public void setBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
    }

    /**
     * Get the probe value.
     *
     * @return the probe value
     */
    public SubResource getProbe() {
        return this.probe;
    }

    /**
     * Set the probe value.
     *
     * @param probe the probe value to set
     */
    public void setProbe(SubResource probe) {
        this.probe = probe;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the loadDistribution value.
     *
     * @return the loadDistribution value
     */
    public String getLoadDistribution() {
        return this.loadDistribution;
    }

    /**
     * Set the loadDistribution value.
     *
     * @param loadDistribution the loadDistribution value to set
     */
    public void setLoadDistribution(String loadDistribution) {
        this.loadDistribution = loadDistribution;
    }

    /**
     * Get the frontendPort value.
     *
     * @return the frontendPort value
     */
    public int getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort value.
     *
     * @param frontendPort the frontendPort value to set
     */
    public void setFrontendPort(int frontendPort) {
        this.frontendPort = frontendPort;
    }

    /**
     * Get the backendPort value.
     *
     * @return the backendPort value
     */
    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort value.
     *
     * @param backendPort the backendPort value to set
     */
    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
    }

    /**
     * Get the idleTimeoutInMinutes value.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes value.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     */
    public void setIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
    }

    /**
     * Get the enableFloatingIP value.
     *
     * @return the enableFloatingIP value
     */
    public boolean getEnableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set the enableFloatingIP value.
     *
     * @param enableFloatingIP the enableFloatingIP value to set
     */
    public void setEnableFloatingIP(boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
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
