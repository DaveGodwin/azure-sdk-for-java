/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.LoadBalancer;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in LoadBalancersOperations.
 */
public interface LoadBalancersOperations {
    /**
     * The delete loadbalancer operation deletes the specified loadbalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String loadBalancerName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete loadbalancer operation deletes the specified loadbalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String loadBalancerName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete loadbalancer operation deletes the specified loadbalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String loadBalancerName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete loadbalancer operation deletes the specified loadbalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String loadBalancerName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LoadBalancer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LoadBalancer> get(String resourceGroupName, String loadBalancerName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ntework interface operation retreives information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String loadBalancerName, String expand, final ServiceCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put LoadBalancer operation creates/updates a LoadBalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param parameters Parameters supplied to the create/delete LoadBalancer operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the LoadBalancer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LoadBalancer> createOrUpdate(String resourceGroupName, String loadBalancerName, LoadBalancer parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put LoadBalancer operation creates/updates a LoadBalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param parameters Parameters supplied to the create/delete LoadBalancer operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String loadBalancerName, LoadBalancer parameters, final ServiceCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put LoadBalancer operation creates/updates a LoadBalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param parameters Parameters supplied to the create/delete LoadBalancer operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LoadBalancer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LoadBalancer> beginCreateOrUpdate(String resourceGroupName, String loadBalancerName, LoadBalancer parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put LoadBalancer operation creates/updates a LoadBalancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the loadBalancer.
     * @param parameters Parameters supplied to the create/delete LoadBalancer operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String loadBalancerName, LoadBalancer parameters, final ServiceCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LoadBalancer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<LoadBalancer>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LoadBalancer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<LoadBalancer>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LoadBalancer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<LoadBalancer>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LoadBalancer&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<LoadBalancer>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List loadBalancer opertion retrieves all the loadbalancers in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<LoadBalancer> serviceCallback) throws IllegalArgumentException;

}
