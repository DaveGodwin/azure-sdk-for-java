/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BackupItemStatus.
 */
public enum BackupItemStatus {
    /** Enum value InProgress. */
    INPROGRESS("InProgress"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value TimedOut. */
    TIMEDOUT("TimedOut"),

    /** Enum value Created. */
    CREATED("Created"),

    /** Enum value Skipped. */
    SKIPPED("Skipped"),

    /** Enum value PartiallySucceeded. */
    PARTIALLYSUCCEEDED("PartiallySucceeded"),

    /** Enum value DeleteInProgress. */
    DELETEINPROGRESS("DeleteInProgress"),

    /** Enum value DeleteFailed. */
    DELETEFAILED("DeleteFailed"),

    /** Enum value Deleted. */
    DELETED("Deleted");

    /** The actual serialized value for a BackupItemStatus instance. */
    private String value;

    BackupItemStatus(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a BackupItemStatus instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a BackupItemStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupItemStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupItemStatus fromValue(String value) {
        BackupItemStatus[] items = BackupItemStatus.values();
        for (BackupItemStatus item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
