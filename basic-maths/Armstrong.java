public class Armstrong {
    public boolean isArmstrong(int n) {
        int originalN = n;
        int count = 0;
        int sum = 0;
       
        int temp  = Math.abs(n);
            while(temp > 0){
            temp = temp/10;
            count++;
            }
            if(count == 0) count = 1;
        
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        return originalN == sum;

    }
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        System.out.println(a.isArmstrong(123));
    }
}
