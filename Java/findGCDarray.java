class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums[nums.length - 1]; i >= 1; i--) {
            if (nums[0] % i == 0 && nums[nums.length - 1] % i == 0) {
                return i;
            }
        }
        return -1;
    }
}