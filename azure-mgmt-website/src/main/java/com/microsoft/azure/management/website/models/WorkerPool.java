/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Worker pool of a hostingEnvironment (App Service Environment).
 */
@JsonFlatten
public class WorkerPool extends Resource {
    /**
     * Worker size id for referencing this worker pool.
     */
    @JsonProperty(value = "properties.workerSizeId")
    private Integer workerSizeId;

    /**
     * Shared or dedicated web app hosting. Possible values include: 'Shared',
     * 'Dedicated'.
     */
    @JsonProperty(value = "properties.computeMode")
    private ComputeModeOptions computeMode;

    /**
     * VM size of the worker pool instances.
     */
    @JsonProperty(value = "properties.workerSize")
    private String workerSize;

    /**
     * Number of instances in the worker pool.
     */
    @JsonProperty(value = "properties.workerCount")
    private Integer workerCount;

    /**
     * Names of all instances in the worker pool (read only).
     */
    @JsonProperty(value = "properties.instanceNames")
    private List<String> instanceNames;

    /**
     * The sku property.
     */
    private SkuDescription sku;

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
    public String getWorkerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize value.
     *
     * @param workerSize the workerSize value to set
     */
    public void setWorkerSize(String workerSize) {
        this.workerSize = workerSize;
    }

    /**
     * Get the workerCount value.
     *
     * @return the workerCount value
     */
    public Integer getWorkerCount() {
        return this.workerCount;
    }

    /**
     * Set the workerCount value.
     *
     * @param workerCount the workerCount value to set
     */
    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    /**
     * Get the instanceNames value.
     *
     * @return the instanceNames value
     */
    public List<String> getInstanceNames() {
        return this.instanceNames;
    }

    /**
     * Set the instanceNames value.
     *
     * @param instanceNames the instanceNames value to set
     */
    public void setInstanceNames(List<String> instanceNames) {
        this.instanceNames = instanceNames;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuDescription getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(SkuDescription sku) {
        this.sku = sku;
    }

}
