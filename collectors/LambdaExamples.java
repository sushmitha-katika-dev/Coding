import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExamples {
    public static void main(String args[]){
        List<String> ls = Arrays.asList("sushmitha","srujana");
    ls.sort((a,b)->a.compareTo(b));
    System.out.println(ls);
    }
}
