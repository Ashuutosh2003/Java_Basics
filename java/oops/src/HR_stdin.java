import java.util.Scanner;

public class HR_stdin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int integerValue = scanner.nextInt();


        double doubleValue = scanner.nextDouble();


        scanner.nextLine();


        String stringValue = scanner.nextLine();


        scanner.close();

        // Print the results in the required format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);
    }
}