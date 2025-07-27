class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int triplets = n / 3;
        long sum = 0;
        for (int i = n - 2; triplets > 0; i -= 2) {
            sum += nums[i];
            triplets--;
        }
        return sum;
    }
}