/**
 * Object]
 */

package com.microsoft.azure.management.compute;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.compute.models.PageImpl;
import com.microsoft.azure.management.compute.models.VirtualMachineScaleSetVM;
import com.microsoft.azure.management.compute.models.VirtualMachineScaleSetVMInstanceView;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineScaleSetVMsOperations.
 */
public final class VirtualMachineScaleSetVMsOperationsImpl implements VirtualMachineScaleSetVMsOperations {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineScaleSetVMsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClient client;

    /**
     * Initializes an instance of VirtualMachineScaleSetVMsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetVMsOperationsImpl(Retrofit retrofit, ComputeManagementClient client) {
        this.service = retrofit.create(VirtualMachineScaleSetVMsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineScaleSetVMsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineScaleSetVMsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/reimage")
        Call<ResponseBody> reimage(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/reimage")
        Call<ResponseBody> beginReimage(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/deallocate")
        Call<ResponseBody> deallocate(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/deallocate")
        Call<ResponseBody> beginDeallocate(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/instanceView")
        Call<ResponseBody> getInstanceView(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{virtualMachineScaleSetName}/virtualMachines")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("virtualMachineScaleSetName") String virtualMachineScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$select") String select, @Query("$expand") String expand, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/poweroff")
        Call<ResponseBody> powerOff(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/poweroff")
        Call<ResponseBody> beginPowerOff(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/restart")
        Call<ResponseBody> restart(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/restart")
        Call<ResponseBody> beginRestart(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/start")
        Call<ResponseBody> start(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId}/start")
        Call<ResponseBody> beginStart(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }

    /**
     * The operation to re-image a virtual machine scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> reimage(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.reimage(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to re-image a virtual machine scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall reimageAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.reimage(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to re-image a virtual machine scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginReimage(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginReimage(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginReimageDelegate(call.execute());
    }

    /**
     * The operation to re-image a virtual machine scale set instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginReimageAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginReimage(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginReimageDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginReimageDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to deallocate a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> deallocate(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.deallocate(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to deallocate a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall deallocateAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.deallocate(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to deallocate a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDeallocate(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginDeallocate(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginDeallocateDelegate(call.execute());
    }

    /**
     * The operation to deallocate a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginDeallocateAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginDeallocate(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginDeallocateDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginDeallocateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.delete(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginDeleteDelegate(call.execute());
    }

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginDeleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to get a virtual machine scale set virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineScaleSetVM object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualMachineScaleSetVM> get(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * The operation to get a virtual machine scale set virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<VirtualMachineScaleSetVM> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.get(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VirtualMachineScaleSetVM>(serviceCallback) {
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

    private ServiceResponse<VirtualMachineScaleSetVM> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualMachineScaleSetVM, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VirtualMachineScaleSetVM>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to get a virtual machine scale set virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineScaleSetVMInstanceView object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualMachineScaleSetVMInstanceView> getInstanceView(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getInstanceView(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getInstanceViewDelegate(call.execute());
    }

    /**
     * The operation to get a virtual machine scale set virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInstanceViewAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<VirtualMachineScaleSetVMInstanceView> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.getInstanceView(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VirtualMachineScaleSetVMInstanceView>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInstanceViewDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VirtualMachineScaleSetVMInstanceView> getInstanceViewDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualMachineScaleSetVMInstanceView, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VirtualMachineScaleSetVMInstanceView>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to list virtual machine scale sets VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param filter The filter to apply on the operation.
     * @param select The list parameters.
     * @param expand The expand expression to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSetVM&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VirtualMachineScaleSetVM>> list(final String resourceGroupName, final String virtualMachineScaleSetName, final VirtualMachineScaleSetVM filter, final String select, final String expand) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualMachineScaleSetName == null) {
            throw new IllegalArgumentException("Parameter virtualMachineScaleSetName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(filter);
        Call<ResponseBody> call = service.list(resourceGroupName, virtualMachineScaleSetName, this.client.getSubscriptionId(), this.client.getMapperAdapter().serializeRaw(filter), select, expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> response = listDelegate(call.execute());
        List<VirtualMachineScaleSetVM> result = response.getBody().getItems();
        while (response.getBody().getNextPageLink() != null) {
            response = listNext(response.getBody().getNextPageLink());
            result.addAll(response.getBody().getItems());
        }
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * The operation to list virtual machine scale sets VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param filter The filter to apply on the operation.
     * @param select The list parameters.
     * @param expand The expand expression to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final String resourceGroupName, final String virtualMachineScaleSetName, final VirtualMachineScaleSetVM filter, final String select, final String expand, final ListOperationCallback<VirtualMachineScaleSetVM> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (virtualMachineScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualMachineScaleSetName is required and cannot be null."));
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
        Validator.validate(filter, serviceCallback);
        Call<ResponseBody> call = service.list(resourceGroupName, virtualMachineScaleSetName, this.client.getSubscriptionId(), this.client.getMapperAdapter().serializeRaw(filter), select, expand, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineScaleSetVM>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<VirtualMachineScaleSetVM>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<VirtualMachineScaleSetVM>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The operation to power off (stop) a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> powerOff(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.powerOff(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to power off (stop) a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall powerOffAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.powerOff(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to power off (stop) a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginPowerOff(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginPowerOff(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginPowerOffDelegate(call.execute());
    }

    /**
     * The operation to power off (stop) a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginPowerOffAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginPowerOff(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginPowerOffDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginPowerOffDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to restart a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> restart(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.restart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to restart a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall restartAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.restart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to restart a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginRestart(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginRestart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginRestartDelegate(call.execute());
    }

    /**
     * The operation to restart a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginRestartAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginRestart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginRestartDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginRestartDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to start a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> start(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.start(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The operation to start a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall startAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.start(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
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
     * The operation to start a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginStart(String resourceGroupName, String vmScaleSetName, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginStart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginStartDelegate(call.execute());
    }

    /**
     * The operation to start a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param instanceId The instance id of the virtual machine.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginStartAsync(String resourceGroupName, String vmScaleSetName, String instanceId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (vmScaleSetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginStart(resourceGroupName, vmScaleSetName, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginStartDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginStartDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The operation to list virtual machine scale sets VMs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineScaleSetVM&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute());
    }

    /**
     * The operation to list virtual machine scale sets VMs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualMachineScaleSetVM> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<VirtualMachineScaleSetVM>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl<VirtualMachineScaleSetVM>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<VirtualMachineScaleSetVM>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<VirtualMachineScaleSetVM>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
