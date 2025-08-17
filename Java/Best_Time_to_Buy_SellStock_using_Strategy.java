class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long orig = 0L;
        long[] toZero = new long[n];
        long[] toOne  = new long[n];

        // compute original profit and per-index deltas
        for (int i = 0; i < n; i++) {
            orig += (long) strategy[i] * prices[i];
            toZero[i] = -(long) strategy[i] * prices[i];    // gain if we set index i to 0
            toOne[i]  = ((long) 1 - strategy[i]) * prices[i]; // gain if we set index i to 1
        }

        // prefix sums for quick range queries
        long[] prefZero = new long[n + 1];
        long[] prefOne  = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefZero[i + 1] = prefZero[i] + toZero[i];
            prefOne[i + 1]  = prefOne[i]  + toOne[i];
        }

        int half = k / 2;
        long bestDelta = 0L; // allow no modification -> delta 0

        // slide all windows of length k
        for (int s = 0; s + k <= n; s++) {
            int mid = s + half;
            int e = s + k;
            long gainLeft  = prefZero[mid] - prefZero[s]; // set left half to 0
            long gainRight = prefOne[e] - prefOne[mid];   // set right half to 1
            long delta = gainLeft + gainRight;
            if (delta > bestDelta) bestDelta = delta;
        }

        return orig + bestDelta;
    }
}
