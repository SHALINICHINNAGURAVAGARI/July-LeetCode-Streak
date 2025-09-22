class Solution {
    public boolean checkDivisibility(int n) 
    {
        int sum=0;
        int prod=1;
        int temp=n;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        int res=sum+prod;
        if(temp%res==0)
        {
            return true;
        }
        return false;
        
    }
}