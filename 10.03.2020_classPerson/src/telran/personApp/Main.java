package telran.personApp;

import telran.data.Address;
import telran.data.Person;

import static telran.data.Person.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Gena", new Address());
        p1.setAddress(new Address("Riga", "pomoika #2", 100 ));
        Person p2 = new Person("Arion", new Address("Berlin", "Friedrichstrasse", 30));
        Address address1 = new Address("Palma de Mallorca", "Barcelona str", 25);
        Person p3 = new Person("Sergey", address1 );
        Person p4 = new Person("Alina", new Address("Paris", "Saint Denis", 7));
        Person p5 = new Person("Lubov", new Address("London", "Baker str", 221));

        Person[] persons = new Person[]{p1,p2,p3,p4,p5};
        System.out.println(p1.toString());
        p1.getAddress().setCity("Sigulda");
        Person.displayArrayPerson(persons);
        System.out.println(p1.getAddress().getCity());
        System.out.println(p1.getName() + " lives on the "+p1.getAddress().getStreet());

        findByName(persons, "gena");
        listCityMembers(persons, "Berlin");
        Person[] cityMember = Person.listCityMember(persons, "Berlin", 5);
        Person.displayPersons(cityMember);
    }
}
