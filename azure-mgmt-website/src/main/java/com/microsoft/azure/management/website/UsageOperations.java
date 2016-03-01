/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in UsageOperations.
 */
public interface UsageOperations {
    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group
     * @param environmentName Environment name
     * @param lastId Last marker that was returned from the batch
     * @param batchSize size of the batch to be returned.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getUsage(String resourceGroupName, String environmentName, String lastId, int batchSize) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group
     * @param environmentName Environment name
     * @param lastId Last marker that was returned from the batch
     * @param batchSize size of the batch to be returned.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getUsageAsync(String resourceGroupName, String environmentName, String lastId, int batchSize, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

}
