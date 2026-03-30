import java.util.Arrays;

public class GetMaxOccurringChar {
    public static void main(String[] args) {
        String s = "hellogithu0b";

        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int maxFreq = 0;
        int currFreq = 1;
        char maxChar = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                currFreq++;
            }else{
                if (currFreq > maxFreq) {
                    maxFreq = currFreq;
                    maxChar = arr[i-1];
                }
                currFreq = 1;
            }
        }
        if(currFreq > maxFreq) {
            maxFreq = currFreq;
            maxChar = arr[arr.length-1];
        }
        System.out.println(maxChar);
    }

}
