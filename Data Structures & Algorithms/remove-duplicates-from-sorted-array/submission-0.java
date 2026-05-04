class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1,ele=nums[0],j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele) continue;
            nums[j++]=nums[i];
            ele=nums[i];
            k++;
        }   
        return k;
    }
}