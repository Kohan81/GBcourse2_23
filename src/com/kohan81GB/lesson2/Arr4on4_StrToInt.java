package com.kohan81GB.lesson2;

public class Arr4on4_StrToInt {

    int sum, i, j;

    void arrSizeCheck(String[][] arrey) throws MyArraySizeException {
        if (arrey.length != 4){
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < arrey.length; i++){
                if (arrey[i].length != 4){
                    throw new MyArraySizeException();
                }
            }
        }
    }

    int isArreyCorrect(String[][] arrey){

        try{
            for (i = 0; i < arrey.length; i++){
                for (j = 0; j < arrey[i].length; j++){
                    sum += Integer.parseInt(arrey[i][j]);
                }
            }
        } catch (NumberFormatException e){
            System.err.println("you make the mistake in [" + i + "] [" + j + "]");
            throw new MyArrayDataException();
        }
        return sum;
    }

    void theMethod(String[][] arrey){

        arrSizeCheck(arrey);
        System.out.println("the sum of your arrey equals " + isArreyCorrect(arrey) );
    }


}
