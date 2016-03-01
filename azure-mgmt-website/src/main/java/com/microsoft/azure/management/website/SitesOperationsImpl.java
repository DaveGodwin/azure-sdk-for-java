/**
 * Object]
 */

package com.microsoft.azure.management.website;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.BackupItem;
import com.microsoft.azure.management.website.models.BackupItemCollection;
import com.microsoft.azure.management.website.models.BackupRequest;
import com.microsoft.azure.management.website.models.ConnectionStringDictionary;
import com.microsoft.azure.management.website.models.CsmPublishingProfileOptions;
import com.microsoft.azure.management.website.models.CsmSiteRecoveryEntity;
import com.microsoft.azure.management.website.models.CsmSlotEntity;
import com.microsoft.azure.management.website.models.CsmUsageQuotaCollection;
import com.microsoft.azure.management.website.models.DeletedSiteCollection;
import com.microsoft.azure.management.website.models.Deployment;
import com.microsoft.azure.management.website.models.DeploymentCollection;
import com.microsoft.azure.management.website.models.HostNameBinding;
import com.microsoft.azure.management.website.models.HostNameBindingCollection;
import com.microsoft.azure.management.website.models.MetricDefinitionCollection;
import com.microsoft.azure.management.website.models.NetworkFeatures;
import com.microsoft.azure.management.website.models.PremierAddOnRequest;
import com.microsoft.azure.management.website.models.RelayServiceConnectionEntity;
import com.microsoft.azure.management.website.models.ResourceMetricCollection;
import com.microsoft.azure.management.website.models.RestoreRequest;
import com.microsoft.azure.management.website.models.RestoreResponse;
import com.microsoft.azure.management.website.models.Site;
import com.microsoft.azure.management.website.models.SiteAuthSettings;
import com.microsoft.azure.management.website.models.SiteCloneability;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.azure.management.website.models.SiteConfig;
import com.microsoft.azure.management.website.models.SiteInstanceCollection;
import com.microsoft.azure.management.website.models.SiteLogsConfig;
import com.microsoft.azure.management.website.models.SiteSourceControl;
import com.microsoft.azure.management.website.models.SlotConfigNamesResource;
import com.microsoft.azure.management.website.models.SlotDifferenceCollection;
import com.microsoft.azure.management.website.models.StringDictionary;
import com.microsoft.azure.management.website.models.User;
import com.microsoft.azure.management.website.models.VnetGateway;
import com.microsoft.azure.management.website.models.VnetInfo;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in SitesOperations.
 */
public final class SitesOperationsImpl implements SitesOperations {
    /** The Retrofit service to perform REST calls. */
    private SitesService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClient client;

