package com.waltercrdz.coding.design.patterns.state;

public class RedState extends LightState {

    protected RedState(LightState previous) {
        super(previous);
    }

    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.redOn();
        trafficLight.nextState(LightStateFactory.getInstance().create(LightType.YELLOW, this));
    }
}
