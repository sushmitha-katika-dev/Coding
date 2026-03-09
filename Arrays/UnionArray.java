import java.util.HashSet;

public class UnionArray {
    static HashSet<Integer> union(int nums1[],int nums2[]){
       
        HashSet<Integer> hm = new HashSet<>();
        for(int nums : nums1){
            hm.add(nums);
        }
        for (int nums : nums2) {
            hm.add(nums);
            
        }
        return hm;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,2,4};
        int arr2[] = {1,6};
        int m = arr1.length;
        int n = arr2.length;
       System.out.println( union(arr1,arr2));;
    }    
}
