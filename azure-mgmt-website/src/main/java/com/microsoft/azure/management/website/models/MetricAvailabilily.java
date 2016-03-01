/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Class repesenting metrics availability and retention.
 */
public class MetricAvailabilily {
    /**
     * Time grain.
     */
    private String timeGrain;

    /**
     * Retention period for the current
     * {Microsoft.Web.Hosting.Administration.MetricAvailabilily.TimeGrain}.
     */
    private String retention;

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String getTimeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain value.
     *
     * @param timeGrain the timeGrain value to set
     */
    public void setTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
    }

    /**
     * Get the retention value.
     *
     * @return the retention value
     */
    public String getRetention() {
        return this.retention;
    }

    /**
     * Set the retention value.
     *
     * @param retention the retention value to set
     */
    public void setRetention(String retention) {
        this.retention = retention;
    }

}
