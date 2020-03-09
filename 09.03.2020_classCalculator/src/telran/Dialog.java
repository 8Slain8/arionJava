package telran;
import java.util.Scanner;
import static telran.Calculator.*;

public class Dialog {
    static Scanner scanner = new Scanner(System.in);
    public static double getParameter() {

        double a = scanner.nextDouble();
        return a;
    }
    public static int operationChoice(){
        Scanner scanner = new Scanner(System.in);
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
}
