class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        int[] charIndex = new int[26];             // for 'a' to 'z'
        Map<String, Integer> wordIndex = new HashMap<>(); // simulate mapping

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // get last seen index or 0 if not seen before
            int cIndex = charIndex[c - 'a'];
            int wIndex = wordIndex.getOrDefault(word, 0);

            if (cIndex != wIndex) return false;

            // store index+1 to avoid conflict with default 0
            charIndex[c - 'a'] = i + 1;
            wordIndex.put(word, i + 1);
        }

        return true;
    }
}