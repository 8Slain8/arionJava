package telran;

import java.util.Scanner;
import static telran.Dialog.*;

public class Calculator {

        public static void calculation(double a, double b, int operation){
            Scanner scanner = new Scanner(System.in);
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
        }

            System.out.println("Result is: " + result);
            scanner.close();
        }
}
