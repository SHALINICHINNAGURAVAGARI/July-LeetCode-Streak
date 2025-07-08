import java.util.*;
class Solution {
    public static int[] rearrangeArray(int[] nums) {
       int[]answer=new int[nums.length];
       int positiveIndex=0;
       int negativeIndex=1;

       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            answer[positiveIndex]=nums[i];
            positiveIndex+=2;
        }else{
            answer[negativeIndex]=nums[i];
            negativeIndex+=2;
        }
       }
       return answer; 
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        rearrangeArray(nums);
    }
}