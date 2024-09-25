// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationType;
import com.azure.resourcemanager.desktopvirtualization.models.SessionState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents a UserSession definition.
 */
@Fluent
public final class UserSessionInner extends ProxyResource {
    /*
     * Detailed properties for UserSession
     */
    private UserSessionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of UserSessionInner class.
     */
    public UserSessionInner() {
    }

    /**
     * Get the innerProperties property: Detailed properties for UserSession.
     * 
     * @return the innerProperties value.
     */
    private UserSessionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the objectId property: ObjectId of user session. (internal use).
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Get the userPrincipalName property: The user principal name.
     * 
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().userPrincipalName();
    }

    /**
     * Set the userPrincipalName property: The user principal name.
     * 
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withUserPrincipalName(String userPrincipalName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserSessionProperties();
        }
        this.innerProperties().withUserPrincipalName(userPrincipalName);
        return this;
    }

    /**
     * Get the applicationType property: Application type of application.
     * 
     * @return the applicationType value.
     */
    public ApplicationType applicationType() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationType();
    }

    /**
     * Set the applicationType property: Application type of application.
     * 
     * @param applicationType the applicationType value to set.
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withApplicationType(ApplicationType applicationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserSessionProperties();
        }
        this.innerProperties().withApplicationType(applicationType);
        return this;
    }

    /**
     * Get the sessionState property: State of user session.
     * 
     * @return the sessionState value.
     */
    public SessionState sessionState() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionState();
    }

    /**
     * Set the sessionState property: State of user session.
     * 
     * @param sessionState the sessionState value to set.
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withSessionState(SessionState sessionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserSessionProperties();
        }
        this.innerProperties().withSessionState(sessionState);
        return this;
    }

    /**
     * Get the activeDirectoryUsername property: The active directory user name.
     * 
     * @return the activeDirectoryUsername value.
     */
    public String activeDirectoryUsername() {
        return this.innerProperties() == null ? null : this.innerProperties().activeDirectoryUsername();
    }

    /**
     * Set the activeDirectoryUsername property: The active directory user name.
     * 
     * @param activeDirectoryUsername the activeDirectoryUsername value to set.
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withActiveDirectoryUsername(String activeDirectoryUsername) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserSessionProperties();
        }
        this.innerProperties().withActiveDirectoryUsername(activeDirectoryUsername);
        return this;
    }

    /**
     * Get the createTime property: The timestamp of the user session create.
     * 
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createTime();
    }

    /**
     * Set the createTime property: The timestamp of the user session create.
     * 
     * @param createTime the createTime value to set.
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withCreateTime(OffsetDateTime createTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UserSessionProperties();
        }
        this.innerProperties().withCreateTime(createTime);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UserSessionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UserSessionInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UserSessionInner.
     */
    public static UserSessionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UserSessionInner deserializedUserSessionInner = new UserSessionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUserSessionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedUserSessionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedUserSessionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedUserSessionInner.innerProperties = UserSessionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedUserSessionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUserSessionInner;
        });
    }
}
