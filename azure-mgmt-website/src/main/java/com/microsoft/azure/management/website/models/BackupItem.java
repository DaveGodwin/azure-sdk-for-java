/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Backup description.
 */
@JsonFlatten
public class BackupItem extends Resource {
    /**
     * Id of the backup.
     */
    @JsonProperty(value = "properties.id")
    private Integer backupItemId;

    /**
     * SAS URL for the storage account container which contains this backup.
     */
    @JsonProperty(value = "properties.storageAccountUrl")
    private String storageAccountUrl;

    /**
     * Name of the blob which contains data for this backup.
     */
    @JsonProperty(value = "properties.blobName")
    private String blobName;

    /**
     * Name of this backup.
     */
    @JsonProperty(value = "properties.name")
    private String backupItemName;

    /**
     * Backup status. Possible values include: 'InProgress', 'Failed',
     * 'Succeeded', 'TimedOut', 'Created', 'Skipped', 'PartiallySucceeded',
     * 'DeleteInProgress', 'DeleteFailed', 'Deleted'.
     */
    @JsonProperty(value = "properties.status")
    private BackupItemStatus status;

    /**
     * Size of the backup in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes")
    private Long sizeInBytes;

    /**
     * Timestamp of the backup creation.
     */
    @JsonProperty(value = "properties.created")
    private DateTime created;

    /**
     * Details regarding this backup. Might contain an error message.
     */
    @JsonProperty(value = "properties.log")
    private String log;

    /**
     * List of databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * True if this backup has been created due to a schedule being triggered.
     */
    @JsonProperty(value = "properties.scheduled")
    private Boolean scheduled;

    /**
     * Timestamp of a last restore operation which used this backup.
     */
    @JsonProperty(value = "properties.lastRestoreTimeStamp")
    private DateTime lastRestoreTimeStamp;

    /**
     * Timestamp when this backup finished.
     */
    @JsonProperty(value = "properties.finishedTimeStamp")
    private DateTime finishedTimeStamp;

    /**
     * Unique correlation identifier. Please use this along with the timestamp
     * while communicating with Azure support.
     */
    @JsonProperty(value = "properties.correlationId")
    private String correlationId;

    /**
     * Size of the original web app which has been backed up.
     */
    @JsonProperty(value = "properties.websiteSizeInBytes")
    private Long websiteSizeInBytes;

    /**
     * Get the backupItemId value.
     *
     * @return the backupItemId value
     */
    public Integer getBackupItemId() {
        return this.backupItemId;
    }

    /**
     * Set the backupItemId value.
     *
     * @param backupItemId the backupItemId value to set
     */
    public void setBackupItemId(Integer backupItemId) {
        this.backupItemId = backupItemId;
    }

    /**
     * Get the storageAccountUrl value.
     *
     * @return the storageAccountUrl value
     */
    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Set the storageAccountUrl value.
     *
     * @param storageAccountUrl the storageAccountUrl value to set
     */
    public void setStorageAccountUrl(String storageAccountUrl) {
        this.storageAccountUrl = storageAccountUrl;
    }

    /**
     * Get the blobName value.
     *
     * @return the blobName value
     */
    public String getBlobName() {
        return this.blobName;
    }

    /**
     * Set the blobName value.
     *
     * @param blobName the blobName value to set
     */
    public void setBlobName(String blobName) {
        this.blobName = blobName;
    }

    /**
     * Get the backupItemName value.
     *
     * @return the backupItemName value
     */
    public String getBackupItemName() {
        return this.backupItemName;
    }

    /**
     * Set the backupItemName value.
     *
     * @param backupItemName the backupItemName value to set
     */
    public void setBackupItemName(String backupItemName) {
        this.backupItemName = backupItemName;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public BackupItemStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(BackupItemStatus status) {
        this.status = status;
    }

    /**
     * Get the sizeInBytes value.
     *
     * @return the sizeInBytes value
     */
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes value.
     *
     * @param sizeInBytes the sizeInBytes value to set
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime getCreated() {
        return this.created;
    }

    /**
     * Set the created value.
     *
     * @param created the created value to set
     */
    public void setCreated(DateTime created) {
        this.created = created;
    }

    /**
     * Get the log value.
     *
     * @return the log value
     */
    public String getLog() {
        return this.log;
    }

    /**
     * Set the log value.
     *
     * @param log the log value to set
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * Get the databases value.
     *
     * @return the databases value
     */
    public List<DatabaseBackupSetting> getDatabases() {
        return this.databases;
    }

    /**
     * Set the databases value.
     *
     * @param databases the databases value to set
     */
    public void setDatabases(List<DatabaseBackupSetting> databases) {
        this.databases = databases;
    }

    /**
     * Get the scheduled value.
     *
     * @return the scheduled value
     */
    public Boolean getScheduled() {
        return this.scheduled;
    }

    /**
     * Set the scheduled value.
     *
     * @param scheduled the scheduled value to set
     */
    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }

    /**
     * Get the lastRestoreTimeStamp value.
     *
     * @return the lastRestoreTimeStamp value
     */
    public DateTime getLastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }

    /**
     * Set the lastRestoreTimeStamp value.
     *
     * @param lastRestoreTimeStamp the lastRestoreTimeStamp value to set
     */
    public void setLastRestoreTimeStamp(DateTime lastRestoreTimeStamp) {
        this.lastRestoreTimeStamp = lastRestoreTimeStamp;
    }

    /**
     * Get the finishedTimeStamp value.
     *
     * @return the finishedTimeStamp value
     */
    public DateTime getFinishedTimeStamp() {
        return this.finishedTimeStamp;
    }

    /**
     * Set the finishedTimeStamp value.
     *
     * @param finishedTimeStamp the finishedTimeStamp value to set
     */
    public void setFinishedTimeStamp(DateTime finishedTimeStamp) {
        this.finishedTimeStamp = finishedTimeStamp;
    }

    /**
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId value.
     *
     * @param correlationId the correlationId value to set
     */
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    /**
     * Get the websiteSizeInBytes value.
     *
     * @return the websiteSizeInBytes value
     */
    public Long getWebsiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    /**
     * Set the websiteSizeInBytes value.
     *
     * @param websiteSizeInBytes the websiteSizeInBytes value to set
     */
    public void setWebsiteSizeInBytes(Long websiteSizeInBytes) {
        this.websiteSizeInBytes = websiteSizeInBytes;
    }

}
