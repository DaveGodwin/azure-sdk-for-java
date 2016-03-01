/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DomainStatus.
 */
public enum DomainStatus {
    /** Enum value Active. */
    ACTIVE("Active"),

    /** Enum value Awaiting. */
    AWAITING("Awaiting"),

    /** Enum value Cancelled. */
    CANCELLED("Cancelled"),

    /** Enum value Confiscated. */
    CONFISCATED("Confiscated"),

    /** Enum value Disabled. */
    DISABLED("Disabled"),

    /** Enum value Excluded. */
    EXCLUDED("Excluded"),

    /** Enum value Expired. */
    EXPIRED("Expired"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Held. */
    HELD("Held"),

    /** Enum value Locked. */
    LOCKED("Locked"),

    /** Enum value Parked. */
    PARKED("Parked"),

    /** Enum value Pending. */
    PENDING("Pending"),

    /** Enum value Reserved. */
    RESERVED("Reserved"),

    /** Enum value Reverted. */
    REVERTED("Reverted"),

    /** Enum value Suspended. */
    SUSPENDED("Suspended"),

    /** Enum value Transferred. */
    TRANSFERRED("Transferred"),

    /** Enum value Unknown. */
    UNKNOWN("Unknown"),

    /** Enum value Unlocked. */
    UNLOCKED("Unlocked"),

    /** Enum value Unparked. */
    UNPARKED("Unparked"),

    /** Enum value Updated. */
    UPDATED("Updated"),

    /** Enum value JsonConverterFailed. */
    JSONCONVERTERFAILED("JsonConverterFailed");

    /** The actual serialized value for a DomainStatus instance. */
    private String value;

    DomainStatus(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a DomainStatus instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a DomainStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DomainStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static DomainStatus fromValue(String value) {
        DomainStatus[] items = DomainStatus.values();
        for (DomainStatus item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
