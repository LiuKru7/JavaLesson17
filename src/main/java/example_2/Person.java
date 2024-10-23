package example_2;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Setter
    @Getter
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe(){
        System.out.println("I am breathing");


    }

    public void work() {
        System.out.println("I`m working like normal person");

    }

}
