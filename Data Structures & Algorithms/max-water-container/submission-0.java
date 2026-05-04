class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1,maxArea=0;
        while(l<r){
            int min=Math.min(heights[l],heights[r]);
            maxArea=Math.max(maxArea,(r-l)*min);
            if(min==heights[l]) l++;
            else r--;
        }
        return maxArea;
    }
}
