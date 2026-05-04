class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt=0,l=0,r=people.length-1;
        while(l<r){
            if(people[l]+people[r]>limit){
                cnt++;
                r--;
                continue;
            }
            cnt++;
            l++;
            r--;
        }
        if(l==r) cnt++;
        return cnt;
    }
}