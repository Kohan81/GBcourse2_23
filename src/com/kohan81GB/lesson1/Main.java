package com.kohan81GB.lesson1;

public class Main {
    public static void main(String[] args) {

        Member members[] = new Member[3];

        members[0] = new Human();
        members[1] = new Cat();
        members[2] = new Robot();

        Barriers barriers[] = new Barriers[6];

        barriers[0] = new Wall(0);
        barriers[1] = new Treadmill(100);
        barriers[2] = new Wall(1);
        barriers[3] = new Treadmill(500);
        barriers[4] = new Wall(2);
        barriers[5] = new Treadmill(10000);

        Compitition compitition = new Compitition();

        for (Barriers barrier : barriers){
            compitition.compitition(barrier, members);
        }


    }
}
