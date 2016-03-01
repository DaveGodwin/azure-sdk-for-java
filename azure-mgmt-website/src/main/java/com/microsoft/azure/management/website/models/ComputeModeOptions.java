/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeModeOptions.
 */
public enum ComputeModeOptions {
    /** Enum value Shared. */
    SHARED("Shared"),

    /** Enum value Dedicated. */
    DEDICATED("Dedicated");

    /** The actual serialized value for a ComputeModeOptions instance. */
    private String value;

    ComputeModeOptions(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ComputeModeOptions instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ComputeModeOptions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeModeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeModeOptions fromValue(String value) {
        ComputeModeOptions[] items = ComputeModeOptions.values();
        for (ComputeModeOptions item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
