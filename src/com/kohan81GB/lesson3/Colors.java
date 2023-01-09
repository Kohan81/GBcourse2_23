package com.kohan81GB.lesson3;

import java.util.*;

public class Colors {

    String colors [] = {"white", "black", "blue", "red", "pink",
                        "orange", "green", "grey", "black", "yellow",
                        "green", "white", "blue", "white", "yellow",
                        "red", "orange", "grey", "blue", "red"};

    Set<String> stringSet = new HashSet<>(new ArrayList<>(Arrays.asList(colors)));

    public static void main(String[] args) {

        Colors colors = new Colors();

        Iterator<String> iter = colors.stringSet.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            int counter = 0;
            for (int i = 0; i < colors.colors.length; i++){

                if (str.equals(colors.colors[i])) {
                    counter++;
                    }
            }
            System.out.println(str + " " + counter);
        }
    }
}
