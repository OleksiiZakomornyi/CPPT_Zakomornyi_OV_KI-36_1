package KI36.Zakomornyi.lab4;

import java.io.FileNotFoundException;
/**
 * Class lab4
 * @version 1.0
 */
public class lab4 {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, InterruptedException
    {
        Sportsman person = new Sportsman("Gilberto", 90, 1.85, "lab4.txt");

        person.calculateBodyMassIndex();

        person.calculate(10,3);

        person.say("Hi!");

        person.run(5);

        person.dispose();
    }
}
