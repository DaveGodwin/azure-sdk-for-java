// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Identify result.
 */
@Immutable
public final class FaceIdentificationResult implements JsonSerializable<FaceIdentificationResult> {

    /*
     * faceId of the query face.
     */
    @Generated
    private final String faceId;

    /*
     * Identified person candidates for that face (ranked by confidence). Array size should be no larger than input
     * maxNumOfCandidatesReturned. If no person is identified, will return an empty array.
     */
    @Generated
    private final List<FaceIdentificationCandidate> candidates;

    /**
     * Creates an instance of FaceIdentificationResult class.
     *
     * @param faceId the faceId value to set.
     * @param candidates the candidates value to set.
     */
    @Generated
    private FaceIdentificationResult(String faceId, List<FaceIdentificationCandidate> candidates) {
        this.faceId = faceId;
        this.candidates = candidates;
    }

    /**
     * Get the faceId property: faceId of the query face.
     *
     * @return the faceId value.
     */
    @Generated
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * Get the candidates property: Identified person candidates for that face (ranked by confidence). Array size should
     * be no larger than input maxNumOfCandidatesReturned. If no person is identified, will return an empty array.
     *
     * @return the candidates value.
     */
    @Generated
    public List<FaceIdentificationCandidate> getCandidates() {
        return this.candidates;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("faceId", this.faceId);
        jsonWriter.writeArrayField("candidates", this.candidates, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FaceIdentificationResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FaceIdentificationResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FaceIdentificationResult.
     */
    @Generated
    public static FaceIdentificationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String faceId = null;
            List<FaceIdentificationCandidate> candidates = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("faceId".equals(fieldName)) {
                    faceId = reader.getString();
                } else if ("candidates".equals(fieldName)) {
                    candidates = reader.readArray(reader1 -> FaceIdentificationCandidate.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new FaceIdentificationResult(faceId, candidates);
        });
    }
}
