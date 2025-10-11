class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            int num=nums2[i];
            if(map.containsKey(num) && map.get(num)==1){
                result.add(num);
                map.put(num,0);
            }
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}