public class SecondSmallestLargest {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,6,2,74,3};
        int n = arr.length;
        if(n <2)
            System.out.println(0);
        
        
        //second smallest number 
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i = 0;i< n;i++){
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }else if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
        }

        System.out.println("Second Smallest : "+secondSmall);
        //second largest

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i = 0;i< n;i++){
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }else if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        
        System.out.println("Second Largest : "+secondLarge);
    }
}
