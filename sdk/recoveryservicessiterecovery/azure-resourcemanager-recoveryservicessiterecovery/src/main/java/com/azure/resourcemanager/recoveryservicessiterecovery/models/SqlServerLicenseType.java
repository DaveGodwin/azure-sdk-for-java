// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The SQL Server license type. */
public final class SqlServerLicenseType extends ExpandableStringEnum<SqlServerLicenseType> {
    /** Static value NotSpecified for SqlServerLicenseType. */
    public static final SqlServerLicenseType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value NoLicenseType for SqlServerLicenseType. */
    public static final SqlServerLicenseType NO_LICENSE_TYPE = fromString("NoLicenseType");

    /** Static value PAYG for SqlServerLicenseType. */
    public static final SqlServerLicenseType PAYG = fromString("PAYG");

    /** Static value AHUB for SqlServerLicenseType. */
    public static final SqlServerLicenseType AHUB = fromString("AHUB");

    /**
     * Creates or finds a SqlServerLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlServerLicenseType.
     */
    @JsonCreator
    public static SqlServerLicenseType fromString(String name) {
        return fromString(name, SqlServerLicenseType.class);
    }

    /**
     * Gets known SqlServerLicenseType values.
     *
     * @return known SqlServerLicenseType values.
     */
    public static Collection<SqlServerLicenseType> values() {
        return values(SqlServerLicenseType.class);
    }
}
