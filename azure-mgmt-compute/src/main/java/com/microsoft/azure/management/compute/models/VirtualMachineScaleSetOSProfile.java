/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes a virtual machine scale set OS profile.
 */
public class VirtualMachineScaleSetOSProfile {
    /**
     * Gets or sets the computer name prefix.
     */
    private String computerNamePrefix;

    /**
     * Gets or sets the admin user name.
     */
    private String adminUsername;

    /**
     * Gets or sets the admin user password.
     */
    private String adminPassword;

    /**
     * Gets or sets a base-64 encoded string of custom data.
     */
    private String customData;

    /**
     * Gets or sets the Windows Configuration of the OS profile.
     */
    private WindowsConfiguration windowsConfiguration;

    /**
     * Gets or sets the Linux Configuration of the OS profile.
     */
    private LinuxConfiguration linuxConfiguration;

    /**
     * Gets or sets the List of certificates for addition to the VM.
     */
    private List<VaultSecretGroup> secrets;

    /**
     * Get the computerNamePrefix value.
     *
     * @return the computerNamePrefix value
     */
    public String getComputerNamePrefix() {
        return this.computerNamePrefix;
    }

    /**
     * Set the computerNamePrefix value.
     *
     * @param computerNamePrefix the computerNamePrefix value to set
     */
    public void setComputerNamePrefix(String computerNamePrefix) {
        this.computerNamePrefix = computerNamePrefix;
    }

    /**
     * Get the adminUsername value.
     *
     * @return the adminUsername value
     */
    public String getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername value.
     *
     * @param adminUsername the adminUsername value to set
     */
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * Get the adminPassword value.
     *
     * @return the adminPassword value
     */
    public String getAdminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the adminPassword value.
     *
     * @param adminPassword the adminPassword value to set
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * Get the customData value.
     *
     * @return the customData value
     */
    public String getCustomData() {
        return this.customData;
    }

    /**
     * Set the customData value.
     *
     * @param customData the customData value to set
     */
    public void setCustomData(String customData) {
        this.customData = customData;
    }

    /**
     * Get the windowsConfiguration value.
     *
     * @return the windowsConfiguration value
     */
    public WindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration value.
     *
     * @param windowsConfiguration the windowsConfiguration value to set
     */
    public void setWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * Get the linuxConfiguration value.
     *
     * @return the linuxConfiguration value
     */
    public LinuxConfiguration getLinuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set the linuxConfiguration value.
     *
     * @param linuxConfiguration the linuxConfiguration value to set
     */
    public void setLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
    }

    /**
     * Get the secrets value.
     *
     * @return the secrets value
     */
    public List<VaultSecretGroup> getSecrets() {
        return this.secrets;
    }

    /**
     * Set the secrets value.
     *
     * @param secrets the secrets value to set
     */
    public void setSecrets(List<VaultSecretGroup> secrets) {
        this.secrets = secrets;
    }

}
