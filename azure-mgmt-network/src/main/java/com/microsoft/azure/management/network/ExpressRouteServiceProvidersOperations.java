/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ExpressRouteServiceProvider;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteServiceProvidersOperations.
 */
public interface ExpressRouteServiceProvidersOperations {
    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteServiceProvider&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ExpressRouteServiceProvider>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<ExpressRouteServiceProvider> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteServiceProvider&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteServiceProvider>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ExpressRouteServiceProvider opertion retrieves all the available ExpressRouteServiceProviders.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ExpressRouteServiceProvider> serviceCallback) throws IllegalArgumentException;

}
