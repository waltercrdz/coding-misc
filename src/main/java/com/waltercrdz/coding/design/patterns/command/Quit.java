package com.waltercrdz.coding.design.patterns.command;

public class Quit implements Command {

    public void execute() {
        System.out.println("Quit");
    }
}
