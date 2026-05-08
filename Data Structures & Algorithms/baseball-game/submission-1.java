class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s: operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                int tmp=st.pop();
                int toPut=tmp+st.peek();
                st.push(tmp);
                st.push(toPut);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        
        int sum=0,size=st.size();
        while(!st.isEmpty()) sum+=st.pop();

        return sum;
    }
}