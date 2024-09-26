// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.batch.models.AutomaticOSUpgradePolicy;
import com.azure.resourcemanager.batch.models.AutoScaleSettings;
import com.azure.resourcemanager.batch.models.BatchPoolIdentity;
import com.azure.resourcemanager.batch.models.CachingType;
import com.azure.resourcemanager.batch.models.DataDisk;
import com.azure.resourcemanager.batch.models.DeploymentConfiguration;
import com.azure.resourcemanager.batch.models.DiffDiskPlacement;
import com.azure.resourcemanager.batch.models.DiffDiskSettings;
import com.azure.resourcemanager.batch.models.DiskEncryptionConfiguration;
import com.azure.resourcemanager.batch.models.DiskEncryptionTarget;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import com.azure.resourcemanager.batch.models.ImageReference;
import com.azure.resourcemanager.batch.models.InboundEndpointProtocol;
import com.azure.resourcemanager.batch.models.InboundNatPool;
import com.azure.resourcemanager.batch.models.IpAddressProvisioningType;
import com.azure.resourcemanager.batch.models.ManagedDisk;
import com.azure.resourcemanager.batch.models.NetworkConfiguration;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRuleAccess;
import com.azure.resourcemanager.batch.models.NodeCommunicationMode;
import com.azure.resourcemanager.batch.models.NodePlacementConfiguration;
import com.azure.resourcemanager.batch.models.NodePlacementPolicyType;
import com.azure.resourcemanager.batch.models.OSDisk;
import com.azure.resourcemanager.batch.models.PoolEndpointConfiguration;
import com.azure.resourcemanager.batch.models.PoolIdentityType;
import com.azure.resourcemanager.batch.models.PublicIpAddressConfiguration;
import com.azure.resourcemanager.batch.models.RollingUpgradePolicy;
import com.azure.resourcemanager.batch.models.ScaleSettings;
import com.azure.resourcemanager.batch.models.SecurityProfile;
import com.azure.resourcemanager.batch.models.SecurityTypes;
import com.azure.resourcemanager.batch.models.ServiceArtifactReference;
import com.azure.resourcemanager.batch.models.StorageAccountType;
import com.azure.resourcemanager.batch.models.UefiSettings;
import com.azure.resourcemanager.batch.models.UpgradeMode;
import com.azure.resourcemanager.batch.models.UpgradePolicy;
import com.azure.resourcemanager.batch.models.UserAssignedIdentities;
import com.azure.resourcemanager.batch.models.VirtualMachineConfiguration;
import com.azure.resourcemanager.batch.models.VMExtension;
import com.azure.resourcemanager.batch.models.WindowsConfiguration;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Pool Create.
 */
