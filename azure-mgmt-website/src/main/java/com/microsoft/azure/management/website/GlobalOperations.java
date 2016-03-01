/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.CertificateCollection;
import com.microsoft.azure.management.website.models.ClassicMobileServiceCollection;
import com.microsoft.azure.management.website.models.GeoRegionCollection;
import com.microsoft.azure.management.website.models.HostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ManagedHostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ResourceNameAvailability;
import com.microsoft.azure.management.website.models.ResourceNameAvailabilityRequest;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.azure.management.website.models.User;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in GlobalOperations.
 */
public interface GlobalOperations {
    /**
     * Gets publishing credentials for the subscription owner.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> getSubscriptionPublishingCredentials() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets publishing credentials for the subscription owner.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSubscriptionPublishingCredentialsAsync(final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates publishing credentials for the subscription owner.
     *
     * @param requestMessage requestMessage with new publishing credentials
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> updateSubscriptionPublishingCredentials(User requestMessage) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates publishing credentials for the subscription owner.
     *
     * @param requestMessage requestMessage with new publishing credentials
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSubscriptionPublishingCredentialsAsync(User requestMessage, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets list of available geo regions.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the GeoRegionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<GeoRegionCollection> getSubscriptionGeoRegions() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of available geo regions.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSubscriptionGeoRegionsAsync(final ServiceCallback<GeoRegionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all certificates for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CertificateCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CertificateCollection> getAllCertificates() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all certificates for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllCertificatesAsync(final ServiceCallback<CertificateCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all App Service Plans for a subcription.
     *
     * @param detailed False to return a subset of App Service Plan properties, true to return all of the properties.
                 Retrieval of all properties may increase the API latency.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getAllServerFarms(Boolean detailed) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all App Service Plans for a subcription.
     *
     * @param detailed False to return a subset of App Service Plan properties, true to return all of the properties.
                 Retrieval of all properties may increase the API latency.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllServerFarmsAsync(Boolean detailed, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all Web Apps for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getAllSites() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all Web Apps for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllSitesAsync(final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all hostingEnvironments (App Service Environment) for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironmentCollection> getAllHostingEnvironments() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all hostingEnvironments (App Service Environment) for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllHostingEnvironmentsAsync(final ServiceCallback<HostingEnvironmentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all managed hosting environments for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagedHostingEnvironmentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ManagedHostingEnvironmentCollection> getAllManagedHostingEnvironments() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all managed hosting environments for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllManagedHostingEnvironmentsAsync(final ServiceCallback<ManagedHostingEnvironmentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all mobile services for a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ClassicMobileServiceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ClassicMobileServiceCollection> getAllClassicMobileServices() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all mobile services for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAllClassicMobileServicesAsync(final ServiceCallback<ClassicMobileServiceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List premier add on offers.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> listPremierAddOnOffers() throws CloudException, IOException, IllegalArgumentException;

    /**
     * List premier add on offers.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listPremierAddOnOffersAsync(final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> isHostingEnvironmentWithLegacyNameAvailable(String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall isHostingEnvironmentWithLegacyNameAvailableAsync(String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> isHostingEnvironmentNameAvailable(String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Whether hosting environment name is available.
     *
     * @param name Hosting environment name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall isHostingEnvironmentNameAvailableAsync(String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Check if resource name is available.
     *
     * @param request Name availability request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceNameAvailability object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceNameAvailability> checkNameAvailability(ResourceNameAvailabilityRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Check if resource name is available.
     *
     * @param request Name availability request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall checkNameAvailabilityAsync(ResourceNameAvailabilityRequest request, final ServiceCallback<ResourceNameAvailability> serviceCallback) throws IllegalArgumentException;

}
