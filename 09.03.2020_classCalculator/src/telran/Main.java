package telran;

import java.util.Scanner;

import static telran.Calculator.*;
import static telran.Dialog.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        double a = getParameter();
        System.out.println("Enter second number");
        double b = getParameter();

        int operation = operationChoice();
        calculation(a,b,operation);
    }
}
