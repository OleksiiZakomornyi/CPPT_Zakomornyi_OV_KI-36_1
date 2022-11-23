package KI36.Zakomornyi.lab7;
/**
 * Class lab7
 * @version 1.0
 */
public class lab7 {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // Ініціалізація масиву
        Array<? super Shape> mall = new Array();
        // Додаємо фігури
        mall.add(new Sphere(1000, 100,100, "Sphere1"));
        mall.add(new Cube(1000, 10,10, "Cube1" ));
        // Виводимо
        mall.showAll();
        // Виводимо першу
        System.out.println(mall.get(0).getName());
        // Сукупний об'єм
        System.out.println(mall.getTotalVolume());
        // Найбільша фігура
        System.out.println(mall.getLargestFigure().getName());
    }
}
