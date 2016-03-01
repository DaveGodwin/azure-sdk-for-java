/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Domain registration input for validation Api.
 */
@JsonFlatten
public class DomainRegistrationInput extends Resource {
    /**
     * Name of the domain.
     */
    @JsonProperty(value = "properties.name")
    private String domainRegistrationInputName;

    /**
     * Admin contact information.
     */
    @JsonProperty(value = "properties.contactAdmin")
    private Contact contactAdmin;

    /**
     * Billing contact information.
     */
    @JsonProperty(value = "properties.contactBilling")
    private Contact contactBilling;

    /**
     * Registrant contact information.
     */
    @JsonProperty(value = "properties.contactRegistrant")
    private Contact contactRegistrant;

    /**
     * Technical contact information.
     */
    @JsonProperty(value = "properties.contactTech")
    private Contact contactTech;

    /**
     * Domain registration status. Possible values include: 'Active',
     * 'Awaiting', 'Cancelled', 'Confiscated', 'Disabled', 'Excluded',
     * 'Expired', 'Failed', 'Held', 'Locked', 'Parked', 'Pending',
     * 'Reserved', 'Reverted', 'Suspended', 'Transferred', 'Unknown',
     * 'Unlocked', 'Unparked', 'Updated', 'JsonConverterFailed'.
     */
    @JsonProperty(value = "properties.registrationStatus")
    private DomainStatus registrationStatus;

    /**
     * Domain provisioning state. Possible values include: 'Succeeded',
     * 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Name servers.
     */
    @JsonProperty(value = "properties.nameServers")
    private List<String> nameServers;

    /**
     * If true then domain privacy is enabled for this domain.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /**
     * Domain creation timestamp.
     */
    @JsonProperty(value = "properties.createdTime")
    private DateTime createdTime;

    /**
     * Domain expiration timestamp.
     */
    @JsonProperty(value = "properties.expirationTime")
    private DateTime expirationTime;

    /**
     * Timestamp when the domain was renewed last time.
     */
    @JsonProperty(value = "properties.lastRenewedTime")
    private DateTime lastRenewedTime;

    /**
     * If true then domain will renewed automatically.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /**
     * If true then Azure can assign this domain to Web Apps. This value will
     * be true if domain registration status is active and it is hosted on
     * name servers Azure has programmatic access to.
     */
    @JsonProperty(value = "properties.readyForDnsRecordManagement")
    private Boolean readyForDnsRecordManagement;

    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    @JsonProperty(value = "properties.managedHostNames")
    private List<HostName> managedHostNames;

    /**
     * Legal agreement consent.
     */
    @JsonProperty(value = "properties.consent")
    private DomainPurchaseConsent consent;

    /**
     * Get the domainRegistrationInputName value.
     *
     * @return the domainRegistrationInputName value
     */
    public String getDomainRegistrationInputName() {
        return this.domainRegistrationInputName;
    }

    /**
     * Set the domainRegistrationInputName value.
     *
     * @param domainRegistrationInputName the domainRegistrationInputName value to set
     */
    public void setDomainRegistrationInputName(String domainRegistrationInputName) {
        this.domainRegistrationInputName = domainRegistrationInputName;
    }

    /**
     * Get the contactAdmin value.
     *
     * @return the contactAdmin value
     */
    public Contact getContactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set the contactAdmin value.
     *
     * @param contactAdmin the contactAdmin value to set
     */
    public void setContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
    }

    /**
     * Get the contactBilling value.
     *
     * @return the contactBilling value
     */
    public Contact getContactBilling() {
        return this.contactBilling;
    }

    /**
     * Set the contactBilling value.
     *
     * @param contactBilling the contactBilling value to set
     */
    public void setContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
    }

    /**
     * Get the contactRegistrant value.
     *
     * @return the contactRegistrant value
     */
    public Contact getContactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set the contactRegistrant value.
     *
     * @param contactRegistrant the contactRegistrant value to set
     */
    public void setContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
    }

    /**
     * Get the contactTech value.
     *
     * @return the contactTech value
     */
    public Contact getContactTech() {
        return this.contactTech;
    }

    /**
     * Set the contactTech value.
     *
     * @param contactTech the contactTech value to set
     */
    public void setContactTech(Contact contactTech) {
        this.contactTech = contactTech;
    }

    /**
     * Get the registrationStatus value.
     *
     * @return the registrationStatus value
     */
    public DomainStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Set the registrationStatus value.
     *
     * @param registrationStatus the registrationStatus value to set
     */
    public void setRegistrationStatus(DomainStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the nameServers value.
     *
     * @return the nameServers value
     */
    public List<String> getNameServers() {
        return this.nameServers;
    }

    /**
     * Set the nameServers value.
     *
     * @param nameServers the nameServers value to set
     */
    public void setNameServers(List<String> nameServers) {
        this.nameServers = nameServers;
    }

    /**
     * Get the privacy value.
     *
     * @return the privacy value
     */
    public Boolean getPrivacy() {
        return this.privacy;
    }

    /**
     * Set the privacy value.
     *
     * @param privacy the privacy value to set
     */
    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime value.
     *
     * @param createdTime the createdTime value to set
     */
    public void setCreatedTime(DateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Get the expirationTime value.
     *
     * @return the expirationTime value
     */
    public DateTime getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime value.
     *
     * @param expirationTime the expirationTime value to set
     */
    public void setExpirationTime(DateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Get the lastRenewedTime value.
     *
     * @return the lastRenewedTime value
     */
    public DateTime getLastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Set the lastRenewedTime value.
     *
     * @param lastRenewedTime the lastRenewedTime value to set
     */
    public void setLastRenewedTime(DateTime lastRenewedTime) {
        this.lastRenewedTime = lastRenewedTime;
    }

    /**
     * Get the autoRenew value.
     *
     * @return the autoRenew value
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew value.
     *
     * @param autoRenew the autoRenew value to set
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * Get the readyForDnsRecordManagement value.
     *
     * @return the readyForDnsRecordManagement value
     */
    public Boolean getReadyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Set the readyForDnsRecordManagement value.
     *
     * @param readyForDnsRecordManagement the readyForDnsRecordManagement value to set
     */
    public void setReadyForDnsRecordManagement(Boolean readyForDnsRecordManagement) {
        this.readyForDnsRecordManagement = readyForDnsRecordManagement;
    }

    /**
     * Get the managedHostNames value.
     *
     * @return the managedHostNames value
     */
    public List<HostName> getManagedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Set the managedHostNames value.
     *
     * @param managedHostNames the managedHostNames value to set
     */
    public void setManagedHostNames(List<HostName> managedHostNames) {
        this.managedHostNames = managedHostNames;
    }

    /**
     * Get the consent value.
     *
     * @return the consent value
     */
    public DomainPurchaseConsent getConsent() {
        return this.consent;
    }

    /**
     * Set the consent value.
     *
     * @param consent the consent value to set
     */
    public void setConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
    }

}
