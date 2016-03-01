/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Path rule of URL path map of application gateway.
 */
@JsonFlatten
public class ApplicationGatewayPathRule extends SubResource {
    /**
     * Gets or sets the path rules of URL path map.
     */
    @JsonProperty(value = "properties.paths")
    private List<String> paths;

    /**
     * Gets or sets backend address pool resource of URL path map.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Gets or sets backend http settings resource of URL path map.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Gets or sets path rule of URL path map resource
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
     * Get the paths value.
     *
     * @return the paths value
     */
    public List<String> getPaths() {
        return this.paths;
    }

    /**
     * Set the paths value.
     *
     * @param paths the paths value to set
     */
    public void setPaths(List<String> paths) {
        this.paths = paths;
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
     * Get the backendHttpSettings value.
     *
     * @return the backendHttpSettings value
     */
    public SubResource getBackendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings value.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     */
    public void setBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
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
