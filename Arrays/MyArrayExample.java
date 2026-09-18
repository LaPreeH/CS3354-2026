/**
* Demonstrates how Java arrays can store primitive values
 * and references to objects.
 *
 * <p>This program also demonstrates a nested class and shows
 * how object-reference arrays initially contain null values.</p>
 *
 * @author LaPree Habbit Jr
 */
public class MyArrayExample {

    /**
     * A simple nested class used to demonstrate arrays
     * that contain references to objects.
     */
    class Weeble {

        /**
         * Creates a new Weeble object.
         */
        public Weeble() {
            // No instance variables are needed for this basic example.
        }
    }

    /**
     * Runs examples involving arrays of objects, integers,
     * and Strings.
     *
     * @param args command-line arguments that are not used
     */
    public static void main(String[] args) {

        MyArrayExample example = new MyArrayExample();

        /*
         * This creates an array that can hold four references to
         * Weeble objects. It does not create four Weeble objects.
         * Each position initially contains null.
         */
        Weeble[] weebles = new Weeble[4];

        for (int i = 0; i < weebles.length; i++) {

            /*
             * Checking for null tells us whether the array position
             * currently refers to an actual Weeble object.
             */
            if (weebles[i] == null) {
                weebles[i] = example.new Weeble();
            }
        }

        /*
         * An int array stores primitive integer values directly.
         * Java automatically initializes each value to 0.
         */
        int[] numbers = new int[20];

        /*
         * A String array stores references because String is a class.
         * Each position starts as null until a String is assigned.
         */
        String[] words = new String[20];

        // My modification: change some values so the arrays can be tested.
        numbers[0] = 25;
        words[0] = "Texas State";

        System.out.println("First integer: " + numbers[0]);
        System.out.println("First String: " + words[0]);

        /*
         * Weeble does not define its own toString() method, so Java uses
         * the version inherited from the Object class. The result normally
         * contains the class name followed by a hash-code-related value.
         */
        System.out.println("First Weeble: " + weebles[0]);

        System.out.println("Number of Weeble references: "
                + weebles.length);
    }
}
