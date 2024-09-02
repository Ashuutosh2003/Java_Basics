import java.util.Scanner;

public class array4 {
    public static void main(String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int negativeCount=0;
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                negativeCount++;
            }
        }
        System.out.println("Total Negative Number : " + negativeCount );
    }
}
