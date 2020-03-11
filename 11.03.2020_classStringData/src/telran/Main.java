package telran;

public class Main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        Integer c = 500;
        Integer d = 500;

        System.out.println(a==b);
        System.out.println(c.equals(d));

        String str = "Hello!";
        String str1 = "Vasya";
        str1 = str.concat(str1);
        System.out.println(str1);
        str1 = str1.replace("a","y");
        System.out.println(str1);
        System.out.println(str1.codePointAt(1));
        String str3 = "one, two, three, ";
        String[] str4 = str3.split(",");
        System.out.println(str4[0]);



    }
}
