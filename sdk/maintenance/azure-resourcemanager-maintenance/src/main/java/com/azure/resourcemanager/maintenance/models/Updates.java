// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Updates. */
public interface Updates {
    /**
     * Get Updates to resource
     *
     * <p>Get updates to resources.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return updates to resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Update> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName);

    /**
     * Get Updates to resource
     *
     * <p>Get updates to resources.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceParentType Resource parent type.
     * @param resourceParentName Resource parent identifier.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return updates to resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Update> listParent(
        String resourceGroupName,
        String providerName,
        String resourceParentType,
        String resourceParentName,
        String resourceType,
        String resourceName,
        Context context);

    /**
     * Get Updates to resource
     *
     * <p>Get updates to resources.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return updates to resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Update> list(String resourceGroupName, String providerName, String resourceType, String resourceName);

    /**
     * Get Updates to resource
     *
     * <p>Get updates to resources.
     *
     * @param resourceGroupName Resource group name.
     * @param providerName Resource provider name.
     * @param resourceType Resource type.
     * @param resourceName Resource identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return updates to resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Update> list(
        String resourceGroupName, String providerName, String resourceType, String resourceName, Context context);
}
