/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * AddressSpace contains an array of IP address ranges that can be used by
 * subnets.
 */
public class AddressSpace {
    /**
     * Gets or sets List of address blocks reserved for this virtual network
     * in CIDR notation.
     */
    private List<String> addressPrefixes;

    /**
     * Get the addressPrefixes value.
     *
     * @return the addressPrefixes value
     */
    public List<String> getAddressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes value.
     *
     * @param addressPrefixes the addressPrefixes value to set
     */
    public void setAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

}
