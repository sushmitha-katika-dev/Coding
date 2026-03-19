import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    private static void mostFreqElement(int[] arr) {
       HashMap<Integer,Integer> hm = new HashMap<>();
/*      for(int i = 0;i < arr.length;i++){
            int key = arr[i];
            if(hm.containsKey(key)){
                int prev = hm.get(key);
                hm.put(key,prev+1);
            }else{
                hm.put(key,1);
            }
        }
*/
        for(int key : arr){
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
       
       int maxCount = 0;
       int mostFreq = 0;
       
        // iterate using KeySet()
/*
        for (int num : hm.keySet()) {
            int value = hm.get(num);
            if(value > maxCount){
                maxCount = value;
                mostFreq = num;
            }
        }
 */
       // iterate using entrySet()
       for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
        int value = entry.getValue();
        int key = entry.getKey();
        if(value > maxCount){
            maxCount = value;
            mostFreq = key;
        }

       }
       System.out.println(mostFreq);
    }
    public static void main(String[] args) {
       // int arr[] = {1, 2, 2, 3, 3, 3}; // output: 3
        int arr1[] = {4, 4, 5, 5, 6}; //Output: 4 ,Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
        mostFreqElement(arr1);
    }

    
}
