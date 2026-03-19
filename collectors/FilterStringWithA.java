import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringWithA {
    public static void main(String args[]){
        List <String> names = Arrays.asList("sushmitha","anuja","ananya","darsh","avi");
       
        List <String> filterStr = names.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());
        System.out.println(filterStr);
    }
}
