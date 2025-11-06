class Solution {
    public static boolean isBalanced(int x){
        int [] freq=new int[10];
        int temp=x;
        while(temp>0){
            int digit=temp%10;
            freq[digit]++;
            temp=temp/10;
        }
        temp=x;
        while(temp>0){
            int digit=temp%10;
            if(digit==0||freq[digit]!=digit){
                return false;
            }
            temp/=10;
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;;i++){
            if(isBalanced(i)){
                return i;
            } 
        }
    }
}