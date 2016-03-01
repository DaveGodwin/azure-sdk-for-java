/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Certificate signing request object.
 */
@JsonFlatten
public class Csr extends Resource {
    /**
     * Name used to locate CSR object.
     */
    @JsonProperty(value = "properties.name")
    private String csrName;

    /**
     * Distinguished name of certificate to be created.
     */
    @JsonProperty(value = "properties.distinguishedName")
    private String distinguishedName;

    /**
     * Actual CSR string created.
     */
    @JsonProperty(value = "properties.csrString")
    private String csrString;

    /**
     * PFX certifcate of created certificate.
     */
    @JsonProperty(value = "properties.pfxBlob")
    private String pfxBlob;

    /**
     * PFX password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Hash of the certificates public key.
     */
    @JsonProperty(value = "properties.publicKeyHash")
    private String publicKeyHash;

    /**
     * Hosting environment.
     */
    @JsonProperty(value = "properties.hostingEnvironment")
    private String hostingEnvironment;

    /**
     * Get the csrName value.
     *
     * @return the csrName value
     */
    public String getCsrName() {
        return this.csrName;
    }

    /**
     * Set the csrName value.
     *
     * @param csrName the csrName value to set
     */
    public void setCsrName(String csrName) {
        this.csrName = csrName;
    }

    /**
     * Get the distinguishedName value.
     *
     * @return the distinguishedName value
     */
    public String getDistinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set the distinguishedName value.
     *
     * @param distinguishedName the distinguishedName value to set
     */
    public void setDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    /**
     * Get the csrString value.
     *
     * @return the csrString value
     */
    public String getCsrString() {
        return this.csrString;
    }

    /**
     * Set the csrString value.
     *
     * @param csrString the csrString value to set
     */
    public void setCsrString(String csrString) {
        this.csrString = csrString;
    }

    /**
     * Get the pfxBlob value.
     *
     * @return the pfxBlob value
     */
    public String getPfxBlob() {
        return this.pfxBlob;
    }

    /**
     * Set the pfxBlob value.
     *
     * @param pfxBlob the pfxBlob value to set
     */
    public void setPfxBlob(String pfxBlob) {
        this.pfxBlob = pfxBlob;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the publicKeyHash value.
     *
     * @return the publicKeyHash value
     */
    public String getPublicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Set the publicKeyHash value.
     *
     * @param publicKeyHash the publicKeyHash value to set
     */
    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }

    /**
     * Get the hostingEnvironment value.
     *
     * @return the hostingEnvironment value
     */
    public String getHostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment value.
     *
     * @param hostingEnvironment the hostingEnvironment value to set
     */
    public void setHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
    }

}
