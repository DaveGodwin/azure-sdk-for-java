/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Resource name availability request content.
 */
public class ResourceNameAvailabilityRequest {
    /**
     * Resource name to verify.
     */
    private String name;

    /**
     * Resource type used for verification.
     */
    private String type;

    /**
     * Is fully qualified domain name.
     */
    private Boolean isFqdn;

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
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the isFqdn value.
     *
     * @return the isFqdn value
     */
    public Boolean getIsFqdn() {
        return this.isFqdn;
    }

    /**
     * Set the isFqdn value.
     *
     * @param isFqdn the isFqdn value to set
     */
    public void setIsFqdn(Boolean isFqdn) {
        this.isFqdn = isFqdn;
    }

}
