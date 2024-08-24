import java.util.Scanner;

public class HR_Stdin1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            System.out.println(number);
        }

    }
}