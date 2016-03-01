/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Http logs configuration.
 */
public class HttpLogsConfig {
    /**
     * Http logs to file system configuration.
     */
    private FileSystemHttpLogsConfig fileSystem;

    /**
     * Http logs to azure blob storage configuration.
     */
    private AzureBlobStorageHttpLogsConfig azureBlobStorage;

    /**
     * Get the fileSystem value.
     *
     * @return the fileSystem value
     */
    public FileSystemHttpLogsConfig getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem value.
     *
     * @param fileSystem the fileSystem value to set
     */
    public void setFileSystem(FileSystemHttpLogsConfig fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * Get the azureBlobStorage value.
     *
     * @return the azureBlobStorage value
     */
    public AzureBlobStorageHttpLogsConfig getAzureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage value.
     *
     * @param azureBlobStorage the azureBlobStorage value to set
     */
    public void setAzureBlobStorage(AzureBlobStorageHttpLogsConfig azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
    }

}
