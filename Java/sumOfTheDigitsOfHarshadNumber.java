class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int count=0;
        int temp=x;
        while(x!=0){
            int r=x%10;
            count=count+r;
            x=x/10;
        }
        if(temp%count==0){
            return count;
        }
        else{
            return -1;
        }
    }
}