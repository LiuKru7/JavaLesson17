package example_2;

public class Developer extends Person {

    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "Writing code everyday.");
    }
}
