// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of ExpandMsixImage.
 */
public interface ExpandMsixImage {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the packageAlias property: Alias of MSIX Package.
     * 
     * @return the packageAlias value.
     */
    String packageAlias();

    /**
     * Gets the imagePath property: VHD/CIM image path on Network Share.
     * 
     * @return the imagePath value.
     */
    String imagePath();

    /**
     * Gets the packageName property: Package Name from appxmanifest.xml.
     * 
     * @return the packageName value.
     */
    String packageName();

    /**
     * Gets the packageFamilyName property: Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     * 
     * @return the packageFamilyName value.
     */
    String packageFamilyName();

    /**
     * Gets the packageFullName property: Package Full Name from appxmanifest.xml.
     * 
     * @return the packageFullName value.
     */
    String packageFullName();

    /**
     * Gets the displayName property: User friendly Name to be displayed in the portal.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the packageRelativePath property: Relative Path to the package inside the image.
     * 
     * @return the packageRelativePath value.
     */
    String packageRelativePath();

    /**
     * Gets the isRegularRegistration property: Specifies how to register Package in feed.
     * 
     * @return the isRegularRegistration value.
     */
    Boolean isRegularRegistration();

    /**
     * Gets the isActive property: Make this version of the package the active one across the hostpool.
     * 
     * @return the isActive value.
     */
    Boolean isActive();

    /**
     * Gets the packageDependencies property: List of package dependencies.
     * 
     * @return the packageDependencies value.
     */
    List<MsixPackageDependencies> packageDependencies();

    /**
     * Gets the version property: Package version found in the appxmanifest.xml.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the lastUpdated property: Date Package was last updated, found in the appxmanifest.xml.
     * 
     * @return the lastUpdated value.
     */
    OffsetDateTime lastUpdated();

    /**
     * Gets the packageApplications property: List of package applications.
     * 
     * @return the packageApplications value.
     */
    List<MsixPackageApplications> packageApplications();

    /**
     * Gets the certificateName property: Certificate name found in the appxmanifest.xml.
     * 
     * @return the certificateName value.
     */
    String certificateName();

    /**
     * Gets the certificateExpiry property: Date certificate expires, found in the appxmanifest.xml.
     * 
     * @return the certificateExpiry value.
     */
    OffsetDateTime certificateExpiry();

    /**
     * Gets the inner com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner object.
     * 
     * @return the inner object.
     */
    ExpandMsixImageInner innerModel();
}
