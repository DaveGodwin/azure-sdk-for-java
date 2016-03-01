/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.AddressResponse;
import com.microsoft.azure.management.website.models.HostingEnvironment;
import com.microsoft.azure.management.website.models.HostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ManagedHostingEnvironment;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagedHostingEnvironmentsOperations.
 */
public interface ManagedHostingEnvironmentsOperations {
    /**
     * Get properties of a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagedHostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ManagedHostingEnvironment> getManagedHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get properties of a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<ManagedHostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the HostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironment> createOrUpdateManagedHostingEnvironment(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateManagedHostingEnvironmentAsync(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope, final ServiceCallback<HostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironment> beginCreateOrUpdateManagedHostingEnvironment(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateManagedHostingEnvironmentAsync(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope, final ServiceCallback<HostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteManagedHostingEnvironment(String resourceGroupName, String name, Boolean forceDelete) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteManagedHostingEnvironmentAsync(String resourceGroupName, String name, Boolean forceDelete, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> beginDeleteManagedHostingEnvironment(String resourceGroupName, String name, Boolean forceDelete) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteManagedHostingEnvironmentAsync(String resourceGroupName, String name, Boolean forceDelete, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all managed hosting environments in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironmentCollection> getManagedHostingEnvironments(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all managed hosting environments in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentsAsync(String resourceGroupName, final ServiceCallback<HostingEnvironmentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get list of ip addresses assigned to a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the AddressResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<AddressResponse> getManagedHostingEnvironmentVips(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get list of ip addresses assigned to a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentVipsAsync(String resourceGroupName, String name, final ServiceCallback<AddressResponse> serviceCallback) throws IllegalArgumentException;

    /**
     * Get status of an operation on a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param operationId operation identifier GUID
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getManagedHostingEnvironmentOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get status of an operation on a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param operationId operation identifier GUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all sites on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param propertiesToInclude Comma separated list of site properties to include
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getManagedHostingEnvironmentSites(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all sites on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param propertiesToInclude Comma separated list of site properties to include
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentSitesAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getManagedHostingEnvironmentServerFarms(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentServerFarmsAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getManagedHostingEnvironmentWebHostingPlans(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getManagedHostingEnvironmentWebHostingPlansAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

}
