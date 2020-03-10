package com.app;

import java.util.Random;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        Random rnd = new Random(System.currentTimeMillis());

        fillArray(arr);
        printArray(arr);
        System.out.println();
        System.out.println(findMaxNum(arr));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * 20);
        }
    }
    /*public static void fillArray(int [] array){
        for(int i=0; i<array.length; i++){
            array[i] = getRandomInt(0,20);
        }
    }
    public static int getRandomInt(int min, int max){
        return min+rnd.nextInt(max-min+1);
     }
     */

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static int findMaxNum(int[] array) {
        int maxNumber = array[0];
        for (int value : array) {
            maxNumber = max(maxNumber, value);
        }
        return maxNumber;
    }
}