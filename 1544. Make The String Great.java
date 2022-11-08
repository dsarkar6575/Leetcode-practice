class Solution {
    public String makeGood(String s) {
       StringBuilder sb=new StringBuilder();
       int p=0;
        for(int i=0;i<s.length();i++)
        {
            if(p>0 && Math.abs(sb.charAt(p-1)-s.charAt(i))==32)
            {
                p--;
                sb.deleteCharAt(p);
            }else{
                
                sb.append(s.charAt(i));
                p++;
            }
        }
        return sb.toString();
    }
}

//Anathor approach

class Solution {
    public String makeGood(String s) {
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(!st.empty() && Math.abs(st.peek()-s.charAt(i))==32)
        {
            st.pop();
        }else{
            st.push(s.charAt(i));
        }
    }
      char arr[]=new char[st.size()];
      int last=st.size()-1;
      while(!st.empty())
      {
          arr[last--]=st.pop();
      }

      return new String(arr);
    }
}
