import java.util.*;

class CountFrequencies {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Step 1: Count frequencies using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        // Step 2: Convert HashMap to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());      // number
            pair.add(entry.getValue());    // frequency
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        CountFrequencies sol = new CountFrequencies();
        int[] nums = {1, 2, 1, 3, 2};
        List<List<Integer>> res = sol.countFrequencies(nums);
        System.out.println(res); // [[1, 2], [2, 2], [3, 1]]
    }
}
