public class ReverseNumber {
    public int reverseNumber(int n) {
        int reversedN = 0;
        while (n != 0) {
            int rem = n % 10;
            if(reversedN > Integer.MAX_VALUE/10 || reversedN == Integer.MAX_VALUE/10 && rem > 7){
                return 0;
            }
            if(reversedN < Integer.MIN_VALUE/10 || reversedN == Integer.MIN_VALUE/10 && rem < -8){
                return 0;

            }
            reversedN = reversedN * 10 + rem;
            n = n / 10;

        }
        return reversedN;
    }
    public static void main(String args[]){
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverseNumber(-2431));
    }
}
