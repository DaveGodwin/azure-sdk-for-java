// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AddFaceFromUrlRequest model.
 */
@Immutable
public final class AddFaceFromUrlRequest implements JsonSerializable<AddFaceFromUrlRequest> {

    /*
     * URL of input image.
     */
    @Generated
    private final String url;

    /**
     * Creates an instance of AddFaceFromUrlRequest class.
     *
     * @param url the url value to set.
     */
    @Generated
    public AddFaceFromUrlRequest(String url) {
        this.url = url;
    }

    /**
     * Get the url property: URL of input image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("url", this.url);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AddFaceFromUrlRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AddFaceFromUrlRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AddFaceFromUrlRequest.
     */
    @Generated
    public static AddFaceFromUrlRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String url = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("url".equals(fieldName)) {
                    url = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new AddFaceFromUrlRequest(url);
        });
    }
}
