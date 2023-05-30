package com.waltercrdz.coding.design.patterns.builder;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String id;
    private String country;
    private LocalDate birth;

    private Person(Builder builder) {
        this.birth = builder.birth;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
        this.country = builder.country;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String id;
        private String country;
        private LocalDate birth;

        public Builder(String firstName, String lastName, String id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder birth(LocalDate birth) {
            this.birth = birth;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", birth=" + birth +
                '}';
    }
}
