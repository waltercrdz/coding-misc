package com.waltercrdz.coding.design.patterns.command;

public class CreateFile implements Command {
    public void execute() {
        System.out.println("Create File");
    }
}
