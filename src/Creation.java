
// ИЕРАРХИЯ РАЗМЕРЕНИЙ ОБЪЕКТА

public class Creation {
    public static void main (String args[]) {
        Weight creation1 = new Weight(10, 18, 20, 1.025);
        Weight creation2 = new Weight(10, 1.025);

        System.out.println("Объём creation1 равен: " + creation1.volume());
        System.out.println("Вес creation1 равен: " + creation1.weight());
        System.out.println();

        System.out.println("Объём creation2 равен: " + creation2.volume());
        System.out.println("Вес creation2 равен: " + creation2.weight());
        System.out.println();

        System.out.println("THE END");





    }
}
