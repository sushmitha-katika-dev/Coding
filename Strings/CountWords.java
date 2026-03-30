import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count = 1;

        for(char ch : str.toCharArray()){
            if(ch == ' '){
                count++;
            }
        }
        System.out.println("count : "+count);
        scanner.close();
        
    }

}
