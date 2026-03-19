import java.util.Arrays;
import java.util.HashSet;

public class SubSetCheck {
    static boolean isSubset(int[] arr1,int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr1){
            hs.add(num);
        }
        for(int num : arr2){
            if(!hs.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 10};

        if(isSubset(arr1,arr2)){
            System.out.println("arr2 is subset of arr1");
        }else{
            System.out.println(Arrays.toString(arr2) + "not subset of arr1");
        }
    }

}


