/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * SSL certificates of application gateway.
 */
@JsonFlatten
public class ApplicationGatewaySslCertificate extends SubResource {
    /**
     * Gets or sets the certificate data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * Gets or sets the certificate password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Gets or sets the certificate public data.
     */
    @JsonProperty(value = "properties.publicCertData")
    private String publicCertData;

    /**
     * Gets or sets Provisioning state of the ssl certificate resource
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
     * Get the data value.
     *
     * @return the data value
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the publicCertData value.
     *
     * @return the publicCertData value
     */
    public String getPublicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData value.
     *
     * @param publicCertData the publicCertData value to set
     */
    public void setPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
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
