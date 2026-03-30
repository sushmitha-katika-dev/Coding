import java.util.HashSet;
import java.util.Scanner;


/*Problem Statement: Given two strings, write a program to remove characters 
    from the first string which are present in the second string. */

public class RemoveChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        StringBuilder result = new StringBuilder();

        // Traverse str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;

            // Check if ch is in str2
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // If not found, add to result
            if (!found) {
                result.append(ch);
            }
        }

        /* // HashSet to store characters to be removed
        HashSet<Character> removeSet = new HashSet<>();

        // Add all characters of str2 to the set
        for (char ch : str2.toCharArray()) {
            removeSet.add(ch);
        }

        // StringBuilder to store the final result
        StringBuilder result = new StringBuilder();

        // Traverse str1 and append only those not in removeSet
        for (char ch : str1.toCharArray()) {
            // Add character if not in set
            if (!removeSet.contains(ch)) {
                result.append(ch);
            }
        } */

        System.out.println(result);
        scanner.close();
    }
}
