/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Network security rule.
 */
@JsonFlatten
public class SecurityRule extends SubResource {
    /**
     * Gets or sets a description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or
     * All(*). Possible values include: 'Tcp', 'Udp', '*'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private String protocol;

    /**
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. Asterix '*' can also be used to match all ports.
     */
    @JsonProperty(value = "properties.sourcePortRange")
    private String sourcePortRange;

    /**
     * Gets or sets Destination Port or Range. Integer or range between 0 and
     * 65535. Asterix '*' can also be used to match all ports.
     */
    @JsonProperty(value = "properties.destinationPortRange")
    private String destinationPortRange;

    /**
     * Gets or sets source address prefix. CIDR or source IP range. Asterix
     * '*' can also be used to match all source IPs. Default tags such as
     * 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * If this is an ingress rule, specifies where network traffic originates
     * from.
     */
    @JsonProperty(value = "properties.sourceAddressPrefix", required = true)
    private String sourceAddressPrefix;

    /**
     * Gets or sets destination address prefix. CIDR or source IP range.
     * Asterix '*' can also be used to match all source IPs. Default tags
     * such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also
     * be used.
     */
    @JsonProperty(value = "properties.destinationAddressPrefix", required = true)
    private String destinationAddressPrefix;

    /**
     * Gets or sets network traffic is allowed or denied. Possible values are
     * 'Allow' and 'Deny'. Possible values include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "properties.access", required = true)
    private String access;

    /**
     * Gets or sets the priority of the rule. The value can be between 100 and
     * 4096. The priority number must be unique for each rule in the
     * collection. The lower the priority number, the higher the priority of
     * the rule.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outcoming
     * traffic. Possible values include: 'Inbound', 'Outbound'.
     */
    @JsonProperty(value = "properties.direction", required = true)
    private String direction;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Get the sourcePortRange value.
     *
     * @return the sourcePortRange value
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the sourcePortRange value.
     *
     * @param sourcePortRange the sourcePortRange value to set
     */
    public void setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * Get the destinationPortRange value.
     *
     * @return the destinationPortRange value
     */
    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange value.
     *
     * @param destinationPortRange the destinationPortRange value to set
     */
    public void setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * Get the sourceAddressPrefix value.
     *
     * @return the sourceAddressPrefix value
     */
    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix value.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set
     */
    public void setSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
    }

    /**
     * Get the destinationAddressPrefix value.
     *
     * @return the destinationAddressPrefix value
     */
    public String getDestinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destinationAddressPrefix value.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set
     */
    public void setDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
    }

    /**
     * Get the access value.
     *
     * @return the access value
     */
    public String getAccess() {
        return this.access;
    }

    /**
     * Set the access value.
     *
     * @param access the access value to set
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Get the direction value.
     *
     * @return the direction value
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * Set the direction value.
     *
     * @param direction the direction value to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}
