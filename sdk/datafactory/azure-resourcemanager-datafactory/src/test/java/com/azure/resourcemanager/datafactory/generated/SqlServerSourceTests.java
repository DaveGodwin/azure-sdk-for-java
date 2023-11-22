// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;
import com.azure.resourcemanager.datafactory.models.SqlServerSource;

public final class SqlServerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlServerSource model = BinaryData.fromString(
            "{\"type\":\"SqlServerSource\",\"sqlReaderQuery\":\"databqkgu\",\"sqlReaderStoredProcedureName\":\"datadyxrjjdjiki\",\"storedProcedureParameters\":\"datazubgddk\",\"isolationLevel\":\"datavq\",\"produceAdditionalTypes\":\"datauq\",\"partitionOption\":\"datalwnxryyqtjcrpax\",\"partitionSettings\":{\"partitionColumnName\":\"dataf\",\"partitionUpperBound\":\"datae\",\"partitionLowerBound\":\"datad\"},\"queryTimeout\":\"datadldm\",\"additionalColumns\":\"dataqftywb\",\"sourceRetryCount\":\"datan\",\"sourceRetryWait\":\"datadci\",\"maxConcurrentConnections\":\"dataotbvflgkk\",\"disableMetricsCollection\":\"dataqhopafobpyeobr\",\"\":{\"iiu\":\"datavqafdhp\",\"vdtqhrtn\":\"datayrobckelowsm\",\"kphamefzzgwjoau\":\"datassqynupskit\"}}")
            .toObject(SqlServerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlServerSource model = new SqlServerSource().withSourceRetryCount("datan").withSourceRetryWait("datadci")
            .withMaxConcurrentConnections("dataotbvflgkk").withDisableMetricsCollection("dataqhopafobpyeobr")
            .withQueryTimeout("datadldm").withAdditionalColumns("dataqftywb").withSqlReaderQuery("databqkgu")
            .withSqlReaderStoredProcedureName("datadyxrjjdjiki").withStoredProcedureParameters("datazubgddk")
            .withIsolationLevel("datavq").withProduceAdditionalTypes("datauq")
            .withPartitionOption("datalwnxryyqtjcrpax").withPartitionSettings(new SqlPartitionSettings()
                .withPartitionColumnName("dataf").withPartitionUpperBound("datae").withPartitionLowerBound("datad"));
        model = BinaryData.fromObject(model).toObject(SqlServerSource.class);
    }
}
