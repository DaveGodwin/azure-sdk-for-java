/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;


/**
 * Describes a virtual machine scale set virtual machine profile.
 */
public class VirtualMachineScaleSetVMProfile {
    /**
     * Gets or sets the virtual machine scale set OS profile.
     */
    private VirtualMachineScaleSetOSProfile osProfile;

    /**
     * Gets or sets the virtual machine scale set storage profile.
     */
    private VirtualMachineScaleSetStorageProfile storageProfile;

    /**
     * Gets or sets the virtual machine scale set network profile.
     */
    private VirtualMachineScaleSetNetworkProfile networkProfile;

    /**
     * Gets the virtual machine scale set extension profile.
     */
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public VirtualMachineScaleSetOSProfile getOsProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     */
    public void setOsProfile(VirtualMachineScaleSetOSProfile osProfile) {
        this.osProfile = osProfile;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public VirtualMachineScaleSetStorageProfile getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     */
    public void setStorageProfile(VirtualMachineScaleSetStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public VirtualMachineScaleSetNetworkProfile getNetworkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     */
    public void setNetworkProfile(VirtualMachineScaleSetNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
    }

    /**
     * Get the extensionProfile value.
     *
     * @return the extensionProfile value
     */
    public VirtualMachineScaleSetExtensionProfile getExtensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile value.
     *
     * @param extensionProfile the extensionProfile value to set
     */
    public void setExtensionProfile(VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
    }

}
