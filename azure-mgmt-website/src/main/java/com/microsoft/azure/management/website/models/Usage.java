/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Class that represents usage of the quota resource.
 */
@JsonFlatten
public class Usage extends Resource {
    /**
     * Friendly name shown in the UI.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Name of the quota.
     */
    @JsonProperty(value = "properties.name")
    private String usageName;

    /**
     * Name of the quota resource.
     */
    @JsonProperty(value = "properties.resourceName")
    private String resourceName;

    /**
     * Units of measurement for the quota resource.
     */
    @JsonProperty(value = "properties.unit")
    private String unit;

    /**
     * The current value of the resource counter.
     */
    @JsonProperty(value = "properties.currentValue")
    private Long currentValue;

    /**
     * The resource limit.
     */
    @JsonProperty(value = "properties.limit")
    private Long limit;

    /**
     * Next reset time for the resource counter.
     */
    @JsonProperty(value = "properties.nextResetTime")
    private DateTime nextResetTime;

    /**
     * ComputeMode used for this usage. Possible values include: 'Shared',
     * 'Dedicated'.
     */
    @JsonProperty(value = "properties.computeMode")
    private ComputeModeOptions computeMode;

    /**
     * SiteMode used for this usage.
     */
    @JsonProperty(value = "properties.siteMode")
    private String siteMode;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the usageName value.
     *
     * @return the usageName value
     */
    public String getUsageName() {
        return this.usageName;
    }

    /**
     * Set the usageName value.
     *
     * @param usageName the usageName value to set
     */
    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    /**
     * Get the resourceName value.
     *
     * @return the resourceName value
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName value.
     *
     * @param resourceName the resourceName value to set
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Get the currentValue value.
     *
     * @return the currentValue value
     */
    public Long getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     */
    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     */
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    /**
     * Get the nextResetTime value.
     *
     * @return the nextResetTime value
     */
    public DateTime getNextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime value.
     *
     * @param nextResetTime the nextResetTime value to set
     */
    public void setNextResetTime(DateTime nextResetTime) {
        this.nextResetTime = nextResetTime;
    }

    /**
     * Get the computeMode value.
     *
     * @return the computeMode value
     */
    public ComputeModeOptions getComputeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode value.
     *
     * @param computeMode the computeMode value to set
     */
    public void setComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
    }

    /**
     * Get the siteMode value.
     *
     * @return the siteMode value
     */
    public String getSiteMode() {
        return this.siteMode;
    }

    /**
     * Set the siteMode value.
     *
     * @param siteMode the siteMode value to set
     */
    public void setSiteMode(String siteMode) {
        this.siteMode = siteMode;
    }

}
