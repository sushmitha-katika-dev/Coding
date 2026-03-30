import java.util.Scanner;

/* Space	32
'0' - '9'	48 - 57
'A' - 'Z'	65 - 90
'a' - 'z'	97 - 122 */

public class ChangeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 65 && ascii < 91){
                result.append(Character.toLowerCase(ch));
            }else if(ascii >= 97 && ascii < 123){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);
            }
        }
        System.out.println(result);
        scanner.close();
    }

}
