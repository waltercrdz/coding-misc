package com.waltercrdz.coding.design.patterns.proxy;

public class City {

    private final String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
