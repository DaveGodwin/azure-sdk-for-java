// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import com.azure.resourcemanager.desktopvirtualization.models.PublicNetworkAccess;
import java.io.IOException;
import java.util.List;

/**
 * Schema for Workspace properties.
 */
@Fluent
public final class WorkspaceProperties implements JsonSerializable<WorkspaceProperties> {
    /*
     * ObjectId of Workspace. (internal use)
     */
    private String objectId;

    /*
     * Description of Workspace.
     */
    private String description;

    /*
     * Friendly name of Workspace.
     */
    private String friendlyName;

    /*
     * List of applicationGroup resource Ids.
     */
    private List<String> applicationGroupReferences;

    /*
     * Is cloud pc resource.
     */
    private Boolean cloudPcResource;

    /*
     * Enabled allows this resource to be accessed from both public and private networks, Disabled allows this resource
     * to only be accessed via private endpoints
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * List of private endpoint connection associated with the specified resource
     */
    private List<PrivateEndpointConnection> privateEndpointConnections;

    /**
     * Creates an instance of WorkspaceProperties class.
     */
    public WorkspaceProperties() {
    }

    /**
     * Get the objectId property: ObjectId of Workspace. (internal use).
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the description property: Description of Workspace.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of Workspace.
     * 
     * @param description the description value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Workspace.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of Workspace.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the applicationGroupReferences property: List of applicationGroup resource Ids.
     * 
     * @return the applicationGroupReferences value.
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }

    /**
     * Set the applicationGroupReferences property: List of applicationGroup resource Ids.
     * 
     * @param applicationGroupReferences the applicationGroupReferences value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withApplicationGroupReferences(List<String> applicationGroupReferences) {
        this.applicationGroupReferences = applicationGroupReferences;
        return this;
    }

    /**
     * Get the cloudPcResource property: Is cloud pc resource.
     * 
     * @return the cloudPcResource value.
     */
    public Boolean cloudPcResource() {
        return this.cloudPcResource;
    }

    /**
     * Get the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enabled allows this resource to be accessed from both public and private
     * networks, Disabled allows this resource to only be accessed via private endpoints.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection associated with the specified
     * resource.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeArrayField("applicationGroupReferences", this.applicationGroupReferences,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkspaceProperties.
     */
    public static WorkspaceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceProperties deserializedWorkspaceProperties = new WorkspaceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectId".equals(fieldName)) {
                    deserializedWorkspaceProperties.objectId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedWorkspaceProperties.description = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedWorkspaceProperties.friendlyName = reader.getString();
                } else if ("applicationGroupReferences".equals(fieldName)) {
                    List<String> applicationGroupReferences = reader.readArray(reader1 -> reader1.getString());
                    deserializedWorkspaceProperties.applicationGroupReferences = applicationGroupReferences;
                } else if ("cloudPcResource".equals(fieldName)) {
                    deserializedWorkspaceProperties.cloudPcResource = reader.getNullable(JsonReader::getBoolean);
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedWorkspaceProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnection> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnection.fromJson(reader1));
                    deserializedWorkspaceProperties.privateEndpointConnections = privateEndpointConnections;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceProperties;
        });
    }
}
