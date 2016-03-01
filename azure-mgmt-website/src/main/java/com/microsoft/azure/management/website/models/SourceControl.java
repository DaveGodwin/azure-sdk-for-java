/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes the Source Control OAuth Token.
 */
@JsonFlatten
public class SourceControl extends Resource {
    /**
     * Name or Source Control Type.
     */
    @JsonProperty(value = "properties.name")
    private String sourceControlName;

    /**
     * OAuth Access Token.
     */
    @JsonProperty(value = "properties.token")
    private String token;

    /**
     * OAuth Access Token Secret.
     */
    @JsonProperty(value = "properties.tokenSecret")
    private String tokenSecret;

    /**
     * OAuth Refresh Token.
     */
    @JsonProperty(value = "properties.refreshToken")
    private String refreshToken;

    /**
     * OAuth Token Expiration.
     */
    @JsonProperty(value = "properties.expirationTime")
    private DateTime expirationTime;

    /**
     * Get the sourceControlName value.
     *
     * @return the sourceControlName value
     */
    public String getSourceControlName() {
        return this.sourceControlName;
    }

    /**
     * Set the sourceControlName value.
     *
     * @param sourceControlName the sourceControlName value to set
     */
    public void setSourceControlName(String sourceControlName) {
        this.sourceControlName = sourceControlName;
    }

    /**
     * Get the token value.
     *
     * @return the token value
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token value.
     *
     * @param token the token value to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Get the tokenSecret value.
     *
     * @return the tokenSecret value
     */
    public String getTokenSecret() {
        return this.tokenSecret;
    }

    /**
     * Set the tokenSecret value.
     *
     * @param tokenSecret the tokenSecret value to set
     */
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    /**
     * Get the refreshToken value.
     *
     * @return the refreshToken value
     */
    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken value.
     *
     * @param refreshToken the refreshToken value to set
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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

}
