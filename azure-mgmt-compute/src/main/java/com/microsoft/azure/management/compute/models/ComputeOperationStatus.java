/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeOperationStatus.
 */
public enum ComputeOperationStatus {
    /** Enum value InProgress. */
    INPROGRESS("InProgress"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Preempted. */
    PREEMPTED("Preempted");

    /** The actual serialized value for a ComputeOperationStatus instance. */
    private String value;

    ComputeOperationStatus(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ComputeOperationStatus instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ComputeOperationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeOperationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeOperationStatus fromValue(String value) {
        ComputeOperationStatus[] items = ComputeOperationStatus.values();
        for (ComputeOperationStatus item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
