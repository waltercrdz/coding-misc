package com.waltercrdz.coding.design.patterns.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person.Builder("Juan", "Perez", "11.222.333")
                .country("ARG")
                .birth(LocalDate.of(1987, 8, 10))
                .build();
        System.out.println(person);
    }
}
