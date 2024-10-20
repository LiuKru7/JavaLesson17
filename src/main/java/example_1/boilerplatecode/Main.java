package example_1.boilerplatecode;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 =new Car("Audi", "Germany", 100000,true, "jonas", null, 1 );
        car.setBrand("BMW");
        System.out.println(car2);
    }
}
