package KI36.Zakomornyi.lab3;

import java.io.FileNotFoundException;
/**
 * Class lab3
 * @version 1.0
 */
public class lab3 {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Person person = new Person("Van", 90, 1.85, "lab3.txt");

      /*  person.calculateBodyMassIndex();

        person.calculate(10,3);

        person.say("Hi!");

        Person person1 = new Person("Billy", 85, 2.00, "lab3.txt");

        person.tell(person1, "Hello!");

        person.getAge();

        person.getWeight();

        person.getHeight();

        person.dispose(); */
        Person person1 = new Person("Van", 80, 1.85, "lab3.txt");
        Person person2 = new Person("Van", 70, 1.85, "lab3.txt");
        Person person3 = new Person("Van", 60, 1.85, "lab3.txt");
        Person person4 = new Person("Van", 75, 1.85, "lab3.txt");
        
        System.out.println(person2);
        System.out.println(person3);
    }
}
