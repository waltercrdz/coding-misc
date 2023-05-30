package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

import java.util.Optional;

public abstract class Dispenser {

    private final Optional<Dispenser> next;

    protected Dispenser(Dispenser next) {
        this.next = Optional.ofNullable(next);
    }

    abstract void handle(int amount);

    protected void handleNext(int amount) {
        this.next.get().handle(amount);
    }
}
