// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.batch.models.SkuCapability;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Describes a Batch supported SKU.
 */
@Immutable
public final class SupportedSkuInner implements JsonSerializable<SupportedSkuInner> {
    /*
     * The name of the SKU.
     */
    private String name;

    /*
     * The family name of the SKU.
     */
    private String familyName;

    /*
     * A collection of capabilities which this SKU supports.
     */
    private List<SkuCapability> capabilities;

    /*
     * The time when Azure Batch service will retire this SKU.
     */
    private OffsetDateTime batchSupportEndOfLife;

    /**
     * Creates an instance of SupportedSkuInner class.
     */
    public SupportedSkuInner() {
    }

    /**
     * Get the name property: The name of the SKU.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the familyName property: The family name of the SKU.
     * 
     * @return the familyName value.
     */
    public String familyName() {
        return this.familyName;
    }

    /**
     * Get the capabilities property: A collection of capabilities which this SKU supports.
     * 
     * @return the capabilities value.
     */
    public List<SkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the batchSupportEndOfLife property: The time when Azure Batch service will retire this SKU.
     * 
     * @return the batchSupportEndOfLife value.
     */
    public OffsetDateTime batchSupportEndOfLife() {
        return this.batchSupportEndOfLife;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SupportedSkuInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SupportedSkuInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SupportedSkuInner.
     */
    public static SupportedSkuInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SupportedSkuInner deserializedSupportedSkuInner = new SupportedSkuInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSupportedSkuInner.name = reader.getString();
                } else if ("familyName".equals(fieldName)) {
                    deserializedSupportedSkuInner.familyName = reader.getString();
                } else if ("capabilities".equals(fieldName)) {
                    List<SkuCapability> capabilities = reader.readArray(reader1 -> SkuCapability.fromJson(reader1));
                    deserializedSupportedSkuInner.capabilities = capabilities;
                } else if ("batchSupportEndOfLife".equals(fieldName)) {
                    deserializedSupportedSkuInner.batchSupportEndOfLife = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSupportedSkuInner;
        });
    }
}
