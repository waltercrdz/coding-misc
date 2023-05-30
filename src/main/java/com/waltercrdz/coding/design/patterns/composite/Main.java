package com.waltercrdz.coding.design.patterns.composite;

public class Main {

    public static void main(String[] args) {
        final Directory root = new Directory("root");
        final Directory dir1 = new Directory("directory1");
        final Directory dir2 = new Directory("directory2");
        System.out.println("Root adding directory1: " + root.addChild(dir1));
        System.out.println("Directory1 adding directory2: " + dir1.addChild(dir2));
        System.out.println("Root adding file1: " + root.addChild(new File("file1")));
        System.out.println("Directory1 adding file2: " + dir1.addChild(new File("file2")));
        System.out.println("Directory1 adding file3: " + dir2.addChild(new File("file3")));
        System.out.println("Directory1 adding file4: " + dir2.addChild(new File("file4")));
        System.out.println("Directory1 adding file5: " + dir2.addChild(new File("file5")));
        System.out.println("Root adding file directory1: " + root.addChild(new File("directory1")));
        System.out.println("Root adding directory1 again: " + root.addChild(new Directory("directory1")));
    }
}
