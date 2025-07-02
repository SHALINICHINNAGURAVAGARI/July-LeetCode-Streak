class Solution {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        String res=new String(s);
        System.out.println(res);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] s=str.toCharArray();
        reverseString(s);
    }
}