import java.util.*;
class Solution {
    public static int myAtoi(String s) {
        int i=0;
        int e=s.length();
        int sign=1;
        int result=0;
        
        //WhiteSpace
        while(i<e && s.charAt(i)==' '){
            i++;
        }
        //Signedness
        if(i<e && (s.charAt(i)=='+'|| s.charAt(i)=='-')){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        //Conversion
        while(i<e && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE - digit)/10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+digit;
            i++;
        }
        return result*sign;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(myAtoi(s));
    }
}