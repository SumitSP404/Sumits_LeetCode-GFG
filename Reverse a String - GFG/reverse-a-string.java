//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n= str.length();
        if(n == 0)
        return "";
        int l =0, r=n-1;
        char[] ch = str.toCharArray();
        //char []end = str[str - 1].toCharArray;
        while(l < r){
            char temp = ch[l];
            ch[l++] = ch[r];
            ch[r--] = temp;
            
        }
        return new String(ch);
    }
   // return new String(ch);
}