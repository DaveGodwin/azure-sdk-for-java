// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The UpdateRequest model.
 */
@Fluent
public final class UpdateRequest implements JsonSerializable<UpdateRequest> {

    /*
     * User defined name, maximum length is 128.
     */
    @Generated
    private String name;

    /*
     * Optional user defined data. Length should not exceed 16K.
     */
    @Generated
    private String userData;

    /**
     * Creates an instance of UpdateRequest class.
     */
    @Generated
    public UpdateRequest() {
    }

    /**
     * Get the name property: User defined name, maximum length is 128.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: User defined name, maximum length is 128.
     *
     * @param name the name value to set.
     * @return the UpdateRequest object itself.
     */
    @Generated
    public UpdateRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }

    /**
     * Set the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @param userData the userData value to set.
     * @return the UpdateRequest object itself.
     */
    @Generated
    public UpdateRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("userData", this.userData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateRequest.
     */
    @Generated
    public static UpdateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateRequest deserializedUpdateRequest = new UpdateRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    deserializedUpdateRequest.name = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    deserializedUpdateRequest.userData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedUpdateRequest;
        });
    }
}
