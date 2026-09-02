import java.util.Scanner;

/**
 * A program that calculates the area of different shapes.
 * The user can choose to calculate the area of a square,
 * circle, or triangle. The program continues running until
 * the user chooses to exit.
 *
 * @author LaPree Habbit Jr.
 * @version 1.0
 * @since 09-02-2026
 */

public class AreaProgram {

	/**
     * The main method displays a menu and allows the user to
     * calculate the area of different shapes based on their selection.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
		Scanner shape = new Scanner(System.in);
		int choice;

		do {
			System.out.println("=== AREA CALCULATOR ===");
			System.out.println("What shape would you like to find the area of?");
			System.out.println("1. Square");
			System.out.println("2. Circle");
			System.out.println("3. Triangle");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1-4): ");
			choice = shape.nextInt();
			
			if(choice == 1){
				System.out.print("Enter the side length of the square: ");
				double side = shape.nextDouble();
				double area = side * side;
				System.out.println("The area of the square is: " + area);
			}
			if(choice == 2){
				System.out.print("Enter the radius of the circle: ");
				double radius = shape.nextDouble();
				double area = Math.PI * radius * radius;
				System.out.println("The area of the circle is: " + area);
			}
			if(choice == 3){
				System.out.print("Enter the base of the triangle: ");
				double base = shape.nextDouble();
				System.out.print("Enter the height of the triangle: ");
				double height = shape.nextDouble();
				double area = 0.5 * base * height;
				System.out.println("The area of the triangle is: " + area);
			}
			if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		} while (choice != 4);

		if(choice == 4){
			System.out.println("Thank you for using the Area Calculator!");
		}
		shape.close();
	}
}
