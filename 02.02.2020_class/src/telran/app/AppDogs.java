package telran.app;

import telran.data.Dogs;

public class AppDogs {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Bobik", 2, "husky", 25.5);
        Dogs dog2 = new Dogs("Sharik", 3, "pudel", 8);
        Dogs dog3 = new Dogs("Puzik", 45, "pidor", 95);
        dog2.dogSleep();
        dog1.dogRun();

        dog1.display();
        System.out.println();
        dog2.display();
        System.out.println(dog1.getNickName());

        dog1.setNickName("Bubledos");
        System.out.println(dog1.getNickName());
        System.out.println();
        dog3.display();
        System.out.println();
        System.out.println (dog1.toString());
        System.out.println();
    }
}
