// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the delta payload in a streaming run step delta chunk.
 */
@Immutable
public final class RunStepDelta implements JsonSerializable<RunStepDelta> {

    /*
     * The details of the run step.
     */
    @Generated
    private RunStepDeltaDetail stepDetails;

    /**
     * Creates an instance of RunStepDelta class.
     */
    @Generated
    private RunStepDelta() {
    }

    /**
     * Get the stepDetails property: The details of the run step.
     *
     * @return the stepDetails value.
     */
    @Generated
    public RunStepDeltaDetail getStepDetails() {
        return this.stepDetails;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("step_details", this.stepDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDelta from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDelta if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RunStepDelta.
     */
    @Generated
    public static RunStepDelta fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDelta deserializedRunStepDelta = new RunStepDelta();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("step_details".equals(fieldName)) {
                    deserializedRunStepDelta.stepDetails = RunStepDeltaDetail.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRunStepDelta;
        });
    }
}
