/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.CsmMoveResourceEnvelope;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in GlobalResourceGroupsOperations.
 */
public final class GlobalResourceGroupsOperationsImpl implements GlobalResourceGroupsOperations {
    /** The Retrofit service to perform REST calls. */
    private GlobalResourceGroupsService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClient client;

    /**
     * Initializes an instance of GlobalResourceGroupsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GlobalResourceGroupsOperationsImpl(Retrofit retrofit, WebSiteManagementClient client) {
        this.service = retrofit.create(GlobalResourceGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for GlobalResourceGroupsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GlobalResourceGroupsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/moveResources")
        Call<ResponseBody> moveResources(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Body CsmMoveResourceEnvelope moveResourceEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     *
     * @param resourceGroupName the String value
     * @param moveResourceEnvelope the CsmMoveResourceEnvelope value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> moveResources(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (moveResourceEnvelope == null) {
            throw new IllegalArgumentException("Parameter moveResourceEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(moveResourceEnvelope);
        Call<ResponseBody> call = service.moveResources(resourceGroupName, this.client.getSubscriptionId(), moveResourceEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return moveResourcesDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param moveResourceEnvelope the CsmMoveResourceEnvelope value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall moveResourcesAsync(String resourceGroupName, CsmMoveResourceEnvelope moveResourceEnvelope, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (moveResourceEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter moveResourceEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(moveResourceEnvelope, serviceCallback);
        Call<ResponseBody> call = service.moveResources(resourceGroupName, this.client.getSubscriptionId(), moveResourceEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(moveResourcesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> moveResourcesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
