class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if(n==1) return 0.0;
        if(x==1) return 1.0;
        if(x==-1 && n%2==0) return 1.0;
        if(x==-1 && n%2!=0) return -1.0;
        long m=n;
        if(n<0){
            x=1.0/x;
            m=-m;
        }
        double ans=1.0;
        while(m>0){
            if(m%2==1){
                ans=ans*x;
            }
            m=m/2;
            x=x*x;
        }
        return ans;
    }
}