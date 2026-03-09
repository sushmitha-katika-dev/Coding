public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {3,2,5,3,8,64,2,9,4};

        int max =arr[0];
        
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
