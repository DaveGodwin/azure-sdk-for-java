/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Value of resource metric.
 */
public class ResourceMetricValue {
    /**
     * Value timestamp.
     */
    private String timeStamp;

    /**
     * Value average.
     */
    private Double average;

    /**
     * Value minimum.
     */
    private Double minimum;

    /**
     * Value maximum.
     */
    private Double maximum;

    /**
     * Value total.
     */
    private Double total;

    /**
     * Value count.
     */
    private Double count;

    /**
     * Get the timeStamp value.
     *
     * @return the timeStamp value
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timeStamp value.
     *
     * @param timeStamp the timeStamp value to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Get the average value.
     *
     * @return the average value
     */
    public Double getAverage() {
        return this.average;
    }

    /**
     * Set the average value.
     *
     * @param average the average value to set
     */
    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * Get the minimum value.
     *
     * @return the minimum value
     */
    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum value.
     *
     * @param minimum the minimum value to set
     */
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * Get the maximum value.
     *
     * @return the maximum value
     */
    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum value.
     *
     * @param maximum the maximum value to set
     */
    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * Get the total value.
     *
     * @return the total value
     */
    public Double getTotal() {
        return this.total;
    }

    /**
     * Set the total value.
     *
     * @param total the total value to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Double getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Double count) {
        this.count = count;
    }

}
