/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Application logs configuration.
 */
public class ApplicationLogsConfig {
    /**
     * Application logs to file system configuration.
     */
    private FileSystemApplicationLogsConfig fileSystem;

    /**
     * Application logs to azure table storage configuration.
     */
    private AzureTableStorageApplicationLogsConfig azureTableStorage;

    /**
     * Application logs to blob storage configuration.
     */
    private AzureBlobStorageApplicationLogsConfig azureBlobStorage;

    /**
     * Get the fileSystem value.
     *
     * @return the fileSystem value
     */
    public FileSystemApplicationLogsConfig getFileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem value.
     *
     * @param fileSystem the fileSystem value to set
     */
    public void setFileSystem(FileSystemApplicationLogsConfig fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * Get the azureTableStorage value.
     *
     * @return the azureTableStorage value
     */
    public AzureTableStorageApplicationLogsConfig getAzureTableStorage() {
        return this.azureTableStorage;
    }

    /**
     * Set the azureTableStorage value.
     *
     * @param azureTableStorage the azureTableStorage value to set
     */
    public void setAzureTableStorage(AzureTableStorageApplicationLogsConfig azureTableStorage) {
        this.azureTableStorage = azureTableStorage;
    }

    /**
     * Get the azureBlobStorage value.
     *
     * @return the azureBlobStorage value
     */
    public AzureBlobStorageApplicationLogsConfig getAzureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage value.
     *
     * @param azureBlobStorage the azureBlobStorage value to set
     */
    public void setAzureBlobStorage(AzureBlobStorageApplicationLogsConfig azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
    }

}
