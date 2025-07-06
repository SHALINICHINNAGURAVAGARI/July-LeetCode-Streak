import java.util.*;
class Solution {
    public static void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sortColors(nums);
    }
}