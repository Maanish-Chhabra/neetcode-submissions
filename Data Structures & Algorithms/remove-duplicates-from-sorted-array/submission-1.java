class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,n=nums.length;
        for(int i=0;i<n;i++){
            nums[k++]=nums[i];
            while(i<n-1 && nums[i]==nums[i+1]) i++;
        }
        return k;
    }
}