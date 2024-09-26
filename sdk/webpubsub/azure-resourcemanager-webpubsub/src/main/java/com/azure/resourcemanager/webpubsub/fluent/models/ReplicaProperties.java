// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import java.io.IOException;

/**
 * The ReplicaProperties model.
 */
@Fluent
public final class ReplicaProperties implements JsonSerializable<ReplicaProperties> {
    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Enable or disable the regional endpoint. Default to "Enabled".
     * When it's Disabled, new connections will not be routed to this endpoint, however existing connections will not be
     * affected.
     */
    private String regionEndpointEnabled;

    /*
     * Stop or start the resource. Default to "false".
     * When it's true, the data plane of the resource is shutdown.
     * When it's false, the data plane of the resource is started.
     */
    private String resourceStopped;

    /**
     * Creates an instance of ReplicaProperties class.
     */
    public ReplicaProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the regionEndpointEnabled property: Enable or disable the regional endpoint. Default to "Enabled".
     * When it's Disabled, new connections will not be routed to this endpoint, however existing connections will not be
     * affected.
     * 
     * @return the regionEndpointEnabled value.
     */
    public String regionEndpointEnabled() {
        return this.regionEndpointEnabled;
    }

    /**
     * Set the regionEndpointEnabled property: Enable or disable the regional endpoint. Default to "Enabled".
     * When it's Disabled, new connections will not be routed to this endpoint, however existing connections will not be
     * affected.
     * 
     * @param regionEndpointEnabled the regionEndpointEnabled value to set.
     * @return the ReplicaProperties object itself.
     */
    public ReplicaProperties withRegionEndpointEnabled(String regionEndpointEnabled) {
        this.regionEndpointEnabled = regionEndpointEnabled;
        return this;
    }

    /**
     * Get the resourceStopped property: Stop or start the resource. Default to "false".
     * When it's true, the data plane of the resource is shutdown.
     * When it's false, the data plane of the resource is started.
     * 
     * @return the resourceStopped value.
     */
    public String resourceStopped() {
        return this.resourceStopped;
    }

    /**
     * Set the resourceStopped property: Stop or start the resource. Default to "false".
     * When it's true, the data plane of the resource is shutdown.
     * When it's false, the data plane of the resource is started.
     * 
     * @param resourceStopped the resourceStopped value to set.
     * @return the ReplicaProperties object itself.
     */
    public ReplicaProperties withResourceStopped(String resourceStopped) {
        this.resourceStopped = resourceStopped;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("regionEndpointEnabled", this.regionEndpointEnabled);
        jsonWriter.writeStringField("resourceStopped", this.resourceStopped);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReplicaProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReplicaProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReplicaProperties.
     */
    public static ReplicaProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReplicaProperties deserializedReplicaProperties = new ReplicaProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedReplicaProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("regionEndpointEnabled".equals(fieldName)) {
                    deserializedReplicaProperties.regionEndpointEnabled = reader.getString();
                } else if ("resourceStopped".equals(fieldName)) {
                    deserializedReplicaProperties.resourceStopped = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReplicaProperties;
        });
    }
}
