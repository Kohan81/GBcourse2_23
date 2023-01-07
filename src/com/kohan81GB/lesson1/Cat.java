package com.kohan81GB.lesson1;

public class Cat implements Member {

    private String name;

    Cat(){
        name = "Cat";
    }

    private int canToRun = 2500;

    private int canToJump = 1;

    @Override
    public void toRun(int distance) {
        System.out.println("I'm a cat, and I started to run");
        if(distance > canToRun){
            System.out.println("I can't run so long");
        } else {
            System.out.println("I am a " + name + "did it!!! I have run " + distance );
        }
    }

    @Override
    public void toJump(int hight) {
        System.out.println("I'm a cat, and I started to jump");
        if(hight > canToJump){
            System.out.println("I can't jump so hight");
        } else {
            System.out.println("I am a " + name + "did it!!! I have jump " + hight );
        }
    }
}
