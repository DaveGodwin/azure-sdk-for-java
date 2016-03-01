/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Description of a backup which will be performed.
 */
@JsonFlatten
public class BackupRequest extends Resource {
    /**
     * Name of the backup.
     */
    @JsonProperty(value = "properties.name")
    private String backupRequestName;

    /**
     * True if the backup schedule is enabled (must be included in that case),
     * false if the backup schedule should be disabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * SAS URL to the container.
     */
    @JsonProperty(value = "properties.storageAccountUrl")
    private String storageAccountUrl;

    /**
     * Schedule for the backup if it is executed periodically.
     */
    @JsonProperty(value = "properties.backupSchedule")
    private BackupSchedule backupSchedule;

    /**
     * Databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * Type of the backup. Possible values include: 'Default', 'Clone',
     * 'Relocation'.
     */
    @JsonProperty(value = "properties.type")
    private BackupRestoreOperationType backupRequestType;

    /**
     * Get the backupRequestName value.
     *
     * @return the backupRequestName value
     */
    public String getBackupRequestName() {
        return this.backupRequestName;
    }

    /**
     * Set the backupRequestName value.
     *
     * @param backupRequestName the backupRequestName value to set
     */
    public void setBackupRequestName(String backupRequestName) {
        this.backupRequestName = backupRequestName;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
     * Get the backupSchedule value.
     *
     * @return the backupSchedule value
     */
    public BackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }

    /**
     * Set the backupSchedule value.
     *
     * @param backupSchedule the backupSchedule value to set
     */
    public void setBackupSchedule(BackupSchedule backupSchedule) {
        this.backupSchedule = backupSchedule;
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
     * Get the backupRequestType value.
     *
     * @return the backupRequestType value
     */
    public BackupRestoreOperationType getBackupRequestType() {
        return this.backupRequestType;
    }

    /**
     * Set the backupRequestType value.
     *
     * @param backupRequestType the backupRequestType value to set
     */
    public void setBackupRequestType(BackupRestoreOperationType backupRequestType) {
        this.backupRequestType = backupRequestType;
    }

}
