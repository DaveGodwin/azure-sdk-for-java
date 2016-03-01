/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Probe of application gateway.
 */
@JsonFlatten
public class ApplicationGatewayProbe extends SubResource {
    /**
     * Gets or sets the protocol. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private String protocol;

    /**
     * Gets or sets the host to send probe to.
     */
    @JsonProperty(value = "properties.host")
    private String host;

    /**
     * Gets or sets the relative path of probe.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /**
     * Gets or sets probing interval in seconds.
     */
    @JsonProperty(value = "properties.interval")
    private Integer interval;

    /**
     * Gets or sets probing timeout in seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /**
     * Gets or sets probing unhealthy threshold.
     */
    @JsonProperty(value = "properties.unhealthyThreshold")
    private Integer unhealthyThreshold;

    /**
     * Gets or sets Provisioning state of the backend http settings resource
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
     * Get the host value.
     *
     * @return the host value
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Set the host value.
     *
     * @param host the host value to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Get the interval value.
     *
     * @return the interval value
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * Set the interval value.
     *
     * @param interval the interval value to set
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Get the unhealthyThreshold value.
     *
     * @return the unhealthyThreshold value
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * Set the unhealthyThreshold value.
     *
     * @param unhealthyThreshold the unhealthyThreshold value to set
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
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
