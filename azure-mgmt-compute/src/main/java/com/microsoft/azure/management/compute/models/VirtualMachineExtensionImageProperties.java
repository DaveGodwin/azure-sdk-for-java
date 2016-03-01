/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a Virtual Machine Extension Image.
 */
public class VirtualMachineExtensionImageProperties {
    /**
     * Gets or sets the operating system this extension supports.
     */
    @JsonProperty(required = true)
    private String operatingSystem;

    /**
     * Gets or sets the type of role (IaaS or PaaS) this extension supports.
     */
    @JsonProperty(required = true)
    private String computeRole;

    /**
     * Gets or sets the schema defined by publisher, where extension consumers
     * should provide settings in a matching schema.
     */
    @JsonProperty(required = true)
    private String handlerSchema;

    /**
     * Gets or sets whether the extension can be used on xRP VMScaleSets.By
     * default existing extensions are usable on scalesets, but there might
     * be cases where a publisher wants to explicitly indicate the extension
     * is only enabled for CRP VMs but not VMSS.
     */
    private Boolean vmScaleSetEnabled;

    /**
     * Gets or sets whether the handler can support multiple extensions.
     */
    private Boolean supportsMultipleExtensions;

    /**
     * Get the operatingSystem value.
     *
     * @return the operatingSystem value
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem value.
     *
     * @param operatingSystem the operatingSystem value to set
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * Get the computeRole value.
     *
     * @return the computeRole value
     */
    public String getComputeRole() {
        return this.computeRole;
    }

    /**
     * Set the computeRole value.
     *
     * @param computeRole the computeRole value to set
     */
    public void setComputeRole(String computeRole) {
        this.computeRole = computeRole;
    }

    /**
     * Get the handlerSchema value.
     *
     * @return the handlerSchema value
     */
    public String getHandlerSchema() {
        return this.handlerSchema;
    }

    /**
     * Set the handlerSchema value.
     *
     * @param handlerSchema the handlerSchema value to set
     */
    public void setHandlerSchema(String handlerSchema) {
        this.handlerSchema = handlerSchema;
    }

    /**
     * Get the vmScaleSetEnabled value.
     *
     * @return the vmScaleSetEnabled value
     */
    public Boolean getVmScaleSetEnabled() {
        return this.vmScaleSetEnabled;
    }

    /**
     * Set the vmScaleSetEnabled value.
     *
     * @param vmScaleSetEnabled the vmScaleSetEnabled value to set
     */
    public void setVmScaleSetEnabled(Boolean vmScaleSetEnabled) {
        this.vmScaleSetEnabled = vmScaleSetEnabled;
    }

    /**
     * Get the supportsMultipleExtensions value.
     *
     * @return the supportsMultipleExtensions value
     */
    public Boolean getSupportsMultipleExtensions() {
        return this.supportsMultipleExtensions;
    }

    /**
     * Set the supportsMultipleExtensions value.
     *
     * @param supportsMultipleExtensions the supportsMultipleExtensions value to set
     */
    public void setSupportsMultipleExtensions(Boolean supportsMultipleExtensions) {
        this.supportsMultipleExtensions = supportsMultipleExtensions;
    }

}
