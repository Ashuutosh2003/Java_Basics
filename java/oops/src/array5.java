import java.util.Scanner;

public class array5 {
    public static void main(String ...a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        Double arr[] = new Double[n];
        int negativeCount=0;
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println("Negative numbers are : ");
        for(int i=0; i<arr.length; i++){
            if(Math.signum(arr[i]) == -1.0){
                System.out.println(Math.round(arr[i]));
            }
        }
    }

}
