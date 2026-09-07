import java.util.Scanner;

/**
 * AreaProgram is an application that can calculate the area of multiple 2D shapes.
 */
public class AreaProgramFunctions {

    /**
     * Calculates the area of a square.
     * @param side is the length of one side of the square
     * @return the calculated area of the square
     */
    public static int SquareArea(int side) {
        return side * side;
    }

    /**
     * Calculates the area of a triangle.
     * @param base the length of the base of the triangle
     * @param height the height of the triangle
     * @return the calculated area of the triangle
     */
    public static double TriangleArea(int base, int height) {
        return (base * height) / 2.0;
    }

    /**
     * Calculates the area of a circle.
     * @param radius the radius of the circle
     * @return the calculated area of the circle
     */
    public static double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    /**
     * It executes the full area application
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option;
    
        do {
            System.out.println("Please select a shape to calculate the area of:");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please enter the length of the side of the square:");
                    int side = keyboard.nextInt();
                    int area = SquareArea(side);
                    System.out.println("The area of the square is: " + area);
                    break;
                case 2:
                    System.out.println("Please enter the base of the triangle:");
                    int base = keyboard.nextInt();
                    System.out.println("Please enter the height of the triangle:");
                    int height = keyboard.nextInt();
                    double triangleArea = TriangleArea(base, height);
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 3:
                    System.out.println("Please enter the radius of the circle:");
                    double radius = keyboard.nextDouble();
                    double circleArea = CircleArea(radius);
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }
}
