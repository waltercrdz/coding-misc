package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

public class Dollar50Dispenser extends Dispenser {

    protected Dollar50Dispenser(Dispenser next) {
        super(next);
    }

    @Override
    public void handle(int amount) {
        final int count = amount / 50;
        if(count != 0) {
            System.out.println(String.format("> 50USD bills: %s", count));
            amount = amount - (count * 50);
        }
        this.handleNext(amount);
    }
}
