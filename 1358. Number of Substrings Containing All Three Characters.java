class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int letter[]=new int[3];
        int st=0,e=0,res=0,count=0;
        while(e<n)
        {
            char ch=s.charAt(e);
            if(letter[ch-'a']++==0)
            {
                // letter[ch-'a']++;
                count++;
            }

            while(count==3)
            {
                res+=n-e;
                char c=s.charAt(st);
                if(letter[c-'a']--==1)
                {
                    
                    count--;
                }
                st++;
            }
            e++;
        }
        return res;
    }
}
