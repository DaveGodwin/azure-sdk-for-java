// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner;
import com.azure.resourcemanager.desktopvirtualization.models.ExpandMsixImage;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class ExpandMsixImageImpl implements ExpandMsixImage {
    private ExpandMsixImageInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    ExpandMsixImageImpl(ExpandMsixImageInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String packageAlias() {
        return this.innerModel().packageAlias();
    }

    public String imagePath() {
        return this.innerModel().imagePath();
    }

    public String packageName() {
        return this.innerModel().packageName();
    }

    public String packageFamilyName() {
        return this.innerModel().packageFamilyName();
    }

    public String packageFullName() {
        return this.innerModel().packageFullName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String packageRelativePath() {
        return this.innerModel().packageRelativePath();
    }

    public Boolean isRegularRegistration() {
        return this.innerModel().isRegularRegistration();
    }

    public Boolean isActive() {
        return this.innerModel().isActive();
    }

    public List<MsixPackageDependencies> packageDependencies() {
        List<MsixPackageDependencies> inner = this.innerModel().packageDependencies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String version() {
        return this.innerModel().version();
    }

    public OffsetDateTime lastUpdated() {
        return this.innerModel().lastUpdated();
    }

    public List<MsixPackageApplications> packageApplications() {
        List<MsixPackageApplications> inner = this.innerModel().packageApplications();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String certificateName() {
        return this.innerModel().certificateName();
    }

    public OffsetDateTime certificateExpiry() {
        return this.innerModel().certificateExpiry();
    }

    public ExpandMsixImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
