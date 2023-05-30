package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

public class Dollar20Dispenser extends Dispenser {

    protected Dollar20Dispenser(Dispenser next) {
        super(next);
    }

    @Override
    void handle(int amount) {
        final int count = amount / 20;
        if(count != 0) {
            System.out.println(String.format("> 20USD bills: %s", count));
            amount = amount - (count * 20);
        }
        this.handleNext(amount);
    }
}
