/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CloneAbilityResult.
 */
public enum CloneAbilityResult {
    /** Enum value Cloneable. */
    CLONEABLE("Cloneable"),

    /** Enum value PartiallyCloneable. */
    PARTIALLYCLONEABLE("PartiallyCloneable"),

    /** Enum value NotCloneable. */
    NOTCLONEABLE("NotCloneable");

    /** The actual serialized value for a CloneAbilityResult instance. */
    private String value;

    CloneAbilityResult(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a CloneAbilityResult instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a CloneAbilityResult instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CloneAbilityResult object, or null if unable to parse.
     */
    @JsonCreator
    public static CloneAbilityResult fromValue(String value) {
        CloneAbilityResult[] items = CloneAbilityResult.values();
        for (CloneAbilityResult item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
