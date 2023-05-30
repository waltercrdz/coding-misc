package com.waltercrdz.coding.design.patterns.decorator;

import java.util.Objects;

public class ConcreteResource implements Resource {

    private String name;

    public ConcreteResource(String name) {
        this.name = Objects.requireNonNull(name, "Name attribute is mandatory");
    }

    @Override
    public void execute(User user) {
        System.out.println("Resource " + this.name + " obtained by user " + user.getEmail());
    }
}
