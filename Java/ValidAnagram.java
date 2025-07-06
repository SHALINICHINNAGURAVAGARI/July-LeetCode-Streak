import java.util.*;
class Solution {
    public static boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();

        s=s.replace(" ","");
        t=t.replace(" ","");

        int[]counts=new int[26];

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            counts[t.charAt(i)-'a']--;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        isAnagram(s,t);
    }
}