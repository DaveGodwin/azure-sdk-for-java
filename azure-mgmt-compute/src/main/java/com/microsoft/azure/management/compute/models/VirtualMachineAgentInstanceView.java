/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * The instance view of the VM Agent running on the virtual machine.
 */
public class VirtualMachineAgentInstanceView {
    /**
     * Gets or sets the VM Agent full version.
     */
    private String vmAgentVersion;

    /**
     * Gets or sets the virtual machine extension handler instance view.
     */
    private List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers;

    /**
     * Gets or sets the resource status information.
     */
    private List<InstanceViewStatus> statuses;

    /**
     * Get the vmAgentVersion value.
     *
     * @return the vmAgentVersion value
     */
    public String getVmAgentVersion() {
        return this.vmAgentVersion;
    }

    /**
     * Set the vmAgentVersion value.
     *
     * @param vmAgentVersion the vmAgentVersion value to set
     */
    public void setVmAgentVersion(String vmAgentVersion) {
        this.vmAgentVersion = vmAgentVersion;
    }

    /**
     * Get the extensionHandlers value.
     *
     * @return the extensionHandlers value
     */
    public List<VirtualMachineExtensionHandlerInstanceView> getExtensionHandlers() {
        return this.extensionHandlers;
    }

    /**
     * Set the extensionHandlers value.
     *
     * @param extensionHandlers the extensionHandlers value to set
     */
    public void setExtensionHandlers(List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers) {
        this.extensionHandlers = extensionHandlers;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     */
    public void setStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
    }

}
