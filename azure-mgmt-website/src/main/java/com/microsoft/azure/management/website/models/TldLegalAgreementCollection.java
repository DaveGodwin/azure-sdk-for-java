/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Collection of Tld Legal Agreements.
 */
public class TldLegalAgreementCollection {
    /**
     * Collection of resources.
     */
    private List<TldLegalAgreement> value;

    /**
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<TldLegalAgreement> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<TldLegalAgreement> value) {
        this.value = value;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     */
    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

}
