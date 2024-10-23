package homework.vehicle;

import lombok.Data;

@Data
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " is starting." );
    }
    public void stop() {
        System.out.println(brand + " is stopping." );
    }
}
