/**
 * Object]
 */

package com.microsoft.azure.management.network.models;

import java.util.List;

/**
 * DHCPOptions contains an array of DNS servers available to VMs deployed in
 * the virtual networkStandard DHCP option for a subnet overrides VNET DHCP
 * options.
 */
public class DhcpOptions {
    /**
     * Gets or sets list of DNS servers IP addresses.
     */
    private List<String> dnsServers;

    /**
     * Get the dnsServers value.
     *
     * @return the dnsServers value
     */
    public List<String> getDnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers value.
     *
     * @param dnsServers the dnsServers value to set
     */
    public void setDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

}
