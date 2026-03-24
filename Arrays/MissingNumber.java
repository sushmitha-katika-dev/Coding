public class MissingNumber {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int sum = 0;
        int targetSum = n*(n+1)/2;
        for (int num : nums) {
            sum += num;
        }
        return targetSum - sum;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,0};
        System.out.println(missingNumber(nums));
    }
}
