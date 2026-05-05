class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0,r=1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        while(r<nums.length && r<=k){
            if(set.contains(nums[r])) return true;
            set.add(nums[r++]);
        }
        while(r<nums.length){
            set.remove(nums[l]);
            if(set.contains(nums[r])) return true;
            set.add(nums[r]);
            l++;
            r++;
        }
        return false;
    }
}