public class array3 {
    public static void main(String ...a){
        int arr[] = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,13,14 };
        int evenCount=0, oddCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total Even Number : " + evenCount + "\nTotal Odd Number : "+oddCount);
    }
}
