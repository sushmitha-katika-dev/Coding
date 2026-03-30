import java.util.HashMap;
import java.util.Scanner;

/* Problem Statement: Write a program to find a word in a given string
 that has the highest number of repeated letters. If not found, return -1.
 */

public class HighestRepeatedLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String words[] = str.trim().split(" ");

        int maxFreq = 0;
        String result = "";
        for(String word : words){
            int curWordMaxFreq = getMaxFreq(word);
            if(curWordMaxFreq > maxFreq){
                maxFreq = curWordMaxFreq;
                result = word;
            }

        }
        if(maxFreq > 1){            
        System.out.println(result);
        }else{
            System.out.println("-1");
        }
        scanner.close();
    }
    public static int getMaxFreq(String word){
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxFreqInword = 0;

        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                char lowerC = Character.toLowerCase(c);
                hm.put(lowerC,hm.getOrDefault(lowerC,0)+1);

                if(hm.get(lowerC) > maxFreqInword){
                    maxFreqInword = hm.get(lowerC);
                }
            }
        }
        return maxFreqInword;
        
    }

}
