import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            if(!hs.contains(num)){
                hs.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicates(nums));//true
        int nums2[] = {1,2,3,4};
        System.out.println(containsDuplicates(nums2));//false
    }
    
}
