/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Contact information for domain registration. If 'Domain Privacy' option is
 * not selected then the contact information will be  be made publicly
 * available through the Whois directories as per ICANN requirements.
 */
public class Contact {
    /**
     * Mailing address.
     */
    private Address addressMailing;

    /**
     * Email address.
     */
    private String email;

    /**
     * Fax number.
     */
    private String fax;

    /**
     * Job title.
     */
    private String jobTitle;

    /**
     * First name.
     */
    private String nameFirst;

    /**
     * Last name.
     */
    private String nameLast;

    /**
     * Middle name.
     */
    private String nameMiddle;

    /**
     * Organization.
     */
    private String organization;

    /**
     * Phone number.
     */
    private String phone;

    /**
     * Get the addressMailing value.
     *
     * @return the addressMailing value
     */
    public Address getAddressMailing() {
        return this.addressMailing;
    }

    /**
     * Set the addressMailing value.
     *
     * @param addressMailing the addressMailing value to set
     */
    public void setAddressMailing(Address addressMailing) {
        this.addressMailing = addressMailing;
    }

    /**
     * Get the email value.
     *
     * @return the email value
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email value.
     *
     * @param email the email value to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the fax value.
     *
     * @return the fax value
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Set the fax value.
     *
     * @param fax the fax value to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Get the jobTitle value.
     *
     * @return the jobTitle value
     */
    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle value.
     *
     * @param jobTitle the jobTitle value to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Get the nameFirst value.
     *
     * @return the nameFirst value
     */
    public String getNameFirst() {
        return this.nameFirst;
    }

    /**
     * Set the nameFirst value.
     *
     * @param nameFirst the nameFirst value to set
     */
    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    /**
     * Get the nameLast value.
     *
     * @return the nameLast value
     */
    public String getNameLast() {
        return this.nameLast;
    }

    /**
     * Set the nameLast value.
     *
     * @param nameLast the nameLast value to set
     */
    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    /**
     * Get the nameMiddle value.
     *
     * @return the nameMiddle value
     */
    public String getNameMiddle() {
        return this.nameMiddle;
    }

    /**
     * Set the nameMiddle value.
     *
     * @param nameMiddle the nameMiddle value to set
     */
    public void setNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
    }

    /**
     * Get the organization value.
     *
     * @return the organization value
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization value.
     *
     * @param organization the organization value to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Get the phone value.
     *
     * @return the phone value
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Set the phone value.
     *
     * @param phone the phone value to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
