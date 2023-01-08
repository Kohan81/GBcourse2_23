package com.kohan81GB.lesson1;

public class Human implements Member {

    private String name;

    Human(){
        name = "Human";
    }

    private int canToRun = 42000;

    private int canToJump = 2;

    boolean admittance = true;

    @Override
    public void toRun(int distance) {
        System.out.println("I'm a human, and I started to run");
        if(distance > canToRun){
            System.out.println("I can't run so long");
            admittance = false;
        } else {
            System.out.println("I am a " + name + " and I did it!!! I have run " + distance );
        }
    }

    @Override
    public void toJump(int hight) {
        System.out.println("I'm a human, and I started to jump");
        if(hight > canToJump){
            System.out.println("I can't jump so hight");
            admittance = false;
        } else {
            System.out.println("I am a " + name + " and I did it!!! I have jump " + hight );
        }
    }

    @Override
    public boolean admittance() {
        return admittance;
    }
}
