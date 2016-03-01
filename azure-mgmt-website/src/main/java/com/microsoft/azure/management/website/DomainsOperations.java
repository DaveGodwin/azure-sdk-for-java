/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.Domain;
import com.microsoft.azure.management.website.models.DomainCollection;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in DomainsOperations.
 */
public interface DomainsOperations {
    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DomainCollection> getDomains(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDomainsAsync(String resourceGroupName, final ServiceCallback<DomainCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Domain> getDomain(String resourceGroupName, String domainName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDomainAsync(String resourceGroupName, String domainName, final ServiceCallback<Domain> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Domain> createOrUpdateDomain(String resourceGroupName, String domainName, Domain domain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateDomainAsync(String resourceGroupName, String domainName, Domain domain, final ServiceCallback<Domain> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteDomain(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteDomainAsync(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Domain> updateDomain(String resourceGroupName, String domainName, Domain domain) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateDomainAsync(String resourceGroupName, String domainName, Domain domain, final ServiceCallback<Domain> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Domain object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Domain> getDomainOperation(String resourceGroupName, String domainName, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDomainOperationAsync(String resourceGroupName, String domainName, String operationId, final ServiceCallback<Domain> serviceCallback) throws IllegalArgumentException;

}
