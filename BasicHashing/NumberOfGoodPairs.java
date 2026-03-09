import java.util.HashMap;
class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> hm =new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int ans = 0;
        for(int bom:hm.keySet()){
            int val=hm.get(bom);
            ans+= ((val-1)*val)/2;
        }
        return ans;
    }
}