public class ReverseArray {
    public static void reverse(int[] arr,int index) {

        if(index >= arr.length/2){
            return;
        }
        int temp = arr[index];
        arr[index] = arr[arr.length-1-index];
        arr[arr.length-1-index] = temp;
       
        reverse(arr,index+1);
    }
   public static void main(String[] args) {
       int[] arr = new int[]{1, 2, 3, 4, 5};
        reverse(arr,0);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}

