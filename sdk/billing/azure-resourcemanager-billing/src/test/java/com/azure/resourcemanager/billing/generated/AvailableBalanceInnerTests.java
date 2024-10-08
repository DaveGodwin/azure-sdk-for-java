// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.AvailableBalanceInner;
import com.azure.resourcemanager.billing.models.AvailableBalanceProperties;
import com.azure.resourcemanager.billing.models.AvailableBalancePropertiesAmount;
import com.azure.resourcemanager.billing.models.AvailableBalancePropertiesTotalPaymentsOnAccount;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AvailableBalanceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableBalanceInner model = BinaryData.fromString(
            "{\"properties\":{\"amount\":{\"currency\":\"dnvowg\",\"value\":70.59679},\"paymentsOnAccount\":[{\"amount\":{\"currency\":\"kcglhslaz\",\"value\":50.55987},\"billingProfileId\":\"gdtjixhbkuofqwey\",\"billingProfileDisplayName\":\"menevfyexfwh\",\"invoiceId\":\"cibvyvdcsitynn\",\"invoiceName\":\"mdectehfiqscjey\",\"date\":\"2021-03-08T20:07:33Z\",\"paymentMethodType\":\"TaskOrder\"},{\"amount\":{\"currency\":\"gqhcjrefovg\",\"value\":15.571833},\"billingProfileId\":\"leyyvx\",\"billingProfileDisplayName\":\"jpkcattpng\",\"invoiceId\":\"rcczsqpjhvmd\",\"invoiceName\":\"v\",\"date\":\"2021-09-30T19:57Z\",\"paymentMethodType\":\"CheckWire\"},{\"amount\":{\"currency\":\"e\",\"value\":21.057589},\"billingProfileId\":\"ae\",\"billingProfileDisplayName\":\"fhyhltrpmopjmcma\",\"invoiceId\":\"okth\",\"invoiceName\":\"iuaod\",\"date\":\"2021-03-11T15:37:41Z\",\"paymentMethodType\":\"CreditCard\"}],\"totalPaymentsOnAccount\":{\"currency\":\"odpuozmyzydag\",\"value\":52.79117}},\"tags\":{\"ywqsmbsurexim\":\"ezyiuokktwhrdxw\"},\"id\":\"yocf\",\"name\":\"fksymddystki\",\"type\":\"uxh\"}")
            .toObject(AvailableBalanceInner.class);
        Assertions.assertEquals("ezyiuokktwhrdxw", model.tags().get("ywqsmbsurexim"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableBalanceInner model = new AvailableBalanceInner().withTags(mapOf("ywqsmbsurexim", "ezyiuokktwhrdxw"))
            .withProperties(new AvailableBalanceProperties().withAmount(new AvailableBalancePropertiesAmount())
                .withTotalPaymentsOnAccount(new AvailableBalancePropertiesTotalPaymentsOnAccount()));
        model = BinaryData.fromObject(model).toObject(AvailableBalanceInner.class);
        Assertions.assertEquals("ezyiuokktwhrdxw", model.tags().get("ywqsmbsurexim"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
