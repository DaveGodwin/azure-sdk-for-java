/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Configuration of Azure web site.
 */
@JsonFlatten
public class SiteLogsConfig extends Resource {
    /**
     * Application logs configuration.
     */
    @JsonProperty(value = "properties.applicationLogs")
    private ApplicationLogsConfig applicationLogs;

    /**
     * Http logs configuration.
     */
    @JsonProperty(value = "properties.httpLogs")
    private HttpLogsConfig httpLogs;

    /**
     * Failed requests tracing configuration.
     */
    @JsonProperty(value = "properties.failedRequestsTracing")
    private EnabledConfig failedRequestsTracing;

    /**
     * Detailed error messages configuration.
     */
    @JsonProperty(value = "properties.detailedErrorMessages")
    private EnabledConfig detailedErrorMessages;

    /**
     * Get the applicationLogs value.
     *
     * @return the applicationLogs value
     */
    public ApplicationLogsConfig getApplicationLogs() {
        return this.applicationLogs;
    }

    /**
     * Set the applicationLogs value.
     *
     * @param applicationLogs the applicationLogs value to set
     */
    public void setApplicationLogs(ApplicationLogsConfig applicationLogs) {
        this.applicationLogs = applicationLogs;
    }

    /**
     * Get the httpLogs value.
     *
     * @return the httpLogs value
     */
    public HttpLogsConfig getHttpLogs() {
        return this.httpLogs;
    }

    /**
     * Set the httpLogs value.
     *
     * @param httpLogs the httpLogs value to set
     */
    public void setHttpLogs(HttpLogsConfig httpLogs) {
        this.httpLogs = httpLogs;
    }

    /**
     * Get the failedRequestsTracing value.
     *
     * @return the failedRequestsTracing value
     */
    public EnabledConfig getFailedRequestsTracing() {
        return this.failedRequestsTracing;
    }

    /**
     * Set the failedRequestsTracing value.
     *
     * @param failedRequestsTracing the failedRequestsTracing value to set
     */
    public void setFailedRequestsTracing(EnabledConfig failedRequestsTracing) {
        this.failedRequestsTracing = failedRequestsTracing;
    }

    /**
     * Get the detailedErrorMessages value.
     *
     * @return the detailedErrorMessages value
     */
    public EnabledConfig getDetailedErrorMessages() {
        return this.detailedErrorMessages;
    }

    /**
     * Set the detailedErrorMessages value.
     *
     * @param detailedErrorMessages the detailedErrorMessages value to set
     */
    public void setDetailedErrorMessages(EnabledConfig detailedErrorMessages) {
        this.detailedErrorMessages = detailedErrorMessages;
    }

}
