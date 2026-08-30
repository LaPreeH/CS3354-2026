import java.util.Scanner;

class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tickets would you like to purchase for the event?");
        int QUANTITY_OF_TICKETS = scanner.nextInt();

        int TOTAL = (QUANTITY_OF_TICKETS * 15);
        System.out.println("Ok, you want " + QUANTITY_OF_TICKETS + " tickets. Since each ticket is $15 each, your total will be $" + TOTAL);       

        scanner.close();
    }
}
