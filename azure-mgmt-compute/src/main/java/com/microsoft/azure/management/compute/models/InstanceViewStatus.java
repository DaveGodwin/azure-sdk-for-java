/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import org.joda.time.DateTime;

/**
 * Instance view status.
 */
public class InstanceViewStatus {
    /**
     * Gets or sets the status Code.
     */
    private String code;

    /**
     * Gets or sets the level Code. Possible values include: 'Info',
     * 'Warning', 'Error'.
     */
    private String level;

    /**
     * Gets or sets the short localizable label for the status.
     */
    private String displayStatus;

    /**
     * Gets or sets the optional detailed Message, including for alerts and
     * error messages.
     */
    private String message;

    /**
     * Gets or sets the time of the status.
     */
    private DateTime time;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Get the displayStatus value.
     *
     * @return the displayStatus value
     */
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the displayStatus value.
     *
     * @param displayStatus the displayStatus value to set
     */
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the time value.
     *
     * @return the time value
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the time value.
     *
     * @param time the time value to set
     */
    public void setTime(DateTime time) {
        this.time = time;
    }

}
