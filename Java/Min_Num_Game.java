class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i + 1];     // Player B gets smaller
            res[i + 1] = nums[i];     // Player A gets larger
        }
        return res;
    }
}