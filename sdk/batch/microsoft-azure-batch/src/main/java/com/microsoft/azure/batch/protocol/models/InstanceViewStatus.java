/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view status.
 */
public class InstanceViewStatus {
    /**
     * The status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The localized label for the status.
     */
    @JsonProperty(value = "displayStatus")
    private String displayStatus;

    /**
     * Level code.
     * Possible values include: 'Error', 'Info', 'Warning'.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /**
     * The detailed status message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The time of the status.
     */
    @JsonProperty(value = "time")
    private String time;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the displayStatus value.
     *
     * @return the displayStatus value
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the displayStatus value.
     *
     * @param displayStatus the displayStatus value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Get possible values include: 'Error', 'Info', 'Warning'.
     *
     * @return the level value
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set possible values include: 'Error', 'Info', 'Warning'.
     *
     * @param level the level value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the time of the status.
     *
     * @return the time value
     */
    public String time() {
        return this.time;
    }

    /**
     * Set the time of the status.
     *
     * @param time the time value to set
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withTime(String time) {
        this.time = time;
        return this;
    }

}
