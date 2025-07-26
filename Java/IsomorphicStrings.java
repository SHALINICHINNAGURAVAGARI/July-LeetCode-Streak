class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> charMap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);
            if(!charMap.containsKey(original)){
                if(!charMap.containsValue(replacement)){
                    charMap.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char mappedChar=charMap.get(original);
                if(mappedChar!=replacement){
                    return false;
                }
            }
        }return true;
    }
}