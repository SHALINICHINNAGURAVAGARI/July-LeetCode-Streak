class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int bestCount = Integer.MIN_VALUE;
        int bestRow = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count = count + mat[i][j];
            }
            if (count > bestCount) {
                bestCount = count;
                bestRow = i;
            }
        }
        return new int[] { bestRow, bestCount };
    }
}