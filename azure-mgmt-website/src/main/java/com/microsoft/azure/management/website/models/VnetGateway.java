/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The VnetGateway contract. This is used to give the vnet gateway access to
 * the VPN package.
 */
@JsonFlatten
public class VnetGateway extends Resource {
    /**
     * The VNET name.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * The URI where the Vpn package can be downloaded.
     */
    @JsonProperty(value = "properties.vpnPackageUri")
    private String vpnPackageUri;

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String getVnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     */
    public void setVnetName(String vnetName) {
        this.vnetName = vnetName;
    }

    /**
     * Get the vpnPackageUri value.
     *
     * @return the vpnPackageUri value
     */
    public String getVpnPackageUri() {
        return this.vpnPackageUri;
    }

    /**
     * Set the vpnPackageUri value.
     *
     * @param vpnPackageUri the vpnPackageUri value to set
     */
    public void setVpnPackageUri(String vpnPackageUri) {
        this.vpnPackageUri = vpnPackageUri;
    }

}
