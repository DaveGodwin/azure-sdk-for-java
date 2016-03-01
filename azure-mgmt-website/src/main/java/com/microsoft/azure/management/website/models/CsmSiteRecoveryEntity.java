/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import org.joda.time.DateTime;

/**
 * Class containting details about site recovery operation.
 */
public class CsmSiteRecoveryEntity {
    /**
     * Point in time in which the site recover should be attempted.
     */
    private DateTime snapshotTime;

    /**
     * [Optional] Destination web app name into which web app should be
     * recovered. This is case when new web app should be created instead.
     */
    private String siteName;

    /**
     * [Optional] Destination web app slot name into which web app should be
     * recovered.
     */
    private String slotName;

    /**
     * Get the snapshotTime value.
     *
     * @return the snapshotTime value
     */
    public DateTime getSnapshotTime() {
        return this.snapshotTime;
    }

    /**
     * Set the snapshotTime value.
     *
     * @param snapshotTime the snapshotTime value to set
     */
    public void setSnapshotTime(DateTime snapshotTime) {
        this.snapshotTime = snapshotTime;
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
     * Get the slotName value.
     *
     * @return the slotName value
     */
    public String getSlotName() {
        return this.slotName;
    }

    /**
     * Set the slotName value.
     *
     * @param slotName the slotName value to set
     */
    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

}
