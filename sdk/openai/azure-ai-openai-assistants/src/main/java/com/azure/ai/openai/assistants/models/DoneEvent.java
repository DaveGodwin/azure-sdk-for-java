// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Terminal event indicating the successful end of a stream.
 */
public final class DoneEvent extends ExpandableStringEnum<DoneEvent> {

    /**
     * Event sent when the stream is done.
     */
    @Generated
    public static final DoneEvent DONE = fromString("done");

    /**
     * Creates a new instance of DoneEvent value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DoneEvent() {
    }

    /**
     * Creates or finds a DoneEvent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DoneEvent.
     */
    @Generated
    public static DoneEvent fromString(String name) {
        return fromString(name, DoneEvent.class);
    }

    /**
     * Gets known DoneEvent values.
     *
     * @return known DoneEvent values.
     */
    @Generated
    public static Collection<DoneEvent> values() {
        return values(DoneEvent.class);
    }
}
