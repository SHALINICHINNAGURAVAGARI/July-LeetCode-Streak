class Solution {
    public int findNumbers(int[] nums) {
        int count;
        int result=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            while(nums[i]>0){
                int s=nums[i]%10;
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}