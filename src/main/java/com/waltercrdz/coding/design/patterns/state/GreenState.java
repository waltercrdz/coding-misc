package com.waltercrdz.coding.design.patterns.state;

public class GreenState extends LightState {

    protected GreenState(LightState previous) {
        super(previous);
    }

    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.greenOn();
        trafficLight.nextState(LightStateFactory.getInstance().create(LightType.YELLOW, this));
    }
}
