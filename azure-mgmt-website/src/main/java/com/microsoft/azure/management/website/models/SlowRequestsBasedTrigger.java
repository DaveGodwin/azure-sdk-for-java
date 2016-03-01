/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * SlowRequestsBasedTrigger.
 */
public class SlowRequestsBasedTrigger {
    /**
     * TimeTaken.
     */
    private String timeTaken;

    /**
     * Count.
     */
    private Integer count;

    /**
     * TimeInterval.
     */
    private String timeInterval;

    /**
     * Get the timeTaken value.
     *
     * @return the timeTaken value
     */
    public String getTimeTaken() {
        return this.timeTaken;
    }

    /**
     * Set the timeTaken value.
     *
     * @param timeTaken the timeTaken value to set
     */
    public void setTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Get the timeInterval value.
     *
     * @return the timeInterval value
     */
    public String getTimeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval value.
     *
     * @param timeInterval the timeInterval value to set
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

}
