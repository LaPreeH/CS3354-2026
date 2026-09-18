import java.util.ArrayList;

/**
 * Demonstrates how an ArrayList stores objects and how its
 * number of elements can change while a program is running.
 *
 * <p>The program adds, removes, and displays String objects
 * stored inside an ArrayList.</p>
 *
 * @author LaPree Habbit Jr
 */
public class MyArrayListExample {

    /**
     * Creates and modifies an ArrayList of country names.
     *
     * @param args command-line arguments that are not used
     */
    public static void main(String[] args) {

        /*
         * String is used as the generic type, which means this
         * ArrayList is intended to contain only String objects.
         *
         * The value 20 is the starting capacity, not a fixed size.
         * Unlike an array, the ArrayList can grow if more elements
         * are added.
         */
        ArrayList<String> countries = new ArrayList<String>(20);

        countries.add("Belgium");
        countries.add("Italy");
        countries.add("Thailand");

        /*
         * The enhanced for loop retrieves each String object
         * stored in the ArrayList without requiring an index.
         */
        for (String country : countries) {
            System.out.println(country);
        }

        // My modification: add another country to the collection.
        countries.add("Japan");

        System.out.println("\nAfter adding Japan:");

        for (String country : countries) {
            System.out.println(country);
        }

        /*
         * ArrayLists can remove elements and automatically adjust
         * their logical size. A normal array keeps its original length.
         */
        countries.remove("Italy");

        System.out.println("\nAfter removing Italy:");

        for (String country : countries) {
            System.out.println(country);
        }

        // size() reports how many objects are currently stored.
        System.out.println("\nNumber of countries: " + countries.size());
    }
}
