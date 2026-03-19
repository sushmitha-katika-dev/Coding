public class Palindrome {
   public boolean isPalindrome(int n) {
    int reversedN = 0;
    int originalN = n;
    while( n > 0){
        int rem = n % 10;
        reversedN = reversedN * 10 + rem;
        n /=10;
    }
    if(originalN == reversedN){
        return true;
    }else{
        return false;
    }
    }  
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(234382));
    }
}
