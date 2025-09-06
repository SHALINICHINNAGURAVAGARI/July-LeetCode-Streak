class Solution {
    public boolean isPowerOfThree(int n) 
    {

        if(n==1)
        {
            return true;
        }
        long prod=1;
        while(prod<n)
        {
             prod=prod*3;
            if(prod==n)
            {
                return true;
            }
        }
        return false;
    }
}