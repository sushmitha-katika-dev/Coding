public class PrintNameNtimes {
    public static String printNamesNtimes(String s,int n){
        if(n == 0){
            return "";
        }
        return s+ (n > 1? "\n":"") +printNamesNtimes(s, n-1);
    }
    public static void main(String[] args) {
        System.out.println(printNamesNtimes("sushmitha",4));
    }


}
