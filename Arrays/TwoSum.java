import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
/*
        
        int n = nums.length;
        
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        
*/
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                int j = map.get(compliment);
                int k = i;
                return new int[]{j,k};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}