import java.util.HashSet;

class Program1 {

    public static boolean fun(String subStr) {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < subStr.length(); i++) {
            hs.add(subStr.charAt(i));
        }

        return hs.size() == subStr.length();
    }

    public static void main(String[] args) {

        String str = "xyxabxc";
        int count = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (fun(str.substring(i, i + 3))) {
                count++;
            }
        }

        System.out.println(count);
    }
}