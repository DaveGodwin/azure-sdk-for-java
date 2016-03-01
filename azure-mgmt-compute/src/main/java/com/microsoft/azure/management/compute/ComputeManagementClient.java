/**
 * Object]
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/**
 * The interface for ComputeManagementClient class.
 */
public interface ComputeManagementClient {
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
     * Gets the AvailabilitySetsOperations object to access its operations.
     * @return the AvailabilitySetsOperations object.
     */
    AvailabilitySetsOperations getAvailabilitySetsOperations();

    /**
     * Gets the VirtualMachineExtensionImagesOperations object to access its operations.
     * @return the VirtualMachineExtensionImagesOperations object.
     */
    VirtualMachineExtensionImagesOperations getVirtualMachineExtensionImagesOperations();

    /**
     * Gets the VirtualMachineExtensionsOperations object to access its operations.
     * @return the VirtualMachineExtensionsOperations object.
     */
    VirtualMachineExtensionsOperations getVirtualMachineExtensionsOperations();

    /**
     * Gets the VirtualMachineImagesOperations object to access its operations.
     * @return the VirtualMachineImagesOperations object.
     */
    VirtualMachineImagesOperations getVirtualMachineImagesOperations();

    /**
     * Gets the UsageOperations object to access its operations.
     * @return the UsageOperations object.
     */
    UsageOperations getUsageOperations();

    /**
     * Gets the VirtualMachineSizesOperations object to access its operations.
     * @return the VirtualMachineSizesOperations object.
     */
    VirtualMachineSizesOperations getVirtualMachineSizesOperations();

    /**
     * Gets the VirtualMachinesOperations object to access its operations.
     * @return the VirtualMachinesOperations object.
     */
    VirtualMachinesOperations getVirtualMachinesOperations();

    /**
     * Gets the VirtualMachineScaleSetsOperations object to access its operations.
     * @return the VirtualMachineScaleSetsOperations object.
     */
    VirtualMachineScaleSetsOperations getVirtualMachineScaleSetsOperations();

    /**
     * Gets the VirtualMachineScaleSetVMsOperations object to access its operations.
     * @return the VirtualMachineScaleSetVMsOperations object.
     */
    VirtualMachineScaleSetVMsOperations getVirtualMachineScaleSetVMsOperations();

}
