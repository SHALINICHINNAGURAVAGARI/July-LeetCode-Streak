class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int count=0;
        StringBuilder s=new StringBuilder();
        while(i>=0||j>=0||count>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=n1+n2+count;
            count=sum/10;
            s.append(sum%10);
            i--;
            j--;
        }
        return s.reverse().toString();
    }
}