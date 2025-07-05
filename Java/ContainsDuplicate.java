import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> inSet=  new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(inSet.contains(nums[i])){
                return true;
            }
            inSet.add(nums[i]);
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        containsDuplicate(nums);
    }
}