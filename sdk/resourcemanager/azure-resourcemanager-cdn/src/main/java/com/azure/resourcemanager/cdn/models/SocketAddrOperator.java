// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes operator to be matched. */
public final class SocketAddrOperator extends ExpandableStringEnum<SocketAddrOperator> {
    /** Static value Any for SocketAddrOperator. */
    public static final SocketAddrOperator ANY = fromString("Any");

    /** Static value IPMatch for SocketAddrOperator. */
    public static final SocketAddrOperator IPMATCH = fromString("IPMatch");

    /**
     * Creates a new instance of SocketAddrOperator value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SocketAddrOperator() {
    }

    /**
     * Creates or finds a SocketAddrOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SocketAddrOperator.
     */
    @JsonCreator
    public static SocketAddrOperator fromString(String name) {
        return fromString(name, SocketAddrOperator.class);
    }

    /**
     * Gets known SocketAddrOperator values.
     *
     * @return known SocketAddrOperator values.
     */
    public static Collection<SocketAddrOperator> values() {
        return values(SocketAddrOperator.class);
    }
}
