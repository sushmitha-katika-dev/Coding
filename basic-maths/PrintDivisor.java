import java.util.Arrays;

public class PrintDivisor {
    public static int[] printDivisor(int n) {
        int count = 0;
        for(int i = 1;i <= n;i++){
            if(n % i == 0){
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index++] = i;
            }
        }
       return arr;
    }
        public static void main(String[] args) {
        System.out.println(Arrays.toString(printDivisor(32)));
    }
}
