/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.Map;

/**
 * The PremierAddOnRequest model.
 */
public class PremierAddOnRequest {
    /**
     * Geo region resource belongs to e.g. SouthCentralUS, SouthEastAsia.
     */
    private String location;

    /**
     * Tags associated with resource.
     */
    private Map<String, String> tags;

    /**
     * Azure resource manager plan.
     */
    private ArmPlan plan;

    /**
     * Resource specific properties.
     */
    private Object properties;

    /**
     * Sku description of the resource.
     */
    private SkuDescription sku;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     */
    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public ArmPlan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     */
    public void setPlan(ArmPlan plan) {
        this.plan = plan;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(Object properties) {
        this.properties = properties;
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

}
