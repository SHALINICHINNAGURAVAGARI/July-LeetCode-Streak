import java.util.*;
class Solution {
    public static String sortSentence(String s) {
        Map<Integer,String> WordMap=new HashMap<>();
        //<> tells Java:“Use the same types I already declared on the left.”
        for(String word:s.split(" ")){
            int lastIndex=word.length()-1;
            int index=word.charAt(lastIndex)-'0';
            String actualWord=word.substring(0,lastIndex);
            WordMap.put(index,actualWord);
        }
        
        StringBuilder actualString=new StringBuilder();
        for (int i = 1; i <= WordMap.size(); i++) {
            actualString.append(WordMap.get(i)).append(" ");
        }
        return actualString.toString().trim();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sortSentence(s);
    }
}