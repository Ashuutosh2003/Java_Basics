import java.util.Scanner;

public class HR_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("================================");

        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf( str, num);
        }

        System.out.println("================================");

        scanner.close();
    }

}
