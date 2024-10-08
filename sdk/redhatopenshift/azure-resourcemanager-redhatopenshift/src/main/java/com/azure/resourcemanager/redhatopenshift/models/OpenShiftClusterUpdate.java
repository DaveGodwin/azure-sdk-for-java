// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redhatopenshift.fluent.models.OpenShiftClusterProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * OpenShiftCluster represents an Azure Red Hat OpenShift cluster.
 */
@Fluent
public final class OpenShiftClusterUpdate implements JsonSerializable<OpenShiftClusterUpdate> {
    /*
     * The resource tags.
     */
    private Map<String, String> tags;

    /*
     * The cluster properties.
     */
    private OpenShiftClusterProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /**
     * Creates an instance of OpenShiftClusterUpdate class.
     */
    public OpenShiftClusterUpdate() {
    }

    /**
     * Get the tags property: The resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags.
     * 
     * @param tags the tags value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The cluster properties.
     * 
     * @return the innerProperties value.
     */
    private OpenShiftClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The cluster provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The cluster provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the clusterProfile property: The cluster profile.
     * 
     * @return the clusterProfile value.
     */
    public ClusterProfile clusterProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterProfile();
    }

    /**
     * Set the clusterProfile property: The cluster profile.
     * 
     * @param clusterProfile the clusterProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withClusterProfile(ClusterProfile clusterProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withClusterProfile(clusterProfile);
        return this;
    }

    /**
     * Get the consoleProfile property: The console profile.
     * 
     * @return the consoleProfile value.
     */
    public ConsoleProfile consoleProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().consoleProfile();
    }

    /**
     * Set the consoleProfile property: The console profile.
     * 
     * @param consoleProfile the consoleProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withConsoleProfile(ConsoleProfile consoleProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withConsoleProfile(consoleProfile);
        return this;
    }

    /**
     * Get the servicePrincipalProfile property: The cluster service principal profile.
     * 
     * @return the servicePrincipalProfile value.
     */
    public ServicePrincipalProfile servicePrincipalProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().servicePrincipalProfile();
    }

    /**
     * Set the servicePrincipalProfile property: The cluster service principal profile.
     * 
     * @param servicePrincipalProfile the servicePrincipalProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withServicePrincipalProfile(ServicePrincipalProfile servicePrincipalProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    /**
     * Get the networkProfile property: The cluster network profile.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: The cluster network profile.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the masterProfile property: The cluster master profile.
     * 
     * @return the masterProfile value.
     */
    public MasterProfile masterProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().masterProfile();
    }

    /**
     * Set the masterProfile property: The cluster master profile.
     * 
     * @param masterProfile the masterProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withMasterProfile(MasterProfile masterProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withMasterProfile(masterProfile);
        return this;
    }

    /**
     * Get the workerProfiles property: The cluster worker profiles.
     * 
     * @return the workerProfiles value.
     */
    public List<WorkerProfile> workerProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().workerProfiles();
    }

    /**
     * Set the workerProfiles property: The cluster worker profiles.
     * 
     * @param workerProfiles the workerProfiles value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withWorkerProfiles(List<WorkerProfile> workerProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withWorkerProfiles(workerProfiles);
        return this;
    }

    /**
     * Get the workerProfilesStatus property: The cluster worker profiles status.
     * 
     * @return the workerProfilesStatus value.
     */
    public List<WorkerProfile> workerProfilesStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().workerProfilesStatus();
    }

    /**
     * Get the apiserverProfile property: The cluster API server profile.
     * 
     * @return the apiserverProfile value.
     */
    public ApiServerProfile apiserverProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().apiserverProfile();
    }

    /**
     * Set the apiserverProfile property: The cluster API server profile.
     * 
     * @param apiserverProfile the apiserverProfile value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withApiserverProfile(ApiServerProfile apiserverProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withApiserverProfile(apiserverProfile);
        return this;
    }

    /**
     * Get the ingressProfiles property: The cluster ingress profiles.
     * 
     * @return the ingressProfiles value.
     */
    public List<IngressProfile> ingressProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressProfiles();
    }

    /**
     * Set the ingressProfiles property: The cluster ingress profiles.
     * 
     * @param ingressProfiles the ingressProfiles value to set.
     * @return the OpenShiftClusterUpdate object itself.
     */
    public OpenShiftClusterUpdate withIngressProfiles(List<IngressProfile> ingressProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenShiftClusterProperties();
        }
        this.innerProperties().withIngressProfiles(ingressProfiles);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftClusterUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftClusterUpdate if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OpenShiftClusterUpdate.
     */
    public static OpenShiftClusterUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftClusterUpdate deserializedOpenShiftClusterUpdate = new OpenShiftClusterUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedOpenShiftClusterUpdate.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedOpenShiftClusterUpdate.innerProperties = OpenShiftClusterProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedOpenShiftClusterUpdate.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftClusterUpdate;
        });
    }
}
