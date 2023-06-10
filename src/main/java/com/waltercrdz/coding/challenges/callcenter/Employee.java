package com.waltercrdz.coding.challenges.callcenter;

import java.time.Instant;

public class Employee {

    private String name;
    private boolean free;

    private Employee(String name, boolean free) {
        this.name = name;
        this.free = free;
    }

    public synchronized void attend(Call call) {
        this.setBusy();
        System.out.println(Instant.now() + " - " + this.name + " busy for attending " + call);
        //System.out.println("Call " + call + " attended by " + this.name);
        call.execute();
        this.setFree();
        System.out.println(Instant.now() + " - " + this.name + " is free now " + call);
    }

    public boolean isFree() {
        return this.free;
    }

    private synchronized void setFree() {
        this.free = true;
    }

    private synchronized void setBusy() {
        this.free = false;
    }

    public static Employee newInstance(String name) {
        return new Employee(name, Boolean.TRUE);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", free=" + free +
                '}';
    }
}
