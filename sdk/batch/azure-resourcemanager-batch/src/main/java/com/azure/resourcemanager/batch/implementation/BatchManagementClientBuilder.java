// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * A builder for creating a new instance of the BatchManagementClientImpl type.
 */
@ServiceClientBuilder(serviceClients = { BatchManagementClientImpl.class })
public final class BatchManagementClientBuilder {
    /*
     * The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000)
     */
    private String subscriptionId;

    /**
     * Sets The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /*
     * server parameter
     */
    private String endpoint;

    /**
     * Sets server parameter.
     * 
     * @param endpoint the endpoint value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     * 
     * @param environment the environment value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     * 
     * @param pipeline the pipeline value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     * 
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     * 
     * @param serializerAdapter the serializerAdapter value.
     * @return the BatchManagementClientBuilder.
     */
    public BatchManagementClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of BatchManagementClientImpl with the provided parameters.
     * 
     * @return an instance of BatchManagementClientImpl.
     */
    public BatchManagementClientImpl buildClient() {
        String localEndpoint = (endpoint != null) ? endpoint : "https://management.azure.com";
        AzureEnvironment localEnvironment = (environment != null) ? environment : AzureEnvironment.AZURE;
        HttpPipeline localPipeline = (pipeline != null)
            ? pipeline
            : new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build();
        Duration localDefaultPollInterval
            = (defaultPollInterval != null) ? defaultPollInterval : Duration.ofSeconds(30);
        SerializerAdapter localSerializerAdapter = (serializerAdapter != null)
            ? serializerAdapter
            : SerializerFactory.createDefaultManagementSerializerAdapter();
        BatchManagementClientImpl client = new BatchManagementClientImpl(localPipeline, localSerializerAdapter,
            localDefaultPollInterval, localEnvironment, this.subscriptionId, localEndpoint);
        return client;
    }
}
