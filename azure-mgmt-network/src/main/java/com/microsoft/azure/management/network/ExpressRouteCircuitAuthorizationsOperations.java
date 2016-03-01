/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitAuthorization;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteCircuitAuthorizationsOperations.
 */
public interface ExpressRouteCircuitAuthorizationsOperations {
    /**
     * The delete authorization operation deletes the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String circuitName, String authorizationName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete authorization operation deletes the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String circuitName, String authorizationName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete authorization operation deletes the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String circuitName, String authorizationName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete authorization operation deletes the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String circuitName, String authorizationName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The GET authorization operation retrieves the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitAuthorization object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitAuthorization> get(String resourceGroupName, String circuitName, String authorizationName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The GET authorization operation retrieves the specified authorization from the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String circuitName, String authorizationName, final ServiceCallback<ExpressRouteCircuitAuthorization> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Authorization operation creates/updates an authorization in thespecified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create/update ExpressRouteCircuitAuthorization operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuitAuthorization object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitAuthorization> createOrUpdate(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorization authorizationParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put Authorization operation creates/updates an authorization in thespecified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create/update ExpressRouteCircuitAuthorization operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorization authorizationParameters, final ServiceCallback<ExpressRouteCircuitAuthorization> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Authorization operation creates/updates an authorization in thespecified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create/update ExpressRouteCircuitAuthorization operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitAuthorization object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuitAuthorization> beginCreateOrUpdate(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorization authorizationParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put Authorization operation creates/updates an authorization in thespecified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create/update ExpressRouteCircuitAuthorization operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String authorizationName, ExpressRouteCircuitAuthorization authorizationParameters, final ServiceCallback<ExpressRouteCircuitAuthorization> serviceCallback) throws IllegalArgumentException;

    /**
     * The List authorization operation retrieves all the authorizations in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitAuthorization&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitAuthorization>> list(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List authorization operation retrieves all the authorizations in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitAuthorization> serviceCallback) throws IllegalArgumentException;

    /**
     * The List authorization operation retrieves all the authorizations in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitAuthorization&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitAuthorization>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List authorization operation retrieves all the authorizations in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuitAuthorization> serviceCallback) throws IllegalArgumentException;

}
