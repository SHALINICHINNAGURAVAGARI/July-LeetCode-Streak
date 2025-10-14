class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            a[i]=count;
            count=0;
        }
        return a;
    }
}