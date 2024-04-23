// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.selfhelp.fluent.models.DiagnosticResourceInner;

/**
 * An instance of this class provides access to all the operations defined in DiagnosticsClient.
 */
public interface DiagnosticsClient {
    /**
     * Creates a diagnostic for the specific resource using solutionId from discovery solutions. &lt;br/&gt;Diagnostics
     * are powerful solutions that access product resources or other relevant data and provide the root cause of the
     * issue and the steps to address the issue.&lt;br/&gt;&lt;br/&gt;.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of diagnostic resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticResourceInner>, DiagnosticResourceInner> beginCreate(String scope,
        String diagnosticsResourceName);

    /**
     * Creates a diagnostic for the specific resource using solutionId from discovery solutions. &lt;br/&gt;Diagnostics
     * are powerful solutions that access product resources or other relevant data and provide the root cause of the
     * issue and the steps to address the issue.&lt;br/&gt;&lt;br/&gt;.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @param diagnosticResourceRequest The required request body for this insightResource invocation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of diagnostic resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticResourceInner>, DiagnosticResourceInner> beginCreate(String scope,
        String diagnosticsResourceName, DiagnosticResourceInner diagnosticResourceRequest, Context context);

    /**
     * Creates a diagnostic for the specific resource using solutionId from discovery solutions. &lt;br/&gt;Diagnostics
     * are powerful solutions that access product resources or other relevant data and provide the root cause of the
     * issue and the steps to address the issue.&lt;br/&gt;&lt;br/&gt;.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticResourceInner create(String scope, String diagnosticsResourceName);

    /**
     * Creates a diagnostic for the specific resource using solutionId from discovery solutions. &lt;br/&gt;Diagnostics
     * are powerful solutions that access product resources or other relevant data and provide the root cause of the
     * issue and the steps to address the issue.&lt;br/&gt;&lt;br/&gt;.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @param diagnosticResourceRequest The required request body for this insightResource invocation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostic resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticResourceInner create(String scope, String diagnosticsResourceName,
        DiagnosticResourceInner diagnosticResourceRequest, Context context);

    /**
     * Get the diagnostics using the 'diagnosticsResourceName' you chose while creating the diagnostic.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostics using the 'diagnosticsResourceName' you chose while creating the diagnostic along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticResourceInner> getWithResponse(String scope, String diagnosticsResourceName, Context context);

    /**
     * Get the diagnostics using the 'diagnosticsResourceName' you chose while creating the diagnostic.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param diagnosticsResourceName Unique resource name for insight resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostics using the 'diagnosticsResourceName' you chose while creating the diagnostic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticResourceInner get(String scope, String diagnosticsResourceName);
}
