class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            s.insert(0, letter);
            columnNumber = columnNumber / 26;
        }
        return s.toString();
    }
}