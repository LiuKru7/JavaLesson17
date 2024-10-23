package homework.vehicle;

import lombok.Data;
import lombok.Getter;

@Getter
public class Car extends Vehicle{
    private final int doors ;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    public void hank() {
        System.out.println(super.getBrand() + " is honking." );
    }
}

