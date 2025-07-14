class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        long ans=1;
        while(ans<n){
           ans*=2;
        }
        return ans==n;
    }
}