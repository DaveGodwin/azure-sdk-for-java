/**
 * Object]
 */

package com.microsoft.azure.management.network.models;


/**
 * The arp table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitArpTable {
    /**
     * Gets ipAddress.
     */
    private String ipAddress;

    /**
     * Gets macAddress.
     */
    private String macAddress;

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Get the macAddress value.
     *
     * @return the macAddress value
     */
    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress value.
     *
     * @param macAddress the macAddress value to set
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

}
