/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.NetworkSecurityGroup;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkSecurityGroupsOperations.
 */
public interface NetworkSecurityGroupsOperations {
    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String networkSecurityGroupName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String networkSecurityGroupName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String networkSecurityGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Delete NetworkSecurityGroup operation deletes the specifed network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String networkSecurityGroupName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkSecurityGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkSecurityGroup> get(String resourceGroupName, String networkSecurityGroupName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get NetworkSecurityGroups operation retrieves information about the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String networkSecurityGroupName, String expand, final ServiceCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the NetworkSecurityGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkSecurityGroup> createOrUpdate(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, final ServiceCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkSecurityGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkSecurityGroup> beginCreateOrUpdate(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put NetworkSecurityGroup operation creates/updates a network security groupin the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkSecurityGroupName The name of the network security group.
     * @param parameters Parameters supplied to the create/update Network Security Group operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String networkSecurityGroupName, NetworkSecurityGroup parameters, final ServiceCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkSecurityGroup>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<NetworkSecurityGroup>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkSecurityGroup>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;NetworkSecurityGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<NetworkSecurityGroup>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list NetworkSecurityGroups returns all network security groups in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<NetworkSecurityGroup> serviceCallback) throws IllegalArgumentException;

}
