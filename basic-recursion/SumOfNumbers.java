public class SumOfNumbers {
    public static int printNumbers(int n){
        int sum = n;
        if(n == 0){
            return 0 ;
        }
        return sum + printNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printNumbers(10));;
    }
}
