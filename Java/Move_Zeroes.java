class Solution {
    public static void moveZeroes(int[] nums) {
        int insertPosition=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        while(insertPosition<nums.length){
            nums[insertPosition++]=0;
        }
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        moveZeroes(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}