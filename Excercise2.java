import java.util.Scanner;

class Excercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in degrees Fahrenheit (°F): ");
        int TEMP = scanner.nextInt();
        
        if(TEMP <= 32){
            System.out.print("This temperature is Freezing.");
        }
        else if(TEMP <= 50){
            System.out.print("This temperature is cold.");
        }
        else if(TEMP <= 85){
            System.out.print("This temperature is warm.");
        }
        else
            System.out.print("This temperature is hot.");
        
        scanner.close();
    }
}