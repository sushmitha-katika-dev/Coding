public class CapitalizeFirstLastWord {

    public static String capitalizeFirstLastWord(String s){
        String words[] = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            int len = word.length();
ṇ
            if(len == 1){
                 result.append(Character.toUpperCase(word.charAt(0)));
            }else{
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(len-1));

                result.append(first);
                /* for(int i = 1; i < len-1; i++ ){
                    result.append(word.charAt(i));
                } */
               result.append(word.substring(1,len-1));
                result.append(last);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        String s = "hello world java";
        System.out.println(capitalizeFirstLastWord(s));
    }
}
