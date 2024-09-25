// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPooledScheduleInner;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPooledScheduleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPooledScheduleInner model = BinaryData.fromString(
            "{\"properties\":{\"daysOfWeek\":[\"Thursday\"],\"rampUpStartTime\":{\"hour\":1647609549,\"minute\":2048055130},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":1715507551,\"rampUpCapacityThresholdPct\":1436102139,\"peakStartTime\":{\"hour\":1600165537,\"minute\":1827531187},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":391970506,\"minute\":2048168714},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":1152020606,\"rampDownCapacityThresholdPct\":1151827085,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroSessions\",\"rampDownWaitTimeMinutes\":2069794521,\"rampDownNotificationMessage\":\"zovawjvz\",\"offPeakStartTime\":{\"hour\":1168094954,\"minute\":2116872834},\"offPeakLoadBalancingAlgorithm\":\"BreadthFirst\"},\"id\":\"n\",\"name\":\"rnxipei\",\"type\":\"pjzu\"}")
            .toObject(ScalingPlanPooledScheduleInner.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1647609549, model.rampUpStartTime().hour());
        Assertions.assertEquals(2048055130, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(1715507551, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(1436102139, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(1600165537, model.peakStartTime().hour());
        Assertions.assertEquals(1827531187, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(391970506, model.rampDownStartTime().hour());
        Assertions.assertEquals(2048168714, model.rampDownStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1152020606, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1151827085, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(2069794521, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("zovawjvz", model.rampDownNotificationMessage());
        Assertions.assertEquals(1168094954, model.offPeakStartTime().hour());
        Assertions.assertEquals(2116872834, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPooledScheduleInner model
            = new ScalingPlanPooledScheduleInner().withDaysOfWeek(Arrays.asList(DayOfWeek.THURSDAY))
                .withRampUpStartTime(new Time().withHour(1647609549).withMinute(2048055130))
                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                .withRampUpMinimumHostsPct(1715507551)
                .withRampUpCapacityThresholdPct(1436102139)
                .withPeakStartTime(new Time().withHour(1600165537).withMinute(1827531187))
                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                .withRampDownStartTime(new Time().withHour(391970506).withMinute(2048168714))
                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                .withRampDownMinimumHostsPct(1152020606)
                .withRampDownCapacityThresholdPct(1151827085)
                .withRampDownForceLogoffUsers(true)
                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_SESSIONS)
                .withRampDownWaitTimeMinutes(2069794521)
                .withRampDownNotificationMessage("zovawjvz")
                .withOffPeakStartTime(new Time().withHour(1168094954).withMinute(2116872834))
                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPooledScheduleInner.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1647609549, model.rampUpStartTime().hour());
        Assertions.assertEquals(2048055130, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(1715507551, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(1436102139, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(1600165537, model.peakStartTime().hour());
        Assertions.assertEquals(1827531187, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(391970506, model.rampDownStartTime().hour());
        Assertions.assertEquals(2048168714, model.rampDownStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(1152020606, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1151827085, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(2069794521, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("zovawjvz", model.rampDownNotificationMessage());
        Assertions.assertEquals(1168094954, model.offPeakStartTime().hour());
        Assertions.assertEquals(2116872834, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }
}
