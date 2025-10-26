class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int left = 0;
        int right = sorted.length - 1;

        int num1 = 0, num2 = 0;
        while (left < right) {
            int sum = sorted[left] + sorted[right];
            if (sum == target) {
                num1 = sorted[left];
                num2 = sorted[right];
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        int[] result = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1 || nums[i] == num2) {
                result[count++] = i;
                if (count == 2)
                    break;
            }
        }
        return result;
    }
}
