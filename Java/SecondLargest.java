import java.util.*;
public class SecondLargest {
	public static void SL(int[]arr) {
		int max=arr[0];
		int min=Integer.MIN_VALUE;//OR -1
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=min;
				max=arr[i];
			}
			else if(arr[i]>min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SL(arr);

	}

}
