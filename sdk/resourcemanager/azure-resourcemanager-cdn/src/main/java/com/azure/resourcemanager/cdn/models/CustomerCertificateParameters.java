// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Customer Certificate used for https. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomerCertificate")
@Fluent
public final class CustomerCertificateParameters extends SecretParameters {
    /*
     * Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
     */
    @JsonProperty(value = "secretSource", required = true)
    private ResourceReference secretSource;

    /*
     * Version of the secret to be used
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /*
     * Whether to use the latest version for the certificate
     */
    @JsonProperty(value = "useLatestVersion")
    private Boolean useLatestVersion;

    /*
     * Subject name in the certificate.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String expirationDate;

    /*
     * Certificate issuing authority.
     */
    @JsonProperty(value = "certificateAuthority", access = JsonProperty.Access.WRITE_ONLY)
    private String certificateAuthority;

    /*
     * The list of SANs.
     */
    @JsonProperty(value = "subjectAlternativeNames")
    private List<String> subjectAlternativeNames;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /** Creates an instance of CustomerCertificateParameters class. */
    public CustomerCertificateParameters() {
    }

    /**
     * Get the secretSource property: Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @return the secretSource value.
     */
    public ResourceReference secretSource() {
        return this.secretSource;
    }

    /**
     * Set the secretSource property: Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @param secretSource the secretSource value to set.
     * @return the CustomerCertificateParameters object itself.
     */
    public CustomerCertificateParameters withSecretSource(ResourceReference secretSource) {
        this.secretSource = secretSource;
        return this;
    }

    /**
     * Get the secretVersion property: Version of the secret to be used.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: Version of the secret to be used.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the CustomerCertificateParameters object itself.
     */
    public CustomerCertificateParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @return the useLatestVersion value.
     */
    public Boolean useLatestVersion() {
        return this.useLatestVersion;
    }

    /**
     * Set the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @param useLatestVersion the useLatestVersion value to set.
     * @return the CustomerCertificateParameters object itself.
     */
    public CustomerCertificateParameters withUseLatestVersion(Boolean useLatestVersion) {
        this.useLatestVersion = useLatestVersion;
        return this;
    }

    /**
     * Get the subject property: Subject name in the certificate.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the certificateAuthority property: Certificate issuing authority.
     *
     * @return the certificateAuthority value.
     */
    public String certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Get the subjectAlternativeNames property: The list of SANs.
     *
     * @return the subjectAlternativeNames value.
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * Set the subjectAlternativeNames property: The list of SANs.
     *
     * @param subjectAlternativeNames the subjectAlternativeNames value to set.
     * @return the CustomerCertificateParameters object itself.
     */
    public CustomerCertificateParameters withSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (secretSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretSource in model CustomerCertificateParameters"));
        } else {
            secretSource().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomerCertificateParameters.class);
}
