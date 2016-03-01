/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Application logs azure blob storage configuration.
 */
public class AzureBlobStorageApplicationLogsConfig {
    /**
     * Log level. Possible values include: 'Off', 'Verbose', 'Information',
     * 'Warning', 'Error'.
     */
    private LogLevel level;

    /**
     * SAS url to a azure blob container with read/write/list/delete
     * permissions.
     */
    private String sasUrl;

    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     */
    private Integer retentionInDays;

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public LogLevel getLevel() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     */
    public void setLevel(LogLevel level) {
        this.level = level;
    }

    /**
     * Get the sasUrl value.
     *
     * @return the sasUrl value
     */
    public String getSasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl value.
     *
     * @param sasUrl the sasUrl value to set
     */
    public void setSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
    }

    /**
     * Get the retentionInDays value.
     *
     * @return the retentionInDays value
     */
    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays value.
     *
     * @param retentionInDays the retentionInDays value to set
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

}
