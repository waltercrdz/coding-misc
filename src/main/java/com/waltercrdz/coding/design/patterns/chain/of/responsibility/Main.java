package com.waltercrdz.coding.design.patterns.chain.of.responsibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final AtmDispenser atm = new AtmDispenser(new Dollar100Dispenser(new Dollar50Dispenser(new Dollar20Dispenser(new Dollar10Dispenser()))));
        final Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter amount to dispense");
            int input = scanner.nextInt();
            atm.dispense(input);
        }
    }
}
