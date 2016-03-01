/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;
import org.joda.time.DateTime;

/**
 * Domain purchase consent object representing acceptance of applicable legal
 * agreements.
 */
public class DomainPurchaseConsent {
    /**
     * List of applicable legal agreement keys. This list can be retrieved
     * using ListLegalAgreements Api under TopLevelDomain resource.
     */
    private List<String> agreementKeys;

    /**
     * Client IP address.
     */
    private String agreedBy;

    /**
     * Timestamp when the agreements were accepted.
     */
    private DateTime agreedAt;

    /**
     * Get the agreementKeys value.
     *
     * @return the agreementKeys value
     */
    public List<String> getAgreementKeys() {
        return this.agreementKeys;
    }

    /**
     * Set the agreementKeys value.
     *
     * @param agreementKeys the agreementKeys value to set
     */
    public void setAgreementKeys(List<String> agreementKeys) {
        this.agreementKeys = agreementKeys;
    }

    /**
     * Get the agreedBy value.
     *
     * @return the agreedBy value
     */
    public String getAgreedBy() {
        return this.agreedBy;
    }

    /**
     * Set the agreedBy value.
     *
     * @param agreedBy the agreedBy value to set
     */
    public void setAgreedBy(String agreedBy) {
        this.agreedBy = agreedBy;
    }

    /**
     * Get the agreedAt value.
     *
     * @return the agreedAt value
     */
    public DateTime getAgreedAt() {
        return this.agreedAt;
    }

    /**
     * Set the agreedAt value.
     *
     * @param agreedAt the agreedAt value to set
     */
    public void setAgreedAt(DateTime agreedAt) {
        this.agreedAt = agreedAt;
    }

}
