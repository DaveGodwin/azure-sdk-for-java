/**
 * Object]
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Configuration of Azure web site.
 */
@JsonFlatten
public class SiteConfig extends Resource {
    /**
     * Number of workers.
     */
    @JsonProperty(value = "properties.numberOfWorkers")
    private Integer numberOfWorkers;

    /**
     * Default documents.
     */
    @JsonProperty(value = "properties.defaultDocuments")
    private List<String> defaultDocuments;

    /**
     * Net Framework Version.
     */
    @JsonProperty(value = "properties.netFrameworkVersion")
    private String netFrameworkVersion;

    /**
     * Version of PHP.
     */
    @JsonProperty(value = "properties.phpVersion")
    private String phpVersion;

    /**
     * Version of Python.
     */
    @JsonProperty(value = "properties.pythonVersion")
    private String pythonVersion;

    /**
     * Enable request tracing.
     */
    @JsonProperty(value = "properties.requestTracingEnabled")
    private Boolean requestTracingEnabled;

    /**
     * Request tracing expiration time.
     */
    @JsonProperty(value = "properties.requestTracingExpirationTime")
    private DateTime requestTracingExpirationTime;

    /**
     * Remote Debugging Enabled.
     */
    @JsonProperty(value = "properties.remoteDebuggingEnabled")
    private Boolean remoteDebuggingEnabled;

    /**
     * Remote Debugging Version.
     */
    @JsonProperty(value = "properties.remoteDebuggingVersion")
    private String remoteDebuggingVersion;

    /**
     * HTTP logging Enabled.
     */
    @JsonProperty(value = "properties.httpLoggingEnabled")
    private Boolean httpLoggingEnabled;

    /**
     * HTTP Logs Directory size limit.
     */
    @JsonProperty(value = "properties.logsDirectorySizeLimit")
    private Integer logsDirectorySizeLimit;

    /**
     * Detailed error logging enabled.
     */
    @JsonProperty(value = "properties.detailedErrorLoggingEnabled")
    private Boolean detailedErrorLoggingEnabled;

    /**
     * Publishing user name.
     */
    @JsonProperty(value = "properties.publishingUsername")
    private String publishingUsername;

    /**
     * Publishing password.
     */
    @JsonProperty(value = "properties.publishingPassword")
    private String publishingPassword;

    /**
     * Application Settings.
     */
    @JsonProperty(value = "properties.appSettings")
    private List<NameValuePair> appSettings;

    /**
     * Site Metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private List<NameValuePair> metadata;

    /**
     * Connection strings.
     */
    @JsonProperty(value = "properties.connectionStrings")
    private List<ConnStringInfo> connectionStrings;

    /**
     * Handler mappings.
     */
    @JsonProperty(value = "properties.handlerMappings")
    private List<HandlerMapping> handlerMappings;

    /**
     * Document root.
     */
    @JsonProperty(value = "properties.documentRoot")
    private String documentRoot;

    /**
     * SCM type.
     */
    @JsonProperty(value = "properties.scmType")
    private String scmType;

    /**
     * Use 32 bit worker process.
     */
    @JsonProperty(value = "properties.use32BitWorkerProcess")
    private Boolean use32BitWorkerProcess;

    /**
     * Web socket enabled.
     */
    @JsonProperty(value = "properties.webSocketsEnabled")
    private Boolean webSocketsEnabled;

    /**
     * Always On.
     */
    @JsonProperty(value = "properties.alwaysOn")
    private Boolean alwaysOn;

    /**
     * Java version.
     */
    @JsonProperty(value = "properties.javaVersion")
    private String javaVersion;

    /**
     * Java container.
     */
    @JsonProperty(value = "properties.javaContainer")
    private String javaContainer;

    /**
     * Java container version.
     */
    @JsonProperty(value = "properties.javaContainerVersion")
    private String javaContainerVersion;

    /**
     * Managed pipeline mode. Possible values include: 'Integrated', 'Classic'.
     */
    @JsonProperty(value = "properties.managedPipelineMode")
    private ManagedPipelineMode managedPipelineMode;

    /**
     * Virtual applications.
     */
    @JsonProperty(value = "properties.virtualApplications")
    private List<VirtualApplication> virtualApplications;

