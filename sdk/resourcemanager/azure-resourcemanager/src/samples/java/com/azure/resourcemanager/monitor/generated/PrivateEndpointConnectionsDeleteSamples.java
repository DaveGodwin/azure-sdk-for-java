// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-07-01-preview/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: Deletes a private endpoint connection with a given name.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .delete("MyResourceGroup", "MyPrivateLinkScope", "private-endpoint-connection-name", Context.NONE);
    }
}
