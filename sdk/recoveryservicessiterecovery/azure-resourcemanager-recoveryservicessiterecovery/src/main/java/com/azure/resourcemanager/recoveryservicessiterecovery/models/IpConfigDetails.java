// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IpConfigDetails model. */
@Fluent
public final class IpConfigDetails {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The isPrimary property.
     */
    @JsonProperty(value = "isPrimary")
    private Boolean isPrimary;

    /*
     * The subnetName property.
     */
    @JsonProperty(value = "subnetName")
    private String subnetName;

    /*
     * The staticIPAddress property.
     */
    @JsonProperty(value = "staticIPAddress")
    private String staticIpAddress;

    /*
     * The ipAddressType property.
     */
    @JsonProperty(value = "ipAddressType")
    private String ipAddressType;

    /*
     * The isSeletedForFailover property.
     */
    @JsonProperty(value = "isSeletedForFailover")
    private Boolean isSeletedForFailover;

    /*
     * The recoverySubnetName property.
     */
    @JsonProperty(value = "recoverySubnetName")
    private String recoverySubnetName;

    /*
     * The recoveryStaticIPAddress property.
     */
    @JsonProperty(value = "recoveryStaticIPAddress")
    private String recoveryStaticIpAddress;

    /*
     * The recoveryIPAddressType property.
     */
    @JsonProperty(value = "recoveryIPAddressType")
    private String recoveryIpAddressType;

    /*
     * The recoveryPublicIPAddressId property.
     */
    @JsonProperty(value = "recoveryPublicIPAddressId")
    private String recoveryPublicIpAddressId;

    /*
     * The recoveryLBBackendAddressPoolIds property.
     */
    @JsonProperty(value = "recoveryLBBackendAddressPoolIds")
    private List<String> recoveryLBBackendAddressPoolIds;

    /*
     * The tfoSubnetName property.
     */
    @JsonProperty(value = "tfoSubnetName")
    private String tfoSubnetName;

    /*
     * The tfoStaticIPAddress property.
     */
    @JsonProperty(value = "tfoStaticIPAddress")
    private String tfoStaticIpAddress;

    /*
     * The tfoPublicIPAddressId property.
     */
    @JsonProperty(value = "tfoPublicIPAddressId")
    private String tfoPublicIpAddressId;

    /*
     * The tfoLBBackendAddressPoolIds property.
     */
    @JsonProperty(value = "tfoLBBackendAddressPoolIds")
    private List<String> tfoLBBackendAddressPoolIds;

