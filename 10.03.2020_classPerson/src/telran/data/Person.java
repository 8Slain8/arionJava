package telran.data;

public class Person {
    private String name;
    Address address;

    public Person() {
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person " +
                 name + '\n' +
                 address +
                '.';
    }
    public static void displayArrayPerson(Person[] persons){
        for (Person p:persons
             ) {
            System.out.println(p.toString());
        }
    }
    public static void findByName(Person[] persons, String name){
        int flag = 0;
        for (int i = 0; i < persons.length ; i++) {
            if(persons[i].getName().equalsIgnoreCase(name)){
                System.out.println(name + " Lives in " + persons[i].getAddress().getCity());
                flag =1;
            }
        }if(flag==0){
            System.out.println("not found");
        }
    }
    public static void listCityMembers(Person[] persons, String city){
        int flag=0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAddress().getCity().equalsIgnoreCase(city)){
                System.out.println(persons[i]);
                flag=1;
            }
        }if(flag==0){
            System.out.println("city not found");
        }
    }
}
