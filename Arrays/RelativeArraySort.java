import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RelativeArraySort {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {


        /* HashMap<Integer,Integer> hm = new HashMap<>();
        for(int nums : arr1){
            hm.put(nums,hm.getOrDefault(nums,0)+1);
        }
        int result[] = new int[arr1.length];
        int i = 0;

        for(int key : arr2){
            if(hm.containsKey(key)){
                //print the key of frequency times
                int freq = hm.get(key);
                while(freq > 0){
                result[i] = key;
                freq--;
                i++;
                }
                hm.remove(key);
            }
        }

        List<Integer> remainingElements = new ArrayList<>();
        for(int key : hm.keySet()){
            int freq = hm.get(key);
            while(freq > 0){
                remainingElements.add(key);
                freq--;
            }
        }
        Collections.sort(remainingElements);
        
        for(int num : remainingElements){
            result[i] = num;
            i++;
        }
        
        return result; */


        // Step 1: Frequency array
        int[] freq = new int[1001];

        for(int num : arr1){
            freq[num]++;
        }

        // Step 2: Result array
        int[] result = new int[arr1.length];
        int i = 0;

        // Step 3: Elements in arr2 order
        for(int num : arr2){
            while (freq[num] > 0) {
                result[i++] = num;
                freq[num]--;
            }
        }

        // Step 4: Remaining elements sorted
        for(int j = 0; j <= 1000; j++){
            while (freq[j] > 0) {
                result[i++] = j;   // ✅ FIX HERE
                freq[j]--;
            }
        }

        return result;
    }
}