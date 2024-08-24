import java.util.Scanner;

public class HRloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("input a number:");
        int N = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {

            int result = N * i;

            System.out.println(N + " x " + i + " = " + result);
        }



    }
}
