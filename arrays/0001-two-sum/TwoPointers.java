import java.util.Arrays;

public class TwoPointers {

    public int[] twoSum(int[] nums, int target) {
        Integer[] indices = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices,
                (a, b) -> Integer.compare(nums[a], nums[b]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[indices[left]] + nums[indices[right]];

            if (sum == target) {
                return new int[]{indices[left], indices[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        SortingTwoPointers solution = new SortingTwoPointers();

        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(result[0] + ", " + result[1]);
    }
}