public class Pattern{
    public static void main(String[] args){
        //https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/assignments
        //pattern1(4);
        //pattern2(4);
        //pattern3(4);
        //pattern4(5);
        //pattern5(5);
        pattern6(5);
    }

   static void pattern1(int n){
    for(int row=1;row<=4;row++){
        for(int col=1;col<=4;col++){
            System.out.print("* ");
        }
        System.out.println();
           } 
    
   }

   static void pattern2(int n){
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
   }

   static void pattern3(int n){
    for(int row=1;row<=n;row++){
        for(int col=n;col>=row;col--){
            System.out.print("* ");
        }
        System.out.println();
    }
   }

   static void pattern4(int n){
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print(" "+col);
        }
        System.out.println();
    }
   }

   static void pattern5(int n){
    for(int row=1;row<=2*n-1;row++){
        int totalColsInRow=row>n?2*n-row:row;
        for(int col=1;col<=totalColsInRow;col++){
            System.out.print(" *");
        }
        System.out.println();
    }
    
   }

   static void pattern6(int n){
    for(int row=1;row<=n;row++){
        for(int col=n;col<=row;col--){
            System.out.println(" ");
        }
    }
    System.out.println("*");
   }

   
}