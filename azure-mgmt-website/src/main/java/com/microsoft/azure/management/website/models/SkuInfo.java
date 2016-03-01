/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Sku discovery information.
 */
public class SkuInfo {
    /**
     * Resource type that this sku applies to.
     */
    private String resourceType;

    /**
     * Name and tier of the sku.
     */
    private SkuDescription sku;

    /**
     * Min, max, and default scale values of the sku.
     */
    private SkuCapacity capacity;

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
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(SkuDescription sku) {
        this.sku = sku;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public SkuCapacity getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
    }

}
