class Solution {
    public int countDigits(int num) {
        int originalnum = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && originalnum % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}