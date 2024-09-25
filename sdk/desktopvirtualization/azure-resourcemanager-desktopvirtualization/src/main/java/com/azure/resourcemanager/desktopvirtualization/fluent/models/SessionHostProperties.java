// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostHealthCheckReport;
import com.azure.resourcemanager.desktopvirtualization.models.Status;
import com.azure.resourcemanager.desktopvirtualization.models.UpdateState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Schema for SessionHost properties.
 */
@Fluent
public final class SessionHostProperties implements JsonSerializable<SessionHostProperties> {
    /*
     * ObjectId of SessionHost. (internal use)
     */
    private String objectId;

    /*
     * Last heart beat from SessionHost.
     */
    private OffsetDateTime lastHeartBeat;

    /*
     * Number of sessions on SessionHost.
     */
    private Integer sessions;

    /*
     * Version of agent on SessionHost.
     */
    private String agentVersion;

    /*
     * Allow a new session.
     */
    private Boolean allowNewSession;

    /*
     * Virtual Machine Id of SessionHost's underlying virtual machine.
     */
    private String virtualMachineId;

    /*
     * Resource Id of SessionHost's underlying virtual machine.
     */
    private String resourceId;

    /*
     * User assigned to SessionHost.
     */
    private String assignedUser;

    /*
     * Friendly name of SessionHost
     */
    private String friendlyName;

    /*
     * Status for a SessionHost.
     */
    private Status status;

    /*
     * The timestamp of the status.
     */
    private OffsetDateTime statusTimestamp;

    /*
     * The version of the OS on the session host.
     */
    private String osVersion;

    /*
     * The version of the side by side stack on the session host.
     */
    private String sxSStackVersion;

    /*
     * Update state of a SessionHost.
     */
    private UpdateState updateState;

    /*
     * The timestamp of the last update.
     */
    private OffsetDateTime lastUpdateTime;

    /*
     * The error message.
     */
    private String updateErrorMessage;

    /*
     * List of SessionHostHealthCheckReports
     */
    private List<SessionHostHealthCheckReport> sessionHostHealthCheckResults;

    /**
     * Creates an instance of SessionHostProperties class.
     */
    public SessionHostProperties() {
    }

    /**
     * Get the objectId property: ObjectId of SessionHost. (internal use).
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the lastHeartBeat property: Last heart beat from SessionHost.
     * 
     * @return the lastHeartBeat value.
     */
    public OffsetDateTime lastHeartBeat() {
        return this.lastHeartBeat;
    }

    /**
     * Set the lastHeartBeat property: Last heart beat from SessionHost.
     * 
     * @param lastHeartBeat the lastHeartBeat value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withLastHeartBeat(OffsetDateTime lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }

    /**
     * Get the sessions property: Number of sessions on SessionHost.
     * 
     * @return the sessions value.
     */
    public Integer sessions() {
        return this.sessions;
    }

    /**
     * Set the sessions property: Number of sessions on SessionHost.
     * 
     * @param sessions the sessions value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withSessions(Integer sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * Get the agentVersion property: Version of agent on SessionHost.
     * 
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: Version of agent on SessionHost.
     * 
     * @param agentVersion the agentVersion value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the allowNewSession property: Allow a new session.
     * 
     * @return the allowNewSession value.
     */
    public Boolean allowNewSession() {
        return this.allowNewSession;
    }

    /**
     * Set the allowNewSession property: Allow a new session.
     * 
     * @param allowNewSession the allowNewSession value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withAllowNewSession(Boolean allowNewSession) {
        this.allowNewSession = allowNewSession;
        return this;
    }

    /**
     * Get the virtualMachineId property: Virtual Machine Id of SessionHost's underlying virtual machine.
     * 
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get the resourceId property: Resource Id of SessionHost's underlying virtual machine.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the assignedUser property: User assigned to SessionHost.
     * 
     * @return the assignedUser value.
     */
    public String assignedUser() {
        return this.assignedUser;
    }

    /**
     * Set the assignedUser property: User assigned to SessionHost.
     * 
     * @param assignedUser the assignedUser value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of SessionHost.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of SessionHost.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the status property: Status for a SessionHost.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Status for a SessionHost.
     * 
     * @param status the status value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusTimestamp property: The timestamp of the status.
     * 
     * @return the statusTimestamp value.
     */
    public OffsetDateTime statusTimestamp() {
        return this.statusTimestamp;
    }

    /**
     * Get the osVersion property: The version of the OS on the session host.
     * 
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The version of the OS on the session host.
     * 
     * @param osVersion the osVersion value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the sxSStackVersion property: The version of the side by side stack on the session host.
     * 
     * @return the sxSStackVersion value.
     */
    public String sxSStackVersion() {
        return this.sxSStackVersion;
    }