    /**
     * Site load balancing. Possible values include: 'WeightedRoundRobin',
     * 'LeastRequests', 'LeastResponseTime', 'WeightedTotalTraffic',
     * 'RequestHash'.
     */
    @JsonProperty(value = "properties.loadBalancing")
    private SiteLoadBalancing loadBalancing;

    /**
     * This is work around for polymophic types.
     */
    @JsonProperty(value = "properties.experiments")
    private Experiments experiments;

    /**
     * Site limits.
     */
    @JsonProperty(value = "properties.limits")
    private SiteLimits limits;

    /**
     * Auto heal enabled.
     */
    @JsonProperty(value = "properties.autoHealEnabled")
    private Boolean autoHealEnabled;

    /**
     * Auto heal rules.
     */
    @JsonProperty(value = "properties.autoHealRules")
    private AutoHealRules autoHealRules;

    /**
     * Tracing options.
     */
    @JsonProperty(value = "properties.tracingOptions")
    private String tracingOptions;

    /**
     * Vnet name.
     */
    @JsonProperty(value = "properties.vnetName")
    private String vnetName;

    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "properties.cors")
    private CorsSettings cors;

    /**
     * Information about the formal API definition for the web app.
     */
    @JsonProperty(value = "properties.apiDefinition")
    private ApiDefinitionInfo apiDefinition;

    /**
     * Auto swap slot name.
     */
    @JsonProperty(value = "properties.autoSwapSlotName")
    private String autoSwapSlotName;

    /**
     * Local mysql enabled.
     */
    @JsonProperty(value = "properties.localMySqlEnabled")
    private Boolean localMySqlEnabled;

    /**
     * Get the numberOfWorkers value.
     *
     * @return the numberOfWorkers value
     */
    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Set the numberOfWorkers value.
     *
     * @param numberOfWorkers the numberOfWorkers value to set
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * Get the defaultDocuments value.
     *
     * @return the defaultDocuments value
     */
    public List<String> getDefaultDocuments() {
        return this.defaultDocuments;
    }

    /**
     * Set the defaultDocuments value.
     *
     * @param defaultDocuments the defaultDocuments value to set
     */
    public void setDefaultDocuments(List<String> defaultDocuments) {
        this.defaultDocuments = defaultDocuments;
    }

    /**
     * Get the netFrameworkVersion value.
     *
     * @return the netFrameworkVersion value
     */
    public String getNetFrameworkVersion() {
        return this.netFrameworkVersion;
    }

    /**
     * Set the netFrameworkVersion value.
     *
     * @param netFrameworkVersion the netFrameworkVersion value to set
     */
    public void setNetFrameworkVersion(String netFrameworkVersion) {
        this.netFrameworkVersion = netFrameworkVersion;
    }

    /**
     * Get the phpVersion value.
     *
     * @return the phpVersion value
     */
    public String getPhpVersion() {
        return this.phpVersion;
    }

    /**
     * Set the phpVersion value.
     *
     * @param phpVersion the phpVersion value to set
     */
    public void setPhpVersion(String phpVersion) {
        this.phpVersion = phpVersion;
    }

    /**
     * Get the pythonVersion value.
     *
     * @return the pythonVersion value
     */
    public String getPythonVersion() {
        return this.pythonVersion;
    }

    /**
     * Set the pythonVersion value.
     *
     * @param pythonVersion the pythonVersion value to set
     */
    public void setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    /**
     * Get the requestTracingEnabled value.
     *
     * @return the requestTracingEnabled value
     */
    public Boolean getRequestTracingEnabled() {
        return this.requestTracingEnabled;
    }

    /**
     * Set the requestTracingEnabled value.
     *
     * @param requestTracingEnabled the requestTracingEnabled value to set
     */
    public void setRequestTracingEnabled(Boolean requestTracingEnabled) {
        this.requestTracingEnabled = requestTracingEnabled;
    }

    /**
     * Get the requestTracingExpirationTime value.
     *
     * @return the requestTracingExpirationTime value
     */
    public DateTime getRequestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }

    /**
     * Set the requestTracingExpirationTime value.
     *
     * @param requestTracingExpirationTime the requestTracingExpirationTime value to set
     */
    public void setRequestTracingExpirationTime(DateTime requestTracingExpirationTime) {
        this.requestTracingExpirationTime = requestTracingExpirationTime;
    }

    /**
     * Get the remoteDebuggingEnabled value.
     *
     * @return the remoteDebuggingEnabled value
     */
    public Boolean getRemoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }

    /**
     * Set the remoteDebuggingEnabled value.
     *
     * @param remoteDebuggingEnabled the remoteDebuggingEnabled value to set
     */
    public void setRemoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
    }

    /**
     * Get the remoteDebuggingVersion value.
     *
     * @return the remoteDebuggingVersion value
     */
    public String getRemoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }

    /**
     * Set the remoteDebuggingVersion value.
     *
     * @param remoteDebuggingVersion the remoteDebuggingVersion value to set
     */
    public void setRemoteDebuggingVersion(String remoteDebuggingVersion) {
        this.remoteDebuggingVersion = remoteDebuggingVersion;
    }

    /**
     * Get the httpLoggingEnabled value.
     *
     * @return the httpLoggingEnabled value
     */
    public Boolean getHttpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }

    /**
     * Set the httpLoggingEnabled value.
     *
     * @param httpLoggingEnabled the httpLoggingEnabled value to set
     */
    public void setHttpLoggingEnabled(Boolean httpLoggingEnabled) {
        this.httpLoggingEnabled = httpLoggingEnabled;
    }

    /**
     * Get the logsDirectorySizeLimit value.
     *
     * @return the logsDirectorySizeLimit value
     */
    public Integer getLogsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }

    /**
     * Set the logsDirectorySizeLimit value.
     *
     * @param logsDirectorySizeLimit the logsDirectorySizeLimit value to set
     */
    public void setLogsDirectorySizeLimit(Integer logsDirectorySizeLimit) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimit;
    }

    /**
     * Get the detailedErrorLoggingEnabled value.
     *
     * @return the detailedErrorLoggingEnabled value
     */
    public Boolean getDetailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }

    /**
     * Set the detailedErrorLoggingEnabled value.
     *
     * @param detailedErrorLoggingEnabled the detailedErrorLoggingEnabled value to set
     */
    public void setDetailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
    }

    /**
     * Get the publishingUsername value.
     *
     * @return the publishingUsername value
     */
    public String getPublishingUsername() {
        return this.publishingUsername;
    }

    /**
     * Set the publishingUsername value.
     *
     * @param publishingUsername the publishingUsername value to set
     */
    public void setPublishingUsername(String publishingUsername) {
        this.publishingUsername = publishingUsername;
    }

    /**
     * Get the publishingPassword value.
     *
     * @return the publishingPassword value
     */
    public String getPublishingPassword() {
        return this.publishingPassword;
    }

    /**
     * Set the publishingPassword value.
     *
     * @param publishingPassword the publishingPassword value to set
     */
    public void setPublishingPassword(String publishingPassword) {
        this.publishingPassword = publishingPassword;
    }

    /**
     * Get the appSettings value.
     *
     * @return the appSettings value
     */
    public List<NameValuePair> getAppSettings() {
        return this.appSettings;
    }

    /**
     * Set the appSettings value.
     *
     * @param appSettings the appSettings value to set
     */
    public void setAppSettings(List<NameValuePair> appSettings) {
        this.appSettings = appSettings;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<NameValuePair> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     */
    public void setMetadata(List<NameValuePair> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the connectionStrings value.
     *
     * @return the connectionStrings value
     */
    public List<ConnStringInfo> getConnectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set the connectionStrings value.
     *
     * @param connectionStrings the connectionStrings value to set
     */
    public void setConnectionStrings(List<ConnStringInfo> connectionStrings) {
        this.connectionStrings = connectionStrings;
    }

    /**
     * Get the handlerMappings value.
     *
     * @return the handlerMappings value
     */
    public List<HandlerMapping> getHandlerMappings() {
        return this.handlerMappings;
    }

    /**
     * Set the handlerMappings value.
     *
     * @param handlerMappings the handlerMappings value to set
     */
    public void setHandlerMappings(List<HandlerMapping> handlerMappings) {
        this.handlerMappings = handlerMappings;
    }

    /**
     * Get the documentRoot value.
     *
     * @return the documentRoot value
     */
    public String getDocumentRoot() {
        return this.documentRoot;
    }

    /**
     * Set the documentRoot value.
     *
     * @param documentRoot the documentRoot value to set
     */
    public void setDocumentRoot(String documentRoot) {
        this.documentRoot = documentRoot;
    }

    /**
     * Get the scmType value.
     *
     * @return the scmType value
     */
    public String getScmType() {
        return this.scmType;
    }

    /**
     * Set the scmType value.
     *
     * @param scmType the scmType value to set
     */
    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    /**
     * Get the use32BitWorkerProcess value.
     *
     * @return the use32BitWorkerProcess value
     */
    public Boolean getUse32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }

    /**
     * Set the use32BitWorkerProcess value.
     *
     * @param use32BitWorkerProcess the use32BitWorkerProcess value to set
     */
    public void setUse32BitWorkerProcess(Boolean use32BitWorkerProcess) {
        this.use32BitWorkerProcess = use32BitWorkerProcess;
    }

    /**
     * Get the webSocketsEnabled value.
     *
     * @return the webSocketsEnabled value
     */
    public Boolean getWebSocketsEnabled() {
        return this.webSocketsEnabled;
    }

    /**
     * Set the webSocketsEnabled value.
     *
     * @param webSocketsEnabled the webSocketsEnabled value to set
     */
    public void setWebSocketsEnabled(Boolean webSocketsEnabled) {
        this.webSocketsEnabled = webSocketsEnabled;
    }

    /**
     * Get the alwaysOn value.
     *
     * @return the alwaysOn value
     */
    public Boolean getAlwaysOn() {
        return this.alwaysOn;
    }

    /**
     * Set the alwaysOn value.
     *
     * @param alwaysOn the alwaysOn value to set
     */
    public void setAlwaysOn(Boolean alwaysOn) {
        this.alwaysOn = alwaysOn;
    }

    /**
     * Get the javaVersion value.
     *
     * @return the javaVersion value
     */
    public String getJavaVersion() {
        return this.javaVersion;
    }

    /**
     * Set the javaVersion value.
     *
     * @param javaVersion the javaVersion value to set
     */
    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    /**
     * Get the javaContainer value.
     *
     * @return the javaContainer value
     */
    public String getJavaContainer() {
        return this.javaContainer;
    }

    /**
     * Set the javaContainer value.
     *
     * @param javaContainer the javaContainer value to set
     */
    public void setJavaContainer(String javaContainer) {
        this.javaContainer = javaContainer;
    }

    /**
     * Get the javaContainerVersion value.
     *
     * @return the javaContainerVersion value
     */
    public String getJavaContainerVersion() {
        return this.javaContainerVersion;
    }

    /**
     * Set the javaContainerVersion value.
     *
     * @param javaContainerVersion the javaContainerVersion value to set
     */
    public void setJavaContainerVersion(String javaContainerVersion) {
        this.javaContainerVersion = javaContainerVersion;
    }

    /**
     * Get the managedPipelineMode value.
     *
     * @return the managedPipelineMode value
     */
    public ManagedPipelineMode getManagedPipelineMode() {
        return this.managedPipelineMode;
    }

    /**
     * Set the managedPipelineMode value.
     *
     * @param managedPipelineMode the managedPipelineMode value to set
     */
    public void setManagedPipelineMode(ManagedPipelineMode managedPipelineMode) {
        this.managedPipelineMode = managedPipelineMode;
    }

    /**
     * Get the virtualApplications value.
     *
     * @return the virtualApplications value
     */
    public List<VirtualApplication> getVirtualApplications() {
        return this.virtualApplications;
    }

    /**
     * Set the virtualApplications value.
     *
     * @param virtualApplications the virtualApplications value to set
     */
    public void setVirtualApplications(List<VirtualApplication> virtualApplications) {
        this.virtualApplications = virtualApplications;
    }

    /**
     * Get the loadBalancing value.
     *
     * @return the loadBalancing value
     */
    public SiteLoadBalancing getLoadBalancing() {
        return this.loadBalancing;
    }

    /**
     * Set the loadBalancing value.
     *
     * @param loadBalancing the loadBalancing value to set
     */
    public void setLoadBalancing(SiteLoadBalancing loadBalancing) {
        this.loadBalancing = loadBalancing;
    }

    /**
     * Get the experiments value.
     *
     * @return the experiments value
     */
    public Experiments getExperiments() {
        return this.experiments;
    }

    /**
     * Set the experiments value.
     *
     * @param experiments the experiments value to set
     */
    public void setExperiments(Experiments experiments) {
        this.experiments = experiments;
    }

    /**
     * Get the limits value.
     *
     * @return the limits value
     */
    public SiteLimits getLimits() {
        return this.limits;
    }

    /**
     * Set the limits value.
     *
     * @param limits the limits value to set
     */
    public void setLimits(SiteLimits limits) {
        this.limits = limits;
    }

    /**
     * Get the autoHealEnabled value.
     *
     * @return the autoHealEnabled value
     */
    public Boolean getAutoHealEnabled() {
        return this.autoHealEnabled;
    }

    /**
     * Set the autoHealEnabled value.
     *
     * @param autoHealEnabled the autoHealEnabled value to set
     */
    public void setAutoHealEnabled(Boolean autoHealEnabled) {
        this.autoHealEnabled = autoHealEnabled;
    }

    /**
     * Get the autoHealRules value.
     *
     * @return the autoHealRules value
     */
    public AutoHealRules getAutoHealRules() {
        return this.autoHealRules;
    }

    /**
     * Set the autoHealRules value.
     *
     * @param autoHealRules the autoHealRules value to set
     */
    public void setAutoHealRules(AutoHealRules autoHealRules) {
        this.autoHealRules = autoHealRules;
    }

    /**
     * Get the tracingOptions value.
     *
     * @return the tracingOptions value
     */
    public String getTracingOptions() {
        return this.tracingOptions;
    }

    /**
     * Set the tracingOptions value.
     *
     * @param tracingOptions the tracingOptions value to set
     */
    public void setTracingOptions(String tracingOptions) {
        this.tracingOptions = tracingOptions;
    }

    /**
     * Get the vnetName value.
     *
     * @return the vnetName value
     */
    public String getVnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName value.
     *
     * @param vnetName the vnetName value to set
     */
    public void setVnetName(String vnetName) {
        this.vnetName = vnetName;
    }

    /**
     * Get the cors value.
     *
     * @return the cors value
     */
    public CorsSettings getCors() {
        return this.cors;
    }

    /**
     * Set the cors value.
     *
     * @param cors the cors value to set
     */
    public void setCors(CorsSettings cors) {
        this.cors = cors;
    }

    /**
     * Get the apiDefinition value.
     *
     * @return the apiDefinition value
     */
    public ApiDefinitionInfo getApiDefinition() {
        return this.apiDefinition;
    }

    /**
     * Set the apiDefinition value.
     *
     * @param apiDefinition the apiDefinition value to set
     */
    public void setApiDefinition(ApiDefinitionInfo apiDefinition) {
        this.apiDefinition = apiDefinition;
    }

    /**
     * Get the autoSwapSlotName value.
     *
     * @return the autoSwapSlotName value
     */
    public String getAutoSwapSlotName() {
        return this.autoSwapSlotName;
    }

    /**
     * Set the autoSwapSlotName value.
     *
     * @param autoSwapSlotName the autoSwapSlotName value to set
     */
    public void setAutoSwapSlotName(String autoSwapSlotName) {
        this.autoSwapSlotName = autoSwapSlotName;
    }

    /**
     * Get the localMySqlEnabled value.
     *
     * @return the localMySqlEnabled value
     */
    public Boolean getLocalMySqlEnabled() {
        return this.localMySqlEnabled;
    }

    /**
     * Set the localMySqlEnabled value.
     *
     * @param localMySqlEnabled the localMySqlEnabled value to set
     */
    public void setLocalMySqlEnabled(Boolean localMySqlEnabled) {
        this.localMySqlEnabled = localMySqlEnabled;
    }

}
