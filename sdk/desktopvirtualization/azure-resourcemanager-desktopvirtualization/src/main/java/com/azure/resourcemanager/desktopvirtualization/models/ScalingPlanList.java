// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanInner;
import java.io.IOException;
import java.util.List;

/**
 * ScalingPlanList
 * 
 * List of scaling plan definitions.
 */
@Fluent
public final class ScalingPlanList implements JsonSerializable<ScalingPlanList> {
    /*
     * List of scaling plan definitions.
     */
    private List<ScalingPlanInner> value;

    /*
     * Link to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ScalingPlanList class.
     */
    public ScalingPlanList() {
    }

    /**
     * Get the value property: List of scaling plan definitions.
     * 
     * @return the value value.
     */
    public List<ScalingPlanInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of scaling plan definitions.
     * 
     * @param value the value value to set.
     * @return the ScalingPlanList object itself.
     */
    public ScalingPlanList withValue(List<ScalingPlanInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScalingPlanList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScalingPlanList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScalingPlanList.
     */
    public static ScalingPlanList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScalingPlanList deserializedScalingPlanList = new ScalingPlanList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ScalingPlanInner> value = reader.readArray(reader1 -> ScalingPlanInner.fromJson(reader1));
                    deserializedScalingPlanList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedScalingPlanList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScalingPlanList;
        });
    }
}
