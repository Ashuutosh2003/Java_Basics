import java.util.Scanner;

public class array7 {
    public static void main(String args[]){
        System.out.println("Enter the size of the array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int [size];
        int sum = 0;
        System.out.println("Enter the array elements one by one ");
        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of array elements: "+sum);
    }

}
