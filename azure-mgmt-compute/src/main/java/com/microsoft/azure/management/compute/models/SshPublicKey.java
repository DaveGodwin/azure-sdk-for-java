/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;


/**
 * Contains information about SSH certificate public key and the path on the
 * Linux VM where the public key is placed.
 */
public class SshPublicKey {
    /**
     * Gets or sets the full path on the created VM where SSH public key is
     * stored. If the file already exists, the specified key is appended to
     * the file.
     */
    private String path;

    /**
     * Gets or sets Certificate public key used to authenticate with VM
     * through SSH.The certificate must be in Pem format with or without
     * headers.
     */
    private String keyData;

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Get the keyData value.
     *
     * @return the keyData value
     */
    public String getKeyData() {
        return this.keyData;
    }

    /**
     * Set the keyData value.
     *
     * @param keyData the keyData value to set
     */
    public void setKeyData(String keyData) {
        this.keyData = keyData;
    }

}
