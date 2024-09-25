// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of preferred application group type, default to Desktop Application Group.
 */
public final class PreferredAppGroupType extends ExpandableStringEnum<PreferredAppGroupType> {
    /**
     * Static value None for PreferredAppGroupType.
     */
    public static final PreferredAppGroupType NONE = fromString("None");

    /**
     * Static value Desktop for PreferredAppGroupType.
     */
    public static final PreferredAppGroupType DESKTOP = fromString("Desktop");

    /**
     * Static value RailApplications for PreferredAppGroupType.
     */
    public static final PreferredAppGroupType RAIL_APPLICATIONS = fromString("RailApplications");

    /**
     * Creates a new instance of PreferredAppGroupType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PreferredAppGroupType() {
    }

    /**
     * Creates or finds a PreferredAppGroupType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PreferredAppGroupType.
     */
    public static PreferredAppGroupType fromString(String name) {
        return fromString(name, PreferredAppGroupType.class);
    }

    /**
     * Gets known PreferredAppGroupType values.
     * 
     * @return known PreferredAppGroupType values.
     */
    public static Collection<PreferredAppGroupType> values() {
        return values(PreferredAppGroupType.class);
    }
}
