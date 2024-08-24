import java.util.Scanner;

public class ans4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("enter a number:");
        int a = myObj.nextInt();

        if (a%2==0) {
            System.out.println("the number is even");
        }
        else System.out.println("number is odd");

        }


    }
