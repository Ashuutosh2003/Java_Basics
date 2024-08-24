import java.util.Scanner;

public class ans3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("enter a number:");
        int a = myObj.nextInt();

        if (a%5==0 && a%11==0) {
            System.out.println("yes it is divisible by both 5 and 11");
        }
        else System.out.println("not divisible by both 5 and 11");


    }
}
