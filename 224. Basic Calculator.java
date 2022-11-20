class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0,sum=0,sign=1;
        st.push(1);
        for(char ch: s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                sum=sum*10+(ch-'0');
            }
            else{
                res+=sum*sign*st.peek();
                sum=0;
                if(ch=='-'){
                    sign=-1;
                }
                else if(ch=='+')
                {
                    sign=1;
                }
                else if(ch=='(')
                {
                    st.push(st.peek()*sign);
                    sign=1;
                }
                else if(ch==')')
                {
                    st.pop();
                }
            }
        }
                    res+=sum*sign;
        return res;
    }
}
