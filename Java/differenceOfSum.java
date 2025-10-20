class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (nums[i] != 0) {
                int r = nums[i] % 10;
                digit = digit + r;
                nums[i] = nums[i] / 10;
            }
        }
        return sum - digit;
    }
}