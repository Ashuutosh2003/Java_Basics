import java.util.*;

public class HR_1Darray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        // Read n integers and store them in the array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}