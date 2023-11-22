// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AmazonS3CompatibleLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Linked service for Amazon S3 Compatible.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3Compatible")
@Fluent
public final class AmazonS3CompatibleLinkedService extends LinkedService {
    /*
     * Amazon S3 Compatible linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AmazonS3CompatibleLinkedServiceTypeProperties innerTypeProperties
        = new AmazonS3CompatibleLinkedServiceTypeProperties();

    /**
     * Creates an instance of AmazonS3CompatibleLinkedService class.
     */
    public AmazonS3CompatibleLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Amazon S3 Compatible linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AmazonS3CompatibleLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmazonS3CompatibleLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessKeyId();
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     * @param accessKeyId the accessKeyId value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withAccessKeyId(Object accessKeyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     * 
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().secretAccessKey();
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Amazon S3 Compatible Identity and Access
     * Management (IAM) user.
     * 
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withSecretAccessKey(SecretBase secretAccessKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible
     * Connector. This is an optional property; change it only if you want to try a different service endpoint or want
     * to switch between https and http. Type: string (or Expression with resultType string).
     * 
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceUrl();
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the Amazon S3 Compatible
     * Connector. This is an optional property; change it only if you want to try a different service endpoint or want
     * to switch between https and http. Type: string (or Expression with resultType string).
     * 
     * @param serviceUrl the serviceUrl value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withServiceUrl(Object serviceUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServiceUrl(serviceUrl);
        return this;
    }

    /**
     * Get the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the forcePathStyle value.
     */
    public Object forcePathStyle() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().forcePathStyle();
    }

    /**
     * Set the forcePathStyle property: If true, use S3 path-style access instead of virtual hosted-style access.
     * Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param forcePathStyle the forcePathStyle value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withForcePathStyle(Object forcePathStyle) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withForcePathStyle(forcePathStyle);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AmazonS3CompatibleLinkedService object itself.
     */
    public AmazonS3CompatibleLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AmazonS3CompatibleLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model AmazonS3CompatibleLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AmazonS3CompatibleLinkedService.class);
}
