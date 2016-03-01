/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * The SiteProperties model.
 */
public class SiteProperties {
    /**
     * The metadata property.
     */
    private List<NameValuePair> metadata;

    /**
     * The properties property.
     */
    private List<NameValuePair> properties;

    /**
     * The appSettings property.
     */
    private List<NameValuePair> appSettings;

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<NameValuePair> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     */
    public void setMetadata(List<NameValuePair> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<NameValuePair> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(List<NameValuePair> properties) {
        this.properties = properties;
    }

    /**
     * Get the appSettings value.
     *
     * @return the appSettings value
     */
    public List<NameValuePair> getAppSettings() {
        return this.appSettings;
    }

    /**
     * Set the appSettings value.
     *
     * @param appSettings the appSettings value to set
     */
    public void setAppSettings(List<NameValuePair> appSettings) {
        this.appSettings = appSettings;
    }

}
