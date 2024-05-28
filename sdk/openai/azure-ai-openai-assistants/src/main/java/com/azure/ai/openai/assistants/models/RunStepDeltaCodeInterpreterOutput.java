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
 * The abstract base representation of a streaming run step tool call's Code Interpreter tool output.
 */
@Immutable
public class RunStepDeltaCodeInterpreterOutput implements JsonSerializable<RunStepDeltaCodeInterpreterOutput> {

    /*
     * The type of the streaming run step tool call's Code Interpreter output.
     */
    @Generated
    private String type;

    /*
     * The index of the output in the streaming run step tool call's Code Interpreter outputs array.
     */
    @Generated
    private final int index;

    /**
     * Creates an instance of RunStepDeltaCodeInterpreterOutput class.
     *
     * @param index the index value to set.
     */
    @Generated
    protected RunStepDeltaCodeInterpreterOutput(int index) {
        this.type = "RunStepDeltaCodeInterpreterOutput";
        this.index = index;
    }

    /**
     * Get the type property: The type of the streaming run step tool call's Code Interpreter output.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the index property: The index of the output in the streaming run step tool call's Code Interpreter outputs
     * array.
     *
     * @return the index value.
     */
    @Generated
    public int getIndex() {
        return this.index;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaCodeInterpreterOutput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaCodeInterpreterOutput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaCodeInterpreterOutput.
     */
    @Generated
    public static RunStepDeltaCodeInterpreterOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("logs".equals(discriminatorValue)) {
                    return RunStepDeltaCodeInterpreterLogOutput.fromJson(readerToUse.reset());
                } else if ("image".equals(discriminatorValue)) {
                    return RunStepDeltaCodeInterpreterImageOutput.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static RunStepDeltaCodeInterpreterOutput fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDeltaCodeInterpreterOutput deserializedRunStepDeltaCodeInterpreterOutput
                = new RunStepDeltaCodeInterpreterOutput(index);
            deserializedRunStepDeltaCodeInterpreterOutput.type = type;
            return deserializedRunStepDeltaCodeInterpreterOutput;
        });
    }
}
