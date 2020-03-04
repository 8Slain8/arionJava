package com.telran.project1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        int a = 10;
        System.out.println(a);
        System.out.println(a + " this is number " + a);
        System.out.println(a + a);

        float f = 3.15f;
        long b = 98765432345678L;

        boolean boo = 2 > 3;
        System.out.println(boo);

        int height = 175;
        if (height > 200) {
            System.out.println("go to Circus");
        } else if (height < 150) {
            System.out.println("go to school");
        } else {
            System.out.println("go to work");
        }
        //powerXY(3,3);
        //fan(3);
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age = scanner.nextInt();
        army(age);
    }
    private static void powerXY(int x, int y){
            int res = 1;
            for (int i = 1; i <= y; i++) {
                res = res * x;
            }
            System.out.println("power of xy is " + res);
        }

        private static void fan(int mode){
            switch (mode) {
                case 0:
                    System.out.println("fa is off");
                    break;
                case 1:
                    System.out.println("fan is min");
                    break;
                case 2:
                    System.out.println("fan is medium");
                    break;
                case 3:
                    System.out.println("fan is high");
                    break;
                default:
                    System.out.println("wrong mode");
            }
        }
        private static void army(int age){
            if(age>=18&&age<=27) {
                System.out.println("welcome to brotherhood");
            }
            if(age<18){
                System.out.println("your time will come");
            }
                else{
                    System.out.println("go work");
                }
            }
}