    /**
     * Set the sxSStackVersion property: The version of the side by side stack on the session host.
     * 
     * @param sxSStackVersion the sxSStackVersion value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withSxSStackVersion(String sxSStackVersion) {
        this.sxSStackVersion = sxSStackVersion;
        return this;
    }

    /**
     * Get the updateState property: Update state of a SessionHost.
     * 
     * @return the updateState value.
     */
    public UpdateState updateState() {
        return this.updateState;
    }

    /**
     * Set the updateState property: Update state of a SessionHost.
     * 
     * @param updateState the updateState value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withUpdateState(UpdateState updateState) {
        this.updateState = updateState;
        return this;
    }

    /**
     * Get the lastUpdateTime property: The timestamp of the last update.
     * 
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the updateErrorMessage property: The error message.
     * 
     * @return the updateErrorMessage value.
     */
    public String updateErrorMessage() {
        return this.updateErrorMessage;
    }

    /**
     * Set the updateErrorMessage property: The error message.
     * 
     * @param updateErrorMessage the updateErrorMessage value to set.
     * @return the SessionHostProperties object itself.
     */
    public SessionHostProperties withUpdateErrorMessage(String updateErrorMessage) {
        this.updateErrorMessage = updateErrorMessage;
        return this;
    }

    /**
     * Get the sessionHostHealthCheckResults property: List of SessionHostHealthCheckReports.
     * 
     * @return the sessionHostHealthCheckResults value.
     */
    public List<SessionHostHealthCheckReport> sessionHostHealthCheckResults() {
        return this.sessionHostHealthCheckResults;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sessionHostHealthCheckResults() != null) {
            sessionHostHealthCheckResults().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("lastHeartBeat",
            this.lastHeartBeat == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastHeartBeat));
        jsonWriter.writeNumberField("sessions", this.sessions);
        jsonWriter.writeStringField("agentVersion", this.agentVersion);
        jsonWriter.writeBooleanField("allowNewSession", this.allowNewSession);
        jsonWriter.writeStringField("assignedUser", this.assignedUser);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("osVersion", this.osVersion);
        jsonWriter.writeStringField("sxSStackVersion", this.sxSStackVersion);
        jsonWriter.writeStringField("updateState", this.updateState == null ? null : this.updateState.toString());
        jsonWriter.writeStringField("updateErrorMessage", this.updateErrorMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionHostProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionHostProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SessionHostProperties.
     */
    public static SessionHostProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionHostProperties deserializedSessionHostProperties = new SessionHostProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectId".equals(fieldName)) {
                    deserializedSessionHostProperties.objectId = reader.getString();
                } else if ("lastHeartBeat".equals(fieldName)) {
                    deserializedSessionHostProperties.lastHeartBeat = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("sessions".equals(fieldName)) {
                    deserializedSessionHostProperties.sessions = reader.getNullable(JsonReader::getInt);
                } else if ("agentVersion".equals(fieldName)) {
                    deserializedSessionHostProperties.agentVersion = reader.getString();
                } else if ("allowNewSession".equals(fieldName)) {
                    deserializedSessionHostProperties.allowNewSession = reader.getNullable(JsonReader::getBoolean);
                } else if ("virtualMachineId".equals(fieldName)) {
                    deserializedSessionHostProperties.virtualMachineId = reader.getString();
                } else if ("resourceId".equals(fieldName)) {
                    deserializedSessionHostProperties.resourceId = reader.getString();
                } else if ("assignedUser".equals(fieldName)) {
                    deserializedSessionHostProperties.assignedUser = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedSessionHostProperties.friendlyName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedSessionHostProperties.status = Status.fromString(reader.getString());
                } else if ("statusTimestamp".equals(fieldName)) {
                    deserializedSessionHostProperties.statusTimestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("osVersion".equals(fieldName)) {
                    deserializedSessionHostProperties.osVersion = reader.getString();
                } else if ("sxSStackVersion".equals(fieldName)) {
                    deserializedSessionHostProperties.sxSStackVersion = reader.getString();
                } else if ("updateState".equals(fieldName)) {
                    deserializedSessionHostProperties.updateState = UpdateState.fromString(reader.getString());
                } else if ("lastUpdateTime".equals(fieldName)) {
                    deserializedSessionHostProperties.lastUpdateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("updateErrorMessage".equals(fieldName)) {
                    deserializedSessionHostProperties.updateErrorMessage = reader.getString();
                } else if ("sessionHostHealthCheckResults".equals(fieldName)) {
                    List<SessionHostHealthCheckReport> sessionHostHealthCheckResults
                        = reader.readArray(reader1 -> SessionHostHealthCheckReport.fromJson(reader1));
                    deserializedSessionHostProperties.sessionHostHealthCheckResults = sessionHostHealthCheckResults;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionHostProperties;
        });
    }
}
