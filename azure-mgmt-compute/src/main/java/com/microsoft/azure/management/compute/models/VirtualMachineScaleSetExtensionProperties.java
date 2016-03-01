/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a Virtual Machine Scale Set Extension.
 */
public class VirtualMachineScaleSetExtensionProperties {
    /**
     * Gets or sets the name of the extension handler publisher.
     */
    private String publisher;

    /**
     * Gets or sets the type of the extension handler.
     */
    private String type;

    /**
     * Gets or sets the type version of the extension handler.
     */
    private String typeHandlerVersion;

    /**
     * Gets or sets whether the extension handler should be automatically
     * upgraded across minor versions.
     */
    private Boolean autoUpgradeMinorVersion;

    /**
     * Gets or sets Json formatted public settings for the extension.
     */
    private Object settings;

    /**
     * Gets or sets Json formatted protected settings for the extension.
     */
    private Object protectedSettings;

    /**
     * Gets the provisioning state, which only appears in the response.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the typeHandlerVersion value.
     *
     * @return the typeHandlerVersion value
     */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion value.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     */
    public void setTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Get the autoUpgradeMinorVersion value.
     *
     * @return the autoUpgradeMinorVersion value
     */
    public Boolean getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion value.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set
     */
    public void setAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
    }

    /**
     * Get the settings value.
     *
     * @return the settings value
     */
    public Object getSettings() {
        return this.settings;
    }

    /**
     * Set the settings value.
     *
     * @param settings the settings value to set
     */
    public void setSettings(Object settings) {
        this.settings = settings;
    }

    /**
     * Get the protectedSettings value.
     *
     * @return the protectedSettings value
     */
    public Object getProtectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings value.
     *
     * @param protectedSettings the protectedSettings value to set
     */
    public void setProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

}
