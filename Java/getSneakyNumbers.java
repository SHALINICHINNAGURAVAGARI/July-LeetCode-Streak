class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int k = 0;
        HashSet<Integer> avail = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!avail.add(nums[i])) {
                arr[k++] = nums[i];
            }
        }
        return arr;
    }
}