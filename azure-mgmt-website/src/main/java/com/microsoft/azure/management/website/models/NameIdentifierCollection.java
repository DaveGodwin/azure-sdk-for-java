/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Collection of domain name identifiers.
 */
public class NameIdentifierCollection {
    /**
     * Collection of resources.
     */
    private List<NameIdentifier> value;

    /**
     * Link to next page of resources.
     */
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<NameIdentifier> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<NameIdentifier> value) {
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
