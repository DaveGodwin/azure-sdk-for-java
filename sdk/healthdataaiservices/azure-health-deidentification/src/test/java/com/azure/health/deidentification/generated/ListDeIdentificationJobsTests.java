// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.deidentification.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.health.deidentification.models.DeidentificationJob;
import com.azure.health.deidentification.models.DocumentDataType;
import com.azure.health.deidentification.models.JobStatus;
import com.azure.health.deidentification.models.JobSummary;
import com.azure.health.deidentification.models.OperationType;
import com.azure.health.deidentification.models.SourceStorageLocation;
import com.azure.health.deidentification.models.TargetStorageLocation;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class ListDeIdentificationJobsTests extends DeidentificationClientTestBase {
    @Test
    @Disabled
    public void testListDeIdentificationJobsTests() {
        // method invocation
        PagedIterable<DeidentificationJob> response = deidentificationClient
            .listJobs("K1JJRDpzOEtaQWZabUQrQUNBQUFBQUFBQUFBQT09I1JUOjEjVFJDOjEwI0ZQQzpBZ0VBQUFBTUFDUUFBQUFBQUE9PQ==");

        // response assertion
        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());
        DeidentificationJob firstItem = response.iterator().next();
        Assertions.assertNotNull(firstItem);
        // verify property "name"
        Assertions.assertEquals("documents_smith_1", firstItem.getName());
        // verify property "sourceLocation"
        SourceStorageLocation firstItemSourceLocation = firstItem.getSourceLocation();
        Assertions.assertNotNull(firstItemSourceLocation);
        Assertions.assertEquals(
            "https://blobtest.blob.core.windows.net/container?sp=r&st=2024-01-24T18:11:10Z&se=2024-01-25T02:11:10Z&spr=https&sv=2022-11-02&sr=c&sig=signature%3D",
            firstItemSourceLocation.getLocation());
        Assertions.assertEquals("/documents", firstItemSourceLocation.getPrefix());
        List<String> firstItemSourceLocationExtensions = firstItemSourceLocation.getExtensions();
        Assertions.assertEquals("*", firstItemSourceLocationExtensions.iterator().next());
        // verify property "targetLocation"
        TargetStorageLocation firstItemTargetLocation = firstItem.getTargetLocation();
        Assertions.assertNotNull(firstItemTargetLocation);
        Assertions.assertEquals(
            "https://blobtest.blob.core.windows.net/container?sp=r&st=2024-01-24T18:11:10Z&se=2024-01-25T02:11:10Z&spr=https&sv=2022-11-02&sr=c&sig=signature%3D",
            firstItemTargetLocation.getLocation());
        Assertions.assertEquals("/documents", firstItemTargetLocation.getPrefix());
        // verify property "operation"
        Assertions.assertEquals(OperationType.REDACT, firstItem.getOperation());
        // verify property "dataType"
        Assertions.assertEquals(DocumentDataType.PLAINTEXT, firstItem.getDataType());
        // verify property "redactionFormat"
        Assertions.assertEquals("[{type}]", firstItem.getRedactionFormat());
        // verify property "status"
        Assertions.assertEquals(JobStatus.SUCCEEDED, firstItem.getStatus());
        // verify property "lastUpdatedAt"
        Assertions.assertNotNull(firstItem.getLastUpdatedAt());
        // verify property "createdAt"
        Assertions.assertNotNull(firstItem.getCreatedAt());
        // verify property "startedAt"
        Assertions.assertNotNull(firstItem.getStartedAt());
        // verify property "summary"
        JobSummary firstItemSummary = firstItem.getSummary();
        Assertions.assertNotNull(firstItemSummary);
        Assertions.assertEquals(10, firstItemSummary.getSuccessful());
        Assertions.assertEquals(0, firstItemSummary.getFailed());
        Assertions.assertEquals(0, firstItemSummary.getCanceled());
        Assertions.assertEquals(10, firstItemSummary.getTotal());
        Assertions.assertEquals(4096L, firstItemSummary.getBytesProcessed());
    }
}
