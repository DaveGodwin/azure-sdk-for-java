/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a Encryption Settings for a Disk.
 */
public class DiskEncryptionSettings {
    /**
     * Gets or sets the disk encryption key which is a KeyVault Secret.
     */
    @JsonProperty(required = true)
    private KeyVaultSecretReference diskEncryptionKey;

    /**
     * Gets or sets the key encryption key which is KeyVault Key.
     */
    private KeyVaultKeyReference keyEncryptionKey;

    /**
     * Get the diskEncryptionKey value.
     *
     * @return the diskEncryptionKey value
     */
    public KeyVaultSecretReference getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set the diskEncryptionKey value.
     *
     * @param diskEncryptionKey the diskEncryptionKey value to set
     */
    public void setDiskEncryptionKey(KeyVaultSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
    }

    /**
     * Get the keyEncryptionKey value.
     *
     * @return the keyEncryptionKey value
     */
    public KeyVaultKeyReference getKeyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey value.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set
     */
    public void setKeyEncryptionKey(KeyVaultKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
    }

}
