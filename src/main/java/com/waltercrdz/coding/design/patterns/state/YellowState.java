package com.waltercrdz.coding.design.patterns.state;

public class YellowState extends LightState {

    protected YellowState(LightState previous) {
        super(previous);
    }

    @Override
    public void execute(TrafficLight trafficLight) {
        trafficLight.yellowOn();
        trafficLight.nextState(this.getNextByPrevious());
    }

    private LightState getNextByPrevious() {
        if (super.previous instanceof GreenState)
            return LightStateFactory.getInstance().create(LightType.RED, this);
        else
            return LightStateFactory.getInstance().create(LightType.GREEN, this);
    }
}
