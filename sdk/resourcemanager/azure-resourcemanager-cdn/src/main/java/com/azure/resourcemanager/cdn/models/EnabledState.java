// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'. */
public final class EnabledState extends ExpandableStringEnum<EnabledState> {
    /** Static value Enabled for EnabledState. */
    public static final EnabledState ENABLED = fromString("Enabled");

    /** Static value Disabled for EnabledState. */
    public static final EnabledState DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of EnabledState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnabledState() {
    }

    /**
     * Creates or finds a EnabledState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnabledState.
     */
    @JsonCreator
    public static EnabledState fromString(String name) {
        return fromString(name, EnabledState.class);
    }

    /**
     * Gets known EnabledState values.
     *
     * @return known EnabledState values.
     */
    public static Collection<EnabledState> values() {
        return values(EnabledState.class);
    }
}
