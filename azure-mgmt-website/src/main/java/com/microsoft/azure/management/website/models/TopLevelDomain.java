/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A top level domain object.
 */
@JsonFlatten
public class TopLevelDomain extends Resource {
    /**
     * Name of the top level domain.
     */
    @JsonProperty(value = "properties.name")
    private String topLevelDomainName;

    /**
     * If true then the top level domain supports domain privacy.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /**
     * Get the topLevelDomainName value.
     *
     * @return the topLevelDomainName value
     */
    public String getTopLevelDomainName() {
        return this.topLevelDomainName;
    }

    /**
     * Set the topLevelDomainName value.
     *
     * @param topLevelDomainName the topLevelDomainName value to set
     */
    public void setTopLevelDomainName(String topLevelDomainName) {
        this.topLevelDomainName = topLevelDomainName;
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

}