    /** Creates an instance of IpConfigDetails class. */
    public IpConfigDetails() {
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isPrimary property: The isPrimary property.
     *
     * @return the isPrimary value.
     */
    public Boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set the isPrimary property: The isPrimary property.
     *
     * @param isPrimary the isPrimary value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Get the subnetName property: The subnetName property.
     *
     * @return the subnetName value.
     */
    public String subnetName() {
        return this.subnetName;
    }

    /**
     * Set the subnetName property: The subnetName property.
     *
     * @param subnetName the subnetName value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * Get the staticIpAddress property: The staticIPAddress property.
     *
     * @return the staticIpAddress value.
     */
    public String staticIpAddress() {
        return this.staticIpAddress;
    }

    /**
     * Set the staticIpAddress property: The staticIPAddress property.
     *
     * @param staticIpAddress the staticIpAddress value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withStaticIpAddress(String staticIpAddress) {
        this.staticIpAddress = staticIpAddress;
        return this;
    }

    /**
     * Get the ipAddressType property: The ipAddressType property.
     *
     * @return the ipAddressType value.
     */
    public String ipAddressType() {
        return this.ipAddressType;
    }

    /**
     * Set the ipAddressType property: The ipAddressType property.
     *
     * @param ipAddressType the ipAddressType value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
        return this;
    }

    /**
     * Get the isSeletedForFailover property: The isSeletedForFailover property.
     *
     * @return the isSeletedForFailover value.
     */
    public Boolean isSeletedForFailover() {
        return this.isSeletedForFailover;
    }

    /**
     * Set the isSeletedForFailover property: The isSeletedForFailover property.
     *
     * @param isSeletedForFailover the isSeletedForFailover value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withIsSeletedForFailover(Boolean isSeletedForFailover) {
        this.isSeletedForFailover = isSeletedForFailover;
        return this;
    }

    /**
     * Get the recoverySubnetName property: The recoverySubnetName property.
     *
     * @return the recoverySubnetName value.
     */
    public String recoverySubnetName() {
        return this.recoverySubnetName;
    }

    /**
     * Set the recoverySubnetName property: The recoverySubnetName property.
     *
     * @param recoverySubnetName the recoverySubnetName value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withRecoverySubnetName(String recoverySubnetName) {
        this.recoverySubnetName = recoverySubnetName;
        return this;
    }

    /**
     * Get the recoveryStaticIpAddress property: The recoveryStaticIPAddress property.
     *
     * @return the recoveryStaticIpAddress value.
     */
    public String recoveryStaticIpAddress() {
        return this.recoveryStaticIpAddress;
    }

    /**
     * Set the recoveryStaticIpAddress property: The recoveryStaticIPAddress property.
     *
     * @param recoveryStaticIpAddress the recoveryStaticIpAddress value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withRecoveryStaticIpAddress(String recoveryStaticIpAddress) {
        this.recoveryStaticIpAddress = recoveryStaticIpAddress;
        return this;
    }

    /**
     * Get the recoveryIpAddressType property: The recoveryIPAddressType property.
     *
     * @return the recoveryIpAddressType value.
     */
    public String recoveryIpAddressType() {
        return this.recoveryIpAddressType;
    }

    /**
     * Set the recoveryIpAddressType property: The recoveryIPAddressType property.
     *
     * @param recoveryIpAddressType the recoveryIpAddressType value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withRecoveryIpAddressType(String recoveryIpAddressType) {
        this.recoveryIpAddressType = recoveryIpAddressType;
        return this;
    }

    /**
     * Get the recoveryPublicIpAddressId property: The recoveryPublicIPAddressId property.
     *
     * @return the recoveryPublicIpAddressId value.
     */
    public String recoveryPublicIpAddressId() {
        return this.recoveryPublicIpAddressId;
    }

    /**
     * Set the recoveryPublicIpAddressId property: The recoveryPublicIPAddressId property.
     *
     * @param recoveryPublicIpAddressId the recoveryPublicIpAddressId value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withRecoveryPublicIpAddressId(String recoveryPublicIpAddressId) {
        this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
        return this;
    }

    /**
     * Get the recoveryLBBackendAddressPoolIds property: The recoveryLBBackendAddressPoolIds property.
     *
     * @return the recoveryLBBackendAddressPoolIds value.
     */
    public List<String> recoveryLBBackendAddressPoolIds() {
        return this.recoveryLBBackendAddressPoolIds;
    }

    /**
     * Set the recoveryLBBackendAddressPoolIds property: The recoveryLBBackendAddressPoolIds property.
     *
     * @param recoveryLBBackendAddressPoolIds the recoveryLBBackendAddressPoolIds value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withRecoveryLBBackendAddressPoolIds(List<String> recoveryLBBackendAddressPoolIds) {
        this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
        return this;
    }

    /**
     * Get the tfoSubnetName property: The tfoSubnetName property.
     *
     * @return the tfoSubnetName value.
     */
    public String tfoSubnetName() {
        return this.tfoSubnetName;
    }

    /**
     * Set the tfoSubnetName property: The tfoSubnetName property.
     *
     * @param tfoSubnetName the tfoSubnetName value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withTfoSubnetName(String tfoSubnetName) {
        this.tfoSubnetName = tfoSubnetName;
        return this;
    }

    /**
     * Get the tfoStaticIpAddress property: The tfoStaticIPAddress property.
     *
     * @return the tfoStaticIpAddress value.
     */
    public String tfoStaticIpAddress() {
        return this.tfoStaticIpAddress;
    }

    /**
     * Set the tfoStaticIpAddress property: The tfoStaticIPAddress property.
     *
     * @param tfoStaticIpAddress the tfoStaticIpAddress value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withTfoStaticIpAddress(String tfoStaticIpAddress) {
        this.tfoStaticIpAddress = tfoStaticIpAddress;
        return this;
    }

    /**
     * Get the tfoPublicIpAddressId property: The tfoPublicIPAddressId property.
     *
     * @return the tfoPublicIpAddressId value.
     */
    public String tfoPublicIpAddressId() {
        return this.tfoPublicIpAddressId;
    }

    /**
     * Set the tfoPublicIpAddressId property: The tfoPublicIPAddressId property.
     *
     * @param tfoPublicIpAddressId the tfoPublicIpAddressId value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withTfoPublicIpAddressId(String tfoPublicIpAddressId) {
        this.tfoPublicIpAddressId = tfoPublicIpAddressId;
        return this;
    }

    /**
     * Get the tfoLBBackendAddressPoolIds property: The tfoLBBackendAddressPoolIds property.
     *
     * @return the tfoLBBackendAddressPoolIds value.
     */
    public List<String> tfoLBBackendAddressPoolIds() {
        return this.tfoLBBackendAddressPoolIds;
    }

    /**
     * Set the tfoLBBackendAddressPoolIds property: The tfoLBBackendAddressPoolIds property.
     *
     * @param tfoLBBackendAddressPoolIds the tfoLBBackendAddressPoolIds value to set.
     * @return the IpConfigDetails object itself.
     */
    public IpConfigDetails withTfoLBBackendAddressPoolIds(List<String> tfoLBBackendAddressPoolIds) {
        this.tfoLBBackendAddressPoolIds = tfoLBBackendAddressPoolIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
