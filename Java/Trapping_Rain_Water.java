class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int res = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < n - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            int wl = Math.min(leftMax[i], rightMax[i]);
            int tw = wl - height[i];
            res = res + tw;
        }
        return res;
    }
}