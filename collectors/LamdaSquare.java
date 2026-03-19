import java.util.function.Function;

public class LamdaSquare {
    public static void main(String arg[]){
        Function<Integer,Integer> square = x->x * x;
        int ans = square.apply(4);
        System.out.println(ans);
    }
}
