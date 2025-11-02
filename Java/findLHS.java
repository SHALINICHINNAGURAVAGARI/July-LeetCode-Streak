class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0;
        int maxLen = 0;
        while (j < nums.length) {
            while (nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen;
    }
}