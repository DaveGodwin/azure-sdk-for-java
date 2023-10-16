// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rules defining user's geo access within a CDN endpoint. */
@Fluent
public final class GeoFilter {
    /*
     * Relative path applicable to geo filter. (e.g. '/mypictures', '/mypicture/kitty.jpg', and etc.)
     */
    @JsonProperty(value = "relativePath", required = true)
    private String relativePath;

    /*
     * Action of the geo filter, i.e. allow or block access.
     */
    @JsonProperty(value = "action", required = true)
    private GeoFilterActions action;

    /*
     * Two letter country or region codes defining user country or region access in a geo filter, e.g. AU, MX, US.
     */
    @JsonProperty(value = "countryCodes", required = true)
    private List<String> countryCodes;

    /** Creates an instance of GeoFilter class. */
    public GeoFilter() {
    }

    /**
     * Get the relativePath property: Relative path applicable to geo filter. (e.g. '/mypictures',
     * '/mypicture/kitty.jpg', and etc.).
     *
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: Relative path applicable to geo filter. (e.g. '/mypictures',
     * '/mypicture/kitty.jpg', and etc.).
     *
     * @param relativePath the relativePath value to set.
     * @return the GeoFilter object itself.
     */
    public GeoFilter withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Get the action property: Action of the geo filter, i.e. allow or block access.
     *
     * @return the action value.
     */
    public GeoFilterActions action() {
        return this.action;
    }

    /**
     * Set the action property: Action of the geo filter, i.e. allow or block access.
     *
     * @param action the action value to set.
     * @return the GeoFilter object itself.
     */
    public GeoFilter withAction(GeoFilterActions action) {
        this.action = action;
        return this;
    }

    /**
     * Get the countryCodes property: Two letter country or region codes defining user country or region access in a geo
     * filter, e.g. AU, MX, US.
     *
     * @return the countryCodes value.
     */
    public List<String> countryCodes() {
        return this.countryCodes;
    }

    /**
     * Set the countryCodes property: Two letter country or region codes defining user country or region access in a geo
     * filter, e.g. AU, MX, US.
     *
     * @param countryCodes the countryCodes value to set.
     * @return the GeoFilter object itself.
     */
    public GeoFilter withCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (relativePath() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property relativePath in model GeoFilter"));
        }
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model GeoFilter"));
        }
        if (countryCodes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property countryCodes in model GeoFilter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GeoFilter.class);
}
