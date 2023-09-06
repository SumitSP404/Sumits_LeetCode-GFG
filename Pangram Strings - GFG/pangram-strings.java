//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        // code here
        S = S.replaceAll(" "," ");
        S = S.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i='a';i<='z';i++){
            set.add((char) i);
        }
         for(int i=0; i<S.length();i++){
             
            set.remove(S.charAt(i));
            if(set.isEmpty()) return 1;
        }
        return 0;
    }
}