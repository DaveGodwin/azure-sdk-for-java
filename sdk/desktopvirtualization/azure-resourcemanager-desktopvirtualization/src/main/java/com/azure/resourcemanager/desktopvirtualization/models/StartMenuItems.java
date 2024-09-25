// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of StartMenuItems.
 */
public interface StartMenuItems {
    /**
     * List start menu items in the given application group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return startMenuItemList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StartMenuItem> list(String resourceGroupName, String applicationGroupName);

    /**
     * List start menu items in the given application group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return startMenuItemList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StartMenuItem> list(String resourceGroupName, String applicationGroupName, Integer pageSize,
        Boolean isDescending, Integer initialSkip, Context context);
}
