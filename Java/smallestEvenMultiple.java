class Solution {
    public int smallestEvenMultiple(int n) 
    {
        int res=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0 && i%n==0)
            {
                res=i;
                break;
            }
        }
        return res;
        
    }
}