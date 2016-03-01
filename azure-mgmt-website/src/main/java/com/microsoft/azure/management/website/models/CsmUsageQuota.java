/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import org.joda.time.DateTime;

/**
 * Usage of the quota resource.
 */
public class CsmUsageQuota {
    /**
     * Units of measurement for the quota resourse.
     */
    private String unit;

    /**
     * Next reset time for the resource counter.
     */
    private DateTime nextResetTime;

    /**
     * The current value of the resource counter.
     */
    private Long currentValue;

    /**
     * The resource limit.
     */
    private Long limit;

    /**
     * Quota name.
     */
    private LocalizableString name;

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
     * Get the name value.
     *
     * @return the name value
     */
    public LocalizableString getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(LocalizableString name) {
        this.name = name;
    }

}
