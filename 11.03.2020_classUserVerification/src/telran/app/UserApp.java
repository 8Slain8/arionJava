package telran.app;

import java.util.Scanner;

import org.jetbrains.annotations.NotNull;
import telran.data.User;

public class UserApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        User user1 = new User("Gena",3457);
        User user2 = new User("Liza",1234);
        User user3 = new User("Pidor",2222);
        User user4 = new User("Kevin",3333);

        User[] users = {user1,user2,user3,user4};
        String nameUser = getNameFromUser();
        userCollaboration(users, nameUser);

        scanner.close();
    }
    public static String getNameFromUser(){
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        return userName;
    }
    public static int operationChoice(){
        System.out.println("If you want your secret code, press 1");
        System.out.println("If you want to change your name, enter 2");
        int operation = scanner.nextInt();
        return operation;
    }
    public static void updateUsername(User user){
        checkSecretCode(user);
        if(checkSecretCode(user)!=0) {
            System.out.println("enter new name");
            String newName = scanner.next();
            user.setName(newName);
            System.out.println("your new name is " + user.getName() + " now, pidor");
        }
    }
    public static void commitUserOperationChoice(int operation, User user){
        switch (operation){
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUsername(user);
                break;
            default:
                System.out.println("bad code, bad code, bad code, bad code, bad code");
        }
    }
    public static void userCollaboration(User[] users, String name){
        if(User.getUserByName(users, name)==null){
            System.out.println("sorry we don't know u");
        }else{
            System.out.println("Hello dear bitch "+name);
            int operation = operationChoice();
            commitUserOperationChoice(operation, User.getUserByName(users, name));
        }
    }
    public static int checkSecretCode(User user){
        System.out.println("Enter your secret code");
        int flag = 0;
        int sCode = scanner.nextInt();
        if(sCode!=(user.getSecretCode())){
            System.out.println("your secret code is wrong");
        }else{flag = 1;
        }
        return flag;
    }

}
