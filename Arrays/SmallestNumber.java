//import java.util.Arrays;

public class SmallestNumber {

    public static int smallestNumber(int arr[]){
        /*Arrays.sort(arr);
        return arr[0];*/

        int min = arr[0];

        for(int i = 0;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int arr[] = {9,4,26,4,7,9};
        System.out.println(smallestNumber(arr));
    }

}
