// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.TimeSeriesBaseline;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The response to a metric baselines query. */
@Fluent
public final class MetricBaselinesProperties {
    /*
     * The timespan for which the data was retrieved. Its value consists of two datetimes concatenated, separated by
     * '/'.  This may be adjusted in the future and returned back from what was originally requested.
     */
    @JsonProperty(value = "timespan", required = true)
    private String timespan;

    /*
     * The interval (window size) for which the metric data was returned in.  This may be adjusted in the future and
     * returned back from what was originally requested.  This is not present if a metadata request was made.
     */
    @JsonProperty(value = "interval", required = true)
    private Duration interval;

    /*
     * The namespace of the metrics been queried.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The baseline for each time series that was queried.
     */
    @JsonProperty(value = "baselines", required = true)
    private List<TimeSeriesBaseline> baselines;

    /**
     * Get the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @return the timespan value.
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan for which the data was retrieved. Its value consists of two datetimes
     * concatenated, separated by '/'. This may be adjusted in the future and returned back from what was originally
     * requested.
     *
     * @param timespan the timespan value to set.
     * @return the MetricBaselinesProperties object itself.
     */
    public MetricBaselinesProperties withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @return the interval value.
     */
    public Duration interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (window size) for which the metric data was returned in. This may be
     * adjusted in the future and returned back from what was originally requested. This is not present if a metadata
     * request was made.
     *
     * @param interval the interval value to set.
     * @return the MetricBaselinesProperties object itself.
     */
    public MetricBaselinesProperties withInterval(Duration interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the namespace property: The namespace of the metrics been queried.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the metrics been queried.
     *
     * @param namespace the namespace value to set.
     * @return the MetricBaselinesProperties object itself.
     */
    public MetricBaselinesProperties withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the baselines property: The baseline for each time series that was queried.
     *
     * @return the baselines value.
     */
    public List<TimeSeriesBaseline> baselines() {
        return this.baselines;
    }

    /**
     * Set the baselines property: The baseline for each time series that was queried.
     *
     * @param baselines the baselines value to set.
     * @return the MetricBaselinesProperties object itself.
     */
    public MetricBaselinesProperties withBaselines(List<TimeSeriesBaseline> baselines) {
        this.baselines = baselines;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timespan() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property timespan in model MetricBaselinesProperties"));
        }
        if (interval() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property interval in model MetricBaselinesProperties"));
        }
        if (baselines() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property baselines in model MetricBaselinesProperties"));
        } else {
            baselines().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricBaselinesProperties.class);
}
