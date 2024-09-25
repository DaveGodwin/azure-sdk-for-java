// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.resourcemanager.desktopvirtualization.models.MsixImageUri;

/**
 * Samples for MsixImages Expand.
 */
public final class MsixImagesExpandSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-04-03/examples/
     * MsixImage_Expand_Post.json
     */
    /**
     * Sample code: MsixImage_Expand.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        msixImageExpand(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixImages()
            .expand("resourceGroup1", "hostpool1", new MsixImageUri().withUri("imagepath"),
                com.azure.core.util.Context.NONE);
    }
}
