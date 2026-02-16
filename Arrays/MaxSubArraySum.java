public class MaxSubArraySum {
    static int[] maxSubArraySum(int nums[]){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int ansStart = 0, ansEnd = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
                start = i+1;
            }
        }

        return new int[] {ansStart,ansEnd}; 
    

    }
    public static void main(String[] args) {
        int arr[] ={2, 3, 5, -2, 7, -4};
        int result[] = maxSubArraySum(arr);
        System.out.println(result[0]+","+result[1]);
    }
}
