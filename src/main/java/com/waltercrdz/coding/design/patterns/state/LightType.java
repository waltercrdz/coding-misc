package com.waltercrdz.coding.design.patterns.state;

public enum LightType {
    GREEN("green"), YELLOW("yellow"), RED("red");

    private String type;

    LightType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
