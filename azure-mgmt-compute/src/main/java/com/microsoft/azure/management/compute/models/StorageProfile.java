/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Describes a storage profile.
 */
public class StorageProfile {
    /**
     * Gets or sets the image reference.
     */
    private ImageReference imageReference;

    /**
     * Gets or sets the OS disk.
     */
    private OSDisk osDisk;

    /**
     * Gets or sets the data disks.
     */
    private List<DataDisk> dataDisks;

    /**
     * Get the imageReference value.
     *
     * @return the imageReference value
     */
    public ImageReference getImageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference value.
     *
     * @param imageReference the imageReference value to set
     */
    public void setImageReference(ImageReference imageReference) {
        this.imageReference = imageReference;
    }

    /**
     * Get the osDisk value.
     *
     * @return the osDisk value
     */
    public OSDisk getOsDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk value.
     *
     * @param osDisk the osDisk value to set
     */
    public void setOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
    }

    /**
     * Get the dataDisks value.
     *
     * @return the dataDisks value
     */
    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks value.
     *
     * @param dataDisks the dataDisks value to set
     */
    public void setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
    }

}
