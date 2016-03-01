/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Class repesenting metadata for the metrics.
 */
@JsonFlatten
public class MetricDefinition extends Resource {
    /**
     * Name of the metric.
     */
    @JsonProperty(value = "properties.name")
    private String metricDefinitionName;

    /**
     * Unit of the metric.
     */
    @JsonProperty(value = "properties.unit")
    private String unit;

    /**
     * Primary aggregation type.
     */
    @JsonProperty(value = "properties.primaryAggregationType")
    private String primaryAggregationType;

    /**
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "properties.metricAvailabilities")
    private List<MetricAvailabilily> metricAvailabilities;

    /**
     * Friendly name shown in the UI.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get the metricDefinitionName value.
     *
     * @return the metricDefinitionName value
     */
    public String getMetricDefinitionName() {
        return this.metricDefinitionName;
    }

    /**
     * Set the metricDefinitionName value.
     *
     * @param metricDefinitionName the metricDefinitionName value to set
     */
    public void setMetricDefinitionName(String metricDefinitionName) {
        this.metricDefinitionName = metricDefinitionName;
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
     * Get the primaryAggregationType value.
     *
     * @return the primaryAggregationType value
     */
    public String getPrimaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Set the primaryAggregationType value.
     *
     * @param primaryAggregationType the primaryAggregationType value to set
     */
    public void setPrimaryAggregationType(String primaryAggregationType) {
        this.primaryAggregationType = primaryAggregationType;
    }

    /**
     * Get the metricAvailabilities value.
     *
     * @return the metricAvailabilities value
     */
    public List<MetricAvailabilily> getMetricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Set the metricAvailabilities value.
     *
     * @param metricAvailabilities the metricAvailabilities value to set
     */
    public void setMetricAvailabilities(List<MetricAvailabilily> metricAvailabilities) {
        this.metricAvailabilities = metricAvailabilities;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
