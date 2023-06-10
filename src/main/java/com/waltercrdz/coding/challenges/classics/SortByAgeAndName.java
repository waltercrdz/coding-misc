package com.waltercrdz.coding.challenges.classics;

import java.util.*;

public class SortByAgeAndName {

    private static final List<Person> people;

    static {
        people = new ArrayList<>(
                Arrays.asList(
                        new Person(190, 80),
                        new Person(194, 85),
                        new Person(188, 77),
                        new Person(170, 78),
                        new Person(168, 70),
                        new Person(155, 55),
                        new Person(174, 69)
                ));
    }

    public static void main(String[] args) {
        final Stack stack = new Stack();
        Collections.sort(stack, (Comparator<Person>) (p1, p2) -> {
        });
        people.stream().forEach(person -> {

        });
    }
}
