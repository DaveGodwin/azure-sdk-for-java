// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Request body to build a new custom document classifier.
 */
@Fluent
public final class BuildDocumentClassifierRequest implements JsonSerializable<BuildDocumentClassifierRequest> {
    /*
     * Unique document classifier name.
     */
    @Generated
    private final String classifierId;

    /*
     * Document classifier description.
     */
    @Generated
    private String description;

    /*
     * Base classifierId on top of which to train the classifier.
     */
    @Generated
    private String baseClassifierId;

    /*
     * List of document types to classify against.
     */
    @Generated
    private final Map<String, ClassifierDocumentTypeDetails> docTypes;

    /*
     * Allow overwriting an existing classifier with the same name.
     */
    @Generated
    private Boolean allowOverwrite;

    /**
     * Creates an instance of BuildDocumentClassifierRequest class.
     * 
     * @param classifierId the classifierId value to set.
     * @param docTypes the docTypes value to set.
     */
    @Generated
    public BuildDocumentClassifierRequest(String classifierId, Map<String, ClassifierDocumentTypeDetails> docTypes) {
        this.classifierId = classifierId;
        this.docTypes = docTypes;
    }

    /**
     * Get the classifierId property: Unique document classifier name.
     * 
     * @return the classifierId value.
     */
    @Generated
    public String getClassifierId() {
        return this.classifierId;
    }

    /**
     * Get the description property: Document classifier description.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Document classifier description.
     * 
     * @param description the description value to set.
     * @return the BuildDocumentClassifierRequest object itself.
     */
    @Generated
    public BuildDocumentClassifierRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the baseClassifierId property: Base classifierId on top of which to train the classifier.
     * 
     * @return the baseClassifierId value.
     */
    @Generated
    public String getBaseClassifierId() {
        return this.baseClassifierId;
    }

    /**
     * Set the baseClassifierId property: Base classifierId on top of which to train the classifier.
     * 
     * @param baseClassifierId the baseClassifierId value to set.
     * @return the BuildDocumentClassifierRequest object itself.
     */
    @Generated
    public BuildDocumentClassifierRequest setBaseClassifierId(String baseClassifierId) {
        this.baseClassifierId = baseClassifierId;
        return this;
    }

    /**
     * Get the docTypes property: List of document types to classify against.
     * 
     * @return the docTypes value.
     */
    @Generated
    public Map<String, ClassifierDocumentTypeDetails> getDocTypes() {
        return this.docTypes;
    }

    /**
     * Get the allowOverwrite property: Allow overwriting an existing classifier with the same name.
     * 
     * @return the allowOverwrite value.
     */
    @Generated
    public Boolean isAllowOverwrite() {
        return this.allowOverwrite;
    }

    /**
     * Set the allowOverwrite property: Allow overwriting an existing classifier with the same name.
     * 
     * @param allowOverwrite the allowOverwrite value to set.
     * @return the BuildDocumentClassifierRequest object itself.
     */
    @Generated
    public BuildDocumentClassifierRequest setAllowOverwrite(Boolean allowOverwrite) {
        this.allowOverwrite = allowOverwrite;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("classifierId", this.classifierId);
        jsonWriter.writeMapField("docTypes", this.docTypes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("baseClassifierId", this.baseClassifierId);
        jsonWriter.writeBooleanField("allowOverwrite", this.allowOverwrite);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BuildDocumentClassifierRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BuildDocumentClassifierRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BuildDocumentClassifierRequest.
     */
    @Generated
    public static BuildDocumentClassifierRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String classifierId = null;
            Map<String, ClassifierDocumentTypeDetails> docTypes = null;
            String description = null;
            String baseClassifierId = null;
            Boolean allowOverwrite = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("classifierId".equals(fieldName)) {
                    classifierId = reader.getString();
                } else if ("docTypes".equals(fieldName)) {
                    docTypes = reader.readMap(reader1 -> ClassifierDocumentTypeDetails.fromJson(reader1));
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("baseClassifierId".equals(fieldName)) {
                    baseClassifierId = reader.getString();
                } else if ("allowOverwrite".equals(fieldName)) {
                    allowOverwrite = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            BuildDocumentClassifierRequest deserializedBuildDocumentClassifierRequest
                = new BuildDocumentClassifierRequest(classifierId, docTypes);
            deserializedBuildDocumentClassifierRequest.description = description;
            deserializedBuildDocumentClassifierRequest.baseClassifierId = baseClassifierId;
            deserializedBuildDocumentClassifierRequest.allowOverwrite = allowOverwrite;

            return deserializedBuildDocumentClassifierRequest;
        });
    }
}
