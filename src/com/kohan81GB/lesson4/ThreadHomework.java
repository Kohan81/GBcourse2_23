package com.kohan81GB.lesson4;

import java.util.Arrays;

public class ThreadHomework {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }
    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
// Создаем два массива для левой и правой части исходного
        float[] leftHalf = new float[size/2];
        float[] rightHalf = new float[size/2];

// Копируем в них значения из большого массива
        System.arraycopy(arr, 0, leftHalf, 0, leftHalf.length);
        System.arraycopy(arr, size/2 + 1, rightHalf, 0, rightHalf.length-1);

// Запускает два потока и параллельно просчитываем каждый малый массив
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }

        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < size/2 - 1; i++) {
                rightHalf[i] = (float)(arr[i + size/2] *
                        Math.sin(0.2f + i / 5) *
                        Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }

        }).start();
// ...
// Склеиваем малые массивы обратно в один большой
        float[] mergedArray = new float[size];
        System.arraycopy(leftHalf, 0, mergedArray, 0, leftHalf.length);
        System.arraycopy(rightHalf, 0, mergedArray, leftHalf.length +1, rightHalf.length-1);
// ...
        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }
}
