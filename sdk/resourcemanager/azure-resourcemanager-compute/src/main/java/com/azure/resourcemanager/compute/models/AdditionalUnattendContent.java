// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies additional XML formatted information that can be included in the Unattend.xml file, which is used by
 * Windows Setup. Contents are defined by setting name, component name, and the pass in which the content is applied.
 */
@Fluent
public final class AdditionalUnattendContent implements JsonSerializable<AdditionalUnattendContent> {
    /*
     * The pass name. Currently, the only allowable value is OobeSystem.
     */
    private PassNames passName;

    /*
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     */
    private ComponentNames componentName;

    /*
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and
     * AutoLogon.
     */
    private SettingNames settingName;

    /*
     * Specifies the XML formatted content that is added to the unattend.xml file for the specified path and component.
     * The XML must be less than 4KB and must include the root element for the setting or feature that is being
     * inserted.
     */
    private String content;

    /**
     * Creates an instance of AdditionalUnattendContent class.
     */
    public AdditionalUnattendContent() {
    }

    /**
     * Get the passName property: The pass name. Currently, the only allowable value is OobeSystem.
     * 
     * @return the passName value.
     */
    public PassNames passName() {
        return this.passName;
    }

    /**
     * Set the passName property: The pass name. Currently, the only allowable value is OobeSystem.
     * 
     * @param passName the passName value to set.
     * @return the AdditionalUnattendContent object itself.
     */
    public AdditionalUnattendContent withPassName(PassNames passName) {
        this.passName = passName;
        return this;
    }

    /**
     * Get the componentName property: The component name. Currently, the only allowable value is
     * Microsoft-Windows-Shell-Setup.
     * 
     * @return the componentName value.
     */
    public ComponentNames componentName() {
        return this.componentName;
    }

    /**
     * Set the componentName property: The component name. Currently, the only allowable value is
     * Microsoft-Windows-Shell-Setup.
     * 
     * @param componentName the componentName value to set.
     * @return the AdditionalUnattendContent object itself.
     */
    public AdditionalUnattendContent withComponentName(ComponentNames componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Get the settingName property: Specifies the name of the setting to which the content applies. Possible values
     * are: FirstLogonCommands and AutoLogon.
     * 
     * @return the settingName value.
     */
    public SettingNames settingName() {
        return this.settingName;
    }

    /**
     * Set the settingName property: Specifies the name of the setting to which the content applies. Possible values
     * are: FirstLogonCommands and AutoLogon.
     * 
     * @param settingName the settingName value to set.
     * @return the AdditionalUnattendContent object itself.
     */
    public AdditionalUnattendContent withSettingName(SettingNames settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * Get the content property: Specifies the XML formatted content that is added to the unattend.xml file for the
     * specified path and component. The XML must be less than 4KB and must include the root element for the setting or
     * feature that is being inserted.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Specifies the XML formatted content that is added to the unattend.xml file for the
     * specified path and component. The XML must be less than 4KB and must include the root element for the setting or
     * feature that is being inserted.
     * 
     * @param content the content value to set.
     * @return the AdditionalUnattendContent object itself.
     */
    public AdditionalUnattendContent withContent(String content) {
        this.content = content;
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
        jsonWriter.writeStringField("passName", this.passName == null ? null : this.passName.toString());
        jsonWriter.writeStringField("componentName", this.componentName == null ? null : this.componentName.toString());
        jsonWriter.writeStringField("settingName", this.settingName == null ? null : this.settingName.toString());
        jsonWriter.writeStringField("content", this.content);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdditionalUnattendContent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdditionalUnattendContent if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdditionalUnattendContent.
     */
    public static AdditionalUnattendContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdditionalUnattendContent deserializedAdditionalUnattendContent = new AdditionalUnattendContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("passName".equals(fieldName)) {
                    deserializedAdditionalUnattendContent.passName = PassNames.fromString(reader.getString());
                } else if ("componentName".equals(fieldName)) {
                    deserializedAdditionalUnattendContent.componentName = ComponentNames.fromString(reader.getString());
                } else if ("settingName".equals(fieldName)) {
                    deserializedAdditionalUnattendContent.settingName = SettingNames.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    deserializedAdditionalUnattendContent.content = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdditionalUnattendContent;
        });
    }
}
