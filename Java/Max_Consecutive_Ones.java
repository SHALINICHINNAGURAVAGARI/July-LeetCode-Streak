class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ones_found=0;
        int maxones_found=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones_found++;
                maxones_found=Math.max(ones_found,maxones_found);
            }else{
                ones_found=0;
            }
        }
        return maxones_found;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print(findMaxConsecutiveOnes(nums));
    }
}