public final class PoolCreateSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * PoolCreate_VirtualMachineConfiguration_ServiceArtifactReference.json
     */
    /**
     * Sample code: CreatePool - VirtualMachineConfiguration ServiceArtifactReference.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolVirtualMachineConfigurationServiceArtifactReference(
        com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("Standard_d4s_v3")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("MicrosoftWindowsServer")
                        .withOffer("WindowsServer")
                        .withSku("2019-datacenter-smalldisk")
                        .withVersion("latest"))
                    .withNodeAgentSkuId("batch.node.windows amd64")
                    .withWindowsConfiguration(new WindowsConfiguration().withEnableAutomaticUpdates(false))
                    .withServiceArtifactReference(new ServiceArtifactReference().withId(
                        "/subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Compute/galleries/myGallery/serviceArtifacts/myServiceArtifact/vmArtifactsProfiles/vmArtifactsProfile"))))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(2).withTargetLowPriorityNodes(0)))
            .withUpgradePolicy(new UpgradePolicy().withMode(UpgradeMode.AUTOMATIC)
                .withAutomaticOSUpgradePolicy(new AutomaticOSUpgradePolicy().withEnableAutomaticOSUpgrade(true)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_SecurityProfile.json
     */
    /**
     * Sample code: CreatePool - SecurityProfile.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolSecurityProfile(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("Standard_d4s_v3")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("Canonical")
                        .withOffer("UbuntuServer")
                        .withSku("18_04-lts-gen2")
                        .withVersion("latest"))
                    .withNodeAgentSkuId("batch.node.ubuntu 18.04")
                    .withSecurityProfile(new SecurityProfile().withSecurityType(SecurityTypes.TRUSTED_LAUNCH)
                        .withEncryptionAtHost(true)
                        .withUefiSettings(new UefiSettings().withVTpmEnabled(false)))))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(1).withTargetLowPriorityNodes(0)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_Tags.json
     */
    /**
     * Sample code: CreatePool - Tags.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolTags(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withTags(mapOf("TagName1", "TagValue1", "TagName2", "TagValue2"))
            .withVmSize("Standard_d4s_v3")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withPublisher("Canonical")
                    .withOffer("0001-com-ubuntu-server-jammy")
                    .withSku("22_04-lts")
                    .withVersion("latest")).withNodeAgentSkuId("batch.node.ubuntu 22.04")))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(1).withTargetLowPriorityNodes(0)))
            .create();
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * PoolCreate_VirtualMachineConfiguration_ManagedOSDisk.json
     */
    /**
     * Sample code: CreatePool - VirtualMachineConfiguration OSDisk.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void
        createPoolVirtualMachineConfigurationOSDisk(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("Standard_d2s_v3")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("microsoftwindowsserver")
                        .withOffer("windowsserver")
                        .withSku("2022-datacenter-smalldisk"))
                    .withNodeAgentSkuId("batch.node.windows amd64")
                    .withOsDisk(new OSDisk().withCaching(CachingType.READ_WRITE)
                        .withManagedDisk(new ManagedDisk().withStorageAccountType(StorageAccountType.STANDARD_SSD_LRS))
                        .withDiskSizeGB(100)
                        .withWriteAcceleratorEnabled(false))))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(1).withTargetLowPriorityNodes(0)))
            .create();
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * PoolCreate_MinimalVirtualMachineConfiguration.json
     */
    /**
     * Sample code: CreatePool - Minimal VirtualMachineConfiguration.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void
        createPoolMinimalVirtualMachineConfiguration(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withPublisher("Canonical")
                    .withOffer("UbuntuServer")
                    .withSku("18.04-LTS")
                    .withVersion("latest")).withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .withScaleSettings(
                new ScaleSettings().withAutoScale(new AutoScaleSettings().withFormula("$TargetDedicatedNodes=1")
                    .withEvaluationInterval(Duration.parse("PT5M"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * PoolCreate_VirtualMachineConfiguration_Extensions.json
     */
    /**
     * Sample code: CreatePool - VirtualMachineConfiguration Extensions.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolVirtualMachineConfigurationExtensions(
        com.azure.resourcemanager.batch.BatchManager manager) throws IOException {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("Canonical")
                        .withOffer("0001-com-ubuntu-server-focal")
                        .withSku("20_04-lts"))
                    .withNodeAgentSkuId("batch.node.ubuntu 20.04")
                    .withExtensions(Arrays.asList(new VMExtension().withName("batchextension1")
                        .withPublisher("Microsoft.Azure.KeyVault")
                        .withType("KeyVaultForLinux")
                        .withTypeHandlerVersion("2.0")
                        .withAutoUpgradeMinorVersion(true)
                        .withEnableAutomaticUpgrade(true)
                        .withSettings(SerializerFactory.createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"authenticationSettingsKey\":\"authenticationSettingsValue\",\"secretsManagementSettingsKey\":\"secretsManagementSettingsValue\"}",
                                Object.class, SerializerEncoding.JSON))))))
            .withScaleSettings(
                new ScaleSettings().withAutoScale(new AutoScaleSettings().withFormula("$TargetDedicatedNodes=1")
                    .withEvaluationInterval(Duration.parse("PT5M"))))
            .withTargetNodeCommunicationMode(NodeCommunicationMode.DEFAULT)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_UserAssignedIdentities
     * .json
     */
    /**
     * Sample code: CreatePool - UserAssignedIdentities.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolUserAssignedIdentities(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withIdentity(new BatchPoolIdentity().withType(PoolIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                    new UserAssignedIdentities(),
                    "/subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id2",
                    new UserAssignedIdentities())))
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withPublisher("Canonical")
                    .withOffer("UbuntuServer")
                    .withSku("18.04-LTS")
                    .withVersion("latest")).withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .withScaleSettings(
                new ScaleSettings().withAutoScale(new AutoScaleSettings().withFormula("$TargetDedicatedNodes=1")
                    .withEvaluationInterval(Duration.parse("PT5M"))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_UpgradePolicy.json
     */
    /**
     * Sample code: CreatePool - UpgradePolicy.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolUpgradePolicy(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("Standard_d4s_v3")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("MicrosoftWindowsServer")
                        .withOffer("WindowsServer")
                        .withSku("2019-datacenter-smalldisk")
                        .withVersion("latest"))
                    .withNodeAgentSkuId("batch.node.windows amd64")
                    .withWindowsConfiguration(new WindowsConfiguration().withEnableAutomaticUpdates(false))
                    .withNodePlacementConfiguration(
                        new NodePlacementConfiguration().withPolicy(NodePlacementPolicyType.ZONAL))))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(2).withTargetLowPriorityNodes(0)))
            .withUpgradePolicy(new UpgradePolicy().withMode(UpgradeMode.AUTOMATIC)
                .withAutomaticOSUpgradePolicy(new AutomaticOSUpgradePolicy().withDisableAutomaticRollback(true)
                    .withEnableAutomaticOSUpgrade(true)
                    .withUseRollingUpgradePolicy(true)
                    .withOsRollingUpgradeDeferral(true))
                .withRollingUpgradePolicy(new RollingUpgradePolicy().withEnableCrossZoneUpgrade(true)
                    .withMaxBatchInstancePercent(20)
                    .withMaxUnhealthyInstancePercent(20)
                    .withMaxUnhealthyUpgradedInstancePercent(20)
                    .withPauseTimeBetweenBatches("PT0S")
                    .withPrioritizeUnhealthyInstances(false)
                    .withRollbackFailedInstancesOnPolicyBreach(false)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_AcceleratedNetworking.
     * json
     */
    /**
     * Sample code: CreatePool - accelerated networking.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolAcceleratedNetworking(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D1_V2")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("MicrosoftWindowsServer")
                        .withOffer("WindowsServer")
                        .withSku("2016-datacenter-smalldisk")
                        .withVersion("latest"))
                    .withNodeAgentSkuId("batch.node.windows amd64")))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(1).withTargetLowPriorityNodes(0)))
            .withNetworkConfiguration(new NetworkConfiguration().withSubnetId(
                "/subscriptions/subid/resourceGroups/rg1234/providers/Microsoft.Network/virtualNetworks/network1234/subnets/subnet123")
                .withEnableAcceleratedNetworking(true))
            .create();
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * PoolCreate_VirtualMachineConfiguration.json
     */
    /**
     * Sample code: CreatePool - Full VirtualMachineConfiguration.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolFullVirtualMachineConfiguration(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(
                new DeploymentConfiguration().withVirtualMachineConfiguration(new VirtualMachineConfiguration()
                    .withImageReference(new ImageReference().withPublisher("MicrosoftWindowsServer")
                        .withOffer("WindowsServer")
                        .withSku("2016-Datacenter-SmallDisk")
                        .withVersion("latest"))
                    .withNodeAgentSkuId("batch.node.windows amd64")
                    .withWindowsConfiguration(new WindowsConfiguration().withEnableAutomaticUpdates(false))
                    .withDataDisks(Arrays.asList(
                        new DataDisk().withLun(0)
                            .withCaching(CachingType.READ_WRITE)
                            .withDiskSizeGB(30)
                            .withStorageAccountType(StorageAccountType.PREMIUM_LRS),
                        new DataDisk().withLun(1)
                            .withCaching(CachingType.NONE)
                            .withDiskSizeGB(200)
                            .withStorageAccountType(StorageAccountType.STANDARD_LRS)))
                    .withLicenseType("Windows_Server")
                    .withDiskEncryptionConfiguration(new DiskEncryptionConfiguration()
                        .withTargets(Arrays.asList(DiskEncryptionTarget.OS_DISK, DiskEncryptionTarget.TEMPORARY_DISK)))
                    .withNodePlacementConfiguration(
                        new NodePlacementConfiguration().withPolicy(NodePlacementPolicyType.ZONAL))
                    .withOsDisk(new OSDisk().withEphemeralOSDiskSettings(
                        new DiffDiskSettings().withPlacement(DiffDiskPlacement.CACHE_DISK)))))
            .withScaleSettings(
                new ScaleSettings().withAutoScale(new AutoScaleSettings().withFormula("$TargetDedicatedNodes=1")
                    .withEvaluationInterval(Duration.parse("PT5M"))))
            .withNetworkConfiguration(
                new NetworkConfiguration().withEndpointConfiguration(new PoolEndpointConfiguration()
                    .withInboundNatPools(Arrays.asList(new InboundNatPool().withName("testnat")
                        .withProtocol(InboundEndpointProtocol.TCP)
                        .withBackendPort(12001)
                        .withFrontendPortRangeStart(15000)
                        .withFrontendPortRangeEnd(15100)
                        .withNetworkSecurityGroupRules(Arrays.asList(
                            new NetworkSecurityGroupRule().withPriority(150)
                                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                                .withSourceAddressPrefix("192.100.12.45")
                                .withSourcePortRanges(Arrays.asList("1", "2")),
                            new NetworkSecurityGroupRule().withPriority(3500)
                                .withAccess(NetworkSecurityGroupRuleAccess.DENY)
                                .withSourceAddressPrefix("*")
                                .withSourcePortRanges(Arrays.asList("*"))))))))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_SharedImageGallery.
     * json
     */
    /**
     * Sample code: CreatePool - Custom Image.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolCustomImage(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withId(
                    "/subscriptions/subid/resourceGroups/networking-group/providers/Microsoft.Compute/galleries/testgallery/images/testimagedef/versions/0.0.1"))
                    .withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_NoPublicIPAddresses.
     * json
     */
    /**
     * Sample code: CreatePool - No public IP.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolNoPublicIP(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withId(
                    "/subscriptions/subid/resourceGroups/networking-group/providers/Microsoft.Compute/galleries/testgallery/images/testimagedef/versions/0.0.1"))
                    .withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .withNetworkConfiguration(new NetworkConfiguration().withSubnetId(
                "/subscriptions/subid/resourceGroups/rg1234/providers/Microsoft.Network/virtualNetworks/network1234/subnets/subnet123")
                .withPublicIpAddressConfiguration(
                    new PublicIpAddressConfiguration().withProvision(IpAddressProvisioningType.NO_PUBLIC_IPADDRESSES)))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_ResourceTags.json
     */
    /**
     * Sample code: CreatePool - ResourceTags.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolResourceTags(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("Standard_d4s_v3")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withPublisher("Canonical")
                    .withOffer("UbuntuServer")
                    .withSku("18_04-lts-gen2")
                    .withVersion("latest")).withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .withScaleSettings(new ScaleSettings()
                .withFixedScale(new FixedScaleSettings().withTargetDedicatedNodes(1).withTargetLowPriorityNodes(0)))
            .withResourceTags(mapOf("TagName1", "TagValue1", "TagName2", "TagValue2"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/PoolCreate_PublicIPs.json
     */
    /**
     * Sample code: CreatePool - Public IPs.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void createPoolPublicIPs(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.pools()
            .define("testpool")
            .withExistingBatchAccount("default-azurebatch-japaneast", "sampleacct")
            .withVmSize("STANDARD_D4")
            .withDeploymentConfiguration(new DeploymentConfiguration().withVirtualMachineConfiguration(
                new VirtualMachineConfiguration().withImageReference(new ImageReference().withId(
                    "/subscriptions/subid/resourceGroups/networking-group/providers/Microsoft.Compute/galleries/testgallery/images/testimagedef/versions/0.0.1"))
                    .withNodeAgentSkuId("batch.node.ubuntu 18.04")))
            .withNetworkConfiguration(new NetworkConfiguration().withSubnetId(
                "/subscriptions/subid/resourceGroups/rg1234/providers/Microsoft.Network/virtualNetworks/network1234/subnets/subnet123")
                .withPublicIpAddressConfiguration(new PublicIpAddressConfiguration()
                    .withProvision(IpAddressProvisioningType.USER_MANAGED)
                    .withIpAddressIds(Arrays.asList(
                        "/subscriptions/subid1/resourceGroups/rg13/providers/Microsoft.Network/publicIPAddresses/ip135"))))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
