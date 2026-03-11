public class SymmetricPairs {
    public static void findSymmetricPairs(int[][] arr) {
        System.out.println("The Symmetric Pairs are:");

        // Nested loop to check for symmetric pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ") ");
                    break;
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};  // Example input

        findSymmetricPairs(arr);


        
    }

}
