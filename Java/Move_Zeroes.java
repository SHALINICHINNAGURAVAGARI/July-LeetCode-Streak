class Solution {
    public static void moveZeroes(int[] nums) {
        int size=nums.length;
        if(size==0||size<0){
            return;
        }
        int nz=0;
        int z=0;
        while(nz<size){
            if(nums[nz]!=0){
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
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
