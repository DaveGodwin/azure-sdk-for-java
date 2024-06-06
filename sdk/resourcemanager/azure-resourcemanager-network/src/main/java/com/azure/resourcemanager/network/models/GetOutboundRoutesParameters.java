// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters specifying the connection resource whose outbound routes are being requested.
 */
@Fluent
public final class GetOutboundRoutesParameters {
    /*
     * The connection resource whose outbound routes are being requested.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /*
     * The type of the specified connection resource like ExpressRouteConnection, HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     */
    @JsonProperty(value = "connectionType")
    private String connectionType;

    /**
     * Creates an instance of GetOutboundRoutesParameters class.
     */
    public GetOutboundRoutesParameters() {
    }

    /**
     * Get the resourceUri property: The connection resource whose outbound routes are being requested.
     * 
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The connection resource whose outbound routes are being requested.
     * 
     * @param resourceUri the resourceUri value to set.
     * @return the GetOutboundRoutesParameters object itself.
     */
    public GetOutboundRoutesParameters withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the connectionType property: The type of the specified connection resource like ExpressRouteConnection,
     * HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     * 
     * @return the connectionType value.
     */
    public String connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: The type of the specified connection resource like ExpressRouteConnection,
     * HubVirtualNetworkConnection, VpnConnection and P2SConnection.
     * 
     * @param connectionType the connectionType value to set.
     * @return the GetOutboundRoutesParameters object itself.
     */
    public GetOutboundRoutesParameters withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
