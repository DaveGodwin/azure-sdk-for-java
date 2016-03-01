/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Compute Resource Usage.
 */
public class Usage {
    /**
     * Gets or sets an enum describing the unit of measurement.
     */
    @JsonProperty(required = true)
    private String unit;

    /**
     * Gets or sets the current value of the usage.
     */
    @JsonProperty(required = true)
    private int currentValue;

    /**
     * Gets or sets the limit of usage.
     */
    @JsonProperty(required = true)
    private long limit;

    /**
     * Gets or sets the name of the type of usage.
     */
    @JsonProperty(required = true)
    private UsageName name;

    /**
     * Creates an instance of Usage class.
     */
    public Usage() {
        unit = "Count";
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
    public int getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     */
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public long getLimit() {
        return this.limit;
    }

    /**
     * Set the limit value.
     *
     * @param limit the limit value to set
     */
    public void setLimit(long limit) {
        this.limit = limit;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public UsageName getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(UsageName name) {
        this.name = name;
    }

}
