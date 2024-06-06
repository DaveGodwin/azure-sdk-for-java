// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.LoadBalancerOutboundRuleProtocol;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Outbound rule of the load balancer.
 */
@Fluent
public final class OutboundRuleInner extends SubResource {
    /*
     * Properties of load balancer outbound rule.
     */
    @JsonProperty(value = "properties")
    private OutboundRulePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within the set of outbound rules used by the load balancer. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Creates an instance of OutboundRuleInner class.
     */
    public OutboundRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of load balancer outbound rule.
     * 
     * @return the innerProperties value.
     */
    private OutboundRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within the set of outbound rules used by the load
     * balancer. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of outbound rules used by the load
     * balancer. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OutboundRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     * 
     * @return the allocatedOutboundPorts value.
     */
    public Integer allocatedOutboundPorts() {
        return this.innerProperties() == null ? null : this.innerProperties().allocatedOutboundPorts();
    }

    /**
     * Set the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     * 
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withAllocatedOutboundPorts(allocatedOutboundPorts);
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<SubResource> frontendIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfigurations();
    }

    /**
     * Set the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withFrontendIpConfigurations(List<SubResource> frontendIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfigurations(frontendIpConfigurations);
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the outbound rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the protocol property: The protocol for the outbound rule in load balancer.
     * 
     * @return the protocol value.
     */
    public LoadBalancerOutboundRuleProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol for the outbound rule in load balancer.
     * 
     * @param protocol the protocol value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withProtocol(LoadBalancerOutboundRuleProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     * 
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTcpReset();
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     * 
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withEnableTcpReset(enableTcpReset);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the OutboundRuleInner object itself.
     */
    public OutboundRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OutboundRulePropertiesFormat();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
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
}
