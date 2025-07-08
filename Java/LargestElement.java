import java.util.*;
public class LargestElement {
	public static void LE(int[]nums) {
		int largest=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>largest){
				largest=nums[i];
			}
		}
		System.out.println(largest);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		LE(nums);
	}

}
