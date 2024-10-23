package example_2;

import java.util.ArrayList;
import java.util.List;

public class HumanTester {
    public static void main(String[] args) {
        Person person = new Person("Ann", 30);
        person.breathe();

        Doctor julius = new Doctor("Julius", 30);
        julius.breathe();
        System.out.println(person instanceof Object);
        julius.work();
        person.work();
        julius.doSurgery();

        Developer ugnius = new Developer("Ugnius", 16);
        ugnius.breathe();
        ugnius.work();


        List<Person> autobusas4g = new ArrayList<>();
        autobusas4g.add(ugnius);
        autobusas4g.add(julius);
        autobusas4g.add(person);
        System.out.println("***********");

        for (Person person1 : autobusas4g) {
            if (person1 instanceof Doctor){
                person1.work();
            }
        }
        System.out.println("*********");

        autobusas4g.forEach(person1 -> person1.work());




    }
}
