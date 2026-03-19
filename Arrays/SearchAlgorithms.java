public class SearchAlgorithms {

    // 🔹 1. Linear Search
    // 👉 Use when array is UNSORTED or small
    // 👉 Works in all cases
    // Time: O(N)
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // 🔹 2. Binary Search (Iterative)
    // 👉 Use when array is SORTED
    // 👉 Best for large data
    // Time: O(log N)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // 🔹 3. Jump Search
    // 👉 Use when array is SORTED
    // 👉 Better than linear, simpler than binary
    // Time: O(√N)
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int)Math.sqrt(n);
        int prev = 0;

        // Finding block
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        // Linear search in block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] unsorted = {30, 10, 50, 20, 40};
        int[] sorted = {10, 20, 30, 40, 50};

        int key = 30;

        // 🔹 Linear Search (works on any array)
        System.out.println("Linear Search: " + linearSearch(unsorted, key));

        // 🔹 Binary Search (only for sorted array)
        System.out.println("Binary Search: " + binarySearch(sorted, key));

        // 🔹 Jump Search (only for sorted array)
        System.out.println("Jump Search: " + jumpSearch(sorted, key));
    }
}