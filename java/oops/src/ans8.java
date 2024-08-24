import java.util.Scanner;

public class ans8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int chocolatePrice = 100;
        int chipsPrice = 40;
        int coldDrinkPrice = 45;

        System.out.println("WELCOME----TO----VENDING-MACHINE");
        System.out.println("A --> Chocolate \nB --> Chips \nC --> Cold-Drink");

        System.out.print("Select item (A/B/C): ");
        char item = myObj.next().charAt(0); // Read the item as a character

        System.out.print("Amount paid by you: ");
        int amountPaid = myObj.nextInt();

        switch (item) {
            case 'A':
                handlePurchase(chocolatePrice, amountPaid, "Chocolate");
                break;
            case 'B':
                handlePurchase(chipsPrice, amountPaid, "Chips");
                break;
            case 'C':
                handlePurchase(coldDrinkPrice, amountPaid, "Cold-Drink");
                break;
            default:
                System.out.println("Invalid item selected. Please choose A, B, or C.");
                break;
        }

        myObj.close(); // Close the scanner object
    }

    private static void handlePurchase(int itemPrice, int amountPaid, String itemName) {
        if (amountPaid == itemPrice) {
            System.out.println("Here is your " + itemName);
        } else if (amountPaid > itemPrice) {
            int change = amountPaid - itemPrice;
            System.out.println("Collect " + change + " as remaining amount.");
            System.out.println("Here is your " + itemName);
        } else {
            int amountDue = itemPrice - amountPaid;
            System.out.println("You need to pay " + amountDue + " more.");
        }
    }
}
