import java.util.Arrays;

public class ArraySum {
    
    public static void arraySum(int arr[],int n){
       
        /*int sum = 0;
        for(int nums : arr){
            sum += nums;
        }
        System.out.println(sum);*/

        //Using Streams 
        System.out.println(Arrays.stream(arr).sum());
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        arraySum(arr,n);
    }
}
