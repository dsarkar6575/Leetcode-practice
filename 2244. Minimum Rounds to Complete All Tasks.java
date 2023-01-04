class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i: tasks)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);

        }
        for(int i: hm.keySet())
        {
            if(hm.get(i)==1) return -1;
            else{
                count+=hm.get(i)/3;
            }
            if(hm.get(i)%3!=0) count++;
        }
        return count;
    }
}
