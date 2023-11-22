// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.datafactory.fluent.PipelineRunsClient;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunInner;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.RunFilterParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PipelineRunsClient.
 */
public final class PipelineRunsClientImpl implements PipelineRunsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PipelineRunsService service;

    /**
     * The service client containing this operation class.
     */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of PipelineRunsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PipelineRunsClientImpl(DataFactoryManagementClientImpl client) {
        this.service
            = RestProxy.create(PipelineRunsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientPipelineRuns to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    public interface PipelineRunsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/queryPipelineRuns")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PipelineRunsQueryResponseInner>> queryByFactory(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RunFilterParameters filterParameters, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/pipelineruns/{runId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PipelineRunInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @PathParam("runId") String runId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/pipelineruns/{runId}/cancel")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> cancel(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @PathParam("runId") String runId, @QueryParam("isRecursive") Boolean isRecursive,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PipelineRunsQueryResponseInner>> queryByFactoryWithResponseAsync(String resourceGroupName,
        String factoryName, RunFilterParameters filterParameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (filterParameters == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter filterParameters is required and cannot be null."));
        } else {
            filterParameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.queryByFactory(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, this.client.getApiVersion(), filterParameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PipelineRunsQueryResponseInner>> queryByFactoryWithResponseAsync(String resourceGroupName,
        String factoryName, RunFilterParameters filterParameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (filterParameters == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter filterParameters is required and cannot be null."));
        } else {
            filterParameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.queryByFactory(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            factoryName, this.client.getApiVersion(), filterParameters, accept, context);
    }

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PipelineRunsQueryResponseInner> queryByFactoryAsync(String resourceGroupName, String factoryName,
        RunFilterParameters filterParameters) {
        return queryByFactoryWithResponseAsync(resourceGroupName, factoryName, filterParameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineRunsQueryResponseInner> queryByFactoryWithResponse(String resourceGroupName,
        String factoryName, RunFilterParameters filterParameters, Context context) {
        return queryByFactoryWithResponseAsync(resourceGroupName, factoryName, filterParameters, context).block();
    }

    /**
     * Query pipeline runs in the factory based on input filter conditions.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list pipeline runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineRunsQueryResponseInner queryByFactory(String resourceGroupName, String factoryName,
        RunFilterParameters filterParameters) {
        return queryByFactoryWithResponse(resourceGroupName, factoryName, filterParameters, Context.NONE).getValue();
    }

    /**
     * Get a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PipelineRunInner>> getWithResponseAsync(String resourceGroupName, String factoryName,
        String runId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, runId, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PipelineRunInner>> getWithResponseAsync(String resourceGroupName, String factoryName,
        String runId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, factoryName,
            runId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PipelineRunInner> getAsync(String resourceGroupName, String factoryName, String runId) {
        return getWithResponseAsync(resourceGroupName, factoryName, runId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PipelineRunInner> getWithResponse(String resourceGroupName, String factoryName, String runId,
        Context context) {
        return getWithResponseAsync(resourceGroupName, factoryName, runId, context).block();
    }

    /**
     * Get a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline run by its run ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PipelineRunInner get(String resourceGroupName, String factoryName, String runId) {
        return getWithResponse(resourceGroupName, factoryName, runId, Context.NONE).getValue();
    }

    /**
     * Cancel a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> cancelWithResponseAsync(String resourceGroupName, String factoryName, String runId,
        Boolean isRecursive) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.cancel(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, runId, isRecursive, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Cancel a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> cancelWithResponseAsync(String resourceGroupName, String factoryName, String runId,
        Boolean isRecursive, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (runId == null) {
            return Mono.error(new IllegalArgumentException("Parameter runId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.cancel(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            factoryName, runId, isRecursive, this.client.getApiVersion(), accept, context);
    }

    /**
     * Cancel a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> cancelAsync(String resourceGroupName, String factoryName, String runId) {
        final Boolean isRecursive = null;
        return cancelWithResponseAsync(resourceGroupName, factoryName, runId, isRecursive)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Cancel a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @param isRecursive If true, cancel all the Child pipelines that are triggered by the current pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelWithResponse(String resourceGroupName, String factoryName, String runId,
        Boolean isRecursive, Context context) {
        return cancelWithResponseAsync(resourceGroupName, factoryName, runId, isRecursive, context).block();
    }

    /**
     * Cancel a pipeline run by its run ID.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String factoryName, String runId) {
        final Boolean isRecursive = null;
        cancelWithResponse(resourceGroupName, factoryName, runId, isRecursive, Context.NONE);
    }
}
