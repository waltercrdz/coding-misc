package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

import java.util.Objects;

public class AtmDispenser {

    private final Dispenser dispenser;

    public AtmDispenser(Dispenser dispenser) {
        this.dispenser = Objects.requireNonNull(dispenser);
    }

    public void dispense(int amount) {
        if(amount % 10 != 0)
            throw new RuntimeException("Amount must be multiple of 10");
        this.dispenser.handle(amount);
    }
}
