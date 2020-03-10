package com.app;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number1 = getFirstNumber();
        int number2 = getSecondNumber();
        char operator = getOperator();

        Calculator calculator1 = new Calculator(number1, number2, operator);
        calculator1.calculate();


    }

    public static int getFirstNumber(){
        System.out.println("Please, enter first number ");
        return scanner.nextInt();
    }

    public static char getOperator(){
        System.out.println("Please, enter desired operation: (+, -, *, /).");
        return scanner.next().charAt(0);
    }

    public static int getSecondNumber(){
        System.out.println("Please, enter second number ");
        return scanner.nextInt();
    }

}
