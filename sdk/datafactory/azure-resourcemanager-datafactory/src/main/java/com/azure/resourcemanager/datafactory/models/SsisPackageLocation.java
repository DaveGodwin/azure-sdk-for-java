// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.SsisPackageLocationTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * SSIS package location.
 */
@Fluent
public final class SsisPackageLocation {
    /*
     * The SSIS package path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "packagePath")
    private Object packagePath;

    /*
     * The type of SSIS package location.
     */
    @JsonProperty(value = "type")
    private SsisPackageLocationType type;

    /*
     * SSIS package location properties.
     */
    @JsonProperty(value = "typeProperties")
    private SsisPackageLocationTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SsisPackageLocation class.
     */
    public SsisPackageLocation() {
    }

    /**
     * Get the packagePath property: The SSIS package path. Type: string (or Expression with resultType string).
     * 
     * @return the packagePath value.
     */
    public Object packagePath() {
        return this.packagePath;
    }

    /**
     * Set the packagePath property: The SSIS package path. Type: string (or Expression with resultType string).
     * 
     * @param packagePath the packagePath value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get the type property: The type of SSIS package location.
     * 
     * @return the type value.
     */
    public SsisPackageLocationType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of SSIS package location.
     * 
     * @param type the type value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withType(SsisPackageLocationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerTypeProperties property: SSIS package location properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SsisPackageLocationTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the packagePassword property: Password of the package.
     * 
     * @return the packagePassword value.
     */
    public SecretBase packagePassword() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packagePassword();
    }

    /**
     * Set the packagePassword property: Password of the package.
     * 
     * @param packagePassword the packagePassword value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackagePassword(SecretBase packagePassword) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withPackagePassword(packagePassword);
        return this;
    }

    /**
     * Get the accessCredential property: The package access credential.
     * 
     * @return the accessCredential value.
     */
    public SsisAccessCredential accessCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessCredential();
    }

    /**
     * Set the accessCredential property: The package access credential.
     * 
     * @param accessCredential the accessCredential value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withAccessCredential(SsisAccessCredential accessCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withAccessCredential(accessCredential);
        return this;
    }

    /**
     * Get the configurationPath property: The configuration file of the package execution. Type: string (or Expression
     * with resultType string).
     * 
     * @return the configurationPath value.
     */
    public Object configurationPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().configurationPath();
    }

    /**
     * Set the configurationPath property: The configuration file of the package execution. Type: string (or Expression
     * with resultType string).
     * 
     * @param configurationPath the configurationPath value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withConfigurationPath(Object configurationPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withConfigurationPath(configurationPath);
        return this;
    }

    /**
     * Get the configurationAccessCredential property: The configuration file access credential.
     * 
     * @return the configurationAccessCredential value.
     */
    public SsisAccessCredential configurationAccessCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().configurationAccessCredential();
    }

    /**
     * Set the configurationAccessCredential property: The configuration file access credential.
     * 
     * @param configurationAccessCredential the configurationAccessCredential value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withConfigurationAccessCredential(SsisAccessCredential configurationAccessCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withConfigurationAccessCredential(configurationAccessCredential);
        return this;
    }

    /**
     * Get the packageName property: The package name.
     * 
     * @return the packageName value.
     */
    public String packageName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageName();
    }

    /**
     * Set the packageName property: The package name.
     * 
     * @param packageName the packageName value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageName(String packageName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withPackageName(packageName);
        return this;
    }

    /**
     * Get the packageContent property: The embedded package content. Type: string (or Expression with resultType
     * string).
     * 
     * @return the packageContent value.
     */
    public Object packageContent() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageContent();
    }

    /**
     * Set the packageContent property: The embedded package content. Type: string (or Expression with resultType
     * string).
     * 
     * @param packageContent the packageContent value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageContent(Object packageContent) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withPackageContent(packageContent);
        return this;
    }

    /**
     * Get the packageLastModifiedDate property: The embedded package last modified date.
     * 
     * @return the packageLastModifiedDate value.
     */
    public String packageLastModifiedDate() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageLastModifiedDate();
    }

    /**
     * Set the packageLastModifiedDate property: The embedded package last modified date.
     * 
     * @param packageLastModifiedDate the packageLastModifiedDate value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageLastModifiedDate(String packageLastModifiedDate) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withPackageLastModifiedDate(packageLastModifiedDate);
        return this;
    }

    /**
     * Get the childPackages property: The embedded child package list.
     * 
     * @return the childPackages value.
     */
    public List<SsisChildPackage> childPackages() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().childPackages();
    }

    /**
     * Set the childPackages property: The embedded child package list.
     * 
     * @param childPackages the childPackages value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withChildPackages(List<SsisChildPackage> childPackages) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SsisPackageLocationTypeProperties();
        }
        this.innerTypeProperties().withChildPackages(childPackages);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
