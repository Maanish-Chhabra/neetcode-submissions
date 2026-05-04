class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length(),l2=word2.length();
        int p1=0,p2=0;
        char[] word1Array=word1.toCharArray();
        char[] word2Array=word2.toCharArray();
        char[] res = new char[l1+l2];
        int k=0;
        while(p1<l1 && p2<l2){
            res[k++]=word1Array[p1++];
            res[k++]=word2Array[p2++];
        }
        while(p1<l1){
            res[k++]=word1Array[p1++];
        }
        while(p2<l2){
            res[k++]=word2Array[p2++];
        }
        return new String(res);
    }
}