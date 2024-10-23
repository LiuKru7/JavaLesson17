package homework.vehicle;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String brand, int year) {
        super(brand, year);
    }
    public void revEngine() {
        System.out.println(super.getBrand() + " is revving the engine.");
    }

}
