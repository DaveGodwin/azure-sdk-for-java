/**
 * Object]
 */

package com.microsoft.azure.management.network.models;


/**
 * VirtualNetworkGatewaySku details.
 */
public class VirtualNetworkGatewaySku {
    /**
     * Gateway sku name -Basic/HighPerformance/Standard. Possible values
     * include: 'Basic', 'HighPerformance', 'Standard'.
     */
    private String name;

    /**
     * Gateway sku tier -Basic/HighPerformance/Standard. Possible values
     * include: 'Basic', 'HighPerformance', 'Standard'.
     */
    private String tier;

    /**
     * The capacity.
     */
    private Integer capacity;

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
     * Get the tier value.
     *
     * @return the tier value
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}
