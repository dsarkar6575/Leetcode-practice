import java.io.*;
import java.util.*;

class Solution{
     public static int maxConsecutiveOnes(int[] arr, int n) {
        // Your code here
		int count=0;
		 int max=0;
		 for(int i=0;i<n;i++)
			 {
				 if(arr[i]==1)
				 {
					 count++;
				 }
				 else{
					 count=0;
				 }
				 max=Math.max(max,count);
			 }
		 return max;
}
}

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
