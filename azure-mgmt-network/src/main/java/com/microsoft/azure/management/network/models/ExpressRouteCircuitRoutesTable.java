/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The routes table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitRoutesTable {
    /**
     * Gets AddressPrefix.
     */
    private String addressPrefix;

    /**
     * Gets NextHopType. Possible values include: 'VirtualNetworkGateway',
     * 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     */
    @JsonProperty(required = true)
    private String nextHopType;

    /**
     * Gets NextHopIP.
     */
    private String nextHopIP;

    /**
     * Gets AsPath.
     */
    private String asPath;

    /**
     * Get the addressPrefix value.
     *
     * @return the addressPrefix value
     */
    public String getAddressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix value.
     *
     * @param addressPrefix the addressPrefix value to set
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * Get the nextHopType value.
     *
     * @return the nextHopType value
     */
    public String getNextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the nextHopType value.
     *
     * @param nextHopType the nextHopType value to set
     */
    public void setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
    }

    /**
     * Get the nextHopIP value.
     *
     * @return the nextHopIP value
     */
    public String getNextHopIP() {
        return this.nextHopIP;
    }

    /**
     * Set the nextHopIP value.
     *
     * @param nextHopIP the nextHopIP value to set
     */
    public void setNextHopIP(String nextHopIP) {
        this.nextHopIP = nextHopIP;
    }

    /**
     * Get the asPath value.
     *
     * @return the asPath value
     */
    public String getAsPath() {
        return this.asPath;
    }

    /**
     * Set the asPath value.
     *
     * @param asPath the asPath value to set
     */
    public void setAsPath(String asPath) {
        this.asPath = asPath;
    }

}
