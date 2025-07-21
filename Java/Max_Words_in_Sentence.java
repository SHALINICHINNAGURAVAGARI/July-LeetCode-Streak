class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Split the sentence by space and count the number of words
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            
            // Update max if current sentence has more words
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        
        return maxWords;
    }
}