package example_2;

public class Doctor extends Person {

    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+  " I`m working like doctor");
    }

    public void doSurgery() {
        System.out.println("I`m doing surgery.");
    }
}
