/*Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.
*/
import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int i=0;i<n;i++){
        if(arr[i]==num){
            return i;
        }
    }
    return -1;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(1)
