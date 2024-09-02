import java.util.Scanner;

public class array6 {
    public static void main(String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        int tempVar=n;
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            temp[tempVar - 1] = arr[i];
            tempVar = tempVar - 1;
        }
        System.out.println("Array after Reverse is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }
}
