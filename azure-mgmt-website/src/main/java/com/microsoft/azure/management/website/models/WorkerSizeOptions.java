/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WorkerSizeOptions.
 */
public enum WorkerSizeOptions {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Small. */
    SMALL("Small"),

    /** Enum value Medium. */
    MEDIUM("Medium"),

    /** Enum value Large. */
    LARGE("Large");

    /** The actual serialized value for a WorkerSizeOptions instance. */
    private String value;

    WorkerSizeOptions(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a WorkerSizeOptions instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a WorkerSizeOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WorkerSizeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkerSizeOptions fromValue(String value) {
        WorkerSizeOptions[] items = WorkerSizeOptions.values();
        for (WorkerSizeOptions item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
