package com.waltercrdz.coding.design.patterns.callcenter;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class CallTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_when_smallerDurationThanMin() {
        new Call(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_when_greaterDurationThanMax() {
        new Call(11);
    }

    @Test
    public void should_execute_when_isCorrectedInitialized() {
        final Call call = new Call(1);
        call.execute();
    }

    @Test
    public void should_executeXDurationTime() {
        final Call call = new Call(1);
        Instant start = Instant.now();
        call.execute();
        Instant end = Instant.now();
        Assert.assertTrue(Duration.between(start, end).getSeconds() == 1);
    }


}