class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int repeat = 0;
        int missing = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int curr = Math.abs(grid[i][j]);
                int row = (curr - 1) / n;
                int col = (curr - 1) % n;

                if (grid[row][col] < 0) {
                    repeat = curr;
                } else {
                    grid[row][col] = -grid[row][col];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    missing = i * n + (j + 1);
                }
            }
        }
        return new int[] { repeat, missing };
    }
}