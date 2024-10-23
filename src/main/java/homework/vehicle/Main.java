package homework.vehicle;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 1999, 4);

        audi.start();
        audi.hank();
        System.out.println(audi.getBrand() + " have "+ audi.getDoors()+ " doors.");
        audi.stop();

        Motorcycle kawasaki = new Motorcycle("Kawasaki", 2019);
        kawasaki.start();
        kawasaki.revEngine();
        System.out.println(kawasaki.isHasSideCar() ? "Has side car" : "No side car");
        kawasaki.setHasSideCar(true);
        System.out.println(kawasaki.isHasSideCar() ? "Has side car" : "No side car");
        kawasaki.stop();
    }
}
