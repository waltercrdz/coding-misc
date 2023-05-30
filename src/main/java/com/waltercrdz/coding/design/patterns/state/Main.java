package com.waltercrdz.coding.design.patterns.state;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final TrafficLight trafficLight = new TrafficLight(LightStateFactory.getInstance().create(LightType.GREEN, null));
        for (int i = 0; i < 10; i++) {
            trafficLight.change();
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
