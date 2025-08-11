import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int number_of_suppliers=sc.nextInt();
        int[] batch_size=new int[number_of_suppliers];
        for(int i=0;i<number_of_suppliers;i++){
            batch_size[i]=sc.nextInt();
        }
        int gcd=batch_size[0];
        for(int i=1;i<number_of_suppliers;i++){
            gcd=findGCD(gcd,batch_size[i]);
        }
        System.out.println(gcd);
    }
}