import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int nums[]=new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
	        }
	        Solution obj = new Solution();
	        long ans[] = obj.ProductOfArrayExceptSelf(n,nums);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
  public long[] ProductOfArrayExceptSelf(int n, int[] a){
        //write code here
	  long arr[]=new long[n];
	   int Bc=1;
	    int Ac=1;
	  for(int i=0;i<n;i++)
		  {
			  arr[i]=Bc;
		
			  Bc*=a[i];
	
		  }
	
	  for(int i=n-1;i>=0;i--)
		  {
			  arr[i]*=Ac;
			
			  Ac*=a[i];
			
		  }
	  return arr;
		  
}
}
