public class SingleNonDuplicate {

    // Your function
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[n - 1];
    }

    public static void main(String[] args) {

        // Sample input
        int[] nums = {1,1,2,3,3,4,4,8,8};

        int result = singleNonDuplicate(nums);

        System.out.println("Single element is: " + result);
    }
}