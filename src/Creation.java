
// ИЕРАРХИЯ РАЗМЕРЕНИЙ ОБЪЕКТА


public class Creation {
    public static void main (String args[]) {
        Weight creationParallelepiped = new Weight(10, 15, 4, 1.025);
        Weight creationCube = new Weight(15, 1.025);

        System.out.println("Объём параллелепипеда равен: " + creationParallelepiped.volume());
        System.out.println("Вес параллелепипеда равен: " + creationParallelepiped.weight());
        System.out.println();

        System.out.println("Объём куба равен: " + creationCube.volume());
        System.out.println("Вес куба равен: " + creationCube.weight());
        System.out.println();

        System.out.println("THE END");





    }
}
