import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] nums1,int m,int[] nums2,int n){

        /* 
        // Approach 1: Copy nums2 into nums1, then sort
        // Time: O((m+n) log(m+n)), Space: O(1)
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
         */
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        while (i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while ((j >= 0)) {
            nums1[k--] = nums2[j];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int m = 3, n = 3;
        int arr2[] = {2,5,6};
        mergeSort(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }
}