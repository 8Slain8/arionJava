package telran.data;

public class Car {
    private String brand;
    private String color;
    private int productionYear;
    public static int wheel = 4;

    public Car(String brand, String color, int productionYear) {
        this.brand = brand;
        this.color = color;
        this.productionYear = productionYear;
    }

    public void displayCar(){
        System.out.println(brand+", color: "+color+" year of production: "+productionYear);
       // System.out.println(wheel);
    }
    public static void printArrayCar(Car[]cars){
        for(Car car:cars){
            car.displayCar();
        }
    }
    public static void sortCarsByYear(Car[] cars){
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = 0; j < (cars.length-1) -i; j++) {
                if(cars[j].productionYear>cars[j+1].productionYear){
                    Car temp = cars[j];
                    cars[j]=cars[j+1];
                    cars[j+1] = temp;
                }
            }
        }
    }
}
