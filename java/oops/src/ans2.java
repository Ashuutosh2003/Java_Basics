import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("enter a number:");
        int a = myObj.nextInt();

        if (a > 0) {
            System.out.println("It is a positive number");
        }
        else if (a==0) {
            System.out.println("Neutral");
        }
        else System.out.println("It is a negative number");
    }
}
