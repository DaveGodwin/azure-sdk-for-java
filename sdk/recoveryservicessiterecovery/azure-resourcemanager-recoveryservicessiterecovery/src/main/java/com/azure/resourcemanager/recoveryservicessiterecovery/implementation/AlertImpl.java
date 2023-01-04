// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.AlertInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Alert;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlertProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ConfigureAlertRequestProperties;

public final class AlertImpl implements Alert, Alert.Definition {
    private AlertInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    AlertImpl(
        AlertInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AlertProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String resourceName;

    private String resourceGroupName;

    private String alertSettingName;

    private ConfigureAlertRequest createRequest;

    public AlertImpl withExistingVault(String resourceName, String resourceGroupName) {
        this.resourceName = resourceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Alert create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationAlertSettings()
                .createWithResponse(resourceName, resourceGroupName, alertSettingName, createRequest, Context.NONE)
                .getValue();
        return this;
    }

    public Alert create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationAlertSettings()
                .createWithResponse(resourceName, resourceGroupName, alertSettingName, createRequest, context)
                .getValue();
        return this;
    }

    AlertImpl(String name, com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = new AlertInner();
        this.serviceManager = serviceManager;
        this.alertSettingName = name;
        this.createRequest = new ConfigureAlertRequest();
    }

    public Alert refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationAlertSettings()
                .getWithResponse(resourceName, resourceGroupName, alertSettingName, Context.NONE)
                .getValue();
        return this;
    }

    public Alert refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationAlertSettings()
                .getWithResponse(resourceName, resourceGroupName, alertSettingName, context)
                .getValue();
        return this;
    }

    public AlertImpl withProperties(ConfigureAlertRequestProperties properties) {
        this.createRequest.withProperties(properties);
        return this;
    }
}
