// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The time for a scaling action to occur.
 */
@Fluent
public final class Time implements JsonSerializable<Time> {
    /*
     * The hour.
     */
    private int hour;

    /*
     * The minute.
     */
    private int minute;

    /**
     * Creates an instance of Time class.
     */
    public Time() {
    }

    /**
     * Get the hour property: The hour.
     * 
     * @return the hour value.
     */
    public int hour() {
        return this.hour;
    }

    /**
     * Set the hour property: The hour.
     * 
     * @param hour the hour value to set.
     * @return the Time object itself.
     */
    public Time withHour(int hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Get the minute property: The minute.
     * 
     * @return the minute value.
     */
    public int minute() {
        return this.minute;
    }

    /**
     * Set the minute property: The minute.
     * 
     * @param minute the minute value to set.
     * @return the Time object itself.
     */
    public Time withMinute(int minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("hour", this.hour);
        jsonWriter.writeIntField("minute", this.minute);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Time from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Time if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Time.
     */
    public static Time fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Time deserializedTime = new Time();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hour".equals(fieldName)) {
                    deserializedTime.hour = reader.getInt();
                } else if ("minute".equals(fieldName)) {
                    deserializedTime.minute = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTime;
        });
    }
}
