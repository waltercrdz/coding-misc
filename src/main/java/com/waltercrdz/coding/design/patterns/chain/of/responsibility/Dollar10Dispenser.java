package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

public class Dollar10Dispenser extends Dispenser {

    protected Dollar10Dispenser() {
        super(null);
    }

    @Override
    void
    handle(int amount) {
        final int count = amount / 10;
        if(count != 0) {
            System.out.println(String.format("> 10USD bills: %s", count));
        }
    }
}
