// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.resourcemanager.desktopvirtualization.models.MsixPackage;

/**
 * Samples for MsixPackages Update.
 */
public final class MsixPackagesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-04-03/examples/
     * MsixPackage_Update.json
     */
    /**
     * Sample code: MSIXPackage_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        mSIXPackageUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        MsixPackage resource = manager.msixPackages()
            .getWithResponse("resourceGroup1", "hostpool1", "msixpackagefullname", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withIsActive(true).withIsRegularRegistration(false).withDisplayName("displayname").apply();
    }
}
