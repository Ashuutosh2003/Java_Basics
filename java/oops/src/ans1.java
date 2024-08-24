import java.util.Scanner;



public class ans1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("1st number");
        int a = myObj.nextInt();

        System.out.println( "2nd number:");
        int b = myObj.nextInt();

        if (a>b) {
            System.out.println("'a' is maximum");
        }
        else {
            System.out.println("'b' is maximum");
        }
        }

    }

