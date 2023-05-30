package com.waltercrdz.coding.design.patterns.command;

public class ChangeDirectory implements Command {

    public void execute() {
        System.out.println("Change directory");
    }
}
