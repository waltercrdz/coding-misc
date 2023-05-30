package com.waltercrdz.coding.design.patterns.state;

public class TrafficLight {

    private LightState state;

    public TrafficLight(LightState state) {
        this.state = state;
    }

    public void change() {
        this.state.execute(this);
    }

    public void nextState(LightState next) {
        this.state = next;
    }

    public void redOn() {
        System.out.println("Swithcing on red light");
    }

    public void redOff() {
        System.out.println("Swithcing off red light");
    }

    public void greenOn() {
        System.out.println("Swithcing on green light");
    }

    public void greenOff() {
        System.out.println("Swithcing off green light");
    }

    public void yellowOn() {
        System.out.println("Swithcing on yellow light");
    }

    public void yellowOff() {
        System.out.println("Swithcing off yellow light");
    }
}
