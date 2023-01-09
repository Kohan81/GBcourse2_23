package com.kohan81GB.lesson3;

import java.util.ArrayList;

public class UsePB {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        ArrayList<Person> person = new ArrayList<>();

        phoneBook.add("Ivanov", 123);
        phoneBook.add("Sidorov", 245);
        phoneBook.add("Petrenko", 546);
        phoneBook.add("Ivanov", 247);
        phoneBook.add("Sydorenko", 954);
        phoneBook.add("Petrov", 589);
        phoneBook.add("Ivanov", 435);

        phoneBook.get("Sidorov");
        phoneBook.get("Ivanov");
    }
}
