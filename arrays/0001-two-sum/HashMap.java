import java.util.HashMap;

public class HashMapApproach {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        HashMapApproach solution = new HashMapApproach();

        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(result[0] + ", " + result[1]);
    }
}