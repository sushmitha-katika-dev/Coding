import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZero(int[] nums){

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for(int i = count; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZero(nums)));
        int nums2[] = {0};
        System.out.println(Arrays.toString(moveZero(nums2)));
    }

}
