class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0,r=0,maxLen=0,maxFreq=0;
        while(r<s.length()){
            char right = s.charAt(r);
            freq[right-'A']++;
            maxFreq=Math.max(maxFreq,freq[right-'A']);
            while((r-l+1-maxFreq) > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
