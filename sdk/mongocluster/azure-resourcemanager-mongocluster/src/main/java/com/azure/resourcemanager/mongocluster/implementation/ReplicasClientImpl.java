// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.mongocluster.fluent.ReplicasClient;
import com.azure.resourcemanager.mongocluster.fluent.models.ReplicaInner;
import com.azure.resourcemanager.mongocluster.implementation.models.ReplicaListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReplicasClient.
 */
public final class ReplicasClientImpl implements ReplicasClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ReplicasService service;

    /**
     * The service client containing this operation class.
     */
    private final MongoClusterManagementClientImpl client;

    /**
     * Initializes an instance of ReplicasClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ReplicasClientImpl(MongoClusterManagementClientImpl client) {
        this.service = RestProxy.create(ReplicasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MongoClusterManagementClientReplicas to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "MongoClusterManageme")
    public interface ReplicasService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/mongoClusters/{mongoClusterName}/replicas")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicaListResult>> listByParent(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("mongoClusterName") String mongoClusterName, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ReplicaListResult>> listByParentNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicaInner>> listByParentSinglePageAsync(String resourceGroupName,
        String mongoClusterName) {
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
        if (mongoClusterName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter mongoClusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByParent(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, mongoClusterName, accept, context))
            .<PagedResponse<ReplicaInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicaInner>> listByParentSinglePageAsync(String resourceGroupName,
        String mongoClusterName, Context context) {
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
        if (mongoClusterName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter mongoClusterName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByParent(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, mongoClusterName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReplicaInner> listByParentAsync(String resourceGroupName, String mongoClusterName) {
        return new PagedFlux<>(() -> listByParentSinglePageAsync(resourceGroupName, mongoClusterName),
            nextLink -> listByParentNextSinglePageAsync(nextLink));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ReplicaInner> listByParentAsync(String resourceGroupName, String mongoClusterName,
        Context context) {
        return new PagedFlux<>(() -> listByParentSinglePageAsync(resourceGroupName, mongoClusterName, context),
            nextLink -> listByParentNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicaInner> listByParent(String resourceGroupName, String mongoClusterName) {
        return new PagedIterable<>(listByParentAsync(resourceGroupName, mongoClusterName));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ReplicaInner> listByParent(String resourceGroupName, String mongoClusterName,
        Context context) {
        return new PagedIterable<>(listByParentAsync(resourceGroupName, mongoClusterName, context));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicaInner>> listByParentNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByParentNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ReplicaInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all the replicas for the mongo cluster.
     * 
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Replica list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ReplicaInner>> listByParentNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByParentNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
