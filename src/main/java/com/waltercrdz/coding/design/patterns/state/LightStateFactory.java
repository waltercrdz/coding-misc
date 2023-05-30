package com.waltercrdz.coding.design.patterns.state;

public class LightStateFactory {

    private LightStateFactory() {}

    public static LightStateFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final LightStateFactory INSTANCE = new LightStateFactory();
    }

    public LightState create(LightType type, LightState previous) {
        if (LightType.GREEN.equals(type))
            return new GreenState(previous);
        else if (LightType.YELLOW.equals(type))
            return new YellowState(previous);
        else if (LightType.RED.equals(type))
            return new RedState(previous);
        throw new RuntimeException("Invalid Light Type");
    }
}
