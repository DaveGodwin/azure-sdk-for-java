/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutoHealActions - Describes the actions which can be
 * taken by the auto-heal module when a rule is triggered.
 */
public class AutoHealActions {
    /**
     * ActionType - predefined action to be taken. Possible values include:
     * 'Recycle', 'LogEvent', 'CustomAction'.
     */
    @JsonProperty(required = true)
    private AutoHealActionType actionType;

    /**
     * CustomAction - custom action to be taken.
     */
    private AutoHealCustomAction customAction;

    /**
     * MinProcessExecutionTime - minimum time the process must execute
     * before taking the action.
     */
    private String minProcessExecutionTime;

    /**
     * Get the actionType value.
     *
     * @return the actionType value
     */
    public AutoHealActionType getActionType() {
        return this.actionType;
    }

    /**
     * Set the actionType value.
     *
     * @param actionType the actionType value to set
     */
    public void setActionType(AutoHealActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * Get the customAction value.
     *
     * @return the customAction value
     */
    public AutoHealCustomAction getCustomAction() {
        return this.customAction;
    }

    /**
     * Set the customAction value.
     *
     * @param customAction the customAction value to set
     */
    public void setCustomAction(AutoHealCustomAction customAction) {
        this.customAction = customAction;
    }

    /**
     * Get the minProcessExecutionTime value.
     *
     * @return the minProcessExecutionTime value
     */
    public String getMinProcessExecutionTime() {
        return this.minProcessExecutionTime;
    }

    /**
     * Set the minProcessExecutionTime value.
     *
     * @param minProcessExecutionTime the minProcessExecutionTime value to set
     */
    public void setMinProcessExecutionTime(String minProcessExecutionTime) {
        this.minProcessExecutionTime = minProcessExecutionTime;
    }

}
