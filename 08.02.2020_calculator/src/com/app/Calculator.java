package com.app;

public class Calculator {

    private int number1;
    private int number2;
    private char operator;

    public Calculator(int number1, int number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public void print(){
        System.out.println("Result is " + calculate(number1, number2, operator));
    }


    private void calculate(int number1, int number2, char operator){
        switch (operator){
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                if(number2==0){
                    System.out.println("Error! Cannot divide by zero!");
                    break;
                } else {
                    System.out.println(number1 / number2);
                    break;
                }
            default:
                System.out.println("Error!");
        }
    }


}
