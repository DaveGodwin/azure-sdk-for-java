// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationPatchProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Application properties that can be patched.
 */
@Fluent
public final class ApplicationPatch implements JsonSerializable<ApplicationPatch> {
    /*
     * tags to be updated
     */
    private Map<String, String> tags;

    /*
     * Detailed properties for Application
     */
    private ApplicationPatchProperties innerProperties;

    /**
     * Creates an instance of ApplicationPatch class.
     */
    public ApplicationPatch() {
    }

    /**
     * Get the tags property: tags to be updated.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: tags to be updated.
     * 
     * @param tags the tags value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Detailed properties for Application.
     * 
     * @return the innerProperties value.
     */
    private ApplicationPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Description of Application.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of Application.
     * 
     * @param description the description value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Application.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of Application.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the filePath property: Specifies a path for the executable file for the application.
     * 
     * @return the filePath value.
     */
    public String filePath() {
        return this.innerProperties() == null ? null : this.innerProperties().filePath();
    }

    /**
     * Set the filePath property: Specifies a path for the executable file for the application.
     * 
     * @param filePath the filePath value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withFilePath(String filePath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withFilePath(filePath);
        return this;
    }

    /**
     * Get the commandLineSetting property: Specifies whether this published application can be launched with command
     * line arguments provided by the client, command line arguments specified at publish time, or no command line
     * arguments at all.
     * 
     * @return the commandLineSetting value.
     */
    public CommandLineSetting commandLineSetting() {
        return this.innerProperties() == null ? null : this.innerProperties().commandLineSetting();
    }

    /**
     * Set the commandLineSetting property: Specifies whether this published application can be launched with command
     * line arguments provided by the client, command line arguments specified at publish time, or no command line
     * arguments at all.
     * 
     * @param commandLineSetting the commandLineSetting value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withCommandLineSetting(CommandLineSetting commandLineSetting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withCommandLineSetting(commandLineSetting);
        return this;
    }

    /**
     * Get the commandLineArguments property: Command Line Arguments for Application.
     * 
     * @return the commandLineArguments value.
     */
    public String commandLineArguments() {
        return this.innerProperties() == null ? null : this.innerProperties().commandLineArguments();
    }

    /**
     * Set the commandLineArguments property: Command Line Arguments for Application.
     * 
     * @param commandLineArguments the commandLineArguments value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withCommandLineArguments(String commandLineArguments) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withCommandLineArguments(commandLineArguments);
        return this;
    }

    /**
     * Get the showInPortal property: Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     * @return the showInPortal value.
     */
    public Boolean showInPortal() {
        return this.innerProperties() == null ? null : this.innerProperties().showInPortal();
    }

    /**
     * Set the showInPortal property: Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     * @param showInPortal the showInPortal value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withShowInPortal(Boolean showInPortal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withShowInPortal(showInPortal);
        return this;
    }

    /**
     * Get the iconPath property: Path to icon.
     * 
     * @return the iconPath value.
     */
    public String iconPath() {
        return this.innerProperties() == null ? null : this.innerProperties().iconPath();
    }

    /**
     * Set the iconPath property: Path to icon.
     * 
     * @param iconPath the iconPath value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withIconPath(String iconPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withIconPath(iconPath);
        return this;
    }

    /**
     * Get the iconIndex property: Index of the icon.
     * 
     * @return the iconIndex value.
     */
    public Integer iconIndex() {
        return this.innerProperties() == null ? null : this.innerProperties().iconIndex();
    }

    /**
     * Set the iconIndex property: Index of the icon.
     * 
     * @param iconIndex the iconIndex value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withIconIndex(Integer iconIndex) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withIconIndex(iconIndex);
        return this;
    }

    /**
     * Get the msixPackageFamilyName property: Specifies the package family name for MSIX applications.
     * 
     * @return the msixPackageFamilyName value.
     */
    public String msixPackageFamilyName() {
        return this.innerProperties() == null ? null : this.innerProperties().msixPackageFamilyName();
    }

    /**
     * Set the msixPackageFamilyName property: Specifies the package family name for MSIX applications.
     * 
     * @param msixPackageFamilyName the msixPackageFamilyName value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withMsixPackageFamilyName(String msixPackageFamilyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withMsixPackageFamilyName(msixPackageFamilyName);
        return this;
    }

    /**
     * Get the msixPackageApplicationId property: Specifies the package application Id for MSIX applications.
     * 
     * @return the msixPackageApplicationId value.
     */
    public String msixPackageApplicationId() {
        return this.innerProperties() == null ? null : this.innerProperties().msixPackageApplicationId();
    }

    /**
     * Set the msixPackageApplicationId property: Specifies the package application Id for MSIX applications.
     * 
     * @param msixPackageApplicationId the msixPackageApplicationId value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withMsixPackageApplicationId(String msixPackageApplicationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withMsixPackageApplicationId(msixPackageApplicationId);
        return this;
    }

    /**
     * Get the applicationType property: Resource Type of Application.
     * 
     * @return the applicationType value.
     */
    public RemoteApplicationType applicationType() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationType();
    }

    /**
     * Set the applicationType property: Resource Type of Application.
     * 
     * @param applicationType the applicationType value to set.
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withApplicationType(RemoteApplicationType applicationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationPatchProperties();
        }
        this.innerProperties().withApplicationType(applicationType);
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationPatch.
     */
    public static ApplicationPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationPatch deserializedApplicationPatch = new ApplicationPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedApplicationPatch.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationPatch.innerProperties = ApplicationPatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationPatch;
        });
    }
}
