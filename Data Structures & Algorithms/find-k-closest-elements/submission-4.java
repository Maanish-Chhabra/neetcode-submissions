class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<k;i++) q.offer(arr[i]);

        for(int i=k;i<arr.length;i++){
            if(Math.abs(arr[i]-x) < Math.abs(q.peek()-x)){
                q.poll();
                q.offer(arr[i]);
            }
        }

        List<Integer> res = new ArrayList<>();
        int size=q.size();
        for(int i=0;i<size;i++) res.add(q.poll());
        return res;
    }
}