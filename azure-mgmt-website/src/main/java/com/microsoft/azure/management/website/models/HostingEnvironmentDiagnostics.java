/**
 * Object]
 */

package com.microsoft.azure.management.website.models;


/**
 * Diagnostics for a hosting environment (App Service Environment).
 */
public class HostingEnvironmentDiagnostics {
    /**
     * Name/identifier of the diagnostics.
     */
    private String name;

    /**
     * Diagnostics output.
     */
    private String diagnosicsOutput;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the diagnosicsOutput value.
     *
     * @return the diagnosicsOutput value
     */
    public String getDiagnosicsOutput() {
        return this.diagnosicsOutput;
    }

    /**
     * Set the diagnosicsOutput value.
     *
     * @param diagnosicsOutput the diagnosicsOutput value to set
     */
    public void setDiagnosicsOutput(String diagnosicsOutput) {
        this.diagnosicsOutput = diagnosicsOutput;
    }

}
