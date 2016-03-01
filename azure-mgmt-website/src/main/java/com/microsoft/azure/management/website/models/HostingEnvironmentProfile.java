/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Specification for a hostingEnvironment (App Service Environment) to use for
 * this resource.
 */
public class HostingEnvironmentProfile {
    /**
     * Resource id of the hostingEnvironment (App Service Environment).
     */
    private String id;

    /**
     * Name of the hostingEnvironment (App Service Environment) (read only).
     */
    private String name;

    /**
     * Resource type of the hostingEnvironment (App Service Environment) (read
     * only).
     */
    private String type;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
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

}
