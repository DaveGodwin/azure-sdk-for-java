/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Description of a restore request.
 */
@JsonFlatten
public class RestoreRequest extends Resource {
    /**
     * SAS URL to the container.
     */
    @JsonProperty(value = "properties.storageAccountUrl")
    private String storageAccountUrl;

    /**
     * Name of a blob which contains the backup.
     */
    @JsonProperty(value = "properties.blobName")
    private String blobName;

    /**
     * True if the restore operation can overwrite target site. "True" needed
     * if trying to restore over an existing site.
     */
    @JsonProperty(value = "properties.overwrite")
    private Boolean overwrite;

    /**
     * Name of a site (Web App).
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /**
     * Collection of databses which should be restored. This list has to match
     * the list of databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * Changes a logic when restoring a site with custom domains. If "true",
     * custom domains are removed automatically. If "false", custom domains
     * are added to
     * the site object when it is being restored, but that might
     * fail due to conflicts during the operation.
     */
    @JsonProperty(value = "properties.ignoreConflictingHostNames")
    private Boolean ignoreConflictingHostNames;

    /**
     * Operation type. Possible values include: 'Default', 'Clone',
     * 'Relocation'.
     */
    @JsonProperty(value = "properties.operationType")
    private BackupRestoreOperationType operationType;

    /**
     * Gets or sets a flag showing if SiteConfig.ConnectionStrings should be
     * set in new site.
     */
    @JsonProperty(value = "properties.adjustConnectionStrings")
    private Boolean adjustConnectionStrings;

    /**
     * App Service Environment name, if needed (only when restoring a site to
     * an App Service Environment).
     */
    @JsonProperty(value = "properties.hostingEnvironment")
    private String hostingEnvironment;

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
     * Get the overwrite value.
     *
     * @return the overwrite value
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * Set the overwrite value.
     *
     * @param overwrite the overwrite value to set
     */
    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * Set the siteName value.
     *
     * @param siteName the siteName value to set
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
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
     * Get the ignoreConflictingHostNames value.
     *
     * @return the ignoreConflictingHostNames value
     */
    public Boolean getIgnoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }

    /**
     * Set the ignoreConflictingHostNames value.
     *
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set
     */
    public void setIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNames;
    }

    /**
     * Get the operationType value.
     *
     * @return the operationType value
     */
    public BackupRestoreOperationType getOperationType() {
        return this.operationType;
    }

    /**
     * Set the operationType value.
     *
     * @param operationType the operationType value to set
     */
    public void setOperationType(BackupRestoreOperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * Get the adjustConnectionStrings value.
     *
     * @return the adjustConnectionStrings value
     */
    public Boolean getAdjustConnectionStrings() {
        return this.adjustConnectionStrings;
    }

    /**
     * Set the adjustConnectionStrings value.
     *
     * @param adjustConnectionStrings the adjustConnectionStrings value to set
     */
    public void setAdjustConnectionStrings(Boolean adjustConnectionStrings) {
        this.adjustConnectionStrings = adjustConnectionStrings;
    }

    /**
     * Get the hostingEnvironment value.
     *
     * @return the hostingEnvironment value
     */
    public String getHostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment value.
     *
     * @param hostingEnvironment the hostingEnvironment value to set
     */
    public void setHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
    }

}
