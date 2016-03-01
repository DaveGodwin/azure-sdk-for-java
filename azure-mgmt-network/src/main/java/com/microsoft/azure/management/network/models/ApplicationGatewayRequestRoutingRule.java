/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request routing rule of application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRequestRoutingRule extends SubResource {
    /**
     * Gets or sets the rule type. Possible values include: 'Basic',
     * 'PathBasedRouting'.
     */
    @JsonProperty(value = "properties.ruleType")
    private String ruleType;

    /**
     * Gets or sets backend address pool resource of application gateway.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Gets or sets frontend port resource of application gateway.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Gets or sets http listener resource of application gateway.
     */
    @JsonProperty(value = "properties.httpListener")
    private SubResource httpListener;

    /**
     * Gets or sets url path map resource of application gateway.
     */
    @JsonProperty(value = "properties.urlPathMap")
    private SubResource urlPathMap;

    /**
     * Gets or sets Provisioning state of the request routing rule resource
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
     * Get the ruleType value.
     *
     * @return the ruleType value
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType value.
     *
     * @param ruleType the ruleType value to set
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
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
     * Get the httpListener value.
     *
     * @return the httpListener value
     */
    public SubResource getHttpListener() {
        return this.httpListener;
    }

    /**
     * Set the httpListener value.
     *
     * @param httpListener the httpListener value to set
     */
    public void setHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
    }

    /**
     * Get the urlPathMap value.
     *
     * @return the urlPathMap value
     */
    public SubResource getUrlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set the urlPathMap value.
     *
     * @param urlPathMap the urlPathMap value to set
     */
    public void setUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
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
