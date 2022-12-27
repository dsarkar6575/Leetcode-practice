class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null|| nums.length<=1)
        {
            return;
        }

        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        rev(nums,i+1,nums.length-1);
    }
     void swap(int arr[],int i,int j)
     {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }
     void rev(int arr[],int i,int j)
     {
         while(i<j)
         {
             swap(arr,i,j);
             i++;
             j--;
         }
     }
}


//code stdio Solution

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> p) 
	{
		// Write your code here.
       
        if( p.size()<=1) 
        {
            return p;
        }
        int i=p.size()-2;
        while(i>=0 && p.get(i)>=p.get(i+1)) i--;
        if(i>=0)
        {
            int j=p.size()-1;
            while(p.get(j)<=p.get(i))
            {
                j--;
            }
            swap(p,i,j);
        }
        reverse(p,i+1,p.size()-1);
        return p;
	}
    static void swap(ArrayList<Integer> p,int i,int j)
    {
        int temp=p.get(i);
        p.set(i,p.get(j));
        p.set(j,temp);
    }
    static void reverse(ArrayList<Integer> p,int i,int j)
    {
        while(i<j)
        {
            swap(p,i++,j--);
        }
    }
}
