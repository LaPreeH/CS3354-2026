import java.util.Scanner;

public class AreaProgram {
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
		} while (choice != 4);

		if(choice == 4){
			System.out.println("Thank you for using the Area Calculator!");
		}
		shape.close();
	}
}
