import java.util.*;
class Solution {
    public static int majorityElement(int[] nums) {
        int majority=nums[0];
        int votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }else if(majority==nums[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        majorityElement(nums);
    }
}