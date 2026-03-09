public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int p1 = 0;
        int p2 = arr.length-1;

        int temp = 0;
        while(p1 < p2){
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
        for(int revArr : arr){

            System.out.print(revArr+" ");
        }
        

    }

}
