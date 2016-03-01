/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * Specfies the peering config.
 */
public class ExpressRouteCircuitPeeringConfig {
    /**
     * Gets or sets the reference of AdvertisedPublicPrefixes.
     */
    private List<String> advertisedPublicPrefixes;

    /**
     * Gets or sets AdvertisedPublicPrefixState of the Peering resource .
     * Possible values include: 'NotConfigured', 'Configuring', 'Configured',
     * 'ValidationNeeded'.
     */
    private String advertisedPublicPrefixesState;

    /**
     * Gets or Sets CustomerAsn of the peering.
     */
    private Integer customerASN;

    /**
     * Gets or Sets RoutingRegistryName of the config.
     */
    private String routingRegistryName;

    /**
     * Get the advertisedPublicPrefixes value.
     *
     * @return the advertisedPublicPrefixes value
     */
    public List<String> getAdvertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes;
    }

    /**
     * Set the advertisedPublicPrefixes value.
     *
     * @param advertisedPublicPrefixes the advertisedPublicPrefixes value to set
     */
    public void setAdvertisedPublicPrefixes(List<String> advertisedPublicPrefixes) {
        this.advertisedPublicPrefixes = advertisedPublicPrefixes;
    }

    /**
     * Get the advertisedPublicPrefixesState value.
     *
     * @return the advertisedPublicPrefixesState value
     */
    public String getAdvertisedPublicPrefixesState() {
        return this.advertisedPublicPrefixesState;
    }

    /**
     * Set the advertisedPublicPrefixesState value.
     *
     * @param advertisedPublicPrefixesState the advertisedPublicPrefixesState value to set
     */
    public void setAdvertisedPublicPrefixesState(String advertisedPublicPrefixesState) {
        this.advertisedPublicPrefixesState = advertisedPublicPrefixesState;
    }

    /**
     * Get the customerASN value.
     *
     * @return the customerASN value
     */
    public Integer getCustomerASN() {
        return this.customerASN;
    }

    /**
     * Set the customerASN value.
     *
     * @param customerASN the customerASN value to set
     */
    public void setCustomerASN(Integer customerASN) {
        this.customerASN = customerASN;
    }

    /**
     * Get the routingRegistryName value.
     *
     * @return the routingRegistryName value
     */
    public String getRoutingRegistryName() {
        return this.routingRegistryName;
    }

    /**
     * Set the routingRegistryName value.
     *
     * @param routingRegistryName the routingRegistryName value to set
     */
    public void setRoutingRegistryName(String routingRegistryName) {
        this.routingRegistryName = routingRegistryName;
    }

}
