package com.kohan81GB.lesson3;

public class Person {

    int phoneNumber;
    String family;

    Person (String family, int phoneNumber){
        this.family = family;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + family + " - " + phoneNumber + '\'' +
                '}';
    }
}
