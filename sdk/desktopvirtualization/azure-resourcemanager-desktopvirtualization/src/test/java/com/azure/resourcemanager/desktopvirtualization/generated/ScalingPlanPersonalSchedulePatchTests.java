// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalSchedulePatch;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPersonalSchedulePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPersonalSchedulePatch model = BinaryData.fromString(
            "{\"properties\":{\"daysOfWeek\":[\"Saturday\"],\"rampUpStartTime\":{\"hour\":1584904008,\"minute\":1427716289},\"rampUpAutoStartHosts\":\"None\",\"rampUpStartVMOnConnect\":\"Enable\",\"rampUpActionOnDisconnect\":\"Hibernate\",\"rampUpMinutesToWaitOnDisconnect\":1238517729,\"rampUpActionOnLogoff\":\"Hibernate\",\"rampUpMinutesToWaitOnLogoff\":918393543,\"peakStartTime\":{\"hour\":1615397265,\"minute\":1712324120},\"peakStartVMOnConnect\":\"Enable\",\"peakActionOnDisconnect\":\"Deallocate\",\"peakMinutesToWaitOnDisconnect\":889157097,\"peakActionOnLogoff\":\"None\",\"peakMinutesToWaitOnLogoff\":270052165,\"rampDownStartTime\":{\"hour\":1108910411,\"minute\":1300588551},\"rampDownStartVMOnConnect\":\"Enable\",\"rampDownActionOnDisconnect\":\"Hibernate\",\"rampDownMinutesToWaitOnDisconnect\":1297199271,\"rampDownActionOnLogoff\":\"Deallocate\",\"rampDownMinutesToWaitOnLogoff\":585310107,\"offPeakStartTime\":{\"hour\":1282949861,\"minute\":245335843},\"offPeakStartVMOnConnect\":\"Enable\",\"offPeakActionOnDisconnect\":\"None\",\"offPeakMinutesToWaitOnDisconnect\":57076299,\"offPeakActionOnLogoff\":\"Hibernate\",\"offPeakMinutesToWaitOnLogoff\":220721528}}")
            .toObject(ScalingPlanPersonalSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1584904008, model.rampUpStartTime().hour());
        Assertions.assertEquals(1427716289, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.NONE, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(1238517729, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(918393543, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(1615397265, model.peakStartTime().hour());
        Assertions.assertEquals(1712324120, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(889157097, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.peakActionOnLogoff());
        Assertions.assertEquals(270052165, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1108910411, model.rampDownStartTime().hour());
        Assertions.assertEquals(1300588551, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(1297199271, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(585310107, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(1282949861, model.offPeakStartTime().hour());
        Assertions.assertEquals(245335843, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(57076299, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(220721528, model.offPeakMinutesToWaitOnLogoff());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPersonalSchedulePatch model
            = new ScalingPlanPersonalSchedulePatch().withDaysOfWeek(Arrays.asList(DayOfWeek.SATURDAY))
                .withRampUpStartTime(new Time().withHour(1584904008).withMinute(1427716289))
                .withRampUpAutoStartHosts(StartupBehavior.NONE)
                .withRampUpStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withRampUpActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withRampUpMinutesToWaitOnDisconnect(1238517729)
                .withRampUpActionOnLogoff(SessionHandlingOperation.HIBERNATE)
                .withRampUpMinutesToWaitOnLogoff(918393543)
                .withPeakStartTime(new Time().withHour(1615397265).withMinute(1712324120))
                .withPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withPeakActionOnDisconnect(SessionHandlingOperation.DEALLOCATE)
                .withPeakMinutesToWaitOnDisconnect(889157097)
                .withPeakActionOnLogoff(SessionHandlingOperation.NONE)
                .withPeakMinutesToWaitOnLogoff(270052165)
                .withRampDownStartTime(new Time().withHour(1108910411).withMinute(1300588551))
                .withRampDownStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withRampDownActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withRampDownMinutesToWaitOnDisconnect(1297199271)
                .withRampDownActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
                .withRampDownMinutesToWaitOnLogoff(585310107)
                .withOffPeakStartTime(new Time().withHour(1282949861).withMinute(245335843))
                .withOffPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withOffPeakActionOnDisconnect(SessionHandlingOperation.NONE)
                .withOffPeakMinutesToWaitOnDisconnect(57076299)
                .withOffPeakActionOnLogoff(SessionHandlingOperation.HIBERNATE)
                .withOffPeakMinutesToWaitOnLogoff(220721528);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPersonalSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(1584904008, model.rampUpStartTime().hour());
        Assertions.assertEquals(1427716289, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.NONE, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(1238517729, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(918393543, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(1615397265, model.peakStartTime().hour());
        Assertions.assertEquals(1712324120, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(889157097, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.peakActionOnLogoff());
        Assertions.assertEquals(270052165, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1108910411, model.rampDownStartTime().hour());
        Assertions.assertEquals(1300588551, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(1297199271, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(585310107, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(1282949861, model.offPeakStartTime().hour());
        Assertions.assertEquals(245335843, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(57076299, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(220721528, model.offPeakMinutesToWaitOnLogoff());
    }
}
