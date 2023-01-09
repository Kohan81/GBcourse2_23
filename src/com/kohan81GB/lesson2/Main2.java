package com.kohan81GB.lesson2;

public class Main2 {
    public static void main(String[] args) {

        String arrey [][] = {{"1", "1", "1", "1"},
                             {"2", "2", "2", "2"},
                             {"3", "3", "3", "3"},
                             {"4", "4", "4", "4"}};

        Arr4on4_StrToInt arr4on4StrToInt = new Arr4on4_StrToInt();

        try{
            arr4on4StrToInt.theMethod(arrey);
        } catch (MyArraySizeException e){
            System.out.println("You make a mistake, your arrey's size must be 4 * 4 ONLY!");
        } catch (MyArrayDataException e){
            System.out.println("Please use only digits when you are entering");
        }
    }
}
