package com.waltercrdz.coding.design.patterns.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SingletonFactory factory = SingletonFactory.getInstance();
        factory.create("cd").execute();
        factory.create("ls").execute();
        factory.create("mkdir").execute();
        factory.create("..").execute();
    }
}
