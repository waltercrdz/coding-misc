package com.waltercrdz.coding.design.patterns.state;

public abstract class LightState {

    protected final LightState previous;

    protected LightState(LightState previous) {
        this.previous = previous;
    }

    abstract void execute(TrafficLight trafficLight);
}