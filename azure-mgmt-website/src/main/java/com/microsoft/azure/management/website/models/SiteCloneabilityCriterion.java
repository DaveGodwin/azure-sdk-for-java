/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Represents a site cloneability criterion.
 */
public class SiteCloneabilityCriterion {
    /**
     * Name of criterion.
     */
    private String name;

    /**
     * Description of criterion.
     */
    private String description;

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
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
