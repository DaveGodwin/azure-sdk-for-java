// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Rule to filter client IP address.
 */
@Fluent
public final class IpRule implements JsonSerializable<IpRule> {
    /*
     * Action when client IP address is matched.
     */
    private String action = "Allow";

    /*
     * IPv4 address, or IPv4 address range in CIDR format.
     */
    private String value;

    /**
     * Creates an instance of IpRule class.
     */
    public IpRule() {
    }

    /**
     * Get the action property: Action when client IP address is matched.
     * 
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: Action when client IP address is matched.
     * 
     * @param action the action value to set.
     * @return the IpRule object itself.
     */
    public IpRule withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the value property: IPv4 address, or IPv4 address range in CIDR format.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: IPv4 address, or IPv4 address range in CIDR format.
     * 
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property value in model IpRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("action", this.action);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpRule if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpRule.
     */
    public static IpRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpRule deserializedIpRule = new IpRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedIpRule.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpRule;
        });
    }
}
