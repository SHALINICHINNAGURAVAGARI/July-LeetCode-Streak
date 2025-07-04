class Solution {
    public static int missingNumber(int[] nums) {
        int allXOR=0;
        for(int i=0;i<=nums.length;i++){
            allXOR=allXOR^i;
        }
        for(int i=0; i<nums.length; i++) {
            allXOR = allXOR ^ nums[i];
        }
        return allXOR;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res=missingNumber(nums);
        System.out.print(res);
    }
}