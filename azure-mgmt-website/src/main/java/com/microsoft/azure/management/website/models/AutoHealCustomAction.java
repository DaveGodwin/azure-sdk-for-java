/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * AutoHealCustomAction - Describes the custom action to be executed
 * when an auto heal rule is triggered.
 */
public class AutoHealCustomAction {
    /**
     * Executable to be run.
     */
    private String exe;

    /**
     * Parameters for the executable.
     */
    private String parameters;

    /**
     * Get the exe value.
     *
     * @return the exe value
     */
    public String getExe() {
        return this.exe;
    }

    /**
     * Set the exe value.
     *
     * @param exe the exe value to set
     */
    public void setExe(String exe) {
        this.exe = exe;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

}
