public class Palindrome {
    public static boolean isPalindrome(String s) {
        String cleanedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPalindromeCheck(cleanedS,0,cleanedS.length()-1);
    }
   public static boolean isPalindromeCheck(String s, int index, int length){
        if(index >= length){
            return true;
        }
        if(s.charAt(index) != s.charAt(length)){
            return false;
        }
        return isPalindromeCheck(s,index+1,length-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
