package com.kohan81GB.lesson1;

public class Wall implements Barriers {

    private int hight;

    Wall(int hight){
        this.hight = hight;
    }

    int getHight(){
        return hight;
    }
}
