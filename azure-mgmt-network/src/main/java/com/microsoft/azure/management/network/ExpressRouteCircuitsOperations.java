/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ExpressRouteCircuit;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitArpTable;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitRoutesTable;
import com.microsoft.azure.management.network.models.ExpressRouteCircuitStats;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteCircuitsOperations.
 */
public interface ExpressRouteCircuitsOperations {
    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String circuitName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String circuitName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete ExpressRouteCircuit operation deletes the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route Circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String circuitName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get ExpressRouteCircuit operation retreives information about the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuit object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuit> get(String resourceGroupName, String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get ExpressRouteCircuit operation retreives information about the specified ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String circuitName, final ServiceCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuit object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuit> createOrUpdate(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters, final ServiceCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuit object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ExpressRouteCircuit> beginCreateOrUpdate(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put ExpressRouteCircuit operation creates/updates a ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param parameters Parameters supplied to the create/delete ExpressRouteCircuit operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, ExpressRouteCircuit parameters, final ServiceCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitArpTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitArpTable>> listArpTable(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listArpTableAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitArpTable> serviceCallback) throws IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitRoutesTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitRoutesTable>> listRoutesTable(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listRoutesTableAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitRoutesTable> serviceCallback) throws IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the loadBalancer.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitStats&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuitStats>> listStats(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the loadBalancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listStatsAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitStats> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuit>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteCircuit>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitArpTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitArpTable>> listArpTableNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListArpTable from ExpressRouteCircuit opertion retrieves the currently advertised arp table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listArpTableNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuitArpTable> serviceCallback) throws IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitRoutesTable&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitRoutesTable>> listRoutesTableNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The ListRoutesTable from ExpressRouteCircuit opertion retrieves the currently advertised routes table associated with the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listRoutesTableNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuitRoutesTable> serviceCallback) throws IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitStats&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitStats>> listStatsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Liststats ExpressRouteCircuit opertion retrieves all the stats from a ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listStatsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuitStats> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuit>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuit&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuit>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteCircuit opertion retrieves all the ExpressRouteCircuits in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteCircuit> serviceCallback) throws IllegalArgumentException;

}
