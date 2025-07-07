import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            //Join
            if(sum>=0){
                sum=sum+nums[i];
            }
            //Don't Join
            else{
                sum=nums[i];
            }
            if(sum>max_sum){
            max_sum=sum;
            }
        }
        return max_sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
}