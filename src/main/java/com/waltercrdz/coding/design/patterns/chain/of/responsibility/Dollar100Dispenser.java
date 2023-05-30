package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

public class Dollar100Dispenser extends Dispenser {

    public Dollar100Dispenser(Dispenser next) {
        super(next);
    }

    @Override
    public void handle(int amount) {
        final int count = amount / 100;
        if(count != 0) {
            System.out.println(String.format("> 100USD bills: %s", count));
            amount = amount - (count * 100);
        }
        this.handleNext(amount);
    }
}
