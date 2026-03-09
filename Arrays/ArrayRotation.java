public class ArrayRotation {
    static void reverseArray(int arr[],int i,int j){

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }

    }

    static void leftRotation(int arr[], int n,int k){
        k = k % n;
        if(k == 0) return;

        reverseArray(arr, 0, k-1);

        reverseArray(arr, k, n-1);

        reverseArray(arr, 0, n-1);

        
    }
    static void rightRotation(int arr[], int n,int k){
        k = k % n;
        if(k == 0) return;

        /*reverseArray(arr, 0, n-1);

        reverseArray(arr, 0, k-1);

        reverseArray(arr, k, n-1);*/
        leftRotation(arr, n, n-k);


        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        leftRotation(arr,n,k);
        for(int nums : arr){
            System.out.print(nums+" ");
        }
        System.out.println();
        int[] arr1 = {1, 2, 3, 4, 5};
        int n1 = arr.length;
        rightRotation(arr1,n1,k);
        for(int nums : arr1){
            System.out.print(nums+" ");
        }
    }
}
