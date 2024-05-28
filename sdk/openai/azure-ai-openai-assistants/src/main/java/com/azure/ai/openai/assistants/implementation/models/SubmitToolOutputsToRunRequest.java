// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.implementation.models;

import com.azure.ai.openai.assistants.models.ToolOutput;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The SubmitToolOutputsToRunRequest model.
 */
@Fluent
public final class SubmitToolOutputsToRunRequest implements JsonSerializable<SubmitToolOutputsToRunRequest> {

    /*
     * A list of tools for which the outputs are being submitted.
     */
    @Generated
    private final List<ToolOutput> toolOutputs;

    /**
     * Creates an instance of SubmitToolOutputsToRunRequest class.
     *
     * @param toolOutputs the toolOutputs value to set.
     */
    @Generated
    public SubmitToolOutputsToRunRequest(List<ToolOutput> toolOutputs) {
        this.toolOutputs = toolOutputs;
    }

    /**
     * Get the toolOutputs property: A list of tools for which the outputs are being submitted.
     *
     * @return the toolOutputs value.
     */
    @Generated
    public List<ToolOutput> getToolOutputs() {
        return this.toolOutputs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tool_outputs", this.toolOutputs, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("stream", this.stream);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubmitToolOutputsToRunRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubmitToolOutputsToRunRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SubmitToolOutputsToRunRequest.
     */
    @Generated
    public static SubmitToolOutputsToRunRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<ToolOutput> toolOutputs = null;
            Boolean stream = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("tool_outputs".equals(fieldName)) {
                    toolOutputs = reader.readArray(reader1 -> ToolOutput.fromJson(reader1));
                } else if ("stream".equals(fieldName)) {
                    stream = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            SubmitToolOutputsToRunRequest deserializedSubmitToolOutputsToRunRequest
                = new SubmitToolOutputsToRunRequest(toolOutputs);
            deserializedSubmitToolOutputsToRunRequest.stream = stream;
            return deserializedSubmitToolOutputsToRunRequest;
        });
    }

    /*
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run
     * enters a terminal state with a `data: [DONE]` message.
     */
    @Generated
    private Boolean stream;

    /**
     * Get the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     *
     * @return the stream value.
     */
    @Generated
    public Boolean isStream() {
        return this.stream;
    }

    /**
     * Set the stream property: If `true`, returns a stream of events that happen during the Run as server-sent events,
     * terminating when the Run enters a terminal state with a `data: [DONE]` message.
     *
     * @param stream the stream value to set.
     * @return the SubmitToolOutputsToRunRequest object itself.
     */
    @Generated
    public SubmitToolOutputsToRunRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
}
