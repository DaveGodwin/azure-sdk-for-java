/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.Route;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in RoutesOperations.
 */
public interface RoutesOperations {
    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Route object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Route> get(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Route object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Route> createOrUpdate(String resourceGroupName, String routeTableName, String routeName, Route routeParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, Route routeParameters, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Route object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Route> beginCreateOrUpdate(String resourceGroupName, String routeTableName, String routeName, Route routeParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, Route routeParameters, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Route&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Route>> list(final String resourceGroupName, final String routeTableName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final String routeTableName, final ListOperationCallback<Route> serviceCallback) throws IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Route&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Route>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Route> serviceCallback) throws IllegalArgumentException;

}
