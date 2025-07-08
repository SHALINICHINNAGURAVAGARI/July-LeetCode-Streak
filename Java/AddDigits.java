import java.util.*;
class Solution {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(addDigits(num));
    }
    
}