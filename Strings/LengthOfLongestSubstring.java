import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        int l = 0;
        int ans = 0;
        for(int r = 0; r < s.length();r++){
            char key = s.charAt(r);
            if(!hs.contains(key)){
                hs.add(key);
                count++;
            }else{
                while(hs.contains(key)) {
                    count = 0;
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(key);
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
