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
import java.util.List;

/**
 * Represents the data of a streamed text content part within a streaming message delta chunk.
 */
@Immutable
public final class MessageDeltaTextContent implements JsonSerializable<MessageDeltaTextContent> {

    /*
     * The data that makes up the text.
     */
    @Generated
    private String value;

    /*
     * Annotations for the text.
     */
    @Generated
    private List<MessageDeltaTextAnnotation> annotations;

    /**
     * Creates an instance of MessageDeltaTextContent class.
     */
    @Generated
    private MessageDeltaTextContent() {
    }

    /**
     * Get the value property: The data that makes up the text.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * Get the annotations property: Annotations for the text.
     *
     * @return the annotations value.
     */
    @Generated
    public List<MessageDeltaTextAnnotation> getAnnotations() {
        return this.annotations;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeArrayField("annotations", this.annotations, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageDeltaTextContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageDeltaTextContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MessageDeltaTextContent.
     */
    @Generated
    public static MessageDeltaTextContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageDeltaTextContent deserializedMessageDeltaTextContent = new MessageDeltaTextContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("value".equals(fieldName)) {
                    deserializedMessageDeltaTextContent.value = reader.getString();
                } else if ("annotations".equals(fieldName)) {
                    List<MessageDeltaTextAnnotation> annotations
                        = reader.readArray(reader1 -> MessageDeltaTextAnnotation.fromJson(reader1));
                    deserializedMessageDeltaTextContent.annotations = annotations;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMessageDeltaTextContent;
        });
    }
}
