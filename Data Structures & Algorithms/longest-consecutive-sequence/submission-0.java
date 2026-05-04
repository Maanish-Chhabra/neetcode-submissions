class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0 || n==1) return n;
        int cnt=1,max=1,ele=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==ele) continue;
            if(nums[i]==ele+1){
                cnt++;
                max=Math.max(max,cnt);
            }
            else cnt=1;
            ele=nums[i];
        }
        return max;
    }
}
