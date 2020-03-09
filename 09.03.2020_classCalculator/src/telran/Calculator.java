package telran;

import java.util.Scanner;

public class Calculator {
        static Scanner scanner = new Scanner(System.in);
        public static double getParameter() {
            double a = scanner.nextDouble();
            return a;
        }
        public static int operationChoice(){
            System.out.println("Enter operation symbol");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            int operation = scanner.nextInt();
            while(operation<1 || operation>4){
                System.out.println("Error. Please enter correct function number");
                operation = scanner.nextInt();
            }
            return operation;
        }
        public static void calculation(double a, double b, int operation){
        double result;
        if(operation==1){
            result = a+b;
        }else if(operation==2){
            result = a-b;
        }else if(operation==3){
            result = a*b;
        }else{
            if(b==0){
                while (b==0) {
                    System.out.println("Error, can't divide by zero, enter new number.");
                    b = scanner.nextDouble();
                    }result = a/b;
                }else{
                    result = a/b;
                }
            System.out.println("Result is: " + result);
            }
        }
}
