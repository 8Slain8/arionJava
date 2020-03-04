package com.AppPillow;

import com.Data.Parameters;

public class AppPillow {
    public static void main(String[] args) {
        Parameters pillow1 = new Parameters("Cotton", "Feather", 50, 100);
        Parameters pillow2 = new Parameters("Synthetic", "Foam", 40, 75);
        Parameters pillow3 = new Parameters("Cotton", "Foam", 100, 75);
        System.out.println(pillow1.toString());
        Parameters[] pillows = {pillow1,pillow2,pillow3};
        System.out.println(pillows.length);

        public static void print(){

        }
        public static void printPillowArray(Parameters[];pillows){
            for(int i=0; i<pillows.length; i++ ){
                pillows[i].
            }
        }
    }
}
