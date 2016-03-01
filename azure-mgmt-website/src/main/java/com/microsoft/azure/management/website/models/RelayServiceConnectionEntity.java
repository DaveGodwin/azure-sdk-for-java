/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Class that represents a Biztalk Hybrid Connection.
 */
@JsonFlatten
public class RelayServiceConnectionEntity extends Resource {
    /**
     * The entityName property.
     */
    @JsonProperty(value = "properties.entityName")
    private String entityName;

    /**
     * The entityConnectionString property.
     */
    @JsonProperty(value = "properties.entityConnectionString")
    private String entityConnectionString;

    /**
     * The resourceType property.
     */
    @JsonProperty(value = "properties.resourceType")
    private String resourceType;

    /**
     * The resourceConnectionString property.
     */
    @JsonProperty(value = "properties.resourceConnectionString")
    private String resourceConnectionString;

    /**
     * The hostname property.
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /**
     * The port property.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The biztalkUri property.
     */
    @JsonProperty(value = "properties.biztalkUri")
    private String biztalkUri;

    /**
     * Get the entityName value.
     *
     * @return the entityName value
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * Set the entityName value.
     *
     * @param entityName the entityName value to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * Get the entityConnectionString value.
     *
     * @return the entityConnectionString value
     */
    public String getEntityConnectionString() {
        return this.entityConnectionString;
    }

    /**
     * Set the entityConnectionString value.
     *
     * @param entityConnectionString the entityConnectionString value to set
     */
    public void setEntityConnectionString(String entityConnectionString) {
        this.entityConnectionString = entityConnectionString;
    }

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Get the resourceConnectionString value.
     *
     * @return the resourceConnectionString value
     */
    public String getResourceConnectionString() {
        return this.resourceConnectionString;
    }

    /**
     * Set the resourceConnectionString value.
     *
     * @param resourceConnectionString the resourceConnectionString value to set
     */
    public void setResourceConnectionString(String resourceConnectionString) {
        this.resourceConnectionString = resourceConnectionString;
    }

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Get the biztalkUri value.
     *
     * @return the biztalkUri value
     */
    public String getBiztalkUri() {
        return this.biztalkUri;
    }

    /**
     * Set the biztalkUri value.
     *
     * @param biztalkUri the biztalkUri value to set
     */
    public void setBiztalkUri(String biztalkUri) {
        this.biztalkUri = biztalkUri;
    }

}
