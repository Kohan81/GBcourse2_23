package com.kohan81GB.lesson1;

public class Treadmill implements Barriers {

    private int distance;

    Treadmill(int distance){
        this.distance = distance;
    }

    int getDistance(){
        return distance;
    }
}
