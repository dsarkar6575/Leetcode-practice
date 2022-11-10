class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
       for(int i: nums)
       {
           ans^=i;
       }
       return ans;
    }
}

//Another aproachs

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!st.empty() && st.peek()==nums[i])
            {
                st.pop();
            }else{
                st.push(nums[i]);
            }
        }
        int ans=0;
        while(!st.empty())
        {
            ans=st.pop();
        }
        return ans;
    }
}
Console
