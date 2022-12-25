class Solution {
    public void setZeroes(int[][] matrix) {
         int n=matrix.length;
        int m=matrix[0].length;
        int dumy1[]=new int [n];
        int dumy2[]=new int[m];
        Arrays.fill(dumy1,-1);
        Arrays.fill(dumy2,-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    dumy1[i]=0;
                    dumy2[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(dumy1[i]==0||dumy2[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
