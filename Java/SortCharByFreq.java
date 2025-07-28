class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        // Step 1: Count character frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder result = new StringBuilder();

        // Step 2: repeat s.length() times
        for (int i = 0; i < s.length(); i++) {
            int maxFreq = 0;
            char maxChar = 0;
            for (int j = 0; j < 256; j++) {
                if (freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    maxChar = (char) j;
                }
            }
            for (int j = 0; j < maxFreq; j++) {
                result.append(maxChar);
            }
            freq[maxChar] = 0;
        }
        return result.toString();
    }
}