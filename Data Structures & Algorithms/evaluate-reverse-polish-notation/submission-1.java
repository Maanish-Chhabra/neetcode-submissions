class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int top1=st.pop();
                int top2=st.pop();
                st.push(top1+top2);
            }
            else if(s.equals("-")){
                int top1=st.pop();
                int top2=st.pop();
                st.push(top2-top1);
            }
            else if(s.equals("*")){
                int top1=st.pop();
                int top2=st.pop();
                st.push(top1*top2);
            }
            else if(s.equals("/")){
                int top1=st.pop();
                int top2=st.pop();
                st.push(top2/top1);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
