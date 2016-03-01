/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine scale set operating system disk.
 */
public class VirtualMachineScaleSetOSDisk {
    /**
     * Gets or sets the disk name.
     */
    @JsonProperty(required = true)
    private String name;

    /**
     * Gets or sets the caching type. Possible values include: 'None',
     * 'ReadOnly', 'ReadWrite'.
     */
    private String caching;

    /**
     * Gets or sets the create option. Possible values include: 'fromImage',
     * 'empty', 'attach'.
     */
    @JsonProperty(required = true)
    private String createOption;

    /**
     * Gets or sets the Operating System type. Possible values include:
     * 'Windows', 'Linux'.
     */
    private String osType;

    /**
     * Gets or sets the Source User Image VirtualHardDisk. This
     * VirtualHardDisk will be copied before using it to attach to the
     * Virtual Machine.If SourceImage is provided, the destination
     * VirtualHardDisk should not exist.
     */
    private VirtualHardDisk image;

    /**
     * Gets or sets the list of virtual hard disk container uris.
     */
    private List<String> vhdContainers;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the caching value.
     *
     * @return the caching value
     */
    public String getCaching() {
        return this.caching;
    }

    /**
     * Set the caching value.
     *
     * @param caching the caching value to set
     */
    public void setCaching(String caching) {
        this.caching = caching;
    }

    /**
     * Get the createOption value.
     *
     * @return the createOption value
     */
    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Set the createOption value.
     *
     * @param createOption the createOption value to set
     */
    public void setCreateOption(String createOption) {
        this.createOption = createOption;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public VirtualHardDisk getImage() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     */
    public void setImage(VirtualHardDisk image) {
        this.image = image;
    }

    /**
     * Get the vhdContainers value.
     *
     * @return the vhdContainers value
     */
    public List<String> getVhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the vhdContainers value.
     *
     * @param vhdContainers the vhdContainers value to set
     */
    public void setVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
    }

}
