// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.IpConfigurationProfileInner;
import com.azure.resourcemanager.network.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.models.ContainerNetworkInterfaceConfiguration;
import java.util.Arrays;

/**
 * Samples for NetworkProfiles CreateOrUpdate.
 */
public final class NetworkProfilesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/NetworkProfileCreateConfigOnly.json
     */
    /**
     * Sample code: Create network profile defaults.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createNetworkProfileDefaults(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkProfiles()
            .createOrUpdateWithResponse("rg1", "networkProfile1", new NetworkProfileInner().withLocation("westus")
                .withContainerNetworkInterfaceConfigurations(Arrays.asList(new ContainerNetworkInterfaceConfiguration()
                    .withName("eth1")
                    .withIpConfigurations(Arrays.asList(new IpConfigurationProfileInner().withName("ipconfig1")
                        .withSubnet(new SubnetInner().withId(
                            "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/networkProfileVnet/subnets/networkProfileSubnet1")))))),
                com.azure.core.util.Context.NONE);
    }
}
