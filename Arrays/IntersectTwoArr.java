import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectTwoArr {
    public static int[] intersect(int[] nums1, int[] nums2){
        if(nums2.length > nums1.length){
            return intersect(nums2, nums1);
        }
        // 1. Using HashMap 

        /* HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        //adding intersect array elements to intersectList
        List<Integer> intersectList = new ArrayList<>();
        for(int num : nums2){
            if(hm.getOrDefault(num,0) > 0){
                intersectList.add(num);
                hm.put(num,hm.get(num)-1);
            }
        }
        int result[] = new int[intersectList.size()];
        for(int i = 0; i < result.length;i++){
            result[i] = intersectList.get(i);
        } 
        return result;
        */

        // 2. Using Two pointers

        int i = 0;
        int j = 0;

        List<Integer> intersectList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]){
                intersectList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                    j++;
            }            
        }
        int result[] = new int[intersectList.size()];
        for(int x = 0; x < result.length; x++){
            result[x] = intersectList.get(x);
        }
        return result;

    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    
}
