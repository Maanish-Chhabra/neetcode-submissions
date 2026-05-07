class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res=new ArrayList<>();
        if(k==arr.length){
            for(int i=0;i<arr.length;i++) res.add(arr[i]);
            return res;
        }
        if(x<arr[0]){
            for(int i=0;i<k;i++) res.add(arr[i]);
            return res;
        }
        if(x>arr[arr.length-1]){
            for(int i=arr.length-1;i>=arr.length-k;i--) res.add(arr[i]);
            Collections.reverse(res);
            return res;
        }
        int low=0,high=arr.length-1,ind=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ind=mid;
                break;
            }
            if(arr[mid]>x) high=mid-1;
            else low=mid+1;
        }
        
        if(ind==-1) ind=Math.min(Math.abs(x-arr[high]),Math.abs(x-arr[low]))==Math.abs(x-arr[low])?low:high;
        
        res.add(arr[ind]);

        if(ind==0){
            for(int i=0;i<arr.length;i++) res.add(arr[i]);
            return res;
        }
        if(ind==arr.length-1){
            for(int i=arr.length-1-k;i<arr.length;i++) res.add(arr[i]);
            return res;
        }

        int i=ind-1,j=ind+1,cnt=1;
        while(i>=0 && j<arr.length && cnt<k){
            if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)){
                res.add(arr[i]);
                i--;
            }
            else{
                res.add(arr[j]);
                j++;
            }
            cnt++;
        }
        while(i>=0 && cnt<k){
            res.add(arr[i]);
            i--;
            cnt++;
        }
        while(j<arr.length && cnt<k){
            res.add(arr[j]);
            j++;
            cnt++;
        }

        Collections.sort(res);

        return res;
    }
}