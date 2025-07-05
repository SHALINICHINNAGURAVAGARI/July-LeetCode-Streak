import java.util.*;
public class LinearSearch {
	public static void LS(int[]nums,int key) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==key) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		LS(nums,key);

	}

}
