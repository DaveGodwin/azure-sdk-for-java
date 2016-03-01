/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Describes a sku for a scalable resource.
 */
public class SkuDescription {
    /**
     * Name of the resource sku.
     */
    private String name;

    /**
     * Service Tier of the resource sku.
     */
    private String tier;

    /**
     * Size specifier of the resource sku.
     */
    private String size;

    /**
     * Family code of the resource sku.
     */
    private String family;

    /**
     * Current number of instances assigned to the resource.
     */
    private Integer capacity;

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
     * Get the tier value.
     *
     * @return the tier value
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public String getSize() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public String getFamily() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
