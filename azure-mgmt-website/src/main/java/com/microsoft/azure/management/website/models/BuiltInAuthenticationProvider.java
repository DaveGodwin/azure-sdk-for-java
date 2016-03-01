/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BuiltInAuthenticationProvider.
 */
public enum BuiltInAuthenticationProvider {
    /** Enum value AzureActiveDirectory. */
    AZUREACTIVEDIRECTORY("AzureActiveDirectory"),

    /** Enum value Facebook. */
    FACEBOOK("Facebook"),

    /** Enum value Google. */
    GOOGLE("Google"),

    /** Enum value MicrosoftAccount. */
    MICROSOFTACCOUNT("MicrosoftAccount"),

    /** Enum value Twitter. */
    TWITTER("Twitter");

    /** The actual serialized value for a BuiltInAuthenticationProvider instance. */
    private String value;

    BuiltInAuthenticationProvider(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a BuiltInAuthenticationProvider instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a BuiltInAuthenticationProvider instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BuiltInAuthenticationProvider object, or null if unable to parse.
     */
    @JsonCreator
    public static BuiltInAuthenticationProvider fromValue(String value) {
        BuiltInAuthenticationProvider[] items = BuiltInAuthenticationProvider.values();
        for (BuiltInAuthenticationProvider item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
