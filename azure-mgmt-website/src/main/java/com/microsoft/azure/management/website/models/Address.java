/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Address information for domain registration.
 */
public class Address {
    /**
     * Address 1.
     */
    private String address1;

    /**
     * Address 2.
     */
    private String address2;

    /**
     * City.
     */
    private String city;

    /**
     * Country.
     */
    private String country;

    /**
     * Postal code.
     */
    private String postalCode;

    /**
     * State.
     */
    private String state;

    /**
     * Get the address1 value.
     *
     * @return the address1 value
     */
    public String getAddress1() {
        return this.address1;
    }

    /**
     * Set the address1 value.
     *
     * @param address1 the address1 value to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Get the address2 value.
     *
     * @return the address2 value
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * Set the address2 value.
     *
     * @param address2 the address2 value to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Get the city value.
     *
     * @return the city value
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Set the city value.
     *
     * @param city the city value to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the country value.
     *
     * @return the country value
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Set the country value.
     *
     * @param country the country value to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get the postalCode value.
     *
     * @return the postalCode value
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode value.
     *
     * @param postalCode the postalCode value to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     */
    public void setState(String state) {
        this.state = state;
    }

}
