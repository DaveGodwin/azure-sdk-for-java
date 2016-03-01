/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import java.util.List;

/**
 * Class containing names for connection strings and application settings to
 * be marked as sticky to the slot
 * and not moved during swap operation
 * This is valid for all deployment slots under the site.
 */
public class SlotConfigNames {
    /**
     * List of connection string names.
     */
    private List<String> connectionStringNames;

    /**
     * List of application settings names.
     */
    private List<String> appSettingNames;

    /**
     * Get the connectionStringNames value.
     *
     * @return the connectionStringNames value
     */
    public List<String> getConnectionStringNames() {
        return this.connectionStringNames;
    }

    /**
     * Set the connectionStringNames value.
     *
     * @param connectionStringNames the connectionStringNames value to set
     */
    public void setConnectionStringNames(List<String> connectionStringNames) {
        this.connectionStringNames = connectionStringNames;
    }

    /**
     * Get the appSettingNames value.
     *
     * @return the appSettingNames value
     */
    public List<String> getAppSettingNames() {
        return this.appSettingNames;
    }

    /**
     * Set the appSettingNames value.
     *
     * @param appSettingNames the appSettingNames value to set
     */
    public void setAppSettingNames(List<String> appSettingNames) {
        this.appSettingNames = appSettingNames;
    }

}
