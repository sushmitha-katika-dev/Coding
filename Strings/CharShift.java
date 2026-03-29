//Given a string, write a program to change every letter in the given string with the 
// letter following it in the alphabet (ie. a becomes b, p becomes q, z becomes a)

import java.util.Scanner;

public class CharShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int length = str.length();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;  // Get ASCII value

            if (ascii == 90)  // If 'Z', wrap to 'A'
                result.append((char) 65);
            else if (ascii == 122)  // If 'z', wrap to 'a'
                result.append((char) 97);
            else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122))
                result.append((char) (ascii + 1));  // Shift to next character
            else
                result.append(ch);  // Leave other characters unchanged
        }

        System.out.println(result);
    }

}
