/**
 * Object]
 */

package com.microsoft.azure.management.compute.models;


/**
 * Gets or sets additional XML formatted information that can be included in
 * the Unattend.xml file, which is used by Windows Setup. Contents are
 * defined by setting name, component name, and the pass in which the content
 * is a applied.
 */
public class AdditionalUnattendContent {
    /**
     * Gets or sets the pass name. Currently, the only allowable value is
     * oobeSystem. Possible values include: 'oobeSystem'.
     */
    private String passName;

    /**
     * Gets or sets the component name. Currently, the only allowable value is
     * Microsoft-Windows-Shell-Setup. Possible values include:
     * 'Microsoft-Windows-Shell-Setup'.
     */
    private String componentName;

    /**
     * Gets or sets setting name (e.g. FirstLogonCommands, AutoLogon ).
     * Possible values include: 'AutoLogon', 'FirstLogonCommands'.
     */
    private String settingName;

    /**
     * Gets or sets XML formatted content that is added to the unattend.xml
     * file in the specified pass and component.The XML must be less than 4
     * KB and must include the root element for the setting or feature that
     * is being inserted.
     */
    private String content;

    /**
     * Get the passName value.
     *
     * @return the passName value
     */
    public String getPassName() {
        return this.passName;
    }

    /**
     * Set the passName value.
     *
     * @param passName the passName value to set
     */
    public void setPassName(String passName) {
        this.passName = passName;
    }

    /**
     * Get the componentName value.
     *
     * @return the componentName value
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * Set the componentName value.
     *
     * @param componentName the componentName value to set
     */
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Get the settingName value.
     *
     * @return the settingName value
     */
    public String getSettingName() {
        return this.settingName;
    }

    /**
     * Set the settingName value.
     *
     * @param settingName the settingName value to set
     */
    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     */
    public void setContent(String content) {
        this.content = content;
    }

}
