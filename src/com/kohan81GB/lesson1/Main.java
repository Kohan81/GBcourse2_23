package com.kohan81GB.lesson1;

public class Main {
    public static void main(String[] args) {

        Member members[] = new Member[3];

        members[0] = new Human();
        members[1] = new Cat();
        members[2] = new Robot();

        Competition competition[] = new Competition[6];

        competition[0] = new Wall(0);
        competition[1] = new Treadmill(100);
        competition[2] = new Wall(1);
        competition[3] = new Treadmill(500);
        competition[4] = new Wall(2);
        competition[5] = new Treadmill(10000);

        for (Member member : members){
            member.toJump(0);
        }
    }
}
