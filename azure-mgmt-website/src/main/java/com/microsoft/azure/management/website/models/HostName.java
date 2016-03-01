/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Details of a hostname derived from a domain.
 */
public class HostName {
    /**
     * Name of the hostname.
     */
    private String name;

    /**
     * List of sites the hostname is assigned to. This list will have more
     * than one site only if the hostname is pointing to a Traffic Manager.
     */
    private List<String> siteNames;

    /**
     * Name of the Azure resource the hostname is assigned to. If it is
     * assigned to a traffic manager then it will be the traffic manager name
     * otherwise it will be the website name.
     */
    private String azureResourceName;

    /**
     * Type of the Azure resource the hostname is assigned to. Possible values
     * include: 'Website', 'TrafficManager'.
     */
    private AzureResourceType azureResourceType;

    /**
     * Type of the Dns record. Possible values include: 'CName', 'A'.
     */
    private CustomHostNameDnsRecordType customHostNameDnsRecordType;

    /**
     * Type of the hostname. Possible values include: 'Verified', 'Managed'.
     */
    private HostNameType hostNameType;

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
     * Get the siteNames value.
     *
     * @return the siteNames value
     */
    public List<String> getSiteNames() {
        return this.siteNames;
    }

    /**
     * Set the siteNames value.
     *
     * @param siteNames the siteNames value to set
     */
    public void setSiteNames(List<String> siteNames) {
        this.siteNames = siteNames;
    }

    /**
     * Get the azureResourceName value.
     *
     * @return the azureResourceName value
     */
    public String getAzureResourceName() {
        return this.azureResourceName;
    }

    /**
     * Set the azureResourceName value.
     *
     * @param azureResourceName the azureResourceName value to set
     */
    public void setAzureResourceName(String azureResourceName) {
        this.azureResourceName = azureResourceName;
    }

    /**
     * Get the azureResourceType value.
     *
     * @return the azureResourceType value
     */
    public AzureResourceType getAzureResourceType() {
        return this.azureResourceType;
    }

    /**
     * Set the azureResourceType value.
     *
     * @param azureResourceType the azureResourceType value to set
     */
    public void setAzureResourceType(AzureResourceType azureResourceType) {
        this.azureResourceType = azureResourceType;
    }

    /**
     * Get the customHostNameDnsRecordType value.
     *
     * @return the customHostNameDnsRecordType value
     */
    public CustomHostNameDnsRecordType getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }

    /**
     * Set the customHostNameDnsRecordType value.
     *
     * @param customHostNameDnsRecordType the customHostNameDnsRecordType value to set
     */
    public void setCustomHostNameDnsRecordType(CustomHostNameDnsRecordType customHostNameDnsRecordType) {
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
    }

    /**
     * Get the hostNameType value.
     *
     * @return the hostNameType value
     */
    public HostNameType getHostNameType() {
        return this.hostNameType;
    }

    /**
     * Set the hostNameType value.
     *
     * @param hostNameType the hostNameType value to set
     */
    public void setHostNameType(HostNameType hostNameType) {
        this.hostNameType = hostNameType;
    }

}
