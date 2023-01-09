package com.kohan81GB.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

//    ArrayList<Person> people = new ArrayList<>();

    HashMap<String, ArrayList> phoneBook = new HashMap<>();

    void add(String family, int number){

        Person person = new Person(family, number);
        ArrayList<Person> list = phoneBook.get(family);
        if (list == null){
            list = new ArrayList<Person>();
            list.add(person);
        } else {
            list.add(person);
        }
       phoneBook.put(family, list);

    }

    void get(String family){
        ArrayList<Person> person = phoneBook.get(family);
        for (Person people : person){
            System.out.println(people);
        }
    }


}
