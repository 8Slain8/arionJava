package com.company;

public class Person {
    private String name;
    private Date birthday;
    private int age;

    Person(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new Date(day,month,year);
    }

    Person(String name, Date date){
        this.name = name;
        this.birthday = date;
    }


    public int getAge() {
        return age;
    }




}
