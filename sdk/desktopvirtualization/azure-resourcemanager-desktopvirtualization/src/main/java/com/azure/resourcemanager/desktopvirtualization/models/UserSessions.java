// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of UserSessions.
 */
public interface UserSessions {
    /**
     * List userSessions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserSession> listByHostPool(String resourceGroupName, String hostPoolName);

    /**
     * List userSessions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param filter OData filter expression. Valid properties for filtering are userprincipalname and sessionstate.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserSession> listByHostPool(String resourceGroupName, String hostPoolName, String filter,
        Integer pageSize, Boolean isDescending, Integer initialSkip, Context context);

    /**
     * Get a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession along with {@link Response}.
     */
    Response<UserSession> getWithResponse(String resourceGroupName, String hostPoolName, String sessionHostname,
        String userSessionId, Context context);

    /**
     * Get a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a userSession.
     */
    UserSession get(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Remove a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param force Force flag to login off userSession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String hostPoolName, String sessionHostname,
        String userSessionId, Boolean force, Context context);

    /**
     * Remove a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * List userSessions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserSession> list(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * List userSessions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param pageSize Number of items per page.
     * @param isDescending Indicates whether the collection is descending.
     * @param initialSkip Initial number of items to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return userSessionList as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserSession> list(String resourceGroupName, String hostPoolName, String sessionHostname,
        Integer pageSize, Boolean isDescending, Integer initialSkip, Context context);

    /**
     * Disconnect a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> disconnectWithResponse(String resourceGroupName, String hostPoolName, String sessionHostname,
        String userSessionId, Context context);

    /**
     * Disconnect a userSession.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disconnect(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);

    /**
     * Send a message to a user.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @param sendMessage Object containing message includes title and message body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> sendMessageWithResponse(String resourceGroupName, String hostPoolName, String sessionHostname,
        String userSessionId, SendMessage sendMessage, Context context);

    /**
     * Send a message to a user.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param userSessionId The name of the user session within the specified session host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sendMessage(String resourceGroupName, String hostPoolName, String sessionHostname, String userSessionId);
}