    /**
     * Initializes an instance of SitesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SitesOperationsImpl(Retrofit retrofit, WebSiteManagementClient client) {
        this.service = retrofit.create(SitesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SitesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SitesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> getSiteVNETConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> createOrUpdateSiteVNETConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("subscriptionId") String subscriptionId, @Body VnetInfo connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteVNETConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> updateSiteVNETConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("subscriptionId") String subscriptionId, @Body VnetInfo connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> getSiteVNETConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> createOrUpdateSiteVNETConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body VnetInfo connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteVNETConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}")
        Call<ResponseBody> updateSiteVNETConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body VnetInfo connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/networkFeatures/{view}")
        Call<ResponseBody> getSiteNetworkFeatures(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("view") String view, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/networkFeatures/{view}")
        Call<ResponseBody> getSiteNetworkFeaturesSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("view") String view, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/operationresults/{operationId}")
        Call<ResponseBody> getSiteOperationSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("operationId") String operationId, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/operationresults/{operationId}")
        Call<ResponseBody> getSiteOperation(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slotsswap")
        Call<ResponseBody> swapSlotWithProduction(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/slotsswap")
        Call<ResponseBody> swapSlotsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slotsdiffs")
        Call<ResponseBody> getSlotsDifferencesFromProduction(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/slotsdiffs")
        Call<ResponseBody> getSlotsDifferencesSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/applySlotConfig")
        Call<ResponseBody> applySlotConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/applySlotConfig")
        Call<ResponseBody> applySlotConfigToProduction(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body CsmSlotEntity slotSwapEntity, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/resetSlotConfig")
        Call<ResponseBody> resetSlotConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/resetSlotConfig")
        Call<ResponseBody> resetProductionSlotConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/slotConfigNames")
        Call<ResponseBody> getSlotConfigNames(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/slotConfigNames")
        Call<ResponseBody> updateSlotConfigNames(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SlotConfigNamesResource slotConfigNames, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots")
        Call<ResponseBody> getSiteSlots(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites")
        Call<ResponseBody> getSites(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("includeSiteTypes") String includeSiteTypes, @Query("includeSlots") Boolean includeSlots, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}")
        Call<ResponseBody> getSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}")
        Call<ResponseBody> createOrUpdateSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body Site siteEnvelope, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("skipCustomDomainVerification") String skipCustomDomainVerification, @Query("forceDnsRegistration") String forceDnsRegistration, @Query("ttlInSeconds") String ttlInSeconds, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}")
        Call<ResponseBody> beginCreateOrUpdateSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body Site siteEnvelope, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("skipCustomDomainVerification") String skipCustomDomainVerification, @Query("forceDnsRegistration") String forceDnsRegistration, @Query("ttlInSeconds") String ttlInSeconds, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("deleteMetrics") String deleteMetrics, @Query("deleteEmptyServerFarm") String deleteEmptyServerFarm, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("deleteAllSlots") String deleteAllSlots, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}")
        Call<ResponseBody> getSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}")
        Call<ResponseBody> createOrUpdateSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body Site siteEnvelope, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("skipCustomDomainVerification") String skipCustomDomainVerification, @Query("forceDnsRegistration") String forceDnsRegistration, @Query("ttlInSeconds") String ttlInSeconds, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}")
        Call<ResponseBody> beginCreateOrUpdateSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body Site siteEnvelope, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("skipCustomDomainVerification") String skipCustomDomainVerification, @Query("forceDnsRegistration") String forceDnsRegistration, @Query("ttlInSeconds") String ttlInSeconds, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("deleteMetrics") String deleteMetrics, @Query("deleteEmptyServerFarm") String deleteEmptyServerFarm, @Query("skipDnsRegistration") String skipDnsRegistration, @Query("deleteAllSlots") String deleteAllSlots, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/iscloneable")
        Call<ResponseBody> isSiteCloneable(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/iscloneable")
        Call<ResponseBody> isSiteCloneableSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/recover")
        Call<ResponseBody> recoverSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body CsmSiteRecoveryEntity snapshot, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/recover")
        Call<ResponseBody> recoverSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body CsmSiteRecoveryEntity snapshot, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/restorableSnapshots")
        Call<ResponseBody> getSiteSnapshotsOnSku(@Path("name") String name, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("subscriptionName") String subscriptionName, @Query("webspaceName") String webspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/restorableSnapshots")
        Call<ResponseBody> getSiteSnapshotsOnSkuSlot(@Path("name") String name, @Path("resourceGroupName") String resourceGroupName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("subscriptionName") String subscriptionName, @Query("webspaceName") String webspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/snapshots")
        Call<ResponseBody> getSiteSnapshots(@Path("name") String name, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("subscriptionName") String subscriptionName, @Query("webspaceName") String webspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/snapshots")
        Call<ResponseBody> getSiteSnapshotsSlot(@Path("name") String name, @Path("resourceGroupName") String resourceGroupName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("subscriptionName") String subscriptionName, @Query("webspaceName") String webspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/deletedSites")
        Call<ResponseBody> getDeletedSites(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("includeSiteTypes") String includeSiteTypes, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/deployments")
        Call<ResponseBody> getDeployments(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/deployments")
        Call<ResponseBody> getDeploymentsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/instances/{instanceId}/deployments")
        Call<ResponseBody> getInstanceDeployments(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/instances/{instanceId}/deployments")
        Call<ResponseBody> getInstanceDeploymentsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/deployments/{id}")
        Call<ResponseBody> getDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/deployments/{id}")
        Call<ResponseBody> createDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body Deployment deployment, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/deployments/{id}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/deployments/{id}")
        Call<ResponseBody> getDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/deployments/{id}")
        Call<ResponseBody> createDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("subscriptionId") String subscriptionId, @Body Deployment deployment, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/deployments/{id}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/instances/{instanceId}/deployments/{id}")
        Call<ResponseBody> getInstanceDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/instances/{instanceId}/deployments/{id}")
        Call<ResponseBody> createInstanceDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Body Deployment deployment, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/instances/{instanceId}/deployments/{id}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteInstanceDeployment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/instances/{instanceId}/deployments/{id}")
        Call<ResponseBody> getInstanceDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/instances/{instanceId}/deployments/{id}")
        Call<ResponseBody> createInstanceDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Body Deployment deployment, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/instances/{instanceId}/deployments/{id}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteInstanceDeploymentSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("id") String id, @Path("slot") String slot, @Path("instanceId") String instanceId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/instances")
        Call<ResponseBody> getSiteInstanceIdentifiers(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/instances")
        Call<ResponseBody> getSiteInstanceIdentifiersSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hostNameBindings")
        Call<ResponseBody> getSiteHostNameBindingsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hostNameBindings")
        Call<ResponseBody> getSiteHostNameBindings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hostNameBindings/{hostName}")
        Call<ResponseBody> getSiteHostNameBinding(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("hostName") String hostName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hostNameBindings/{hostName}")
        Call<ResponseBody> createOrUpdateSiteHostNameBinding(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("hostName") String hostName, @Path("subscriptionId") String subscriptionId, @Body HostNameBinding hostNameBinding, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hostNameBindings/{hostName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteHostNameBinding(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("hostName") String hostName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hostNameBindings/{hostName}")
        Call<ResponseBody> getSiteHostNameBindingSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("hostName") String hostName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hostNameBindings/{hostName}")
        Call<ResponseBody> createOrUpdateSiteHostNameBindingSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("hostName") String hostName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body HostNameBinding hostNameBinding, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hostNameBindings/{hostName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteHostNameBindingSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("hostName") String hostName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/web")
        Call<ResponseBody> getSiteConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/web")
        Call<ResponseBody> createOrUpdateSiteConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteConfig siteConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/web")
        Call<ResponseBody> updateSiteConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteConfig siteConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/web")
        Call<ResponseBody> getSiteConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/web")
        Call<ResponseBody> createOrUpdateSiteConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteConfig siteConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/web")
        Call<ResponseBody> updateSiteConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteConfig siteConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sourcecontrols/web")
        Call<ResponseBody> getSiteSourceControl(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sourcecontrols/web")
        Call<ResponseBody> createOrUpdateSiteSourceControl(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteSourceControl siteSourceControl, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sourcecontrols/web", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteSourceControl(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sourcecontrols/web")
        Call<ResponseBody> updateSiteSourceControl(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteSourceControl siteSourceControl, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sourcecontrols/web")
        Call<ResponseBody> getSiteSourceControlSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sourcecontrols/web")
        Call<ResponseBody> createOrUpdateSiteSourceControlSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteSourceControl siteSourceControl, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sourcecontrols/web", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteSourceControlSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sourcecontrols/web")
        Call<ResponseBody> updateSiteSourceControlSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteSourceControl siteSourceControl, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/appsettings/list")
        Call<ResponseBody> listSiteAppSettings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/appsettings/list")
        Call<ResponseBody> listSiteAppSettingsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/appsettings")
        Call<ResponseBody> updateSiteAppSettings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body StringDictionary appSettings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/appsettings")
        Call<ResponseBody> updateSiteAppSettingsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body StringDictionary appSettings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/connectionstrings/list")
        Call<ResponseBody> listSiteConnectionStrings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/connectionstrings/list")
        Call<ResponseBody> listSiteConnectionStringsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/connectionstrings")
        Call<ResponseBody> updateSiteConnectionStrings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body ConnectionStringDictionary connectionStrings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/connectionstrings")
        Call<ResponseBody> updateSiteConnectionStringsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body ConnectionStringDictionary connectionStrings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/authsettings/list")
        Call<ResponseBody> listSiteAuthSettings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/authsettings/list")
        Call<ResponseBody> listSiteAuthSettingsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/authsettings")
        Call<ResponseBody> updateSiteAuthSettings(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteAuthSettings siteAuthSettings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/authsettings")
        Call<ResponseBody> updateSiteAuthSettingsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteAuthSettings siteAuthSettings, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/publishingcredentials/list")
        Call<ResponseBody> listSitePublishingCredentials(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/publishingcredentials/list")
        Call<ResponseBody> beginListSitePublishingCredentials(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/publishingcredentials/list")
        Call<ResponseBody> listSitePublishingCredentialsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/publishingcredentials/list")
        Call<ResponseBody> beginListSitePublishingCredentialsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/metadata/list")
        Call<ResponseBody> listSiteMetadata(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/metadata/list")
        Call<ResponseBody> listSiteMetadataSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/metadata")
        Call<ResponseBody> updateSiteMetadata(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body StringDictionary metadata, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/metadata")
        Call<ResponseBody> updateSiteMetadataSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body StringDictionary metadata, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/logs")
        Call<ResponseBody> getSiteLogsConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/logs")
        Call<ResponseBody> updateSiteLogsConfig(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body SiteLogsConfig siteLogsConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/logs")
        Call<ResponseBody> getSiteLogsConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/logs")
        Call<ResponseBody> updateSiteLogsConfigSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body SiteLogsConfig siteLogsConfig, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/premieraddons")
        Call<ResponseBody> listSitePremierAddOnsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/premieraddons")
        Call<ResponseBody> listSitePremierAddOns(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/premieraddons/{premierAddOnName}")
        Call<ResponseBody> getSitePremierAddOnSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/premieraddons/{premierAddOnName}")
        Call<ResponseBody> addSitePremierAddOnSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body PremierAddOnRequest premierAddOn, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/premieraddons/{premierAddOnName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSitePremierAddOnSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/premieraddons/{premierAddOnName}")
        Call<ResponseBody> getSitePremierAddOn(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/premieraddons/{premierAddOnName}")
        Call<ResponseBody> addSitePremierAddOn(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("subscriptionId") String subscriptionId, @Body PremierAddOnRequest premierAddOn, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/premieraddons/{premierAddOnName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSitePremierAddOn(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("premierAddOnName") String premierAddOnName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/backup/list")
        Call<ResponseBody> getSiteBackupConfiguration(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/backup/list")
        Call<ResponseBody> getSiteBackupConfigurationSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/backup")
        Call<ResponseBody> updateSiteBackupConfiguration(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/backup")
        Call<ResponseBody> updateSiteBackupConfigurationSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backup")
        Call<ResponseBody> backupSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backup")
        Call<ResponseBody> backupSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups/discover")
        Call<ResponseBody> discoverSiteRestore(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body RestoreRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups/discover")
        Call<ResponseBody> discoverSiteRestoreSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body RestoreRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups")
        Call<ResponseBody> listSiteBackupsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups")
        Call<ResponseBody> listSiteBackups(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups/{backupId}")
        Call<ResponseBody> getSiteBackupStatus(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups/{backupId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteBackup(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups/{backupId}")
        Call<ResponseBody> getSiteBackupStatusSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups/{backupId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteBackupSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups/{backupId}/list")
        Call<ResponseBody> getSiteBackupStatusSecrets(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups/{backupId}/list")
        Call<ResponseBody> getSiteBackupStatusSecretsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body BackupRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/backups/{backupId}/restore")
        Call<ResponseBody> restoreSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("subscriptionId") String subscriptionId, @Body RestoreRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/backups/{backupId}/restore")
        Call<ResponseBody> restoreSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("backupId") String backupId, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body RestoreRequest request, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/usages")
        Call<ResponseBody> getSiteUsagesSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/usages")
        Call<ResponseBody> getSiteUsages(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/metrics")
        Call<ResponseBody> getSiteMetricsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("details") Boolean details, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/metrics")
        Call<ResponseBody> getSiteMetrics(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("details") Boolean details, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/metricdefinitions")
        Call<ResponseBody> getSiteMetricDefinitions(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/metricdefinitions")
        Call<ResponseBody> getSiteMetricDefinitionsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/publishxml")
        Call<ResponseBody> listSitePublishingProfileXml(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body CsmPublishingProfileOptions options, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/publishxml")
        Call<ResponseBody> listSitePublishingProfileXmlSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body CsmPublishingProfileOptions options, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/restart")
        Call<ResponseBody> restartSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("softRestart") Boolean softRestart, @Query("synchronous") Boolean synchronous, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/restart")
        Call<ResponseBody> restartSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("softRestart") Boolean softRestart, @Query("synchronous") Boolean synchronous, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/start")
        Call<ResponseBody> startSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/start")
        Call<ResponseBody> startSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/stop")
        Call<ResponseBody> stopSite(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/stop")
        Call<ResponseBody> stopSiteSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/sync")
        Call<ResponseBody> syncSiteRepositorySlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/sync")
        Call<ResponseBody> syncSiteRepository(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/newpassword")
        Call<ResponseBody> generateNewSitePublishingPasswordSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/newpassword")
        Call<ResponseBody> generateNewSitePublishingPassword(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection/{entityName}")
        Call<ResponseBody> getSiteRelayServiceConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection/{entityName}")
        Call<ResponseBody> createOrUpdateSiteRelayServiceConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("subscriptionId") String subscriptionId, @Body RelayServiceConnectionEntity connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection/{entityName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteRelayServiceConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection/{entityName}")
        Call<ResponseBody> updateSiteRelayServiceConnection(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("subscriptionId") String subscriptionId, @Body RelayServiceConnectionEntity connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection/{entityName}")
        Call<ResponseBody> getSiteRelayServiceConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection/{entityName}")
        Call<ResponseBody> createOrUpdateSiteRelayServiceConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body RelayServiceConnectionEntity connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection/{entityName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteSiteRelayServiceConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection/{entityName}")
        Call<ResponseBody> updateSiteRelayServiceConnectionSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("entityName") String entityName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body RelayServiceConnectionEntity connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection")
        Call<ResponseBody> listSiteRelayServiceConnectionsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridconnection")
        Call<ResponseBody> listSiteRelayServiceConnections(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> getSiteVnetGatewaySlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> createOrUpdateSiteVNETConnectionGatewaySlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body VnetGateway connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> updateSiteVNETConnectionGatewaySlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Body VnetGateway connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> getSiteVnetGateway(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> createOrUpdateSiteVNETConnectionGateway(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("subscriptionId") String subscriptionId, @Body VnetGateway connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections/{vnetName}/gateways/{gatewayName}")
        Call<ResponseBody> updateSiteVNETConnectionGateway(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("vnetName") String vnetName, @Path("gatewayName") String gatewayName, @Path("subscriptionId") String subscriptionId, @Body VnetGateway connectionEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/virtualNetworkConnections")
        Call<ResponseBody> getSiteVNETConnections(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/virtualNetworkConnections")
        Call<ResponseBody> getSiteVNETConnectionsSlot(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("slot") String slot, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> getSiteVNETConnection(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVNETConnectionDelegate(call.execute());
    }

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVNETConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> getSiteVNETConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnection(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteVNETConnectionDelegate(call.execute());
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteVNETConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteVNETConnection(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteVNETConnectionDelegate(call.execute());
    }

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteVNETConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteVNETConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> updateSiteVNETConnection(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteVNETConnectionDelegate(call.execute());
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteVNETConnection(resourceGroupName, name, vnetName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteVNETConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> updateSiteVNETConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> getSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVNETConnectionSlotDelegate(call.execute());
    }

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVNETConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> getSiteVNETConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteVNETConnectionSlotDelegate(call.execute());
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteVNETConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteVNETConnectionSlotDelegate(call.execute());
    }

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteVNETConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteVNETConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetInfo> updateSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteVNETConnectionSlotDelegate(call.execute());
    }

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteVNETConnectionSlot(resourceGroupName, name, vnetName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetInfo>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteVNETConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetInfo> updateSiteVNETConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetInfo, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetInfo>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkFeatures object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<NetworkFeatures> getSiteNetworkFeatures(String resourceGroupName, String name, String view) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (view == null) {
            throw new IllegalArgumentException("Parameter view is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteNetworkFeatures(resourceGroupName, name, view, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteNetworkFeaturesDelegate(call.execute());
    }

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteNetworkFeaturesAsync(String resourceGroupName, String name, String view, final ServiceCallback<NetworkFeatures> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (view == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter view is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteNetworkFeatures(resourceGroupName, name, view, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<NetworkFeatures>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteNetworkFeaturesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<NetworkFeatures> getSiteNetworkFeaturesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<NetworkFeatures, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<NetworkFeatures>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkFeatures object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<NetworkFeatures> getSiteNetworkFeaturesSlot(String resourceGroupName, String name, String view, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (view == null) {
            throw new IllegalArgumentException("Parameter view is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteNetworkFeaturesSlot(resourceGroupName, name, view, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteNetworkFeaturesSlotDelegate(call.execute());
    }

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteNetworkFeaturesSlotAsync(String resourceGroupName, String name, String view, String slot, final ServiceCallback<NetworkFeatures> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (view == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter view is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteNetworkFeaturesSlot(resourceGroupName, name, view, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<NetworkFeatures>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteNetworkFeaturesSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<NetworkFeatures> getSiteNetworkFeaturesSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<NetworkFeatures, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<NetworkFeatures>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteOperationSlot(String resourceGroupName, String name, String operationId, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteOperationSlot(resourceGroupName, name, operationId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteOperationSlotDelegate(call.execute());
    }

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteOperationSlotAsync(String resourceGroupName, String name, String operationId, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (operationId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteOperationSlot(resourceGroupName, name, operationId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteOperationSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteOperationSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteOperation(resourceGroupName, name, operationId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteOperationDelegate(call.execute());
    }

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (operationId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteOperation(resourceGroupName, name, operationId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteOperationDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteOperationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> swapSlotWithProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.swapSlotWithProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return swapSlotWithProductionDelegate(call.execute());
    }

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall swapSlotWithProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.swapSlotWithProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(swapSlotWithProductionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> swapSlotWithProductionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(202, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of source slot for the swap
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> swapSlotsSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.swapSlotsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return swapSlotsSlotDelegate(call.execute());
    }

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of source slot for the swap
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall swapSlotsSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.swapSlotsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(swapSlotsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> swapSlotsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(202, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotDifferenceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesFromProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.getSlotsDifferencesFromProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSlotsDifferencesFromProductionDelegate(call.execute());
    }

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSlotsDifferencesFromProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<SlotDifferenceCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.getSlotsDifferencesFromProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SlotDifferenceCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSlotsDifferencesFromProductionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesFromProductionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SlotDifferenceCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SlotDifferenceCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotDifferenceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.getSlotsDifferencesSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSlotsDifferencesSlotDelegate(call.execute());
    }

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSlotsDifferencesSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<SlotDifferenceCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.getSlotsDifferencesSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SlotDifferenceCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSlotsDifferencesSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SlotDifferenceCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SlotDifferenceCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot. Settings from the target slot will be applied onto this slot
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> applySlotConfigSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.applySlotConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return applySlotConfigSlotDelegate(call.execute());
    }

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot. Settings from the target slot will be applied onto this slot
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall applySlotConfigSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.applySlotConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(applySlotConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> applySlotConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> applySlotConfigToProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotSwapEntity == null) {
            throw new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotSwapEntity);
        Call<ResponseBody> call = service.applySlotConfigToProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return applySlotConfigToProductionDelegate(call.execute());
    }

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall applySlotConfigToProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotSwapEntity == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotSwapEntity is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotSwapEntity, serviceCallback);
        Call<ResponseBody> call = service.applySlotConfigToProduction(resourceGroupName, name, this.client.getSubscriptionId(), slotSwapEntity, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(applySlotConfigToProductionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> applySlotConfigToProductionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> resetSlotConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.resetSlotConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return resetSlotConfigSlotDelegate(call.execute());
    }

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall resetSlotConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.resetSlotConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(resetSlotConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> resetSlotConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> resetProductionSlotConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.resetProductionSlotConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return resetProductionSlotConfigDelegate(call.execute());
    }

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall resetProductionSlotConfigAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.resetProductionSlotConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(resetProductionSlotConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> resetProductionSlotConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotConfigNamesResource object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SlotConfigNamesResource> getSlotConfigNames(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSlotConfigNames(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSlotConfigNamesDelegate(call.execute());
    }

    /**
     * Gets the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSlotConfigNamesAsync(String resourceGroupName, String name, final ServiceCallback<SlotConfigNamesResource> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSlotConfigNames(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SlotConfigNamesResource>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSlotConfigNamesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SlotConfigNamesResource> getSlotConfigNamesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SlotConfigNamesResource, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SlotConfigNamesResource>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotConfigNames Request body containing the names of application settings and connection strings
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotConfigNamesResource object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SlotConfigNamesResource> updateSlotConfigNames(String resourceGroupName, String name, SlotConfigNamesResource slotConfigNames) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (slotConfigNames == null) {
            throw new IllegalArgumentException("Parameter slotConfigNames is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(slotConfigNames);
        Call<ResponseBody> call = service.updateSlotConfigNames(resourceGroupName, name, this.client.getSubscriptionId(), slotConfigNames, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSlotConfigNamesDelegate(call.execute());
    }

    /**
     * Updates the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotConfigNames Request body containing the names of application settings and connection strings
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSlotConfigNamesAsync(String resourceGroupName, String name, SlotConfigNamesResource slotConfigNames, final ServiceCallback<SlotConfigNamesResource> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (slotConfigNames == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slotConfigNames is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(slotConfigNames, serviceCallback);
        Call<ResponseBody> call = service.updateSlotConfigNames(resourceGroupName, name, this.client.getSubscriptionId(), slotConfigNames, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SlotConfigNamesResource>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSlotConfigNamesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SlotConfigNamesResource> updateSlotConfigNamesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SlotConfigNamesResource, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SlotConfigNamesResource>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude List of app properties to include in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteCollection> getSiteSlots(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSlots(resourceGroupName, name, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSlotsDelegate(call.execute());
    }

    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude List of app properties to include in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSlotsAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSlots(resourceGroupName, name, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSlotsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteCollection> getSiteSlotsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param includeSlots Whether or not to include deployments slots in results
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteCollection> getSites(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, Boolean includeSlots) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSites(resourceGroupName, this.client.getSubscriptionId(), propertiesToInclude, includeSiteTypes, includeSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSitesDelegate(call.execute());
    }

    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param includeSlots Whether or not to include deployments slots in results
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSitesAsync(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, Boolean includeSlots, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSites(resourceGroupName, this.client.getSubscriptionId(), propertiesToInclude, includeSiteTypes, includeSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSitesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteCollection> getSitesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude Additional web app properties included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Site> getSite(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSite(resourceGroupName, name, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteDelegate(call.execute());
    }

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude Additional web app properties included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSite(resourceGroupName, name, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Site>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Site> getSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Site, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Site>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Site> createOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteEnvelope == null) {
            throw new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteEnvelope);
        Response<ResponseBody> result = service.createOrUpdateSite(resourceGroupName, name, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Site>() { }.getType());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall createOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (siteEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(siteEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSite(resourceGroupName, name, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<Site>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Site> beginCreateOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteEnvelope == null) {
            throw new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteEnvelope);
        Call<ResponseBody> call = service.beginCreateOrUpdateSite(resourceGroupName, name, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginCreateOrUpdateSiteDelegate(call.execute());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginCreateOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteEnvelope, serviceCallback);
        Call<ResponseBody> call = service.beginCreateOrUpdateSite(resourceGroupName, name, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Site>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginCreateOrUpdateSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Site> beginCreateOrUpdateSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Site, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Site>() { }.getType())
                .register(202, new TypeToken<Site>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSite(String resourceGroupName, String name, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSite(resourceGroupName, name, this.client.getSubscriptionId(), deleteMetrics, deleteEmptyServerFarm, skipDnsRegistration, deleteAllSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteDelegate(call.execute());
    }

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteAsync(String resourceGroupName, String name, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSite(resourceGroupName, name, this.client.getSubscriptionId(), deleteMetrics, deleteEmptyServerFarm, skipDnsRegistration, deleteAllSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param propertiesToInclude Additional web app properties included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Site> getSiteSlot(String resourceGroupName, String name, String slot, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSlotDelegate(call.execute());
    }

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param propertiesToInclude Additional web app properties included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSlotAsync(String resourceGroupName, String name, String slot, String propertiesToInclude, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), propertiesToInclude, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Site>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Site> getSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Site, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Site>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Site> createOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteEnvelope == null) {
            throw new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteEnvelope);
        Response<ResponseBody> result = service.createOrUpdateSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Site>() { }.getType());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall createOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (siteEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(siteEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<Site>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Site> beginCreateOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteEnvelope == null) {
            throw new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteEnvelope);
        Call<ResponseBody> call = service.beginCreateOrUpdateSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginCreateOrUpdateSiteSlotDelegate(call.execute());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginCreateOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteEnvelope, serviceCallback);
        Call<ResponseBody> call = service.beginCreateOrUpdateSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteEnvelope, skipDnsRegistration, skipCustomDomainVerification, forceDnsRegistration, ttlInSeconds, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Site>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginCreateOrUpdateSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Site> beginCreateOrUpdateSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Site, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Site>() { }.getType())
                .register(202, new TypeToken<Site>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteSlot(String resourceGroupName, String name, String slot, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), deleteMetrics, deleteEmptyServerFarm, skipDnsRegistration, deleteAllSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteSlotDelegate(call.execute());
    }

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteSlotAsync(String resourceGroupName, String name, String slot, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), deleteMetrics, deleteEmptyServerFarm, skipDnsRegistration, deleteAllSlots, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCloneability object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteCloneability> isSiteCloneable(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.isSiteCloneable(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return isSiteCloneableDelegate(call.execute());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall isSiteCloneableAsync(String resourceGroupName, String name, final ServiceCallback<SiteCloneability> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.isSiteCloneable(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteCloneability>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(isSiteCloneableDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteCloneability> isSiteCloneableDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteCloneability, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteCloneability>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCloneability object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteCloneability> isSiteCloneableSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.isSiteCloneableSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return isSiteCloneableSlotDelegate(call.execute());
    }

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall isSiteCloneableSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteCloneability> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.isSiteCloneableSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteCloneability>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(isSiteCloneableSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteCloneability> isSiteCloneableSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteCloneability, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteCloneability>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> recoverSite(String resourceGroupName, String name, CsmSiteRecoveryEntity snapshot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (snapshot == null) {
            throw new IllegalArgumentException("Parameter snapshot is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(snapshot);
        Call<ResponseBody> call = service.recoverSite(resourceGroupName, name, this.client.getSubscriptionId(), snapshot, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return recoverSiteDelegate(call.execute());
    }

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall recoverSiteAsync(String resourceGroupName, String name, CsmSiteRecoveryEntity snapshot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (snapshot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter snapshot is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(snapshot, serviceCallback);
        Call<ResponseBody> call = service.recoverSite(resourceGroupName, name, this.client.getSubscriptionId(), snapshot, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(recoverSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> recoverSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> recoverSiteSlot(String resourceGroupName, String name, String slot, CsmSiteRecoveryEntity snapshot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (snapshot == null) {
            throw new IllegalArgumentException("Parameter snapshot is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(snapshot);
        Call<ResponseBody> call = service.recoverSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), snapshot, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return recoverSiteSlotDelegate(call.execute());
    }

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall recoverSiteSlotAsync(String resourceGroupName, String name, String slot, CsmSiteRecoveryEntity snapshot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (snapshot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter snapshot is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(snapshot, serviceCallback);
        Call<ResponseBody> call = service.recoverSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), snapshot, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(recoverSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> recoverSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteSnapshotsOnSku(String name, String resourceGroupName, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (subscriptionName == null) {
            throw new IllegalArgumentException("Parameter subscriptionName is required and cannot be null.");
        }
        if (webspaceName == null) {
            throw new IllegalArgumentException("Parameter webspaceName is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSnapshotsOnSku(name, resourceGroupName, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSnapshotsOnSkuDelegate(call.execute());
    }

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSnapshotsOnSkuAsync(String name, String resourceGroupName, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (subscriptionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionName is required and cannot be null."));
            return null;
        }
        if (webspaceName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter webspaceName is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSnapshotsOnSku(name, resourceGroupName, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSnapshotsOnSkuDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteSnapshotsOnSkuDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteSnapshotsOnSkuSlot(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (subscriptionName == null) {
            throw new IllegalArgumentException("Parameter subscriptionName is required and cannot be null.");
        }
        if (webspaceName == null) {
            throw new IllegalArgumentException("Parameter webspaceName is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSnapshotsOnSkuSlot(name, resourceGroupName, slot, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSnapshotsOnSkuSlotDelegate(call.execute());
    }

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSnapshotsOnSkuSlotAsync(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (subscriptionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionName is required and cannot be null."));
            return null;
        }
        if (webspaceName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter webspaceName is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSnapshotsOnSkuSlot(name, resourceGroupName, slot, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSnapshotsOnSkuSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteSnapshotsOnSkuSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteSnapshots(String name, String resourceGroupName, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (subscriptionName == null) {
            throw new IllegalArgumentException("Parameter subscriptionName is required and cannot be null.");
        }
        if (webspaceName == null) {
            throw new IllegalArgumentException("Parameter webspaceName is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSnapshots(name, resourceGroupName, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSnapshotsDelegate(call.execute());
    }

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSnapshotsAsync(String name, String resourceGroupName, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (subscriptionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionName is required and cannot be null."));
            return null;
        }
        if (webspaceName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter webspaceName is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSnapshots(name, resourceGroupName, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSnapshotsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteSnapshotsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteSnapshotsSlot(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (subscriptionName == null) {
            throw new IllegalArgumentException("Parameter subscriptionName is required and cannot be null.");
        }
        if (webspaceName == null) {
            throw new IllegalArgumentException("Parameter webspaceName is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSnapshotsSlot(name, resourceGroupName, slot, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSnapshotsSlotDelegate(call.execute());
    }

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSnapshotsSlotAsync(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (subscriptionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionName is required and cannot be null."));
            return null;
        }
        if (webspaceName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter webspaceName is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSnapshotsSlot(name, resourceGroupName, slot, this.client.getSubscriptionId(), subscriptionName, webspaceName, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSnapshotsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteSnapshotsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeletedSiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DeletedSiteCollection> getDeletedSites(String resourceGroupName, String propertiesToInclude, String includeSiteTypes) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getDeletedSites(resourceGroupName, this.client.getSubscriptionId(), propertiesToInclude, includeSiteTypes, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDeletedSitesDelegate(call.execute());
    }

    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getDeletedSitesAsync(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, final ServiceCallback<DeletedSiteCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getDeletedSites(resourceGroupName, this.client.getSubscriptionId(), propertiesToInclude, includeSiteTypes, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<DeletedSiteCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDeletedSitesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DeletedSiteCollection> getDeletedSitesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DeletedSiteCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<DeletedSiteCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DeploymentCollection> getDeployments(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getDeployments(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDeploymentsDelegate(call.execute());
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getDeploymentsAsync(String resourceGroupName, String name, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getDeployments(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<DeploymentCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDeploymentsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DeploymentCollection> getDeploymentsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DeploymentCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<DeploymentCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DeploymentCollection> getDeploymentsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getDeploymentsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDeploymentsSlotDelegate(call.execute());
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getDeploymentsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getDeploymentsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<DeploymentCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDeploymentsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DeploymentCollection> getDeploymentsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DeploymentCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<DeploymentCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DeploymentCollection> getInstanceDeployments(String resourceGroupName, String name, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getInstanceDeployments(resourceGroupName, name, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getInstanceDeploymentsDelegate(call.execute());
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInstanceDeploymentsAsync(String resourceGroupName, String name, String instanceId, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getInstanceDeployments(resourceGroupName, name, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<DeploymentCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInstanceDeploymentsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DeploymentCollection> getInstanceDeploymentsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DeploymentCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<DeploymentCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DeploymentCollection> getInstanceDeploymentsSlot(String resourceGroupName, String name, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getInstanceDeploymentsSlot(resourceGroupName, name, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getInstanceDeploymentsSlotDelegate(call.execute());
    }

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInstanceDeploymentsSlotAsync(String resourceGroupName, String name, String slot, String instanceId, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getInstanceDeploymentsSlot(resourceGroupName, name, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<DeploymentCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInstanceDeploymentsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<DeploymentCollection> getInstanceDeploymentsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DeploymentCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<DeploymentCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> getDeploymentSlot(String resourceGroupName, String name, String id, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDeploymentSlotDelegate(call.execute());
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> getDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> createDeploymentSlot(String resourceGroupName, String name, String id, String slot, Deployment deployment) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (deployment == null) {
            throw new IllegalArgumentException("Parameter deployment is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(deployment);
        Call<ResponseBody> call = service.createDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createDeploymentSlotDelegate(call.execute());
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (deployment == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deployment is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(deployment, serviceCallback);
        Call<ResponseBody> call = service.createDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> createDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteDeploymentSlot(String resourceGroupName, String name, String id, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteDeploymentSlotDelegate(call.execute());
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteDeploymentSlot(resourceGroupName, name, id, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> getDeployment(String resourceGroupName, String name, String id) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDeploymentDelegate(call.execute());
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getDeploymentAsync(String resourceGroupName, String name, String id, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> getDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> createDeployment(String resourceGroupName, String name, String id, Deployment deployment) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (deployment == null) {
            throw new IllegalArgumentException("Parameter deployment is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(deployment);
        Call<ResponseBody> call = service.createDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createDeploymentDelegate(call.execute());
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createDeploymentAsync(String resourceGroupName, String name, String id, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (deployment == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deployment is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(deployment, serviceCallback);
        Call<ResponseBody> call = service.createDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> createDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteDeployment(String resourceGroupName, String name, String id) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteDeploymentDelegate(call.execute());
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteDeploymentAsync(String resourceGroupName, String name, String id, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteDeployment(resourceGroupName, name, id, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> getInstanceDeployment(String resourceGroupName, String name, String id, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getInstanceDeploymentDelegate(call.execute());
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInstanceDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> getInstanceDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> createInstanceDeployment(String resourceGroupName, String name, String id, String instanceId, Deployment deployment) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (deployment == null) {
            throw new IllegalArgumentException("Parameter deployment is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(deployment);
        Call<ResponseBody> call = service.createInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createInstanceDeploymentDelegate(call.execute());
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (deployment == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deployment is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(deployment, serviceCallback);
        Call<ResponseBody> call = service.createInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createInstanceDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> createInstanceDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteInstanceDeployment(String resourceGroupName, String name, String id, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteInstanceDeploymentDelegate(call.execute());
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteInstanceDeployment(resourceGroupName, name, id, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteInstanceDeploymentDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteInstanceDeploymentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> getInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getInstanceDeploymentSlotDelegate(call.execute());
    }

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInstanceDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> getInstanceDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Deployment> createInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId, Deployment deployment) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (deployment == null) {
            throw new IllegalArgumentException("Parameter deployment is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(deployment);
        Call<ResponseBody> call = service.createInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createInstanceDeploymentSlotDelegate(call.execute());
    }

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (deployment == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter deployment is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(deployment, serviceCallback);
        Call<ResponseBody> call = service.createInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), deployment, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Deployment>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createInstanceDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Deployment> createInstanceDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Deployment, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Deployment>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (instanceId == null) {
            throw new IllegalArgumentException("Parameter instanceId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteInstanceDeploymentSlotDelegate(call.execute());
    }

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (id == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter id is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (instanceId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteInstanceDeploymentSlot(resourceGroupName, name, id, slot, instanceId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteInstanceDeploymentSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteInstanceDeploymentSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteInstanceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiers(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteInstanceIdentifiers(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteInstanceIdentifiersDelegate(call.execute());
    }

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteInstanceIdentifiersAsync(String resourceGroupName, String name, final ServiceCallback<SiteInstanceCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteInstanceIdentifiers(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteInstanceCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteInstanceIdentifiersDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteInstanceCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteInstanceCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteInstanceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiersSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteInstanceIdentifiersSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteInstanceIdentifiersSlotDelegate(call.execute());
    }

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteInstanceIdentifiersSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteInstanceCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteInstanceIdentifiersSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteInstanceCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteInstanceIdentifiersSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiersSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteInstanceCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteInstanceCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBindingCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBindingCollection> getSiteHostNameBindingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteHostNameBindingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteHostNameBindingsSlotDelegate(call.execute());
    }

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteHostNameBindingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<HostNameBindingCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteHostNameBindingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBindingCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteHostNameBindingsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBindingCollection> getSiteHostNameBindingsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBindingCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBindingCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBindingCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBindingCollection> getSiteHostNameBindings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteHostNameBindings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteHostNameBindingsDelegate(call.execute());
    }

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteHostNameBindingsAsync(String resourceGroupName, String name, final ServiceCallback<HostNameBindingCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteHostNameBindings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBindingCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteHostNameBindingsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBindingCollection> getSiteHostNameBindingsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBindingCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBindingCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBinding> getSiteHostNameBinding(String resourceGroupName, String name, String hostName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteHostNameBindingDelegate(call.execute());
    }

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBinding>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteHostNameBindingDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBinding> getSiteHostNameBindingDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBinding, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBinding>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param hostNameBinding Host name binding information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBinding(String resourceGroupName, String name, String hostName, HostNameBinding hostNameBinding) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (hostNameBinding == null) {
            throw new IllegalArgumentException("Parameter hostNameBinding is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(hostNameBinding);
        Call<ResponseBody> call = service.createOrUpdateSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), hostNameBinding, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteHostNameBindingDelegate(call.execute());
    }

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param hostNameBinding Host name binding information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, HostNameBinding hostNameBinding, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (hostNameBinding == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostNameBinding is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(hostNameBinding, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), hostNameBinding, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBinding>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteHostNameBindingDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBindingDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBinding, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBinding>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteHostNameBinding(String resourceGroupName, String name, String hostName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteHostNameBindingDelegate(call.execute());
    }

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteHostNameBinding(resourceGroupName, name, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteHostNameBindingDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteHostNameBindingDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBinding> getSiteHostNameBindingSlot(String resourceGroupName, String name, String slot, String hostName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteHostNameBindingSlot(resourceGroupName, name, slot, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteHostNameBindingSlotDelegate(call.execute());
    }

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String slot, String hostName, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteHostNameBindingSlot(resourceGroupName, name, slot, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBinding>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteHostNameBindingSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBinding> getSiteHostNameBindingSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBinding, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBinding>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostNameBinding Host name binding information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBindingSlot(String resourceGroupName, String name, String hostName, String slot, HostNameBinding hostNameBinding) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (hostNameBinding == null) {
            throw new IllegalArgumentException("Parameter hostNameBinding is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(hostNameBinding);
        Call<ResponseBody> call = service.createOrUpdateSiteHostNameBindingSlot(resourceGroupName, name, hostName, slot, this.client.getSubscriptionId(), hostNameBinding, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteHostNameBindingSlotDelegate(call.execute());
    }

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostNameBinding Host name binding information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String hostName, String slot, HostNameBinding hostNameBinding, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (hostNameBinding == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostNameBinding is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(hostNameBinding, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteHostNameBindingSlot(resourceGroupName, name, hostName, slot, this.client.getSubscriptionId(), hostNameBinding, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<HostNameBinding>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteHostNameBindingSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBindingSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<HostNameBinding, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<HostNameBinding>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteHostNameBindingSlot(String resourceGroupName, String name, String slot, String hostName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (hostName == null) {
            throw new IllegalArgumentException("Parameter hostName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteHostNameBindingSlot(resourceGroupName, name, slot, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteHostNameBindingSlotDelegate(call.execute());
    }

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String slot, String hostName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (hostName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter hostName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteHostNameBindingSlot(resourceGroupName, name, slot, hostName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteHostNameBindingSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteHostNameBindingSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> getSiteConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteConfigDelegate(call.execute());
    }

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteConfigAsync(String resourceGroupName, String name, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> getSiteConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> createOrUpdateSiteConfig(String resourceGroupName, String name, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteConfig == null) {
            throw new IllegalArgumentException("Parameter siteConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteConfig);
        Call<ResponseBody> call = service.createOrUpdateSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteConfigDelegate(call.execute());
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteConfigAsync(String resourceGroupName, String name, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteConfig, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> createOrUpdateSiteConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> updateSiteConfig(String resourceGroupName, String name, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteConfig == null) {
            throw new IllegalArgumentException("Parameter siteConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteConfig);
        Call<ResponseBody> call = service.updateSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteConfigDelegate(call.execute());
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteConfigAsync(String resourceGroupName, String name, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteConfig, serviceCallback);
        Call<ResponseBody> call = service.updateSiteConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> updateSiteConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> getSiteConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteConfigSlotDelegate(call.execute());
    }

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> getSiteConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> createOrUpdateSiteConfigSlot(String resourceGroupName, String name, String slot, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteConfig == null) {
            throw new IllegalArgumentException("Parameter siteConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteConfig);
        Call<ResponseBody> call = service.createOrUpdateSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteConfigSlotDelegate(call.execute());
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteConfigSlotAsync(String resourceGroupName, String name, String slot, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteConfig, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> createOrUpdateSiteConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteConfig> updateSiteConfigSlot(String resourceGroupName, String name, String slot, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteConfig == null) {
            throw new IllegalArgumentException("Parameter siteConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteConfig);
        Call<ResponseBody> call = service.updateSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteConfigSlotDelegate(call.execute());
    }

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteConfigSlotAsync(String resourceGroupName, String name, String slot, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteConfig, serviceCallback);
        Call<ResponseBody> call = service.updateSiteConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteConfig> updateSiteConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> getSiteSourceControl(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSourceControlDelegate(call.execute());
    }

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSourceControlAsync(String resourceGroupName, String name, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> getSiteSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControl(String resourceGroupName, String name, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteSourceControl == null) {
            throw new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteSourceControl);
        Call<ResponseBody> call = service.createOrUpdateSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteSourceControlDelegate(call.execute());
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteSourceControlAsync(String resourceGroupName, String name, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteSourceControl == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteSourceControl, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteSourceControl(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteSourceControlDelegate(call.execute());
    }

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteSourceControlAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> updateSiteSourceControl(String resourceGroupName, String name, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteSourceControl == null) {
            throw new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteSourceControl);
        Call<ResponseBody> call = service.updateSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteSourceControlDelegate(call.execute());
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteSourceControlAsync(String resourceGroupName, String name, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteSourceControl == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteSourceControl, serviceCallback);
        Call<ResponseBody> call = service.updateSiteSourceControl(resourceGroupName, name, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> updateSiteSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> getSiteSourceControlSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteSourceControlSlotDelegate(call.execute());
    }

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteSourceControlSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> getSiteSourceControlSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControlSlot(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteSourceControl == null) {
            throw new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteSourceControl);
        Call<ResponseBody> call = service.createOrUpdateSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteSourceControlSlotDelegate(call.execute());
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteSourceControl == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteSourceControl, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteSourceControlSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControlSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteSourceControlSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteSourceControlSlotDelegate(call.execute());
    }

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteSourceControlSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteSourceControlSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteSourceControl> updateSiteSourceControlSlot(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteSourceControl == null) {
            throw new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteSourceControl);
        Call<ResponseBody> call = service.updateSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteSourceControlSlotDelegate(call.execute());
    }

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteSourceControl == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteSourceControl is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteSourceControl, serviceCallback);
        Call<ResponseBody> call = service.updateSiteSourceControlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteSourceControl, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteSourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteSourceControlSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteSourceControl> updateSiteSourceControlSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteSourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteSourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> listSiteAppSettings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteAppSettings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteAppSettingsDelegate(call.execute());
    }

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteAppSettingsAsync(String resourceGroupName, String name, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteAppSettings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteAppSettingsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> listSiteAppSettingsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> listSiteAppSettingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteAppSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteAppSettingsSlotDelegate(call.execute());
    }

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteAppSettingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteAppSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteAppSettingsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> listSiteAppSettingsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param appSettings Application settings of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> updateSiteAppSettings(String resourceGroupName, String name, StringDictionary appSettings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (appSettings == null) {
            throw new IllegalArgumentException("Parameter appSettings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(appSettings);
        Call<ResponseBody> call = service.updateSiteAppSettings(resourceGroupName, name, this.client.getSubscriptionId(), appSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteAppSettingsDelegate(call.execute());
    }

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param appSettings Application settings of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteAppSettingsAsync(String resourceGroupName, String name, StringDictionary appSettings, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (appSettings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter appSettings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(appSettings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteAppSettings(resourceGroupName, name, this.client.getSubscriptionId(), appSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteAppSettingsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> updateSiteAppSettingsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param appSettings Application settings of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> updateSiteAppSettingsSlot(String resourceGroupName, String name, String slot, StringDictionary appSettings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (appSettings == null) {
            throw new IllegalArgumentException("Parameter appSettings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(appSettings);
        Call<ResponseBody> call = service.updateSiteAppSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), appSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteAppSettingsSlotDelegate(call.execute());
    }

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param appSettings Application settings of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteAppSettingsSlotAsync(String resourceGroupName, String name, String slot, StringDictionary appSettings, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (appSettings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter appSettings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(appSettings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteAppSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), appSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteAppSettingsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> updateSiteAppSettingsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ConnectionStringDictionary> listSiteConnectionStrings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteConnectionStrings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteConnectionStringsDelegate(call.execute());
    }

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteConnectionStringsAsync(String resourceGroupName, String name, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteConnectionStrings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ConnectionStringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteConnectionStringsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ConnectionStringDictionary> listSiteConnectionStringsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ConnectionStringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ConnectionStringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ConnectionStringDictionary> listSiteConnectionStringsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteConnectionStringsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteConnectionStringsSlotDelegate(call.execute());
    }

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteConnectionStringsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteConnectionStringsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ConnectionStringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteConnectionStringsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ConnectionStringDictionary> listSiteConnectionStringsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ConnectionStringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ConnectionStringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param connectionStrings Connection strings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStrings(String resourceGroupName, String name, ConnectionStringDictionary connectionStrings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionStrings == null) {
            throw new IllegalArgumentException("Parameter connectionStrings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionStrings);
        Call<ResponseBody> call = service.updateSiteConnectionStrings(resourceGroupName, name, this.client.getSubscriptionId(), connectionStrings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteConnectionStringsDelegate(call.execute());
    }

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param connectionStrings Connection strings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteConnectionStringsAsync(String resourceGroupName, String name, ConnectionStringDictionary connectionStrings, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionStrings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionStrings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionStrings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteConnectionStrings(resourceGroupName, name, this.client.getSubscriptionId(), connectionStrings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ConnectionStringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteConnectionStringsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStringsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ConnectionStringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ConnectionStringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param connectionStrings Connection strings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStringsSlot(String resourceGroupName, String name, String slot, ConnectionStringDictionary connectionStrings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionStrings == null) {
            throw new IllegalArgumentException("Parameter connectionStrings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionStrings);
        Call<ResponseBody> call = service.updateSiteConnectionStringsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), connectionStrings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteConnectionStringsSlotDelegate(call.execute());
    }

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param connectionStrings Connection strings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteConnectionStringsSlotAsync(String resourceGroupName, String name, String slot, ConnectionStringDictionary connectionStrings, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionStrings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionStrings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionStrings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteConnectionStringsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), connectionStrings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ConnectionStringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteConnectionStringsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStringsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ConnectionStringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ConnectionStringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteAuthSettings> listSiteAuthSettings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteAuthSettings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteAuthSettingsDelegate(call.execute());
    }

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteAuthSettingsAsync(String resourceGroupName, String name, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteAuthSettings(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteAuthSettings>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteAuthSettingsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteAuthSettings> listSiteAuthSettingsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteAuthSettings, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteAuthSettings>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteAuthSettings> listSiteAuthSettingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteAuthSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteAuthSettingsSlotDelegate(call.execute());
    }

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteAuthSettingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteAuthSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteAuthSettings>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteAuthSettingsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteAuthSettings> listSiteAuthSettingsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteAuthSettings, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteAuthSettings>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteAuthSettings Auth settings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteAuthSettings> updateSiteAuthSettings(String resourceGroupName, String name, SiteAuthSettings siteAuthSettings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteAuthSettings == null) {
            throw new IllegalArgumentException("Parameter siteAuthSettings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteAuthSettings);
        Call<ResponseBody> call = service.updateSiteAuthSettings(resourceGroupName, name, this.client.getSubscriptionId(), siteAuthSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteAuthSettingsDelegate(call.execute());
    }

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteAuthSettings Auth settings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteAuthSettingsAsync(String resourceGroupName, String name, SiteAuthSettings siteAuthSettings, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteAuthSettings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteAuthSettings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteAuthSettings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteAuthSettings(resourceGroupName, name, this.client.getSubscriptionId(), siteAuthSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteAuthSettings>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteAuthSettingsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteAuthSettings> updateSiteAuthSettingsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteAuthSettings, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteAuthSettings>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteAuthSettings Auth settings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteAuthSettings> updateSiteAuthSettingsSlot(String resourceGroupName, String name, String slot, SiteAuthSettings siteAuthSettings) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteAuthSettings == null) {
            throw new IllegalArgumentException("Parameter siteAuthSettings is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteAuthSettings);
        Call<ResponseBody> call = service.updateSiteAuthSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteAuthSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteAuthSettingsSlotDelegate(call.execute());
    }

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteAuthSettings Auth settings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteAuthSettingsSlotAsync(String resourceGroupName, String name, String slot, SiteAuthSettings siteAuthSettings, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteAuthSettings == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteAuthSettings is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteAuthSettings, serviceCallback);
        Call<ResponseBody> call = service.updateSiteAuthSettingsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteAuthSettings, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteAuthSettings>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteAuthSettingsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteAuthSettings> updateSiteAuthSettingsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteAuthSettings, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteAuthSettings>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the User object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<User> listSitePublishingCredentials(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.listSitePublishingCredentials(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<User>() { }.getType());
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall listSitePublishingCredentialsAsync(String resourceGroupName, String name, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listSitePublishingCredentials(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<User>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<User> beginListSitePublishingCredentials(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginListSitePublishingCredentials(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginListSitePublishingCredentialsDelegate(call.execute());
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginListSitePublishingCredentialsAsync(String resourceGroupName, String name, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.beginListSitePublishingCredentials(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<User>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginListSitePublishingCredentialsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<User> beginListSitePublishingCredentialsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<User, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<User>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the User object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<User> listSitePublishingCredentialsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.listSitePublishingCredentialsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<User>() { }.getType());
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall listSitePublishingCredentialsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.listSitePublishingCredentialsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<User>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<User> beginListSitePublishingCredentialsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginListSitePublishingCredentialsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginListSitePublishingCredentialsSlotDelegate(call.execute());
    }

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginListSitePublishingCredentialsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.beginListSitePublishingCredentialsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<User>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginListSitePublishingCredentialsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<User> beginListSitePublishingCredentialsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<User, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<User>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> listSiteMetadata(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteMetadata(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteMetadataDelegate(call.execute());
    }

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteMetadataAsync(String resourceGroupName, String name, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteMetadata(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteMetadataDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> listSiteMetadataDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> listSiteMetadataSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteMetadataSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteMetadataSlotDelegate(call.execute());
    }

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteMetadataSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteMetadataSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteMetadataSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> listSiteMetadataSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param metadata Meta data of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> updateSiteMetadata(String resourceGroupName, String name, StringDictionary metadata) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (metadata == null) {
            throw new IllegalArgumentException("Parameter metadata is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(metadata);
        Call<ResponseBody> call = service.updateSiteMetadata(resourceGroupName, name, this.client.getSubscriptionId(), metadata, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteMetadataDelegate(call.execute());
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param metadata Meta data of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteMetadataAsync(String resourceGroupName, String name, StringDictionary metadata, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (metadata == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter metadata is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(metadata, serviceCallback);
        Call<ResponseBody> call = service.updateSiteMetadata(resourceGroupName, name, this.client.getSubscriptionId(), metadata, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteMetadataDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> updateSiteMetadataDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param metadata Meta data of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<StringDictionary> updateSiteMetadataSlot(String resourceGroupName, String name, String slot, StringDictionary metadata) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (metadata == null) {
            throw new IllegalArgumentException("Parameter metadata is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(metadata);
        Call<ResponseBody> call = service.updateSiteMetadataSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), metadata, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteMetadataSlotDelegate(call.execute());
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param metadata Meta data of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteMetadataSlotAsync(String resourceGroupName, String name, String slot, StringDictionary metadata, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (metadata == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter metadata is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(metadata, serviceCallback);
        Call<ResponseBody> call = service.updateSiteMetadataSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), metadata, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<StringDictionary>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteMetadataSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<StringDictionary> updateSiteMetadataSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<StringDictionary, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<StringDictionary>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteLogsConfig> getSiteLogsConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteLogsConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteLogsConfigDelegate(call.execute());
    }

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteLogsConfigAsync(String resourceGroupName, String name, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteLogsConfig(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteLogsConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteLogsConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteLogsConfig> getSiteLogsConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteLogsConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteLogsConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteLogsConfig Site logs configuration
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteLogsConfig> updateSiteLogsConfig(String resourceGroupName, String name, SiteLogsConfig siteLogsConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteLogsConfig == null) {
            throw new IllegalArgumentException("Parameter siteLogsConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteLogsConfig);
        Call<ResponseBody> call = service.updateSiteLogsConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteLogsConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteLogsConfigDelegate(call.execute());
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteLogsConfig Site logs configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteLogsConfigAsync(String resourceGroupName, String name, SiteLogsConfig siteLogsConfig, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteLogsConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteLogsConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteLogsConfig, serviceCallback);
        Call<ResponseBody> call = service.updateSiteLogsConfig(resourceGroupName, name, this.client.getSubscriptionId(), siteLogsConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteLogsConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteLogsConfigDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteLogsConfig> updateSiteLogsConfigDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteLogsConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteLogsConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteLogsConfig> getSiteLogsConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteLogsConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteLogsConfigSlotDelegate(call.execute());
    }

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteLogsConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteLogsConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteLogsConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteLogsConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteLogsConfig> getSiteLogsConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteLogsConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteLogsConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteLogsConfig Site logs configuration
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SiteLogsConfig> updateSiteLogsConfigSlot(String resourceGroupName, String name, String slot, SiteLogsConfig siteLogsConfig) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (siteLogsConfig == null) {
            throw new IllegalArgumentException("Parameter siteLogsConfig is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(siteLogsConfig);
        Call<ResponseBody> call = service.updateSiteLogsConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteLogsConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteLogsConfigSlotDelegate(call.execute());
    }

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteLogsConfig Site logs configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteLogsConfigSlotAsync(String resourceGroupName, String name, String slot, SiteLogsConfig siteLogsConfig, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (siteLogsConfig == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter siteLogsConfig is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(siteLogsConfig, serviceCallback);
        Call<ResponseBody> call = service.updateSiteLogsConfigSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), siteLogsConfig, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SiteLogsConfig>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteLogsConfigSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SiteLogsConfig> updateSiteLogsConfigSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SiteLogsConfig, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SiteLogsConfig>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> listSitePremierAddOnsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSitePremierAddOnsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSitePremierAddOnsSlotDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSitePremierAddOnsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSitePremierAddOnsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSitePremierAddOnsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> listSitePremierAddOnsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> listSitePremierAddOns(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSitePremierAddOns(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSitePremierAddOnsDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSitePremierAddOnsAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSitePremierAddOns(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSitePremierAddOnsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> listSitePremierAddOnsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSitePremierAddOnSlotDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSitePremierAddOnSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSitePremierAddOnSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> addSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot, PremierAddOnRequest premierAddOn) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (premierAddOn == null) {
            throw new IllegalArgumentException("Parameter premierAddOn is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(premierAddOn);
        Call<ResponseBody> call = service.addSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), premierAddOn, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return addSitePremierAddOnSlotDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall addSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, PremierAddOnRequest premierAddOn, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (premierAddOn == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOn is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(premierAddOn, serviceCallback);
        Call<ResponseBody> call = service.addSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), premierAddOn, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(addSitePremierAddOnSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> addSitePremierAddOnSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSitePremierAddOnSlotDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSitePremierAddOnSlot(resourceGroupName, name, premierAddOnName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSitePremierAddOnSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSitePremierAddOnSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSitePremierAddOnDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSitePremierAddOnDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSitePremierAddOnDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> addSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName, PremierAddOnRequest premierAddOn) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (premierAddOn == null) {
            throw new IllegalArgumentException("Parameter premierAddOn is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(premierAddOn);
        Call<ResponseBody> call = service.addSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), premierAddOn, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return addSitePremierAddOnDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall addSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, PremierAddOnRequest premierAddOn, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (premierAddOn == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOn is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(premierAddOn, serviceCallback);
        Call<ResponseBody> call = service.addSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), premierAddOn, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(addSitePremierAddOnDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> addSitePremierAddOnDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (premierAddOnName == null) {
            throw new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSitePremierAddOnDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (premierAddOnName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter premierAddOnName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSitePremierAddOn(resourceGroupName, name, premierAddOnName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSitePremierAddOnDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSitePremierAddOnDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupRequest> getSiteBackupConfiguration(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteBackupConfiguration(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupConfigurationDelegate(call.execute());
    }

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupConfigurationAsync(String resourceGroupName, String name, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteBackupConfiguration(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupConfigurationDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupRequest> getSiteBackupConfigurationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupRequest> getSiteBackupConfigurationSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteBackupConfigurationSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupConfigurationSlotDelegate(call.execute());
    }

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupConfigurationSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteBackupConfigurationSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupConfigurationSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupRequest> getSiteBackupConfigurationSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupRequest> updateSiteBackupConfiguration(String resourceGroupName, String name, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.updateSiteBackupConfiguration(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteBackupConfigurationDelegate(call.execute());
    }

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteBackupConfigurationAsync(String resourceGroupName, String name, BackupRequest request, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.updateSiteBackupConfiguration(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteBackupConfigurationDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupRequest> updateSiteBackupConfigurationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupRequest> updateSiteBackupConfigurationSlot(String resourceGroupName, String name, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.updateSiteBackupConfigurationSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteBackupConfigurationSlotDelegate(call.execute());
    }

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteBackupConfigurationSlotAsync(String resourceGroupName, String name, String slot, BackupRequest request, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.updateSiteBackupConfigurationSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteBackupConfigurationSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupRequest> updateSiteBackupConfigurationSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> backupSite(String resourceGroupName, String name, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.backupSite(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return backupSiteDelegate(call.execute());
    }

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall backupSiteAsync(String resourceGroupName, String name, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.backupSite(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(backupSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> backupSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> backupSiteSlot(String resourceGroupName, String name, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.backupSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return backupSiteSlotDelegate(call.execute());
    }

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall backupSiteSlotAsync(String resourceGroupName, String name, String slot, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.backupSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(backupSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> backupSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RestoreRequest> discoverSiteRestore(String resourceGroupName, String name, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.discoverSiteRestore(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return discoverSiteRestoreDelegate(call.execute());
    }

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall discoverSiteRestoreAsync(String resourceGroupName, String name, RestoreRequest request, final ServiceCallback<RestoreRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.discoverSiteRestore(resourceGroupName, name, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RestoreRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(discoverSiteRestoreDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RestoreRequest> discoverSiteRestoreDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RestoreRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RestoreRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreRequest object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RestoreRequest> discoverSiteRestoreSlot(String resourceGroupName, String name, String slot, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.discoverSiteRestoreSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return discoverSiteRestoreSlotDelegate(call.execute());
    }

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall discoverSiteRestoreSlotAsync(String resourceGroupName, String name, String slot, RestoreRequest request, final ServiceCallback<RestoreRequest> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.discoverSiteRestoreSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RestoreRequest>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(discoverSiteRestoreSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RestoreRequest> discoverSiteRestoreSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RestoreRequest, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RestoreRequest>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItemCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItemCollection> listSiteBackupsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteBackupsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteBackupsSlotDelegate(call.execute());
    }

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteBackupsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<BackupItemCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteBackupsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItemCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteBackupsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItemCollection> listSiteBackupsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItemCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItemCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItemCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItemCollection> listSiteBackups(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteBackups(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteBackupsDelegate(call.execute());
    }

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteBackupsAsync(String resourceGroupName, String name, final ServiceCallback<BackupItemCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteBackups(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItemCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteBackupsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItemCollection> listSiteBackupsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItemCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItemCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> getSiteBackupStatus(String resourceGroupName, String name, String backupId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteBackupStatus(resourceGroupName, name, backupId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupStatusDelegate(call.execute());
    }

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupStatusAsync(String resourceGroupName, String name, String backupId, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteBackupStatus(resourceGroupName, name, backupId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupStatusDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> getSiteBackupStatusDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> deleteBackup(String resourceGroupName, String name, String backupId) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteBackup(resourceGroupName, name, backupId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteBackupDelegate(call.execute());
    }

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteBackupAsync(String resourceGroupName, String name, String backupId, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteBackup(resourceGroupName, name, backupId, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteBackupDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> deleteBackupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> getSiteBackupStatusSlot(String resourceGroupName, String name, String backupId, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteBackupStatusSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupStatusSlotDelegate(call.execute());
    }

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupStatusSlotAsync(String resourceGroupName, String name, String backupId, String slot, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteBackupStatusSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupStatusSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> getSiteBackupStatusSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> deleteBackupSlot(String resourceGroupName, String name, String backupId, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteBackupSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteBackupSlotDelegate(call.execute());
    }

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteBackupSlotAsync(String resourceGroupName, String name, String backupId, String slot, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteBackupSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteBackupSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> deleteBackupSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> getSiteBackupStatusSecrets(String resourceGroupName, String name, String backupId, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.getSiteBackupStatusSecrets(resourceGroupName, name, backupId, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupStatusSecretsDelegate(call.execute());
    }

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupStatusSecretsAsync(String resourceGroupName, String name, String backupId, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.getSiteBackupStatusSecrets(resourceGroupName, name, backupId, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupStatusSecretsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> getSiteBackupStatusSecretsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<BackupItem> getSiteBackupStatusSecretsSlot(String resourceGroupName, String name, String backupId, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.getSiteBackupStatusSecretsSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteBackupStatusSecretsSlotDelegate(call.execute());
    }

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteBackupStatusSecretsSlotAsync(String resourceGroupName, String name, String backupId, String slot, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.getSiteBackupStatusSecretsSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<BackupItem>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteBackupStatusSecretsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<BackupItem> getSiteBackupStatusSecretsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<BackupItem, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<BackupItem>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RestoreResponse> restoreSite(String resourceGroupName, String name, String backupId, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.restoreSite(resourceGroupName, name, backupId, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return restoreSiteDelegate(call.execute());
    }

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall restoreSiteAsync(String resourceGroupName, String name, String backupId, RestoreRequest request, final ServiceCallback<RestoreResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.restoreSite(resourceGroupName, name, backupId, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RestoreResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(restoreSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RestoreResponse> restoreSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RestoreResponse, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RestoreResponse>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreResponse object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RestoreResponse> restoreSiteSlot(String resourceGroupName, String name, String backupId, String slot, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (backupId == null) {
            throw new IllegalArgumentException("Parameter backupId is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(request);
        Call<ResponseBody> call = service.restoreSiteSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return restoreSiteSlotDelegate(call.execute());
    }

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall restoreSiteSlotAsync(String resourceGroupName, String name, String backupId, String slot, RestoreRequest request, final ServiceCallback<RestoreResponse> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (backupId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter backupId is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (request == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter request is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(request, serviceCallback);
        Call<ResponseBody> call = service.restoreSiteSlot(resourceGroupName, name, backupId, slot, this.client.getSubscriptionId(), request, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RestoreResponse>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(restoreSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RestoreResponse> restoreSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RestoreResponse, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RestoreResponse>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<CsmUsageQuotaCollection> getSiteUsagesSlot(String resourceGroupName, String name, String slot, String filter) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteUsagesSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteUsagesSlotDelegate(call.execute());
    }

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteUsagesSlotAsync(String resourceGroupName, String name, String slot, String filter, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteUsagesSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<CsmUsageQuotaCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteUsagesSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<CsmUsageQuotaCollection> getSiteUsagesSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<CsmUsageQuotaCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<CsmUsageQuotaCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<CsmUsageQuotaCollection> getSiteUsages(String resourceGroupName, String name, String filter) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteUsages(resourceGroupName, name, this.client.getSubscriptionId(), filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteUsagesDelegate(call.execute());
    }

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteUsagesAsync(String resourceGroupName, String name, String filter, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteUsages(resourceGroupName, name, this.client.getSubscriptionId(), filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<CsmUsageQuotaCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteUsagesDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<CsmUsageQuotaCollection> getSiteUsagesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<CsmUsageQuotaCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<CsmUsageQuotaCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceMetricCollection> getSiteMetricsSlot(String resourceGroupName, String name, String slot, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteMetricsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), details, filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteMetricsSlotDelegate(call.execute());
    }

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteMetricsSlotAsync(String resourceGroupName, String name, String slot, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteMetricsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), details, filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ResourceMetricCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteMetricsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ResourceMetricCollection> getSiteMetricsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ResourceMetricCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ResourceMetricCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceMetricCollection> getSiteMetrics(String resourceGroupName, String name, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteMetrics(resourceGroupName, name, this.client.getSubscriptionId(), details, filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteMetricsDelegate(call.execute());
    }

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteMetricsAsync(String resourceGroupName, String name, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteMetrics(resourceGroupName, name, this.client.getSubscriptionId(), details, filter, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<ResourceMetricCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteMetricsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<ResourceMetricCollection> getSiteMetricsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ResourceMetricCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<ResourceMetricCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitions(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteMetricDefinitions(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteMetricDefinitionsDelegate(call.execute());
    }

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteMetricDefinitionsAsync(String resourceGroupName, String name, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteMetricDefinitions(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<MetricDefinitionCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteMetricDefinitionsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitionsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<MetricDefinitionCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<MetricDefinitionCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteMetricDefinitionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteMetricDefinitionsSlotDelegate(call.execute());
    }

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteMetricDefinitionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteMetricDefinitionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<MetricDefinitionCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteMetricDefinitionsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitionsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<MetricDefinitionCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<MetricDefinitionCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param options Specifies options for publishing profile. Pass CsmPublishingProfileOptions.Format=FileZilla3 for FileZilla FTP format.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> listSitePublishingProfileXml(String resourceGroupName, String name, CsmPublishingProfileOptions options) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (options == null) {
            throw new IllegalArgumentException("Parameter options is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(options);
        Call<ResponseBody> call = service.listSitePublishingProfileXml(resourceGroupName, name, this.client.getSubscriptionId(), options, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSitePublishingProfileXmlDelegate(call.execute());
    }

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param options Specifies options for publishing profile. Pass CsmPublishingProfileOptions.Format=FileZilla3 for FileZilla FTP format.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSitePublishingProfileXmlAsync(String resourceGroupName, String name, CsmPublishingProfileOptions options, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (options == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter options is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(options, serviceCallback);
        Call<ResponseBody> call = service.listSitePublishingProfileXml(resourceGroupName, name, this.client.getSubscriptionId(), options, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSitePublishingProfileXmlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<InputStream> listSitePublishingProfileXmlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<InputStream, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param options Specifies options for publishing profile. Pass CsmPublishingProfileOptions.Format=FileZilla3 for FileZilla FTP format.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> listSitePublishingProfileXmlSlot(String resourceGroupName, String name, String slot, CsmPublishingProfileOptions options) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (options == null) {
            throw new IllegalArgumentException("Parameter options is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(options);
        Call<ResponseBody> call = service.listSitePublishingProfileXmlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), options, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSitePublishingProfileXmlSlotDelegate(call.execute());
    }

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param options Specifies options for publishing profile. Pass CsmPublishingProfileOptions.Format=FileZilla3 for FileZilla FTP format.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSitePublishingProfileXmlSlotAsync(String resourceGroupName, String name, String slot, CsmPublishingProfileOptions options, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (options == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter options is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(options, serviceCallback);
        Call<ResponseBody> call = service.listSitePublishingProfileXmlSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), options, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSitePublishingProfileXmlSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<InputStream> listSitePublishingProfileXmlSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<InputStream, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> restartSite(String resourceGroupName, String name, Boolean softRestart, Boolean synchronous) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.restartSite(resourceGroupName, name, this.client.getSubscriptionId(), softRestart, synchronous, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return restartSiteDelegate(call.execute());
    }

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall restartSiteAsync(String resourceGroupName, String name, Boolean softRestart, Boolean synchronous, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.restartSite(resourceGroupName, name, this.client.getSubscriptionId(), softRestart, synchronous, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(restartSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> restartSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> restartSiteSlot(String resourceGroupName, String name, String slot, Boolean softRestart, Boolean synchronous) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.restartSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), softRestart, synchronous, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return restartSiteSlotDelegate(call.execute());
    }

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall restartSiteSlotAsync(String resourceGroupName, String name, String slot, Boolean softRestart, Boolean synchronous, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.restartSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), softRestart, synchronous, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(restartSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> restartSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> startSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.startSite(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return startSiteDelegate(call.execute());
    }

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall startSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.startSite(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(startSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> startSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> startSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.startSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return startSiteSlotDelegate(call.execute());
    }

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall startSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.startSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(startSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> startSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> stopSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.stopSite(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return stopSiteDelegate(call.execute());
    }

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall stopSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.stopSite(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(stopSiteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> stopSiteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> stopSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.stopSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return stopSiteSlotDelegate(call.execute());
    }

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall stopSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.stopSiteSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(stopSiteSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> stopSiteSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> syncSiteRepositorySlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.syncSiteRepositorySlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return syncSiteRepositorySlotDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall syncSiteRepositorySlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.syncSiteRepositorySlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(syncSiteRepositorySlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> syncSiteRepositorySlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> syncSiteRepository(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.syncSiteRepository(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return syncSiteRepositoryDelegate(call.execute());
    }

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall syncSiteRepositoryAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.syncSiteRepository(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(syncSiteRepositoryDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> syncSiteRepositoryDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> generateNewSitePublishingPasswordSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.generateNewSitePublishingPasswordSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return generateNewSitePublishingPasswordSlotDelegate(call.execute());
    }

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall generateNewSitePublishingPasswordSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.generateNewSitePublishingPasswordSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(generateNewSitePublishingPasswordSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> generateNewSitePublishingPasswordSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> generateNewSitePublishingPassword(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.generateNewSitePublishingPassword(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return generateNewSitePublishingPasswordDelegate(call.execute());
    }

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall generateNewSitePublishingPasswordAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.generateNewSitePublishingPassword(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(generateNewSitePublishingPasswordDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> generateNewSitePublishingPasswordDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnection(String resourceGroupName, String name, String entityName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteRelayServiceConnectionDelegate(call.execute());
    }

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteRelayServiceConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnection(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteRelayServiceConnectionDelegate(call.execute());
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteRelayServiceConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteRelayServiceConnection(String resourceGroupName, String name, String entityName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteRelayServiceConnectionDelegate(call.execute());
    }

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteRelayServiceConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteRelayServiceConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnection(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteRelayServiceConnectionDelegate(call.execute());
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteRelayServiceConnection(resourceGroupName, name, entityName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteRelayServiceConnectionDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnectionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteRelayServiceConnectionSlotDelegate(call.execute());
    }

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteRelayServiceConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteRelayServiceConnectionSlotDelegate(call.execute());
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteRelayServiceConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.deleteSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteSiteRelayServiceConnectionSlotDelegate(call.execute());
    }

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.deleteSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteSiteRelayServiceConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> deleteSiteRelayServiceConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (entityName == null) {
            throw new IllegalArgumentException("Parameter entityName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteRelayServiceConnectionSlotDelegate(call.execute());
    }

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (entityName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter entityName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteRelayServiceConnectionSlot(resourceGroupName, name, entityName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteRelayServiceConnectionSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnectionSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnectionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteRelayServiceConnectionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteRelayServiceConnectionsSlotDelegate(call.execute());
    }

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteRelayServiceConnectionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteRelayServiceConnectionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteRelayServiceConnectionsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnectionsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnections(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listSiteRelayServiceConnections(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listSiteRelayServiceConnectionsDelegate(call.execute());
    }

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listSiteRelayServiceConnectionsAsync(String resourceGroupName, String name, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listSiteRelayServiceConnections(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<RelayServiceConnectionEntity>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listSiteRelayServiceConnectionsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnectionsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RelayServiceConnectionEntity, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<RelayServiceConnectionEntity>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteVnetGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVnetGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVnetGatewaySlotDelegate(call.execute());
    }

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVnetGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVnetGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVnetGatewaySlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteVnetGatewaySlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteVNETConnectionGatewaySlotDelegate(call.execute());
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteVNETConnectionGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetGateway>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteVNETConnectionGatewaySlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGatewaySlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetGateway, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetGateway>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetGateway> updateSiteVNETConnectionGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteVNETConnectionGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteVNETConnectionGatewaySlotDelegate(call.execute());
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteVNETConnectionGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteVNETConnectionGatewaySlot(resourceGroupName, name, vnetName, gatewayName, slot, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetGateway>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteVNETConnectionGatewaySlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetGateway> updateSiteVNETConnectionGatewaySlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetGateway, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetGateway>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getSiteVnetGateway(String resourceGroupName, String name, String vnetName, String gatewayName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVnetGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVnetGatewayDelegate(call.execute());
    }

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVnetGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVnetGatewayDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getSiteVnetGatewayDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGateway(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateSiteVNETConnectionGatewayDelegate(call.execute());
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateSiteVNETConnectionGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdateSiteVNETConnectionGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetGateway>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateSiteVNETConnectionGatewayDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGatewayDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetGateway, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetGateway>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VnetGateway> updateSiteVNETConnectionGateway(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (vnetName == null) {
            throw new IllegalArgumentException("Parameter vnetName is required and cannot be null.");
        }
        if (gatewayName == null) {
            throw new IllegalArgumentException("Parameter gatewayName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (connectionEnvelope == null) {
            throw new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(connectionEnvelope);
        Call<ResponseBody> call = service.updateSiteVNETConnectionGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSiteVNETConnectionGatewayDelegate(call.execute());
    }

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSiteVNETConnectionGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (vnetName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vnetName is required and cannot be null."));
            return null;
        }
        if (gatewayName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (connectionEnvelope == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionEnvelope is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(connectionEnvelope, serviceCallback);
        Call<ResponseBody> call = service.updateSiteVNETConnectionGateway(resourceGroupName, name, vnetName, gatewayName, this.client.getSubscriptionId(), connectionEnvelope, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<VnetGateway>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSiteVNETConnectionGatewayDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<VnetGateway> updateSiteVNETConnectionGatewayDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VnetGateway, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<VnetGateway>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetInfo&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VnetInfo>> getSiteVNETConnections(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVNETConnections(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVNETConnectionsDelegate(call.execute());
    }

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVNETConnectionsAsync(String resourceGroupName, String name, final ServiceCallback<List<VnetInfo>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVNETConnections(resourceGroupName, name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VnetInfo>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVNETConnectionsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VnetInfo>> getSiteVNETConnectionsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VnetInfo>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VnetInfo>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetInfo&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<VnetInfo>> getSiteVNETConnectionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Parameter slot is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSiteVNETConnectionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSiteVNETConnectionsSlotDelegate(call.execute());
    }

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSiteVNETConnectionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<List<VnetInfo>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
            return null;
        }
        if (slot == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter slot is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSiteVNETConnectionsSlot(resourceGroupName, name, slot, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<VnetInfo>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSiteVNETConnectionsSlotDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<List<VnetInfo>> getSiteVNETConnectionsSlotDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<List<VnetInfo>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<List<VnetInfo>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
