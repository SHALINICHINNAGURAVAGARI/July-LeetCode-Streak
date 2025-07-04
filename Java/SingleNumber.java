class Solution {
    public int singleNumber(int[] nums) {
        int single=nums[0];
        for(int i=1;i<nums.length;i++){
            single=single^nums[i];
        }
        return single;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int res=s.singleNumber(nums);
        System.out.println(res);
    }
}