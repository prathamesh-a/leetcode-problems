import java.util.*;
class Solution {
    public int lastStoneWeight(int[] arr) {
        if(arr.length==0) return 0;
        arr = doIt(arr);
        if(arr.length != 0) return arr[0];
        else return 0;
    }
    private static int[] doIt(int[] arr){
        
        if(arr.length == 1 || arr.length==0) return arr;
        else{
            Arrays.sort(arr);
            int x = arr[arr.length-2];
            int y = arr[arr.length-1];
            if(x==y){
                int[] arr2 = new int[arr.length-2];
                for(int i=0; i<arr2.length; i++){
                    arr2[i]  = arr[i];
                }
                return doIt(arr2);
            }
            else{
                int[] arr2 = new int[arr.length-1];
                for(int i=0; i<arr2.length; i++){
                    if(i==arr2.length-1){
                        arr2[i] = y-x;
                    }
                    else arr2[i] = arr[i];
                }
                return doIt(arr2);
            }
        }
    }
}