class Solution {
    public String convert(String s, int n) {
        StringBuilder[] sb=new StringBuilder[n];

        for(int i=0;i<n;i++)
        {
            sb[i]=new StringBuilder();
        }

        char[] arr=s.toCharArray();
        int l=arr.length;
        int idx=0;
        while(idx<l)
        {
            for(int i=0;i<n && idx<l;i++)
            {
                sb[i].append(arr[idx++]);
            }

            for(int i=n-2;i>0 && idx<l;i--)
            {
                sb[i].append(arr[idx++]);
            }
        }
        StringBuilder result=sb[0];
        for(int i=1;i<n;i++)
        {
            result.append(sb[i].toString());
        }

        return result.toString();
        
    }
}
