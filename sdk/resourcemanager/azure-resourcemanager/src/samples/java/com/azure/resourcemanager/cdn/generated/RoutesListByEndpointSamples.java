// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for Routes ListByEndpoint. */
public final class RoutesListByEndpointSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Routes_ListByEndpoint.json
     */
    /**
     * Sample code: Routes_ListByEndpoint.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routesListByEndpoint(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getRoutes()
            .listByEndpoint("RG", "profile1", "endpoint1", com.azure.core.util.Context.NONE);
    }
}
