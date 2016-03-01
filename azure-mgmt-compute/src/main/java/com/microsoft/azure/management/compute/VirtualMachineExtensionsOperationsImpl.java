/**
 * Object]
 */

package com.microsoft.azure.management.compute;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineExtension;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineExtensionsOperations.
 */
public final class VirtualMachineExtensionsOperationsImpl implements VirtualMachineExtensionsOperations {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineExtensionsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClient client;

    /**
     * Initializes an instance of VirtualMachineExtensionsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineExtensionsOperationsImpl(Retrofit retrofit, ComputeManagementClient client) {
        this.service = retrofit.create(VirtualMachineExtensionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineExtensionsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineExtensionsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineExtension extensionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Call<ResponseBody> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineExtension extensionParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachines/{vmName}/extensions/{vmExtensionName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("vmName") String vmName, @Path("vmExtensionName") String vmExtensionName, @Path("subscriptionId") String subscriptionId, @Query("$expand") String expand, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineExtension object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<VirtualMachineExtension> createOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (extensionParameters == null) {
            throw new IllegalArgumentException("Parameter extensionParameters is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(extensionParameters);
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<VirtualMachineExtension>() { }.getType());
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall createOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (extensionParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter extensionParameters is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(extensionParameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<VirtualMachineExtension>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualMachineExtension> beginCreateOrUpdate(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (extensionParameters == null) {
            throw new IllegalArgumentException("Parameter extensionParameters is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(extensionParameters);
        Call<ResponseBody> call = service.beginCreateOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginCreateOrUpdateDelegate(call.execute());
    }

    /**
     * The operation to create or update the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be create or updated.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param extensionParameters Parameters supplied to the Create Virtual Machine Extension operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String vmName, String vmExtensionName, VirtualMachineExtension extensionParameters, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
            return null;
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (extensionParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter extensionParameters is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(extensionParameters, serviceCallback);
        Call<ResponseBody> call = service.beginCreateOrUpdate(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), extensionParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VirtualMachineExtension>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginCreateOrUpdateDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VirtualMachineExtension> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualMachineExtension, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VirtualMachineExtension>() { }.getType())
                .register(201, new TypeToken<VirtualMachineExtension>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String vmName, String vmExtensionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.delete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall deleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String vmName, String vmExtensionName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginDeleteDelegate(call.execute());
    }

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the extension should be deleted.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginDeleteAsync(String resourceGroupName, String vmName, String vmExtensionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
            return null;
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginDeleteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtension object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualMachineExtension> get(String resourceGroupName, String vmName, String vmExtensionName, String expand) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmName == null) {
            throw new IllegalArgumentException("Parameter vmName is required and cannot be null.");
        }
        if (vmExtensionName == null) {
            throw new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @param vmExtensionName The name of the virtual machine extension.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String resourceGroupName, String vmName, String vmExtensionName, String expand, final ServiceCallback<VirtualMachineExtension> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmName is required and cannot be null."));
            return null;
        }
        if (vmExtensionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmExtensionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(resourceGroupName, vmName, vmExtensionName, this.client.getSubscriptionId(), expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VirtualMachineExtension>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VirtualMachineExtension> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualMachineExtension, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VirtualMachineExtension>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
