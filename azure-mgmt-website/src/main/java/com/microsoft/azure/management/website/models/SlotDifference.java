/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An object describing the difference in setting values between two web app
 * slots.
 */
@JsonFlatten
public class SlotDifference extends Resource {
    /**
     * Indicates the type of the difference: Information, Warning or Error.
     */
    @JsonProperty(value = "properties.type")
    private String slotDifferenceType;

    /**
     * The type of the settings: General, AppSetting or ConnectionString.
     */
    @JsonProperty(value = "properties.settingType")
    private String settingType;

    /**
     * Rule that describes how to process the difference in settings during
     * web app slot swap.
     */
    @JsonProperty(value = "properties.diffRule")
    private String diffRule;

    /**
     * Name of the setting.
     */
    @JsonProperty(value = "properties.settingName")
    private String settingName;

    /**
     * Value of the setting in the current web app slot.
     */
    @JsonProperty(value = "properties.valueInCurrentSlot")
    private String valueInCurrentSlot;

    /**
     * Value of the setting in the target web app slot.
     */
    @JsonProperty(value = "properties.valueInTargetSlot")
    private String valueInTargetSlot;

    /**
     * Description of the difference.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the slotDifferenceType value.
     *
     * @return the slotDifferenceType value
     */
    public String getSlotDifferenceType() {
        return this.slotDifferenceType;
    }

    /**
     * Set the slotDifferenceType value.
     *
     * @param slotDifferenceType the slotDifferenceType value to set
     */
    public void setSlotDifferenceType(String slotDifferenceType) {
        this.slotDifferenceType = slotDifferenceType;
    }

    /**
     * Get the settingType value.
     *
     * @return the settingType value
     */
    public String getSettingType() {
        return this.settingType;
    }

    /**
     * Set the settingType value.
     *
     * @param settingType the settingType value to set
     */
    public void setSettingType(String settingType) {
        this.settingType = settingType;
    }

    /**
     * Get the diffRule value.
     *
     * @return the diffRule value
     */
    public String getDiffRule() {
        return this.diffRule;
    }

    /**
     * Set the diffRule value.
     *
     * @param diffRule the diffRule value to set
     */
    public void setDiffRule(String diffRule) {
        this.diffRule = diffRule;
    }

    /**
     * Get the settingName value.
     *
     * @return the settingName value
     */
    public String getSettingName() {
        return this.settingName;
    }

    /**
     * Set the settingName value.
     *
     * @param settingName the settingName value to set
     */
    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    /**
     * Get the valueInCurrentSlot value.
     *
     * @return the valueInCurrentSlot value
     */
    public String getValueInCurrentSlot() {
        return this.valueInCurrentSlot;
    }

    /**
     * Set the valueInCurrentSlot value.
     *
     * @param valueInCurrentSlot the valueInCurrentSlot value to set
     */
    public void setValueInCurrentSlot(String valueInCurrentSlot) {
        this.valueInCurrentSlot = valueInCurrentSlot;
    }

    /**
     * Get the valueInTargetSlot value.
     *
     * @return the valueInTargetSlot value
     */
    public String getValueInTargetSlot() {
        return this.valueInTargetSlot;
    }

    /**
     * Set the valueInTargetSlot value.
     *
     * @param valueInTargetSlot the valueInTargetSlot value to set
     */
    public void setValueInTargetSlot(String valueInTargetSlot) {
        this.valueInTargetSlot = valueInTargetSlot;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
