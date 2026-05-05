class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l=0,r=0,maxLen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            maxLen=Math.max(maxLen,r-l+1);
            map.put(ch,r);
            r++;
        }
        return maxLen;
    }
}
