//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=n; i>0; i--) {
            StringBuilder str = new StringBuilder("");
            
            for(int j=0; j<n-i; j++) str.append(" ");
            
            for(int j=1; j<i*2; j++) str.append("*");
            
            System.out.println(str.toString());
        }
    }
}