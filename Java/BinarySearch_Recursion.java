import java.util.*;
class Solution {
    // Recursive binary search with 4 parameters
    public static int search(int[] nums, int target,int s,int e) {
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target<nums[mid]){
            return search(nums,target,s,mid-1);
        }
        return search(nums,target,mid+1,e);
    }
    
    // Wrapper method with only 2 parameters
    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(nums,target,0,nums.length-1));
    }
}