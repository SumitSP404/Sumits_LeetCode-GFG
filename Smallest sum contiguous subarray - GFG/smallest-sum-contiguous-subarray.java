//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int smallestSumSubarray(int nums[], int n)
    {
        // your code here
         int cur = nums[0];
        int min = cur;
        for(int i=1; i<n;i++){
            cur = Math.min(nums[i], cur + nums[i]);
            min = Math.min(cur,min);
        }
        return Math.min(cur,min);
       //return min;
    }
}