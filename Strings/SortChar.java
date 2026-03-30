import java.util.Arrays;
import java.util.Scanner;

public class SortChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char arr[] = str.toCharArray();
        /*
        Arrays.sort(arr);
        String ans = new String(arr);
        System.out.println(ans); */

        // bubble sort
        for(int i = 0; i < str.length(); i++){
            for(int j = 1; j < str.length(); j++){
                if(arr[j] < arr[j-1]){
                    char temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        scanner.close();
    }

}
