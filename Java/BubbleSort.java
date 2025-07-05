import java.util.*;
public class BubbleSort {
	public static void BS(int[]nums) {
		int size=nums.length;
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
			for(int k=0;k<size;k++) {
				System.out.print(nums[k]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		BS(nums);

	}

}
