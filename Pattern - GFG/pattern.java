//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        printTriangle(n);
        printTriangleReverse(n);
    }
    
    private void printTriangle(int n) {
        for(int i=0; i<n; i++) {
            StringBuilder str = new StringBuilder("");
            
            for(int j=0; j<n-i-1; j++) str.append(" ");
            
            for(int j=0; j<i+1; j++) str.append("* ");
            
            System.out.println(str.toString());
        }
    }
    
    private void printTriangleReverse(int n) {
        for(int i=0; i<n; i++) {
            StringBuilder str = new StringBuilder("");
            
            for(int j=0; j<i; j++) str.append(" ");
            
            for(int j=0; j<n-i; j++) str.append("* ");
            
            System.out.println(str.toString());
        }
        
    }
}
