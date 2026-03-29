import java.util.Scanner;

public class MaxLenWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String words[] = str.split(" ");
        
        String longest = "";

        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println(longest);
        scanner.close();
    }

}
