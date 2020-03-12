package com.company;

public class Main {

    public static void main(String[] args) {
        Date date1;
        Date date2;
        date1= new Date(29, 2, 2000);
        date2= date1.getRandomDate();

        date1.print();
        System.out.println(date1.isCorrect());
        System.out.println("----------------");
        date2.print();

        System.out.println("day is "+date1.getDay());

        Person p1 = new Person("Oleg", 10, 10, 1977);
        Person p2 = new Person("Lena", date1);

        System.out.println(Date.isLeapYear(100));
        System.out.println("---------------compare-----------");
        Date date3=new Date (10, 10, 2028);
        Date date4=new Date(11,11,2020);
        System.out.println(Date.compareDate(date3, date4));
    }


    /*
               date1       date2
    [][   ][] [   x100  ][ x100    ][][][][][ 29,2,2000 ][][]
                                                x100



     */



}
