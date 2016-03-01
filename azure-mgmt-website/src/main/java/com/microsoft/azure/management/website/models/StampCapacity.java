/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Class containing stamp capacity information.
 */
public class StampCapacity {
    /**
     * Name of the stamp.
     */
    private String name;

    /**
     * Available capacity (# of machines, bytes of storage etc...).
     */
    private Long availableCapacity;

    /**
     * Total capacity (# of machines, bytes of storage etc...).
     */
    private Long totalCapacity;

    /**
     * Name of the unit.
     */
    private String unit;

    /**
     * Shared/Dedicated workers. Possible values include: 'Shared',
     * 'Dedicated'.
     */
    private ComputeModeOptions computeMode;

    /**
     * Size of the machines. Possible values include: 'Default', 'Small',
     * 'Medium', 'Large'.
     */
    private WorkerSizeOptions workerSize;

    /**
     * Size Id of machines:
     * 0 - Small
     * 1 - Medium
     * 2 - Large.
     */
    private Integer workerSizeId;

    /**
     * If true it includes basic sites
     * Basic sites are not used for capacity allocation.
     */
    private Boolean excludeFromCapacityAllocation;

    /**
     * Is capacity applicable for all sites?.
     */
    private Boolean isApplicableForAllComputeModes;

    /**
     * Shared or Dedicated.
     */
    private String siteMode;

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
     * Get the availableCapacity value.
     *
     * @return the availableCapacity value
     */
    public Long getAvailableCapacity() {
        return this.availableCapacity;
    }

    /**
     * Set the availableCapacity value.
     *
     * @param availableCapacity the availableCapacity value to set
     */
    public void setAvailableCapacity(Long availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * Get the totalCapacity value.
     *
     * @return the totalCapacity value
     */
    public Long getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity value.
     *
     * @param totalCapacity the totalCapacity value to set
     */
    public void setTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Get the computeMode value.
     *
     * @return the computeMode value
     */
    public ComputeModeOptions getComputeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode value.
     *
     * @param computeMode the computeMode value to set
     */
    public void setComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
    }

    /**
     * Get the workerSize value.
     *
     * @return the workerSize value
     */
    public WorkerSizeOptions getWorkerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize value.
     *
     * @param workerSize the workerSize value to set
     */
    public void setWorkerSize(WorkerSizeOptions workerSize) {
        this.workerSize = workerSize;
    }

    /**
     * Get the workerSizeId value.
     *
     * @return the workerSizeId value
     */
    public Integer getWorkerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set the workerSizeId value.
     *
     * @param workerSizeId the workerSizeId value to set
     */
    public void setWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
    }

    /**
     * Get the excludeFromCapacityAllocation value.
     *
     * @return the excludeFromCapacityAllocation value
     */
    public Boolean getExcludeFromCapacityAllocation() {
        return this.excludeFromCapacityAllocation;
    }

    /**
     * Set the excludeFromCapacityAllocation value.
     *
     * @param excludeFromCapacityAllocation the excludeFromCapacityAllocation value to set
     */
    public void setExcludeFromCapacityAllocation(Boolean excludeFromCapacityAllocation) {
        this.excludeFromCapacityAllocation = excludeFromCapacityAllocation;
    }

    /**
     * Get the isApplicableForAllComputeModes value.
     *
     * @return the isApplicableForAllComputeModes value
     */
    public Boolean getIsApplicableForAllComputeModes() {
        return this.isApplicableForAllComputeModes;
    }

    /**
     * Set the isApplicableForAllComputeModes value.
     *
     * @param isApplicableForAllComputeModes the isApplicableForAllComputeModes value to set
     */
    public void setIsApplicableForAllComputeModes(Boolean isApplicableForAllComputeModes) {
        this.isApplicableForAllComputeModes = isApplicableForAllComputeModes;
    }

    /**
     * Get the siteMode value.
     *
     * @return the siteMode value
     */
    public String getSiteMode() {
        return this.siteMode;
    }

    /**
     * Set the siteMode value.
     *
     * @param siteMode the siteMode value to set
     */
    public void setSiteMode(String siteMode) {
        this.siteMode = siteMode;
    }

}
