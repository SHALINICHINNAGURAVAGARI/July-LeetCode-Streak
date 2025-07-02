class Solution {
    public static int removeDuplicates(int[] nums) {
        int rd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int rd=removeDuplicates(nums);

        for(int i=0;i<rd;i++){
            System.out.print(nums[i]+" ");
        }
    }
}