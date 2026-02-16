public class LongestSubArray {
    public static int longestSubarray(int[] nums, int k) {
        int len = 0;
       for(int i = 0;i < nums.length; i++){
        int sum = 0;
        for(int j = i; j < nums.length;j++){
            sum += nums[j];

            if(sum == k){
                len = Math.max(len, j-i+1);
            }
        }
        
       }
       return len;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k  = 15;
        System.out.println(longestSubarray(arr,k));
    }
}
