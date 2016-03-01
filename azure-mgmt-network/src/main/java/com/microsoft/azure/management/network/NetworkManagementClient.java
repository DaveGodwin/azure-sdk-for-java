/**
 * Object]
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.network.models.DnsNameAvailabilityResult;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/**
 * The interface for NetworkManagementClient class.
 */
public interface NetworkManagementClient {
    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return the BaseUrl object.
     */
    AutoRestBaseUrl getBaseUrl();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets Gets Azure subscription credentials..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @param subscriptionId the subscriptionId value.
     */
    void setSubscriptionId(String subscriptionId);

    /**
     * Gets Client Api Version..
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean getGenerateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    void setGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the ApplicationGatewaysOperations object to access its operations.
     * @return the ApplicationGatewaysOperations object.
     */
    ApplicationGatewaysOperations getApplicationGatewaysOperations();

    /**
     * Gets the ExpressRouteCircuitAuthorizationsOperations object to access its operations.
     * @return the ExpressRouteCircuitAuthorizationsOperations object.
     */
    ExpressRouteCircuitAuthorizationsOperations getExpressRouteCircuitAuthorizationsOperations();

    /**
     * Gets the ExpressRouteCircuitPeeringsOperations object to access its operations.
     * @return the ExpressRouteCircuitPeeringsOperations object.
     */
    ExpressRouteCircuitPeeringsOperations getExpressRouteCircuitPeeringsOperations();

    /**
     * Gets the ExpressRouteCircuitsOperations object to access its operations.
     * @return the ExpressRouteCircuitsOperations object.
     */
    ExpressRouteCircuitsOperations getExpressRouteCircuitsOperations();

    /**
     * Gets the ExpressRouteServiceProvidersOperations object to access its operations.
     * @return the ExpressRouteServiceProvidersOperations object.
     */
    ExpressRouteServiceProvidersOperations getExpressRouteServiceProvidersOperations();

    /**
     * Gets the LoadBalancersOperations object to access its operations.
     * @return the LoadBalancersOperations object.
     */
    LoadBalancersOperations getLoadBalancersOperations();

    /**
     * Gets the LocalNetworkGatewaysOperations object to access its operations.
     * @return the LocalNetworkGatewaysOperations object.
     */
    LocalNetworkGatewaysOperations getLocalNetworkGatewaysOperations();

    /**
     * Gets the NetworkInterfacesOperations object to access its operations.
     * @return the NetworkInterfacesOperations object.
     */
    NetworkInterfacesOperations getNetworkInterfacesOperations();

    /**
     * Gets the NetworkSecurityGroupsOperations object to access its operations.
     * @return the NetworkSecurityGroupsOperations object.
     */
    NetworkSecurityGroupsOperations getNetworkSecurityGroupsOperations();

    /**
     * Gets the PublicIPAddressesOperations object to access its operations.
     * @return the PublicIPAddressesOperations object.
     */
    PublicIPAddressesOperations getPublicIPAddressesOperations();

    /**
     * Gets the RouteTablesOperations object to access its operations.
     * @return the RouteTablesOperations object.
     */
    RouteTablesOperations getRouteTablesOperations();

    /**
     * Gets the RoutesOperations object to access its operations.
     * @return the RoutesOperations object.
     */
    RoutesOperations getRoutesOperations();

    /**
     * Gets the SecurityRulesOperations object to access its operations.
     * @return the SecurityRulesOperations object.
     */
    SecurityRulesOperations getSecurityRulesOperations();

    /**
     * Gets the SubnetsOperations object to access its operations.
     * @return the SubnetsOperations object.
     */
    SubnetsOperations getSubnetsOperations();

    /**
     * Gets the UsagesOperations object to access its operations.
     * @return the UsagesOperations object.
     */
    UsagesOperations getUsagesOperations();

    /**
     * Gets the VirtualNetworkGatewayConnectionsOperations object to access its operations.
     * @return the VirtualNetworkGatewayConnectionsOperations object.
     */
    VirtualNetworkGatewayConnectionsOperations getVirtualNetworkGatewayConnectionsOperations();

    /**
     * Gets the VirtualNetworkGatewaysOperations object to access its operations.
     * @return the VirtualNetworkGatewaysOperations object.
     */
    VirtualNetworkGatewaysOperations getVirtualNetworkGatewaysOperations();

    /**
     * Gets the VirtualNetworksOperations object to access its operations.
     * @return the VirtualNetworksOperations object.
     */
    VirtualNetworksOperations getVirtualNetworksOperations();

    /**
     * Checks whether a domain name in the cloudapp.net zone is available for use.
     *
     * @param location The location of the domain name
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DnsNameAvailabilityResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DnsNameAvailabilityResult> checkDnsNameAvailability(String location, String domainNameLabel) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Checks whether a domain name in the cloudapp.net zone is available for use.
     *
     * @param location The location of the domain name
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall checkDnsNameAvailabilityAsync(String location, String domainNameLabel, final ServiceCallback<DnsNameAvailabilityResult> serviceCallback) throws IllegalArgumentException;

}
