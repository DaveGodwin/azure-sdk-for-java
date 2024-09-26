// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for Certificate Delete.
 */
public final class CertificateDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/CertificateDelete.json
     */
    /**
     * Sample code: CertificateDelete.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void certificateDelete(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.certificates()
            .delete("default-azurebatch-japaneast", "sampleacct", "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                com.azure.core.util.Context.NONE);
    }
}
